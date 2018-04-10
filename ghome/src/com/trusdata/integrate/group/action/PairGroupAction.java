package com.trusdata.integrate.group.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.trusdata.common.action.BasePageAction;
import com.trusdata.common.util.ProcessorDB;
import com.trusdata.integrate.db.bean.Trus_mapping;
import com.trusdata.integrate.group.bean.PairGroup;
import com.trusdata.integrate.group.bean.PairGroupSearchBean;
import com.trusdata.integrate.group.service.GroupService;

/**
 * 
 * @author JBDING
 * 
 */
public class PairGroupAction extends BasePageAction<PairGroupSearchBean> {

	private static final long serialVersionUID = 1027589418556778624L;
	
	private String t_name;
	private String t_description;
	private String t_source_name;
	private String t_target_name;
	
	private PairGroupSearchBean pairSearchBean = new PairGroupSearchBean();
	List<PairGroup> pairGroupList;

	/**
	 * 资源管理Service
	 */
	@Autowired
	GroupService service;

	public String pair() {
		queryPair();

		return "pair";
	}
	
	public String queryPair() {
		String rtn = "pair_sub";
		
		HashMap<String, Object> usr = this.getLoginUser();
		if (usr == null) {
        	rtn = ERROR;
            return rtn;
		}
		
		Trus_mapping t_mapping = new Trus_mapping();
		t_mapping = (Trus_mapping)usr.get("current_mapping");
		if (t_mapping == null) {
        	rtn = ERROR;
            return rtn;
		}

		pairSearchBean.setT_source_name(t_mapping.getT_source_name());
		pairSearchBean.setT_target_name(t_mapping.getT_target_name());
		pairGroupList = new ArrayList<PairGroup>();
		pairGroupList = service.selectAll(pairSearchBean);
		
		t_name = t_mapping.getT_name();
		t_description = t_mapping.getT_description();
		t_source_name = t_mapping.getT_source_name();
		t_target_name = t_mapping.getT_target_name();
		
		return rtn;
	}

	public String savePair() {
		String rtn = "pair_ok";

		String t_name = request.getParameter("t_name");
		String checkbox[] = request.getParameterValues("number");
		String pair_group_names[] = request.getParameterValues("pair_group_name");
		String source_tbl_names[] = request.getParameterValues("source_tbl_name");
		String target_tbl_names[] = request.getParameterValues("target_tbl_name");
		int idx = 0;
		HashMap<String, String> page = new HashMap<String, String>();
		HashMap<String, HashMap<String, String>> pages = new HashMap<String, HashMap<String, String>>();
		for (String s : checkbox) {
			idx = Integer.parseInt(s);
			page.put("t_name", t_name);
			page.put("pair_group_name", pair_group_names[idx]);
			page.put("source_tbl_name", source_tbl_names[idx]);
			page.put("target_tbl_name", target_tbl_names[idx]);
			pages.put(s, page);
		}
		
		try {
			ProcessorDB.createGroupPair(pages);
		} catch (Exception e) {
        	rtn = ERROR;
            return rtn;
		}
		
		return rtn;
	}

	public List<PairGroup> getPairGroupList() {
		return pairGroupList;
	}

	public void setPairGroupList(List<PairGroup> pairGroupList) {
		this.pairGroupList = pairGroupList;
	}

	public String getT_name() {
		return t_name;
	}

	public void setT_name(String t_name) {
		this.t_name = t_name;
	}

	public String getT_description() {
		return t_description;
	}

	public void setT_description(String t_description) {
		this.t_description = t_description;
	}
	
	public String getT_source_name() {
		return t_source_name;
	}

	public void setT_source_name(String t_source_name) {
		this.t_source_name = t_source_name;
	}

	public String getT_target_name() {
		return t_target_name;
	}

	public void setT_target_name(String t_target_name) {
		this.t_target_name = t_target_name;
	}
	

	@Override
	public PairGroupSearchBean getQueryBean() {
		return pairSearchBean;
	}

	@Override
	public void setQueryBean(PairGroupSearchBean queryBean) {
		pairSearchBean = queryBean;
	}


	public PairGroupSearchBean getPairSearchBean() {
		return pairSearchBean;
	}

	public void setPairSearchBean(PairGroupSearchBean pairSearchBean) {
		this.pairSearchBean = pairSearchBean;
	}
}
