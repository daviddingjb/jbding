package com.trusdata.integrate.connection.bean;

import com.trusdata.common.bean.PageBean;

/**
 * 
 * @author JBDING
 * 
 */
public class ConnListBean extends PageBean {

	private static final long serialVersionUID = -3222102443527097903L;
	private String t_name;
	private String t_description;
	private String t_work_user;
	private String t_host;
	private String t_port;
	private String t_type;
	private String t_db_name;
	private String t_user;
	private String t_password;
	private String t_repair_user;
	private String t_repair_password;

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

	public String getT_host() {
		return t_host;
	}

	public void setT_host(String t_host) {
		this.t_host = t_host;
	}

	public String getT_port() {
		return t_port;
	}

	public void setT_port(String t_port) {
		this.t_port = t_port;
	}

	public String getT_type() {
		return t_type;
	}

	public void setT_type(String t_type) {
		this.t_type = t_type;
	}

	public String getT_db_name() {
		return t_db_name;
	}

	public void setT_db_name(String t_db_name) {
		this.t_db_name = t_db_name;
	}

	public String getT_user() {
		return t_user;
	}

	public void setT_user(String t_user) {
		this.t_user = t_user;
	}

	public String getT_password() {
		return t_password;
	}

	public void setT_password(String t_password) {
		this.t_password = t_password;
	}

	public String getT_repair_user() {
		return t_repair_user;
	}

	public void setT_repair_user(String t_repair_user) {
		this.t_repair_user = t_repair_user;
	}

	public String getT_repair_password() {
		return t_repair_password;
	}

	public void setT_repair_password(String t_repair_password) {
		this.t_repair_password = t_repair_password;
	}
}
