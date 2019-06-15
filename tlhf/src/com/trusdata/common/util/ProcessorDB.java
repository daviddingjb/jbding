package com.trusdata.common.util;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.trusdata.common.db.DBConnection;

/**
 * 
 * @author JBDING
 * 
 */
public class ProcessorDB {

	public static List<ResultSet> queryList(Connection conn, String sql)
			throws Exception {
		List<ResultSet> resList = new ArrayList<>();
		PreparedStatement ps = null;
		ResultSet rs = null;

		ps = conn.prepareStatement(sql);
		rs = ps.executeQuery();
		while (rs.next()) {
			resList.add(rs);
		}

		return resList;
	}

	/***
	 * 通过数据库元对象获取表中列的所有属性（名称，类型，长度等）
	 * 
	 * @param tableName
	 * @return
	 * @throws Exception
	 */
	public static HashMap<String, HashMap<String, HashMap<String, Object>>> getAllColumns(
			Connection conn, List<String> tableNameList) throws Exception {

		HashMap<String, HashMap<String, HashMap<String, Object>>> rtn = new HashMap<String, HashMap<String, HashMap<String, Object>>>();
		ResultSet colrs = null;

		// 数据库元数据对象，也可以理解为 数据库数据对象
		DatabaseMetaData dbm = conn.getMetaData();
		for (String tableName : tableNameList) {
			HashMap<String, HashMap<String, Object>> colHashMap = new HashMap<String, HashMap<String, Object>>();
			// 通过表名获取到 存有所有列信息的结果集对象
			colrs = dbm.getColumns(null, "%", tableName, "%");
			while (colrs.next()) {
				HashMap<String, Object> colMap = new HashMap<String, Object>();
				String columnName = colrs.getString("COLUMN_NAME");
				String columnType = colrs.getString("TYPE_NAME");
				int datasize = colrs.getInt("COLUMN_SIZE");
				int digits = colrs.getInt("DECIMAL_DIGITS");
				int nullable = colrs.getInt("NULLABLE");

				colMap.put("TYPE_NAME", columnType);
				colMap.put("COLUMN_SIZE", datasize);
				colMap.put("DECIMAL_DIGITS", digits);
				colMap.put("NULLABLE", nullable);

				colHashMap.put(columnName, colMap);
			}
			colrs = null;
			rtn.put(tableName, colHashMap);
		}

		return rtn;
	}
	
	public static void createGroup(HashMap<String, HashMap<String, HashMap<String, HashMap<String, HashMap<String, Object>>>>> serverMap, StringBuilder sql) throws Exception {
		// insert records to DB
		Connection conn = DBConnection.getConnection();
		conn.setAutoCommit(false);
		Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
		stmt.addBatch(sql.toString());

		for (String t_server_name : serverMap.keySet()) {
			HashMap<String, HashMap<String, HashMap<String, HashMap<String, Object>>>> dbMap = serverMap.get(t_server_name);
			String sql_tmp = "";

			sql_tmp = "insert into trus_column (t_server_name, t_db_name, t_table_name, t_field_name, t_data_type, t_len) values ('"
					+ t_server_name + "'";
			String sql_append = "";
			String sql_db = "";
			String sql_tbl = "";
			String sql_col = "";
			for (String db_name : dbMap.keySet()) {
				sql_db = sql_db + ", '" + db_name + "'";
				HashMap<String, HashMap<String, HashMap<String, Object>>> dbHashMap = dbMap
						.get(db_name);
				for (String t_table_name : dbHashMap.keySet()) {
					sql_tbl = sql_tbl + ", '" + t_table_name + "'";
					HashMap<String, HashMap<String, Object>> tblHashMap = dbHashMap
							.get(t_table_name);
					for (String t_field_name : tblHashMap.keySet()) {
						sql_col = sql_col + ", '" + t_field_name + "', '"
								+ tblHashMap.get(t_field_name).get("TYPE_NAME")
								+ "', "
								+ tblHashMap.get(t_field_name).get("COLUMN_SIZE")
								+ ")";
						sql_append = sql_tmp + sql_db + sql_tbl + sql_col;
						stmt.addBatch(sql_append);
						sql_col = "";
						sql_append = "";
					}
					sql_tbl = "";
				}
				sql_db = "";
			}
		}
		
		stmt.executeBatch();
		conn.commit();
        DBConnection.closeRes(conn, null);
	}
	
	public static void createGroupPair(HashMap<String, HashMap<String, String>> pages) throws Exception {
		// insert records to DB
		Connection conn = DBConnection.getConnection();
		conn.setAutoCommit(false);
		Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);

		String sql_tmp = "";
		for (String checkboxNumber : pages.keySet()) {
			HashMap<String, String> page = pages.get(checkboxNumber);

			sql_tmp = "insert into trus_group_pair (t_create_time, t_group_name, t_pair_group_name, t_source_tbl_name, t_target_tbl_name) values (now(),";
			sql_tmp = sql_tmp + "'" + page.get("t_name") + "', '" +  page.get("pair_group_name") + "', '" + page.get("source_tbl_name") + "', '" + page.get("target_tbl_name") + "')";
			stmt.addBatch(sql_tmp);
			sql_tmp = "";
		}
		
		stmt.executeBatch();
		conn.commit();
        DBConnection.closeRes(conn, null);
	}
}
