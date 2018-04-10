package com.trusdata.integrate.group.bean;

import com.trusdata.common.bean.PageBean;

/**
 * 
 * @author JBDING
 * 
 */
public class PairGroupSearchBean extends PageBean {

	private static final long serialVersionUID = 1L;

	private String t_source_name;
	private String t_target_name;

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
