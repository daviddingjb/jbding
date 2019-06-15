package com.trusdata.common.db.adapter;

import java.util.HashMap;

/**
 * 
 * @author JBDING
 * 
 */
public class AdapterMySql implements DBTarget {

	// 直接关联被适配类
	private AdapteeMySql adapteeMySql;

	// 可以通过构造函数传入具体需要适配的被适配类对象
	public AdapterMySql(AdapteeMySql adapteeMySql) {
		this.adapteeMySql = adapteeMySql;
	}

	public HashMap<String, HashMap<String, HashMap<String, HashMap<String, Object>>>> insert() throws Exception {
		// 这里是使用委托的方式完成特殊功能
		return this.adapteeMySql.insertMyDB();
	}
}
