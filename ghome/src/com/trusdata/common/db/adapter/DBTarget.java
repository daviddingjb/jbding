package com.trusdata.common.db.adapter;

import java.util.HashMap;


/**
 * 
 * @author JBDING
 *
 */
public interface DBTarget {
	public HashMap<String, HashMap<String, HashMap<String, HashMap<String, Object>>>> insert() throws Exception;
}
