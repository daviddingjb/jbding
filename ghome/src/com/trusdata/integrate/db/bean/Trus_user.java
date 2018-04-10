package com.trusdata.integrate.db.bean;

import com.trusdata.common.annotation.Column;
import com.trusdata.common.annotation.Entity;

/**
 * 
 * @author JBDING
 *
 */
@Entity("trus_user")
public class Trus_user {
    @Column("t_user")
	private String t_user;
    @Column("t_password")
	private String t_password;
	
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
}
