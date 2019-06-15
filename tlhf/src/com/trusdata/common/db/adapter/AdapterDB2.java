package com.trusdata.common.db.adapter;

import java.util.HashMap;

/**
 * 
 * @author JBDING
 *
 */
public class AdapterDB2 implements DBTarget {

	// 直接关联被适配类
	private AdapteeDB2 adapteeDB2;
	
	// 可以通过构造函数传入具体需要适配的被适配类对象
	public AdapterDB2 (AdapteeDB2 adapteeDB2) {
		this.adapteeDB2 = adapteeDB2;
	}
	
	public HashMap<String, HashMap<String, HashMap<String, HashMap<String, Object>>>> insert() {
		// 这里是使用委托的方式完成特殊功能
		return this.adapteeDB2.insertMyDB();
	}
}
