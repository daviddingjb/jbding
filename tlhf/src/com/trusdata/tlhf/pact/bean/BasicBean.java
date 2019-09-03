package com.trusdata.tlhf.pact.bean;

import java.util.Date;

import com.trusdata.common.bean.PageBean;

/**
 * 
 * @author JBDING
 * 
 */
public class BasicBean extends PageBean {

	static final long serialVersionUID = 2831155708368181759L;
	private String id;
	private String entrusted_id;
	private String input_name;
	private Date create_dt;
	private String upd_name;
	private Date upd_dt;
	private String tlhf_name;
	private String entrusted_name;
	private String obj_name;
	private String obj_addr;
	private String const_name;
	private String const_unit_name;
	private String design_name;
	private String supervision_name;
	private String struc_type;
	private String area;
	private String pressure;
	private Date sampling_dt;
	private String check_type;
	private String sealed_time;
	private String sampling_temperature;
	private Date check_dt;
	private String check_depend;
	private String check_device;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEntrusted_id() {
		return entrusted_id;
	}

	public void setEntrusted_id(String entrusted_id) {
		this.entrusted_id = entrusted_id;
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

	public String getTlhf_name() {
		return tlhf_name;
	}

	public void setTlhf_name(String tlhf_name) {
		this.tlhf_name = tlhf_name;
	}

	public String getEntrusted_name() {
		return entrusted_name;
	}

	public void setEntrusted_name(String entrusted_name) {
		this.entrusted_name = entrusted_name;
	}

	public String getObj_name() {
		return obj_name;
	}

	public void setObj_name(String obj_name) {
		this.obj_name = obj_name;
	}

	public String getObj_addr() {
		return obj_addr;
	}

	public void setObj_addr(String obj_addr) {
		this.obj_addr = obj_addr;
	}

	public String getConst_name() {
		return const_name;
	}

	public void setConst_name(String const_name) {
		this.const_name = const_name;
	}

	public String getConst_unit_name() {
		return const_unit_name;
	}

	public void setConst_unit_name(String const_unit_name) {
		this.const_unit_name = const_unit_name;
	}

	public String getDesign_name() {
		return design_name;
	}

	public void setDesign_name(String design_name) {
		this.design_name = design_name;
	}

	public String getSupervision_name() {
		return supervision_name;
	}

	public void setSupervision_name(String supervision_name) {
		this.supervision_name = supervision_name;
	}

	public String getStruc_type() {
		return struc_type;
	}

	public void setStruc_type(String struc_type) {
		this.struc_type = struc_type;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getPressure() {
		return pressure;
	}

	public void setPressure(String pressure) {
		this.pressure = pressure;
	}

	public Date getSampling_dt() {
		return sampling_dt;
	}

	public void setSampling_dt(Date sampling_dt) {
		this.sampling_dt = sampling_dt;
	}

	public String getCheck_type() {
		return check_type;
	}

	public void setCheck_type(String check_type) {
		this.check_type = check_type;
	}

	public String getSealed_time() {
		return sealed_time;
	}

	public void setSealed_time(String sealed_time) {
		this.sealed_time = sealed_time;
	}

	public String getSampling_temperature() {
		return sampling_temperature;
	}

	public void setSampling_temperature(String sampling_temperature) {
		this.sampling_temperature = sampling_temperature;
	}

	public Date getCheck_dt() {
		return check_dt;
	}

	public void setCheck_dt(Date check_dt) {
		this.check_dt = check_dt;
	}

	public String getCheck_depend() {
		return check_depend;
	}

	public void setCheck_depend(String check_depend) {
		this.check_depend = check_depend;
	}

	public String getCheck_device() {
		return check_device;
	}

	public void setCheck_device(String check_device) {
		this.check_device = check_device;
	}

}
