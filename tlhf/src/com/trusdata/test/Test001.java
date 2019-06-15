package com.trusdata.test;

public class Test001 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String sql = "com.mysql.jdbc.ServerPreparedStatement[1] - INSERT INTO trus_server( t_name,t_description,t_work_user,t_host,t_port,t_type,t_db_name,t_user,t_password,t_repair_user,t_repair_password) VALUE( '222','2222','test','127.0.0.1','3306','MySql','','root','63a9f0ea7bb98050796b649e85481845','','' )";
		System.out.println(sql);
		sql = sql.substring(sql.indexOf("INSERT INTO"));
		System.out.println(sql);
	}

}
