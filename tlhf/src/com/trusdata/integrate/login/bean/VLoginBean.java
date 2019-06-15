package com.trusdata.integrate.login.bean;


/**
 * 登录页面的项目类.
 * 
 * @author JBDING
 * 
 */
public class VLoginBean {
    private String uname = null;
    private String pword = null;

    /**
     * get userName.
     * 
     * @return userName
     */
    public String getUname() {
        return uname;
    }

    /**
     * The userName to set.
     * 
     * @param userName
     *            userName
     */
    public void setUname(String uname) {
        this.uname = uname;
    }

    /**
     * get password.
     * 
     * @return password
     */
    public String getPword() {
        return pword;
    }

    /**
     * The password to set.
     * 
     * @param password
     *            password
     */
    public void setPword(String pword) {
        this.pword = pword;
    }
}
