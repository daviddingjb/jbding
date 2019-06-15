package com.trusdata.common.db.adapter;

import java.util.HashMap;

import com.trusdata.common.action.BaseAction;

/**
 * 
 * @author JBDING
 * @param <T>
 *
 */
public class DBAdapter extends BaseAction implements DBTarget {

	/**
	 * serialVersionUID.
	 */
	private static final long serialVersionUID = -6006343951865817794L;
	
	// 直接关联被适配类
	private DBAdaptee adaptee;
	
	// 可以通过构造函数传入具体需要适配的被适配类对象
	public DBAdapter (DBAdaptee adaptee) {
		this.adaptee = adaptee;
	}
	
	public HashMap<String, HashMap<String, HashMap<String, HashMap<String, Object>>>> insert() throws Exception {
		// 这里是使用委托的方式完成特殊功能
		return this.adaptee.insertMyDB();
	}
}
