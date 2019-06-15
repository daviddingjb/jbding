package com.trusdata.common.db.adapter;

import java.util.HashMap;

import com.trusdata.common.Const;
import com.trusdata.common.action.BaseAction;

/**
 * 
 * @author JBDING
 * 
 */
public class DBAdaptee extends BaseAction {
	/**
	 * serialVersionUID.
	 */
	private static final long serialVersionUID = -93028429111075507L;
	
	private HashMap<String, String> connMap;

	public DBAdaptee(HashMap<String, String> connMap) {
		this.connMap = connMap;
	}

	public HashMap<String, HashMap<String, HashMap<String, HashMap<String, Object>>>> insertMyDB() throws Exception {
		DBTarget target = null;
		String t_type = connMap.get("t_type");
		
		if (Const.MYSQL.equals(t_type)) {
			target = new AdapterMySql(new AdapteeMySql(connMap));
		} else if (Const.ORACLE.equals(t_type)) {

		} else if (Const.SYBASE3.equals(t_type)) {

		} else if (Const.DB2.equals(t_type)) {

		} else if (Const.SQLSERVER.equals(t_type)) {

		} else if (Const.MONGODB.equals(t_type)) {

		} else if (Const.POSTGRESQL.equals(t_type)) {

		} else if (Const.INFORMIX.equals(t_type)) {

		}
		
		return target.insert();
	}
}
