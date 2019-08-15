package com.trusdata.tlhf.manager.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.trusdata.common.action.BasePageAction;
import com.trusdata.integrate.db.bean.P_user;
import com.trusdata.integrate.report.bean.ReportIdentifyBean;
import com.trusdata.integrate.report.bean.ReportInsertBean;
import com.trusdata.integrate.report.bean.ReportTbaseBean;
import com.trusdata.tlhf.manager.bean.ManagerTopicListBean;
import com.trusdata.tlhf.manager.service.ManagerService;
import com.trusdata.tlhf.materials.bean.PactMaterialsBean;
import com.trusdata.tlhf.pact.bean.IndoorAirBean;
import com.trusdata.tlhf.pact.bean.PactInputListBean;
import com.trusdata.tlhf.pact.bean.PactSearchBean;
import com.trusdata.tlhf.tdata.bean.PactTdataBean;
import com.trusdata.tlhf.tdatajn.bean.PactTdataJnBean;

/**
 * 
 * @author JBDING
 * 
 */
public class ManagerAction extends BasePageAction<PactSearchBean> {
	/**
	 * UID
	 */
	private static final long serialVersionUID = -2225527419269363691L;

	// 服务器详细信息
	private PactMaterialsBean materials;
	private IndoorAirBean indoor;
	private PactTdataBean tdata;
	private PactTdataJnBean tdatajn;

	List<ManagerTopicListBean> serverList;
	ReportIdentifyBean id1;

	private List<String> dbmsg;
	private PactSearchBean searchBean = new PactSearchBean();

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
		serverList = new ArrayList<ManagerTopicListBean>();
		serverList = service.selectAll(searchBean);
		return rtn;
	}

	public String toadd() {
		String rtn = "add";

//		rtn = add(server);

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
//				insert = SetInsertBean.setBean(server, server1, server2,
//						server3);
//
//				insert.setId1(UUID.randomUUID().toString());
//				insert.setId2(UUID.randomUUID().toString());
//				insert.setId3(UUID.randomUUID().toString());
//				insert.setId4(UUID.randomUUID().toString());
//				insert.setReporter(reporter);
//				insert.setReport_date(new Date());
//
//				service.insert(insert);

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
//		String index[] = request.getParameterValues("number");
//		String id[] = request.getParameterValues("id");
//
//		ReportIdentifyBean delBean = new ReportIdentifyBean();
//		delBean.setId1(id[Integer.parseInt(index[0])]);
//		service.del(delBean);
//		rtn = query();

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

	public PactSearchBean getSearchBean() {
		return searchBean;
	}

	public void setSearchBean(PactSearchBean searchBean) {
		this.searchBean = searchBean;
	}

	public List<ManagerTopicListBean> getServerList() {
		return serverList;
	}

	public void setServerList(List<ManagerTopicListBean> serverList) {
		this.serverList = serverList;
	}

	public ReportIdentifyBean getId1() {
		return id1;
	}

	public void setId1(ReportIdentifyBean id1) {
		this.id1 = id1;
	}

	public PactMaterialsBean getMaterials() {
		return materials;
	}

	public void setMaterials(PactMaterialsBean materials) {
		this.materials = materials;
	}

	public IndoorAirBean getIndoor() {
		return indoor;
	}

	public void setIndoor(IndoorAirBean indoor) {
		this.indoor = indoor;
	}

	public PactTdataBean getTdata() {
		return tdata;
	}

	public void setTdata(PactTdataBean tdata) {
		this.tdata = tdata;
	}

	public PactTdataJnBean getTdatajn() {
		return tdatajn;
	}

	public void setTdatajn(PactTdataJnBean tdatajn) {
		this.tdatajn = tdatajn;
	}

	public ManagerService getService() {
		return service;
	}

	public void setService(ManagerService service) {
		this.service = service;
	}

}
