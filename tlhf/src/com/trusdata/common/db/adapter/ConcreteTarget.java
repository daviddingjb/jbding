package com.trusdata.common.db.adapter;

import java.util.HashMap;

/**
 * 
 * @author JBDING
 *
 */
public class ConcreteTarget implements DBTarget {
	public HashMap<String, HashMap<String, HashMap<String, HashMap<String, Object>>>> insert() {
		System.out.println("普通类 具有 普通功能...");
		return null;
	}
}
