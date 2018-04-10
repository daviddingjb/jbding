package com.trusdata.test;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.trusdata.common.db.DBConnection;

/**
 * 
 * @author JBDING
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String driver = "com.mysql.jdbc.Driver";
		//String url = "jdbc:mysql://10.35.14.215:3306/information_schema?useUnicode=true&characterEncoding=UTF-8";
		String url = "jdbc:mysql://127.0.0.1:3306/";
		String userName = "root";
		String pwd = "root";
		//String userName = "jiangbo";
		//String pwd = "jiangboding";

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
		
		
		
		
//		System.out.println(MD5.MD5Encode("root"));
//		BaseDAOx bd = new BaseDAOx();
//		 ArrayList<Trus_server> ar = bd.getList(Trus_server.class);
//		 for(Trus_server an : ar){
//		 System.out.println(an.getT_name());
//		 }
	}

}
