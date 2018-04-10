package com.trusdata.integrate.group.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.trusdata.common.action.BasePageAction;
import com.trusdata.common.db.CustomDao;
import com.trusdata.common.db.adapter.DBAdaptee;
import com.trusdata.common.db.adapter.DBAdapter;
import com.trusdata.common.db.adapter.DBTarget;
import com.trusdata.common.util.ProcessorDB;
import com.trusdata.integrate.db.bean.Trus_mapping;
import com.trusdata.integrate.db.bean.Trus_server;
import com.trusdata.integrate.db.bean.Trus_user;
import com.trusdata.integrate.group.bean.GroupMappingListBean;
import com.trusdata.integrate.group.bean.GroupSearchBean;
import com.trusdata.integrate.group.service.GroupService;

/**
 * 
 * @author JBDING
 * 
 */
public class GroupAction extends BasePageAction<GroupSearchBean> {

	/**
	 * serialVersionUID.
	 */
	private static final long serialVersionUID = 3427717924561758576L;

	// 服务器详细信息
	private Trus_mapping mapping;

	List<Trus_server> serverList;

	private List<String> sourceDB;
	private List<String> targetDB;

	private GroupSearchBean searchBean = new GroupSearchBean();
	List<GroupMappingListBean> mappingList;

	/**
	 * 资源管理Service
	 */
	@Autowired
	GroupService service;

	/**
	 * 画面初始化
	 * 
	 * @return init
	 */
	public String init() {
		query();
		return "init";
	}

	/**
	 * 查询当前用户所有映射信息
	 * 
	 * @return mappingList
	 */
	public String query() {

		// 获取登录用户名
		HashMap<String, Object> usr = this.getLoginUser();
		if (usr == null) {
            return ERROR;
		}
		Trus_user loginUser = (Trus_user) usr.get("trus_user");

		searchBean.setT_work_user(loginUser.getT_user());

		mappingList = new ArrayList<GroupMappingListBean>();
		mappingList = service.selectAll(searchBean);
		return "sub";
	}

	public String toadd() {
		String rtn = "add";

		rtn = add();

		return rtn;
	}

