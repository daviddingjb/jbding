package com.trusdata.integrate.connection.bean;

import com.trusdata.common.bean.PageBean;

/**
 * 
 * @author JBDING
 *
 */
public class ConnSearchBean extends PageBean {

	private static final long serialVersionUID = 1L;

	private String t_work_user;

	public String getT_work_user() {
		return t_work_user;
	}

	public void setT_work_user(String t_work_user) {
		this.t_work_user = t_work_user;
	}
}
