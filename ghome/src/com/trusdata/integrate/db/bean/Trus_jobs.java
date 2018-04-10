package com.trusdata.integrate.db.bean;

import com.trusdata.common.annotation.Column;
import com.trusdata.common.annotation.Entity;
import com.trusdata.common.annotation.PrimaryKey;

/**
 * 
 * @author JBDING
 *
 */
@Entity("trus_jobs")
public class Trus_jobs {
	@PrimaryKey("t_name")
	@Column("t_name")
	private String t_name;
    @Column("t_description")
	private String t_description;
    @Column("t_work_user")
	private String t_work_user;
    @Column("t_mapping_name")
	private String t_mapping_name;

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
    public String getT_mapping_name() {
		return t_mapping_name;
	}
	public void setT_mapping_name(String t_mapping_name) {
		this.t_mapping_name = t_mapping_name;
	}
}
