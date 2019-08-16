package com.trusdata.tlhf.common.bean;

import java.util.Date;

import com.trusdata.common.bean.PageBean;

/**
 * 
 * @author JBDING
 * 
 */
public class TlhfTopicBean extends PageBean {

	private static final long serialVersionUID = 1L;
	private String id;
	private String obj_name;
	private String entrusted_id;
	private String entrusted_date;
	private String input_name;
	private Date create_dt;
	private String upd_name;
	private Date upd_dt;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getInput_name() {
		return input_name;
	}

	public void setInput_name(String input_name) {
		this.input_name = input_name;
	}

	public Date getCreate_dt() {
		return create_dt;
	}

	public void setCreate_dt(Date create_dt) {
		this.create_dt = create_dt;
	}

	public String getUpd_name() {
		return upd_name;
	}

	public void setUpd_name(String upd_name) {
		this.upd_name = upd_name;
	}

	public Date getUpd_dt() {
		return upd_dt;
	}

	public void setUpd_dt(Date upd_dt) {
		this.upd_dt = upd_dt;
	}

}
