package com.trusdata.tlhf.input.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import com.trusdata.common.action.BasePageAction;
import com.trusdata.integrate.db.bean.P_user;
import com.trusdata.integrate.report.bean.ReportSearchBean;
import com.trusdata.integrate.report.bean.SetInsertBean;
import com.trusdata.tlhf.input.bean.IndoorAirBean;
import com.trusdata.tlhf.input.bean.PactSearchBean;
import com.trusdata.tlhf.input.service.PactService;

/**
 * 
 * @author JBDING
 * 
 */
public class PactAction extends BasePageAction<ReportSearchBean> {
	/**
	 * UID
	 */
	private static final long serialVersionUID = -2225527419269363691L;

	// 服务器详细信息
	private IndoorAirBean server;
//	private PactStatus1Bean server1;
//	private PactStatus2Bean server2;
//	private PactStatus3Bean server3;
//	List<PactListBean> serverList;
//	PactIdentifyBean id1;

	private List<String> dbmsg;
	private PactSearchBean searchBean = new PactSearchBean();

	/**
	 * 资源管理Service
	 */
	@Autowired
	PactService service;

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
		P_user userBean = (P_user) loginUser.get("p_user");
		searchBean.setT_work_user(userBean.getT_user());

//		serverList = new ArrayList<PactListBean>();
//		serverList = service.selectAll(searchBean);
		return "sub";
	}

	public String toadd() {
		String rtn = "add";

		rtn = add(server);

		return rtn;
	}

	public String add(IndoorAirBean server) {
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

				PactInsertBean insert = new PactInsertBean();
				insert = SetInsertBean.setBean(server, server1, server2, server3);
				
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

	public List<String> getDbmsg() {
		return dbmsg;
	}

	public void setDbmsg(List<String> dbmsg) {
		this.dbmsg = dbmsg;
	}

	@Override
	public PactSearchBean getQueryBean() {
		return searchBean;
	}

	@Override
	public void setQueryBean(PactSearchBean queryBean) {
		searchBean = queryBean;
	}

	public List<PactListBean> getServerList() {
		return serverList;
	}

	public void setServerList(List<PactListBean> serverList) {
		this.serverList = serverList;
	}

	public PactSearchBean getSearchBean() {
		return searchBean;
	}

	public void setSearchBean(PactSearchBean searchBean) {
		this.searchBean = searchBean;
	}

//	public PactTbaseBean getServer() {
//		return server;
//	}
//
//	public void setServer(PactTbaseBean server) {
//		this.server = server;
//	}
//
//	public PactStatus1Bean getServer1() {
//		return server1;
//	}
//
//	public void setServer1(PactStatus1Bean server1) {
//		this.server1 = server1;
//	}
//
//	public PactStatus2Bean getServer2() {
//		return server2;
//	}
//
//	public void setServer2(PactStatus2Bean server2) {
//		this.server2 = server2;
//	}
//
//	public PactStatus3Bean getServer3() {
//		return server3;
//	}
//
//	public void setServer3(PactStatus3Bean server3) {
//		this.server3 = server3;
//	}
//
//	public PactIdentifyBean getId1() {
//		return id1;
//	}
//
//	public void setId1(PactIdentifyBean id1) {
//		this.id1 = id1;
//	}
}
