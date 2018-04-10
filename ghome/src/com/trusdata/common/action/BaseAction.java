package com.trusdata.common.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 全部Action的继承类.
 * 
 * @author JBDING
 */
public class BaseAction extends ActionSupport implements SessionAware, ServletRequestAware, ServletResponseAware  {

    private static final long serialVersionUID = 6847278193052792738L;

    /** 用户信息在session中保存时用的key */
    public static final String SESSION_USER_KEY = "SESSION_USER_KEY";

    /**
     * 请求
     */
    public HttpServletRequest request;

    /**
     * 回答，回应
     */
    public HttpServletResponse response;

    /**
     * session
     */
    public Map<String, Object> session;

    /**
     * 上下文
     */
    public ActionContext ctx;

    /**
     * 请求
     */
    @Override
    public void setServletRequest(HttpServletRequest arg0) {
        this.request = arg0;
    }

    /**
     * session
     */
    @Override
    public void setSession(Map<String, Object> arg0) {
        this.session = (SessionMap<String, Object>) arg0;
    }

    /**
     * response
     */
    @Override
    public void setServletResponse(HttpServletResponse response) {
        this.response = response;
    }

    /**
     * 清空session中除了用户的其他信息.
     */
    public void initSession() {
        // 取得上下文环境
        ctx = ActionContext.getContext();

        Object userInfo = session.get(SESSION_USER_KEY);
        session.clear();
        if (userInfo != null) {
            session.put(SESSION_USER_KEY, userInfo);
        }
    }

    /**
     * 取得当前登录的用户对象<br>
     * 
     * @return 前登录的用户对象
     */
    @SuppressWarnings("unchecked")
    public <E extends Object> E getLoginUser() {
        return (E) this.session.get(SESSION_USER_KEY);
    }

    /**
     * 保存用户对象到session
     * 
     * @param obj
     */
    protected <E extends Object> void saveLoginUser(E obj) {
        this.session.put(SESSION_USER_KEY, obj);
    }
}
