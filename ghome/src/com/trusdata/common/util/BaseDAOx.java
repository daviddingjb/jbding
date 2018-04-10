package com.trusdata.common.util;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;

import com.trusdata.common.db.DBConnection;
import com.trusdata.integrate.db.bean.Trus_server;

/**
 * 
 * @author JBDING
 * 
 */
public class BaseDAOx {
	/***
	 * 参数为实体类类型 该方法用于查询出该实体类对应的表中所有数据
	 * 
	 * @param cl
	 * @return
	 */
	public ArrayList getList(Class cl) {
		ArrayList ar = new ArrayList();
		Connection conn = DBConnection.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;

		Field[] fi = cl.getDeclaredFields();
		ArrayList<String> col = getAllColumns(cl.getSimpleName(), conn);
		// 拼接sql语句
		StringBuffer sb = new StringBuffer();
		sb.append("select ");
		for (int i = 0; i < col.size(); i++) {
			sb.append(col.get(i));
			if (i != col.size() - 1) {
				sb.append(" , ");
			}
		}
		sb.append(" from ");
		sb.append(cl.getSimpleName());

		try {
			ps = conn.prepareStatement(sb.toString());
			rs = ps.executeQuery();
			while (rs.next()) {
				Object ob = cl.newInstance();
				for (String str : col) {
					for (Field ff : fi) {
						if (str.equals(ff.getName())) {
							ff.setAccessible(true);
							ff.set(ob, rs.getObject(ff.getName()));
							break;
						}
					}
				}
				ar.add(ob);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBConnection.closeRes(conn, ps, rs);
		}

		return ar;
	}

	/***
	 * 该方法用于 根据表主键值 获取该实体类对应表 查询出该条信息
	 * 
	 * @param cl
	 *            实体类类型
	 * @param id
	 *            主键id值
	 * @return
	 */
	public Object getObById(Class cl, int id) {
		Object ob = null;
		Connection conn = DBConnection.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		Field[] fi = cl.getDeclaredFields();
		ArrayList<String> col = getAllColumns(cl.getSimpleName(), conn);

		StringBuffer sb = new StringBuffer();
		sb.append("select ");
		for (int i = 0; i < col.size(); i++) {
			sb.append(col.get(i));
			if (i != col.size() - 1) {
				sb.append(" , ");
			}
		}
		sb.append(" from ");
		sb.append(cl.getSimpleName());
		sb.append(" where ");
		sb.append(col.get(0));
		sb.append(" = ? ");
		try {
			ps = conn.prepareStatement(sb.toString());
			ps.setInt(1, id);
			rs = ps.executeQuery();
			while (rs.next()) {
				ob = cl.newInstance();
				for (String str : col) {
					for (Field ff : fi) {
						if (ff.getName().equals(str)) {
							ff.setAccessible(true);
							ff.set(ob, rs.getObject(ff.getName()));
						}
					}
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBConnection.closeRes(conn, ps, rs);
		}
		return ob;
	}

	/***
	 * 该方法用于单条件 单表查询
	 * 
	 * @param cl
	 *            实体类类型
	 * @param name
	 *            参数名
	 * @param value
	 *            参数值
	 * @return
	 */
	public ArrayList getListBySome(Class cl, String name, Object value) {
		ArrayList ar = new ArrayList();
		Connection conn = DBConnection.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		Field[] fi = cl.getDeclaredFields();

		ArrayList<String> col = getAllColumns(cl.getSimpleName(), conn);

		StringBuffer sb = new StringBuffer();
		sb.append("select ");
		for (int i = 0; i < col.size(); i++) {
			sb.append(col.get(i));
			if (i != col.size() - 1) {
				sb.append(" , ");
			}
		}
		sb.append(" from ");
		sb.append(cl.getSimpleName());
		sb.append(" where ");
		sb.append(name);
		sb.append(" = ? ");
		try {
			ps = conn.prepareStatement(sb.toString());
			ps.setObject(1, value);
			rs = ps.executeQuery();
			while (rs.next()) {
				Object ob = cl.newInstance();
				for (String str : col) {
					for (Field ff : fi) {
						if (ff.getName().equals(str)) {
							ff.setAccessible(true);
							ff.set(ob, rs.getObject(ff.getName()));
							break;
						}
					}
				}
				ar.add(ob);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBConnection.closeRes(conn, ps, rs);
		}
		return ar;

	}

	/***
	 * 该方法用于 模糊查询 全匹配
	 * 
	 * @param cl
	 *            实体类类型
	 * @param name
	 *            参数名
	 * @param value
	 *            参数值
	 * @return
	 */
	public ArrayList getListByLike(Class cl, String name, Object value) {
		ArrayList ar = new ArrayList();
		Connection conn = DBConnection.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;

		Field[] fi = cl.getDeclaredFields();
		ArrayList<String> col = getAllColumns(cl.getSimpleName(), conn);

		StringBuffer sb = new StringBuffer();
		sb.append("select ");
		for (int i = 0; i < col.size(); i++) {
			sb.append(col.get(i));
			if (i != col.size() - 1) {
				sb.append(",");
			}
		}
		sb.append(" from ");
		sb.append(cl.getSimpleName());
		sb.append(" where ");
		sb.append(name);
		sb.append(" like '%");
		sb.append(value);
		sb.append("%'");
		try {
			ps = conn.prepareStatement(sb.toString());
			rs = ps.executeQuery();
			while (rs.next()) {
				Object ob = cl.newInstance();
				for (String str : col) {
					for (Field ff : fi) {
						if (ff.getName().equals(str)) {
							ff.setAccessible(true);
							ff.set(ob, rs.getObject(ff.getName()));
							break;
						}
					}
				}
				ar.add(ob);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBConnection.closeRes(conn, ps, rs);
		}
		return ar;
	}

	/***
	 * 该方法用于万能插入数据
	 * 
	 * @param ob
	 *            实体对象
	 * @return
	 */
	public boolean insert(Object ob) {
		boolean b = false;
		Connection conn = DBConnection.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;

		Class cl = ob.getClass();
		Field[] fi = cl.getDeclaredFields();
		ArrayList<String> col = getAllColumns(cl.getSimpleName(), conn);

		StringBuffer sb = new StringBuffer();
		StringBuffer sb1 = new StringBuffer();

		sb.append("insert into ");
		sb.append(cl.getSimpleName());
		sb.append(" ( ");

		for (int i = 1; i < col.size(); i++) {
			sb.append(col.get(i));
			sb1.append("?");
			if (i != col.size() - 1) {
				sb.append(",");
				sb1.append(",");
			}
		}

		sb.append(" )values( ");
		sb.append(sb1);
		sb.append(")");
		try {
			ps = conn.prepareStatement(sb.toString());
			for (int i = 1; i < col.size(); i++) {
				for (Field ff : fi) {
					if (ff.getName().equals(col.get(i))) {
						ff.setAccessible(true);
						ps.setObject(i, ff.get(ob));
						break;
					}
				}
			}
			int a = ps.executeUpdate();
			if (a > 0) {
				b = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBConnection.closeRes(conn, ps);
		}
		return b;
	}

	/***
	 * 该方法用于插入数据并获取数据主键的ID值
	 * 
	 * @param ob
	 *            实体类对象
	 * @return
	 */
	public int insertGetGeneratedKey(Object ob) {
		int id = 0;
		Connection conn = DBConnection.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;

		Class cl = ob.getClass();
		Field[] fi = cl.getDeclaredFields();
		ArrayList<String> col = getAllColumns(cl.getSimpleName(), conn);

		StringBuffer sb = new StringBuffer();
		StringBuffer sb1 = new StringBuffer();

		sb.append("insert into ");
		sb.append(cl.getSimpleName());
		sb.append(" ( ");

		for (int i = 1; i < col.size(); i++) {
			sb.append(col.get(i));
			sb1.append("?");
			if (i != col.size() - 1) {
				sb.append(",");
				sb1.append(",");
			}
		}

		sb.append(" )values( ");
		sb.append(sb1);
		sb.append(")");
		try {
			ps = conn.prepareStatement(sb.toString());
			for (int i = 1; i < col.size(); i++) {
				for (Field ff : fi) {
					if (ff.getName().equals(col.get(i))) {
						ff.setAccessible(true);
						ps.setObject(i, ff.get(ob));
						break;
					}
				}
			}
			int a = ps.executeUpdate();
			if (a > 0) {
				// 必须是主键为自动递增的才可以
				// 必须是插入时 创建新的主键时才可以获取到
				rs = ps.getGeneratedKeys();
				if (rs.next()) {
					id = rs.getInt(1);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBConnection.closeRes(conn, ps);
		}
		return id;
	}

	/***
	 * 该方法用于更新数据
	 * 
	 * @param ob
	 *            实体类对象（必须有主键id）
	 * @return
	 */
	public boolean update(Object ob) {
		boolean b = false;
		Connection conn = DBConnection.getConnection();
		PreparedStatement ps = null;

		Class cl = ob.getClass();
		Field[] fi = cl.getDeclaredFields();
		ArrayList<String> col = getAllColumns(cl.getSimpleName(), conn);

		StringBuffer sb = new StringBuffer();
		sb.append("update ");
		sb.append(cl.getSimpleName());
		sb.append(" set ");

		for (int i = 1; i < col.size(); i++) {
			sb.append(col.get(i));
			sb.append("=?");
			if (i != col.size() - 1) {
				sb.append(",");
			}
		}

		sb.append(" where ");
		sb.append(col.get(0));
		sb.append("=?");

		try {
			ps = conn.prepareStatement(sb.toString());
			for (int i = 1; i < col.size(); i++) {
				for (Field ff : fi) {
					if (ff.getName().equals(col.get(i))) {
						ff.setAccessible(true);
						ps.setObject(i, ff.get(ob));
						break;
					}
				}
			}
			fi[0].setAccessible(true);
			ps.setObject(col.size(), fi[0].get(ob));
			int a = ps.executeUpdate();
			if (a > 0) {
				b = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBConnection.closeRes(conn, ps);
		}
		return b;
	}

	/***
	 * 该方法用于删除数据
	 * 
	 * @param cl
	 *            删除实体类类型
	 * @param id
	 *            主键编号
	 * @return
	 */
	public boolean delete(Class cl, int id) {
		boolean b = false;
		Connection conn = DBConnection.getConnection();
		PreparedStatement ps = null;
		Field[] fi = cl.getDeclaredFields();
		String sql = "delete from " + cl.getSimpleName() + " where "
				+ fi[0].getName() + " = ?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setObject(1, id);
			int a = ps.executeUpdate();
			if (a > 0) {
				b = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBConnection.closeRes(conn, ps);
		}
		return b;

	}

	/***
	 * 该方法用于 所有查询操作 注意一点 尽量保证 连接的表中数据 除了主外键关联的以外 尽量不要有重复的表列名
	 * 
	 * @param 查询出来的数据 放到哪个实体类中
	 * @param 查询的sql语句
	 * @param 所有的条件的值
	 * @return
	 */
	public ArrayList getListBySqlX(Class cl, String sql, Object[] obs) {
		ArrayList ar = new ArrayList();
		Connection conn = DBConnection.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		Field[] fi = cl.getDeclaredFields();
		ArrayList<String> col = new ArrayList<String>();
		try {
			ps = conn.prepareStatement(sql);
			for (int i = 0; i < obs.length; i++) {
				ps.setObject(i + 1, obs[i]);
			}
			rs = ps.executeQuery();
			// 获取sql语句查询出来的结果的 所有列名
			ResultSetMetaData metaData = rs.getMetaData();
			int column = metaData.getColumnCount();
			for (int i = 1; i <= column; i++) {
				String columnName = metaData.getColumnName(i);
				col.add(columnName);
			}

			while (rs.next()) {
				Object ob = cl.newInstance();
				for (String str : col) {
					for (Field ff : fi) {
						if (str.equals(ff.getName())) {
							ff.setAccessible(true);
							ff.set(ob, rs.getObject(ff.getName()));
							break;
						}
					}
				}
				ar.add(ob);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBConnection.closeRes(conn, ps, rs);
		}
		return ar;
	}

	/***
	 * 该方法用于通过表名 获取数据库该表的列名 使用ResultSetMetaData对象
	 * 
	 * @param tableName
	 * @return
	 */
	public ArrayList<String> getAllColumn(String tableName) {
		ArrayList<String> ar = new ArrayList<String>();
		Connection conn = DBConnection.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select * from " + tableName + " where 1=2";
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			// 通过结果集rs对象获取 ResultSetMetaData
			ResultSetMetaData metedata = rs.getMetaData();
			// 获取该查询结果有多少列
			int column = metedata.getColumnCount();
			for (int i = 1; i <= column; i++) {
				// 通过ResultSetMetaData 调用getColumnName 将列名一一取出
				String columnName = metedata.getColumnName(i);
				ar.add(columnName);
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			DBConnection.closeRes(conn, ps, rs);
		}
		return ar;
	}

	/***
	 * 通过数据库元对象获取表中列的所有属性（名称，类型，长度等）
	 * 
	 * @param tableName
	 * @return
	 */
	public ArrayList<String> getAllColumns(String tableName, Connection conn) {
		ArrayList<String> ar = new ArrayList<String>();
		//Connection conn = DBConnection.getConnection();
		ResultSet colrs = null;
		try {
			// 数据库元数据对象，也可以理解为 数据库数据对象
			DatabaseMetaData dbm = conn.getMetaData();
			// 通过表名获取到 存有所有列信息的结果集对象
			colrs = dbm.getColumns(null, "%", tableName, "%");
			while (colrs.next()) {
				String columnName = colrs.getString("COLUMN_NAME");
				String columnType = colrs.getString("TYPE_NAME");
				int datasize = colrs.getInt("COLUMN_SIZE");
				int digits = colrs.getInt("DECIMAL_DIGITS");
				int nullable = colrs.getInt("NULLABLE");
				ar.add(columnName);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//DBConnection.closeRes(conn, null, colrs);
		}
		return ar;
	}

	public static void main(String[] args) {
		BaseDAOx bd = new BaseDAOx();
		 ArrayList<Trus_server> ar = bd.getList(Trus_server.class);
		 for(Trus_server an : ar){
		 System.out.println(an.getT_name());
		 }
	}
}
