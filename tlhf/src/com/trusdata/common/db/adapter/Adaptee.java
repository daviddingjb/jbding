package com.trusdata.common.db.adapter;

import java.util.HashMap;

/**
 * 
 * @author JBDING
 *
 */
public class Adaptee {
	public HashMap<String, HashMap<String, HashMap<String, HashMap<String, Object>>>> insertMyDB() {
		System.out.println("被适配类具有 特殊功能...");
		return null;
	}
}
