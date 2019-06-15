package com.trusdata.integrate.manager.action;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import javax.swing.JOptionPane;

import org.springframework.beans.factory.annotation.Autowired;

import com.trusdata.common.action.BasePageAction;
import com.trusdata.common.util.ExportExcel;
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
public class QueryAction extends BasePageAction<ManagerSearchBean> {
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

	ReportInsertBean entity;

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
		
		// 获取登录用户名信息
		HashMap<String, Object> usr = this.getLoginUser();
		if (usr == null) {
			rtn = ERROR;
			return rtn;
		}
		P_user userBean = (P_user) usr.get("p_user");
		
		if ("8".equals(userBean.getT_level())) {
			rtn = "quinit";
		}
		
		return rtn;
	}

	public String query() {
		String rtn = "sub";
		serverList = new ArrayList<ReportListBean>();
		
		// 获取登录用户名信息
		HashMap<String, Object> usr = this.getLoginUser();
		if (usr == null) {
			rtn = ERROR;
			return rtn;
		}
		P_user userBean = (P_user) usr.get("p_user");
		searchBean.setT_level(userBean.getT_level());
		searchBean.setT_user(userBean.getT_user());
		
		serverList = service.selectAll(searchBean);
		return "sub";
	}

	public String select() {
		String rtn = "selectSub";
		serverList = new ArrayList<ReportListBean>();
		if (searchBean == null) {
			return "selectSub";
		}
		
		// 获取登录用户名信息
		HashMap<String, Object> usr = this.getLoginUser();
		if (usr == null) {
			rtn = ERROR;
			return rtn;
		}
		P_user userBean = (P_user) usr.get("p_user");
		searchBean.setT_level(userBean.getT_level());
		searchBean.setT_user(userBean.getT_user());
		
		if ("on".equals(searchBean.getPoverty_level1())) {
			searchBean.setPoverty_level1("1");
		}
		if ("on".equals(searchBean.getPoverty_level2())) {
			searchBean.setPoverty_level2("1");
		}
		if ("on".equals(searchBean.getPoverty_level3())) {
			searchBean.setPoverty_level3("1");
		}
		if ("on".equals(searchBean.getPoverty_level4())) {
			searchBean.setPoverty_level4("1");
		}
		serverList = service.selectAll(searchBean);
		return "selectSub";
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

	public String entity() {
		String rtn = "entity";
		entity = service.look(id1);

		return rtn;
	}

	public String btnDownload() {
		String rtn = "downloadAll";
		
		serverList = new ArrayList<ReportListBean>();
		
		// 获取登录用户名信息
		HashMap<String, Object> usr = this.getLoginUser();
		if (usr == null) {
			rtn = ERROR;
			return rtn;
		}
		P_user userBean = (P_user) usr.get("p_user");
		searchBean.setT_level(userBean.getT_level());
		searchBean.setT_user(userBean.getT_user());
		
		if ("on".equals(searchBean.getPoverty_level1())) {
			searchBean.setPoverty_level1("1");
		}
		if ("on".equals(searchBean.getPoverty_level2())) {
			searchBean.setPoverty_level2("1");
		}
		//五保户不计入汇总
//		if ("on".equals(searchBean.getPoverty_level3())) {
//			searchBean.setPoverty_level3("1");
//		}
		if ("on".equals(searchBean.getPoverty_level4())) {
			searchBean.setPoverty_level4("1");
		}
		serverList = service.selectAll(searchBean);

        ExportExcel<ReportListBean> ex = new ExportExcel<ReportListBean>();  
        String[] headers = { "编号", "年", "县市", "乡镇", "村", "组", "户主姓名", "评估总分" };  
        try {
        	Date date = new Date();
        	SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        	String dateStr =formatter.format(date);
        	String file = "D://脱贫汇总数据_" + dateStr +".xls";
        	OutputStream out = new FileOutputStream(file);  
        	ex.exportExcel(headers, serverList, out);  
        	out.close();  
        	JOptionPane.showMessageDialog(null, "导出成功!");  
        	System.out.println("excel导出成功！");  
        } catch (FileNotFoundException e) {  
           e.printStackTrace();
           rtn = ERROR;
           return rtn;
        } catch (IOException e) {  
           e.printStackTrace();  
           rtn = ERROR;
           return rtn;
        }
        
		return rtn;
	}

	public String updInit() {
		String rtn = "upd";

		return rtn;
	}

	public String queryData() {
		return "queryData";
	}

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

	public ReportInsertBean getEntity() {
		return entity;
	}

	public void setEntity(ReportInsertBean entity) {
		this.entity = entity;
	}
}
