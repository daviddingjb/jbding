package com.trusdata.test;

import java.util.HashMap;
import java.util.List;

import com.trusdata.common.action.BaseAction;
import com.trusdata.common.db.CustomDao;
import com.trusdata.integrate.db.bean.Trus_dbconfig;
import com.trusdata.integrate.db.bean.Trus_user;

/**
 * 
 * @author JBDING
 *
 */
public class TestHashMap extends BaseAction {

	/**
	 * serialVersionUID.
	 */
	private static final long serialVersionUID = -5500691395034600196L;
	
	private static HashMap<String, Object> useMap = new HashMap<String, Object>();

	/**
	 * @param args
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Trus_user userBean = new Trus_user();
		userBean.setT_user("root");
		userBean.setT_password("root");
		useMap.put("trus_user", userBean);

    	HashMap<String, HashMap<String, String>> dbconfList = new HashMap<String, HashMap<String, String>>();
    	CustomDao<Trus_dbconfig> cdao = new CustomDao<Trus_dbconfig>();
    	String sqlWhereString = "";
    	List<Trus_dbconfig> dbmsgList;
		try {
			dbmsgList = cdao.findAllByConditions(sqlWhereString, Trus_dbconfig.class, null);
	        for (Trus_dbconfig detail : dbmsgList) {
	        	HashMap<String, String> dbconf = new HashMap<String, String>();
	        	dbconf.put("t_driver", detail.getT_driver());
	        	dbconf.put("t_url_start", detail.getT_url_start());
	        	dbconf.put("t_url_end", detail.getT_url_end());
	            dbconfList.put(detail.getT_type(), dbconf);
	        }
			useMap.put("trus_dbconfig", dbconfList);
		} catch (Exception e) {
			e.printStackTrace();
		}
        

        HashMap<String, HashMap<String, String>> dbconfList1 = new HashMap<String, HashMap<String, String>>();
		HashMap<String, String> dbconfig = new HashMap<String, String>();
		dbconfList1 = (HashMap<String, HashMap<String,String>>)useMap.get("trus_dbconfig");
//		Set<Entry<String, HashMap<String, String>>> entrySet = dbconfList.entrySet();
//		for (Entry<String, HashMap<String, String>> entry : entrySet) {
//			if (entry.getKey().equals(server.getT_type())) {
//				dbconfig = entry.getValue();
//			}
//		}
		
//		Iterator iterator = dbconfList1.keySet().iterator();
//		while(iterator.hasNext()) {
//			String type = (String)iterator.next();
//			if ("MySql".equals(type)) {
//				dbconfig = dbconfList1.get(type);
//		        System.out.println(dbconfig.get("t_driver"));
//			}
//		}
		
//		for (String type : dbconfList1.keySet()) {
//			if ("MySql".equals(type)) {
//				dbconfig = dbconfList1.get(type);
//				System.out.println(dbconfig.get("t_driver"));
//			}
//		}
		
        dbconfig = dbconfList1.get("MySql");
        System.out.println(dbconfig.get("t_driver"));
        
	}

}
