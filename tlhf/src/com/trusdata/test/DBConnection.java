package com.trusdata.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.trusdata.common.Const;
import com.trusdata.common.util.PropertyUtil;

/**
 * 
 * @author JBDING
 * 
 */
public class DBConnection {

	/**
	 * 获得一个数据库连接对象
	 */
	public static Connection getConnection(String driver, String url,
			String userName, String pwd) {
		Connection conn = null;
		try {
			Class.forName(driver).newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("装载驱动包出现异常!请查正！");
			e.printStackTrace();
		}

		try {
			conn = DriverManager.getConnection(url, userName, pwd);
		} catch (SQLException e) {
			System.out.println("链接数据库发生异常!");
			e.printStackTrace();
		}

		return conn;
	}

	/**
	 * 获得一个数据库连接对象
	 */
	public static Connection getConnection() {
		Connection conn = null;
		try {
			PropertyUtil.loadDB(DBConnection.class);
			Class.forName(PropertyUtil.getProperty(Const.MYSQL_DRIVER))
					.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("装载驱动包出现异常!请查正！");
			e.printStackTrace();
		}

		try {
			String url = PropertyUtil.getProperty(Const.MYSQL_URL);
			String userName = PropertyUtil.getProperty(Const.MYSQL_USERNAME);
			String pwd = PropertyUtil.getProperty(Const.MYSQL_PWD);

			conn = DriverManager.getConnection(url, userName, pwd);
		} catch (SQLException e) {
			System.out.println("链接数据库发生异常!");
			e.printStackTrace();
		}

		return conn;
	}

	/**
	 * 释放数据库资源
	 * 
	 * @param conn
	 * @param ps
	 * @param rs
	 */
	public static void closeRes(Connection conn, PreparedStatement ps,
			ResultSet rs) {
		try {
			if (conn != null) {
				conn.close();
			}
			if (ps != null) {
				ps.close();
			}
			if (rs != null) {
				rs.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 释放数据库资源
	 * 
	 * @param conn
	 * @param ps
	 */
	public static void closeRes(Connection conn, PreparedStatement ps) {
		try {
			if (ps != null) {
				ps.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://10.35.22.91:3306/";
		String userName = "root";
		String pwd = "adminadmin";

        // 拼装SQL
        String sql = "SELECT CHARACTER_SET_NAME, DEFAULT_COLLATE_NAME, DESCRIPTION, MAXLEN FROM information_schema.CHARACTER_SETS WHERE CHARACTER_SET_NAME = 'big5'";
        PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			ps = DBConnection.getConnection(driver, url, userName, pwd).prepareStatement(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}

        // 执行SQL
        try {
			rs = ps.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
        
        try {
			while (rs.next()) {
			    System.out.println(rs.getString("CHARACTER_SET_NAME"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
