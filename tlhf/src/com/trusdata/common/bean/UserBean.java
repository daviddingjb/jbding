package com.trusdata.common.bean;

/**
 * 
 * @author JBDING
 *
 */
public class UserBean implements java.io.Serializable {
	/**
	 * 序列化版本号
	 */
	private static final long serialVersionUID = 2579721409178754852L;

	/** 
	 * 用户id
	 */
	private String userId;

	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}
	
	/**
	 * @param userId
	 *            the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
