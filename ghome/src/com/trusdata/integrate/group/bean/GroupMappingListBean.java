package com.trusdata.integrate.group.bean;

import com.trusdata.common.bean.PageBean;

/**
 * 
 * @author JBDING
 * 
 */
public class GroupMappingListBean extends PageBean {

	private static final long serialVersionUID = 5283541059074197472L;
	
	private String t_name;
	private String t_description;
	private String t_work_user;
	private String t_source_name;
	private String t_target_name;

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

	public String getT_work_user() {
		return t_work_user;
	}

	public void setT_work_user(String t_work_user) {
		this.t_work_user = t_work_user;
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
}
