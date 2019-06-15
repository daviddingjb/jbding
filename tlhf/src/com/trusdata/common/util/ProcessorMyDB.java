package com.trusdata.common.util;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.trusdata.common.db.DBConnection;

/**
 * 
 * @author JBDING
 *
 */
public class ProcessorMyDB {

	public static void insert(StringBuilder sql) throws Exception {
		PreparedStatement ps = null;
		Connection conn = DBConnection.getConnection();
		conn.setAutoCommit(false);
        ps = conn.prepareStatement(sql.toString());
        System.out.println("开始插入  : ");
        System.out.println(sql.toString());
        ps.executeBatch();
        conn.commit();
        DBConnection.closeRes(conn, ps);
        System.out.println("插入成功  : ");
    }
}
