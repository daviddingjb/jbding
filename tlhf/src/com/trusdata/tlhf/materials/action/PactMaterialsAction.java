package com.trusdata.tlhf.materials.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import com.trusdata.common.action.BasePageAction;
import com.trusdata.integrate.db.bean.P_user;
import com.trusdata.tlhf.materials.bean.PactMaterialsBean;
import com.trusdata.tlhf.materials.bean.SetPactMaterialsBean;
import com.trusdata.tlhf.materials.service.PactMaterialsService;
import com.trusdata.tlhf.pact.bean.PactIdentifyBean;
import com.trusdata.tlhf.pact.bean.PactInputListBean;
import com.trusdata.tlhf.pact.bean.PactSearchBean;

/**
 * 
 * @author JBDING
 * 
 */
public class PactMaterialsAction extends BasePageAction<PactSearchBean> {
	/**
	 * UID
	 */
	private static final long serialVersionUID = -2225527419269363691L;

	// 服务器详细信息
	private PactMaterialsBean materials;
	List<PactInputListBean> serverList;

	private List<String> dbmsg;
	private PactSearchBean searchBean = new PactSearchBean();

	/**
	 * 资源管理Service
	 */
	@Autowired
	PactMaterialsService service;

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

		serverList = new ArrayList<PactInputListBean>();
		serverList = service.selectAll(searchBean);
		return "sub";
	}

	public String toadd() {
		String rtn = "add";

		rtn = add(materials);

		return rtn;
	}

	public String add(PactMaterialsBean server) {
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
				String input_name = userBean.getT_user();

				PactMaterialsBean insert = new PactMaterialsBean();
				insert = SetPactMaterialsBean.setBean(server);

				insert.setId(UUID.randomUUID().toString());
				insert.setInput_name(input_name);
				insert.setCreate_dt(new Date());

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
		
		PactIdentifyBean delBean = new PactIdentifyBean();
		delBean.setId1(id[Integer.parseInt(index[0])]);
		service.del(delBean);
		rtn = query();

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

	public PactMaterialsBean getMaterials() {
		return materials;
	}

	public void setMaterials(PactMaterialsBean materials) {
		this.materials = materials;
	}

	public List<PactInputListBean> getServerList() {
		return serverList;
	}

	public void setServerList(List<PactInputListBean> serverList) {
		this.serverList = serverList;
	}

}
