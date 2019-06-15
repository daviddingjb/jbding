package com.trusdata.integrate.manager.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import com.trusdata.common.action.BasePageAction;
import com.trusdata.integrate.db.bean.P_user;
import com.trusdata.integrate.manager.bean.ManagerSearchBean;
import com.trusdata.integrate.manager.service.ManagerService;
import com.trusdata.integrate.report.bean.ReportIdentifyBean;
import com.trusdata.integrate.report.bean.ReportInsertBean;
import com.trusdata.integrate.report.bean.ReportListBean;
import com.trusdata.integrate.report.bean.ReportStatus1Bean;
import com.trusdata.integrate.report.bean.ReportStatus2Bean;
import com.trusdata.integrate.report.bean.ReportStatus3Bean;
import com.trusdata.integrate.report.bean.ReportTbaseBean;
import com.trusdata.integrate.report.bean.SetInsertBean;

/**
 * 
 * @author JBDING
 * 
 */
public class ManagerAction extends BasePageAction<ManagerSearchBean> {
	/**
	 * UID
	 */
	private static final long serialVersionUID = -2225527419269363691L;

	// 服务器详细信息
	private ReportTbaseBean server;

	private ReportStatus1Bean server1;
	private ReportStatus2Bean server2;
	private ReportStatus3Bean server3;
	List<ReportListBean> serverList;
	ReportIdentifyBean id1;

	private List<String> dbmsg;
	private ManagerSearchBean searchBean = new ManagerSearchBean();

	/**
	 * 资源管理Service
	 */
	@Autowired
	ManagerService service;

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
		String rtn = "sub";
		serverList = new ArrayList<ReportListBean>();
		serverList = service.selectAll(searchBean);
		return rtn;
	}

	public String toadd() {
		String rtn = "add";

		rtn = add(server);

		return rtn;
	}

	public String add(ReportTbaseBean server) {
		String rtn = "add";

		try {
			// 页面输入检验
			if (server == null) {
				return rtn;
			} else {
				// 获取登录用户名信息
				HashMap<String, Object> usr = this.getLoginUser();
				if (usr == null) {
					rtn = ERROR;
					return rtn;
				}
				P_user userBean = (P_user) usr.get("p_user");
				String reporter = userBean.getT_user();

				ReportInsertBean insert = new ReportInsertBean();
				insert = SetInsertBean.setBean(server, server1, server2,
						server3);

				insert.setId1(UUID.randomUUID().toString());
				insert.setId2(UUID.randomUUID().toString());
				insert.setId3(UUID.randomUUID().toString());
				insert.setId4(UUID.randomUUID().toString());
				insert.setReporter(reporter);
				insert.setReport_date(new Date());

				service.insert(insert);

				rtn = "add_ok";
			}
		} catch (Exception e) {
			rtn = ERROR;
			return rtn;
		}

		return rtn;
	}

	public String del() {
		String rtn = "sub";
		String index[] = request.getParameterValues("number");
		String id[] = request.getParameterValues("id");

		ReportIdentifyBean delBean = new ReportIdentifyBean();
		delBean.setId1(id[Integer.parseInt(index[0])]);
		service.del(delBean);
		rtn = query();

		return rtn;
	}
//	
//	public String updInit() {
//		String rtn = "upd";
//
//		return rtn;
//	}
//
//	public String queryData() {
//		query();
//		return "queryData";
//	}

	public List<String> getDbmsg() {
		return dbmsg;
	}

	public void setDbmsg(List<String> dbmsg) {
		this.dbmsg = dbmsg;
	}

	@Override
	public ManagerSearchBean getQueryBean() {
		return searchBean;
	}

	@Override
	public void setQueryBean(ManagerSearchBean queryBean) {
		searchBean = queryBean;
	}

	public ManagerSearchBean getSearchBean() {
		return searchBean;
	}

	public void setSearchBean(ManagerSearchBean searchBean) {
		this.searchBean = searchBean;
	}

	public List<ReportListBean> getServerList() {
		return serverList;
	}

	public void setServerList(List<ReportListBean> serverList) {
		this.serverList = serverList;
	}

	public ReportIdentifyBean getId1() {
		return id1;
	}

	public void setId1(ReportIdentifyBean id1) {
		this.id1 = id1;
	}

	public ReportTbaseBean getServer() {
		return server;
	}

	public void setServer(ReportTbaseBean server) {
		this.server = server;
	}

	public ReportStatus1Bean getServer1() {
		return server1;
	}

	public void setServer1(ReportStatus1Bean server1) {
		this.server1 = server1;
	}

	public ReportStatus2Bean getServer2() {
		return server2;
	}

	public void setServer2(ReportStatus2Bean server2) {
		this.server2 = server2;
	}

	public ReportStatus3Bean getServer3() {
		return server3;
	}

	public void setServer3(ReportStatus3Bean server3) {
		this.server3 = server3;
	}

	public ManagerService getService() {
		return service;
	}

	public void setService(ManagerService service) {
		this.service = service;
	}

//	public List<User> getUserList() {
//		return userList;
//	}
//
//	public void setUserList(List<User> userList) {
//		this.userList = userList;
//	}
//
//	public UserSearchBean getUserSearchBean() {
//		return userSearchBean;
//	}
//
//	public void setUserSearchBean(UserSearchBean userSearchBean) {
//		this.userSearchBean = userSearchBean;
//	}
//
//	public User getUser() {
//		return user;
//	}
//
//	public void setUser(User user) {
//		this.user = user;
//	}
}
