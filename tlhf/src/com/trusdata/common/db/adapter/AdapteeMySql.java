package com.trusdata.common.db.adapter;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.trusdata.common.action.BaseAction;
import com.trusdata.common.db.DBConnection;
import com.trusdata.common.util.ProcessorDB;

/**
 * 
 * @author JBDING
 * 
 */
public class AdapteeMySql extends BaseAction {
	/**
	 * serialVersionUID.
	 */
	private static final long serialVersionUID = 455867057271140021L;

	private HashMap<String, String> connMap;

	public AdapteeMySql(HashMap<String, String> connMap) {
		this.connMap = connMap;
	}

	public HashMap<String, HashMap<String, HashMap<String, HashMap<String, Object>>>> insertMyDB() throws Exception {
		String t_db_name = connMap.get("t_db_name");

		String sql_tmp = "";
		HashMap<String, HashMap<String, HashMap<String, HashMap<String, Object>>>> dbMap = new HashMap<String, HashMap<String, HashMap<String, HashMap<String, Object>>>>();
		HashMap<String, HashMap<String, HashMap<String, Object>>> tblMap = new HashMap<String, HashMap<String, HashMap<String, Object>>>();

		PreparedStatement ps = null;
		ResultSet rs = null;

		String driver = connMap.get("driver");
		String url = connMap.get("url");
		String userName = connMap.get("userName");
		String pwd = connMap.get("pwd");
		Connection conn = DBConnection
				.getConnection(driver, url, userName, pwd);

		if ("".equals(t_db_name)) {
			// 得到该用户下所有的数据库名
			sql_tmp = "show databases";
			List<String> dbList = new ArrayList<String>();

			ps = conn.prepareStatement(sql_tmp);
			rs = ps.executeQuery();
			while (rs.next()) {
				dbList.add(rs.getString("Database"));
			}

			// 取得所有数据库里所有表结构
			for (String db : dbList) {
				if ("information_schema".equals(db)) {
					continue;
				}

				sql_tmp = "select TABLE_NAME from information_schema.TABLES where TABLE_SCHEMA = '"
						+ db + "'";
				List<String> tblList = new ArrayList<String>();

				ps = conn.prepareStatement(sql_tmp);
				rs = ps.executeQuery();
				while (rs.next()) {
					tblList.add(rs.getString("TABLE_NAME"));
				}
				DBConnection.closeRes(conn, ps, rs);
				
				url = connMap.get("url") + db
						+ "?useUnicode=true&characterEncoding=UTF-8";
				conn = DBConnection.getConnection(driver, url, userName, pwd);

				tblMap = ProcessorDB.getAllColumns(conn, tblList);
				dbMap.put(db, tblMap);
			}
		} else {
			url = url + t_db_name + "?useUnicode=true&characterEncoding=UTF-8";
			conn = DBConnection.getConnection(driver, url, userName, pwd);

			sql_tmp = "select TABLE_NAME from information_schema.TABLES where TABLE_SCHEMA = '"
					+ t_db_name + "'";
			List<String> tblList = new ArrayList<String>();

			ps = conn.prepareStatement(sql_tmp);
			rs = ps.executeQuery();
			while (rs.next()) {
				tblList.add(rs.getString("TABLE_NAME"));
			}

			tblMap = ProcessorDB.getAllColumns(conn, tblList);
			dbMap.put(t_db_name, tblMap);
		}

		DBConnection.closeRes(conn, ps, rs);
		return dbMap;
	}
}