	@SuppressWarnings("unchecked")
	public String add() {
		String rtn = "add";

		try {
			if (mapping == null) {
				sourceDB = new ArrayList<String>();
				targetDB = new ArrayList<String>();

				// 获取登录用户名
				HashMap<String, Object> usr = this.getLoginUser();
				if (usr == null) {
		        	rtn = ERROR;
		            return rtn;
				}
				Trus_user loginUser = (Trus_user) usr.get("trus_user");

				CustomDao<Trus_server> cdao = new CustomDao<Trus_server>();
				String sqlWhereString = "t_work_user = " + "'"
						+ loginUser.getT_user() + "'";
				serverList = cdao.findAllByConditions(sqlWhereString,
						Trus_server.class, null);

				for (Trus_server server : serverList) {
					sourceDB.add(server.getT_name());
					targetDB.add(server.getT_name());
				}

				return rtn;
				// 页面输入检查
			} else if (!checkUserInput(mapping)) {
				return rtn;
			} else {
				HashMap<String, HashMap<String, HashMap<String, HashMap<String, HashMap<String, Object>>>>> dbMap = new HashMap<String, HashMap<String, HashMap<String, HashMap<String, HashMap<String, Object>>>>>();
				// 获取登录用户名
				HashMap<String, Object> usr = this.getLoginUser();
				if (usr == null) {
		        	rtn = ERROR;
		            return rtn;
				}
			    usr.put("current_mapping", mapping);
			    saveLoginUser(usr);
			    
				Trus_user loginUser = (Trus_user) usr.get("trus_user");

				CustomDao<Trus_mapping> cdao = new CustomDao<Trus_mapping>();
				mapping.setT_work_user(loginUser.getT_user());

				StringBuilder sql = new StringBuilder();
				sql = cdao.touch_sql(mapping, "insert");

				HashMap<String, HashMap<String, String>> dbconfList = new HashMap<String, HashMap<String, String>>();
				dbconfList = (HashMap<String, HashMap<String, String>>) usr
						.get("trus_dbconfig");

				List<String> t_db_name = new ArrayList<String>();
				t_db_name.add(mapping.getT_source_name());
				t_db_name.add(mapping.getT_target_name());
				String db_str = "'" + mapping.getT_source_name() + "','"
						+ mapping.getT_target_name() + "'";

				CustomDao<Trus_server> cdao_ts = new CustomDao<Trus_server>();
				String sqlWhereString = "t_name in (" + db_str + ")";
				serverList = cdao_ts.findAllByConditions(sqlWhereString,
						Trus_server.class, null);

				for (String db_name : t_db_name) {
					if ("".equals(db_name) || db_name == null) {
						rtn = ERROR;
						return rtn;
					}

					for (Trus_server server : serverList) {
						if (db_name.equals(server.getT_name())) {
							HashMap<String, HashMap<String, HashMap<String, HashMap<String, Object>>>> dbMap_tmp = new HashMap<String, HashMap<String, HashMap<String, HashMap<String, Object>>>>();
							HashMap<String, String> connMap = new HashMap<String, String>();
							HashMap<String, String> dbconfig = new HashMap<String, String>();
							dbconfig = dbconfList.get(server.getT_type());

							connMap.put("driver", dbconfig.get("t_driver"));
							connMap.put(
									"url",
									dbconfig.get("t_url_start")
											+ server.getT_host() + ":"
											+ server.getT_port()
											+ dbconfig.get("t_url_end"));
							connMap.put("userName", server.getT_user());
							connMap.put("pwd", server.getT_password());
							connMap.put("t_server_name", server.getT_name());
							connMap.put("t_db_name", server.getT_db_name());
							connMap.put("t_type", server.getT_type());
							DBTarget target = new DBAdapter(new DBAdaptee(
									connMap));
							dbMap_tmp = target.insert();
							dbMap.put(server.getT_name(), dbMap_tmp);
							break;
						}
					}
				}

				ProcessorDB.createGroup(dbMap, sql);

				rtn = "add_ok";
			}
		} catch (Exception e) {
			rtn = ERROR;
			return rtn;
		}
		return rtn;
	}

	/**
	 * 检验用户输入是否正确
	 * 
	 * @param str
	 * @return
	 */
	private boolean validate(String str) {
		if (str != null && !"".equals(str.trim())) {
			return true;
		}
		return false;
	}

	/**
     * 
     */
	private boolean checkUserInput(Trus_mapping mapping) {
		if (this.validate(mapping.getT_name())) {
			return true;
		}
		return false;
	}

	/**
	 * get mapping
	 * 
	 * @return mapping
	 */
	public Trus_mapping getMapping() {
		return mapping;
	}

	/**
	 * set mapping
	 * 
	 * @param mapping
	 */
	public void setMapping(Trus_mapping mapping) {
		this.mapping = mapping;
	}

	/**
	 * get sourceDB
	 * 
	 * @return sourceDB
	 */
	public List<String> getSourceDB() {
		return sourceDB;
	}

	/**
	 * set sourceDB
	 * 
	 * @param sourceDB
	 */
	public void setSourceDB(List<String> sourceDB) {
		this.sourceDB = sourceDB;
	}

	/**
	 * get targetDB
	 * 
	 * @return targetDB
	 */
	public List<String> getTargetDB() {
		return targetDB;
	}

	/**
	 * set targetDB
	 * 
	 * @param targetDB
	 */
	public void setTargetDB(List<String> targetDB) {
		this.targetDB = targetDB;
	}

	public List<GroupMappingListBean> getMappingList() {
		return mappingList;
	}

	public void setMappingList(List<GroupMappingListBean> mappingList) {
		this.mappingList = mappingList;
	}

	@Override
	public GroupSearchBean getQueryBean() {
		return searchBean;
	}

	@Override
	public void setQueryBean(GroupSearchBean queryBean) {
		searchBean = queryBean;
	}

	public GroupSearchBean getSearchBean() {
		return searchBean;
	}

	public void setSearchBean(GroupSearchBean searchBean) {
		this.searchBean = searchBean;
	}
}
