package com.trusdata.integrate.db.bean;

import com.trusdata.common.annotation.Column;
import com.trusdata.common.annotation.Entity;
import com.trusdata.common.annotation.PrimaryKey;

/**
 * 
 * @author JBDING
 *
 */
@Entity("trus_dbconfig")
public class Trus_dbconfig {
	@PrimaryKey("t_name")
    @Column("t_name")
	private String t_name;
	@Column("t_type")
	private String t_type;
	@Column("t_driver")
	private String t_driver;
	@Column("t_url_start")
	private String t_url_start;
	@Column("t_url_end")
	private String t_url_end;

    public String getT_name() {
		return t_name;
	}
	public void setT_name(String t_name) {
		this.t_name = t_name;
	}
	public String getT_type() {
		return t_type;
	}
	public void setT_type(String t_type) {
		this.t_type = t_type;
	}
	public String getT_driver() {
		return t_driver;
	}
	public void setT_driver(String t_driver) {
		this.t_driver = t_driver;
	}
	public String getT_url_start() {
		return t_url_start;
	}
	public void setT_url_start(String t_url_start) {
		this.t_url_start = t_url_start;
	}
	public String getT_url_end() {
		return t_url_end;
	}
	public void setT_url_end(String t_url_end) {
		this.t_url_end = t_url_end;
	}
}
