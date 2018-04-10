package com.trusdata.integrate.db.bean;

import java.util.Date;

import com.trusdata.common.annotation.Column;
import com.trusdata.common.annotation.Entity;
import com.trusdata.common.annotation.PrimaryKey;

/**
 * 
 * @author JBDING
 * 
 */
@Entity("trus_group_pair")
public class Trus_group_pair {
	@PrimaryKey("t_name")
	@Column("t_name")
	private Double t_name;
	@Column("t_create_time")
	private Date t_create_time;
	@Column("t_group_name")
	private String t_group_name;
	@Column("t_pair_group_name")
	private String t_pair_group_name;
	@Column("t_source_tbl_name")
	private String t_source_tbl_name;
	@Column("t_target_tbl_name")
	private String t_target_tbl_name;

	public Double getT_name() {
		return t_name;
	}

	public void setT_name(Double t_name) {
		this.t_name = t_name;
	}

	public Date getT_create_time() {
		return t_create_time;
	}

	public void setT_create_time(Date t_create_time) {
		this.t_create_time = t_create_time;
	}

	public String getT_group_name() {
		return t_group_name;
	}

	public void setT_group_name(String t_group_name) {
		this.t_group_name = t_group_name;
	}
	
	public String getT_pair_group_name() {
		return t_pair_group_name;
	}

	public void setT_pair_group_name(String t_pair_group_name) {
		this.t_pair_group_name = t_pair_group_name;
	}

	public String getT_source_tbl_name() {
		return t_source_tbl_name;
	}

	public void setT_source_tbl_name(String t_source_tbl_name) {
		this.t_source_tbl_name = t_source_tbl_name;
	}

	public String getT_target_tbl_name() {
		return t_target_tbl_name;
	}

	public void setT_target_tbl_name(String t_target_tbl_name) {
		this.t_target_tbl_name = t_target_tbl_name;
	}
}
