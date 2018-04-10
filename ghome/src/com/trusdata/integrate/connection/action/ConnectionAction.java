package com.trusdata.integrate.connection.action;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.trusdata.common.action.BasePageAction;
import com.trusdata.common.db.CustomDao;
import com.trusdata.common.db.DBConnection;
import com.trusdata.integrate.connection.bean.ConnListBean;
import com.trusdata.integrate.connection.bean.ConnSearchBean;
import com.trusdata.integrate.connection.service.ConnectionService;
import com.trusdata.integrate.db.bean.Trus_dbconfig;
import com.trusdata.integrate.db.bean.Trus_server;
import com.trusdata.integrate.db.bean.Trus_user;

/**
 * 
 * @author JBDING
 * 
 */
public class ConnectionAction extends BasePageAction<ConnSearchBean> {
	/**
	 * UID
	 */
	private static final long serialVersionUID = -2225527419269363691L;

	// 服务器详细信息
	private Trus_server server;
	List<ConnListBean> serverList;

	List<Trus_dbconfig> dbmsgList;
	private List<String> dbmsg;
	private ConnSearchBean connSearchBean = new ConnSearchBean();
	
	/**
	 * 资源管理Service
	 */
	@Autowired
	ConnectionService connService;

	/**
	 * 画面初始化
	 * 
	 * @return rtn
	 */
	public String init() {
		String rtn = "init";
		query();

		return rtn;
	}
	
	public String query() {

		// 获取登录用户名
		HashMap<String, Object> loginUser = this.getLoginUser();
		if (loginUser == null) {
			return "error";
		}
		Trus_user userBean = (Trus_user) loginUser.get("trus_user");
		connSearchBean.setT_work_user(userBean.getT_user());

		serverList = new ArrayList<ConnListBean>();
		serverList = connService.selectAll(connSearchBean);
		return "sub";
	}

	public String toadd() {
		String rtn = "add";

		rtn = add(server);

		return rtn;
	}

	@SuppressWarnings("unchecked")
	public String add(Trus_server server) {
		String rtn = "add";

		try {
			// 页面输入检验
			if (server == null) {
				dbmsg = new ArrayList<String>();

				CustomDao<Trus_dbconfig> cdao = new CustomDao<Trus_dbconfig>();
				String sqlWhereString = "";
				dbmsgList = cdao.findAllByConditions(sqlWhereString,
						Trus_dbconfig.class, null);

				for (Trus_dbconfig detail : dbmsgList) {
					dbmsg.add(detail.getT_type());
				}

				return rtn;
			} else if (!checkUserInput(server)) {
				rtn = "check_error";
				return rtn;
			} else {
        		// 获取登录用户名信息
                HashMap<String, Object> usr = this.getLoginUser();
        		if (usr == null) {
                	rtn = ERROR;
                    return rtn;
        		}
                
            	// step1:check connection
                HashMap<String, HashMap<String, String>> dbconfList = new HashMap<String, HashMap<String, String>>();
				HashMap<String, String> dbconfig = new HashMap<String, String>();
				dbconfList = (HashMap<String, HashMap<String,String>>)usr.get("trus_dbconfig");
                dbconfig = dbconfList.get(server.getT_type());
                
        		String driver = dbconfig.get("t_driver");
        		String url = dbconfig.get("t_url_start") + server.getT_host() + ":" + server.getT_port() + dbconfig.get("t_url_end");
        		String userName = server.getT_user();
        		String pwd = server.getT_password();
        		Connection conn = DBConnection.getConnection(driver, url, userName, pwd);
    			// 無法創建數據庫連接
        		if (conn == null) {
                	rtn = ERROR;
                    return rtn;
				}
        		DBConnection.closeRes(conn, null);
            	
            	// step2:insert connection
            	Trus_user userBean = (Trus_user)usr.get("trus_user");
            	CustomDao<Trus_server> cdao_trus_server = new CustomDao<Trus_server>();
            	server.setT_work_user(userBean.getT_user());
            	cdao_trus_server.insert(server);
            	
            	rtn = "add_ok";
			}
		} catch (Exception e) {
			rtn = ERROR;
			return rtn;
		}
		
		return rtn;
	}

	/**
	 * 检验用户是否正确
	 * 
	 * @param str
	 *            用户名/密码
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
	private boolean checkUserInput(Trus_server server) {
		if (this.validate(server.getT_name())) {
			return true;
		}
		return false;
	}

	/**
	 * get server.
	 * 
	 * @return server
	 */
	public Trus_server getServer() {
		return server;
	}

	/**
	 * set server.
	 * 
	 * @param server
	 */
	public void setServer(Trus_server server) {
		this.server = server;
	}

	public List<ConnListBean> getServerList() {
		return serverList;
	}

	public void setServerList(List<ConnListBean> serverList) {
		this.serverList = serverList;
	}

	public List<String> getDbmsg() {
		return dbmsg;
	}

	public void setDbmsg(List<String> dbmsg) {
		this.dbmsg = dbmsg;
	}

	public List<Trus_dbconfig> getDbmsgList() {
		return dbmsgList;
	}

	public void setDbmsgList(List<Trus_dbconfig> dbmsgList) {
		this.dbmsgList = dbmsgList;
	}

	@Override
	public ConnSearchBean getQueryBean() {
		return connSearchBean;
	}

	@Override
	public void setQueryBean(ConnSearchBean queryBean) {
		connSearchBean = queryBean;
	}

	public ConnSearchBean getConnSearchBean() {
		return connSearchBean;
	}

	public void setConnSearchBean(ConnSearchBean connSearchBean) {
		this.connSearchBean = connSearchBean;
	}
}
