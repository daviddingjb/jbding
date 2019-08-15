package com.trusdata.tlhf.manager.bean;

import com.trusdata.common.bean.PageBean;

/**
 * 
 * @author JBDING
 * 
 */
public class ManagerTopicListBean extends PageBean {

	private static final long serialVersionUID = -3222102443527097903L;
	private String id1;
	private String obj_name;
	private String entrusted_id;
	private String entrusted_date;

	public String getId1() {
		return id1;
	}

	public void setId1(String id1) {
		this.id1 = id1;
	}

	public String getObj_name() {
		return obj_name;
	}

	public void setObj_name(String obj_name) {
		this.obj_name = obj_name;
	}

	public String getEntrusted_id() {
		return entrusted_id;
	}

	public void setEntrusted_id(String entrusted_id) {
		this.entrusted_id = entrusted_id;
	}

	public String getEntrusted_date() {
		return entrusted_date;
	}

	public void setEntrusted_date(String entrusted_date) {
		this.entrusted_date = entrusted_date;
	}

}
