package com.trusdata.common.db.adapter;

import java.sql.SQLException;

/**
 * 
 * @author JBDING
 *
 */
public class Test {

	/**
	 * @param args
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws Exception {
		// 使用普通功能类
		DBTarget concreteTarget = new ConcreteTarget();
		concreteTarget.insert();
		
		// 使用特殊功能类，即适配类，
		// 需要先创建一个被适配类的对象作为参数
		DBTarget adapter = new Adapter(new Adaptee());
		adapter.insert();
	}
}
