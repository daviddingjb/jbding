package com.trusdata.test;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.trusdata.common.db.DBConnection;

public class Test002 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://127.0.0.1:3306/";
		String userName = "test1";
		String pwd = "test1";

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
