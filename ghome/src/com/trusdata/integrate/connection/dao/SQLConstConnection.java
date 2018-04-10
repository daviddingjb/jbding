package com.trusdata.integrate.connection.dao;

/**
 * 常量定义
 * 
 * @author JBDING
 */
public class SQLConstConnection {

	public static final String GET_CONN_LIST = 
		"select * from trus_server where t_work_user = ? limit ?,?";
	
	public static final String GET_CONN_LIST_COUNT = 
		"select count(t_name) as totalRecord from trus_server where t_work_user = ?";
}
