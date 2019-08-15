package com.trusdata.tlhf.manager.bean;

import com.trusdata.common.bean.PageBean;
import com.trusdata.common.util.CodeConst;


/**
 * 
 * @author JBDING
 * 
 */
public class UserSearchBean extends PageBean {
	/**
	 * serialVersionUID.
	 */
	private static final long serialVersionUID = 7552880022130593710L;
	
	private String t_user;
	private String t_password;
	private String t_level;

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

	public String getT_level() {
		return t_level;
	}
	
	public String getStatusText() {
        return CodeConst.getCodeValue(CodeConst.TYPE_USERS, t_level);
    }

	public void setT_level(String t_level) {
		this.t_level = t_level;
	}
}
