package com.trusdata.common.interceptor;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import com.trusdata.common.action.BaseAction;

public class SessionInterceptor implements Interceptor {
	private static final long serialVersionUID = 285887038029309574L;
	private static final Logger log = Logger.getLogger(SessionInterceptor.class);
	
	/** 后台管理画面Url */
	private String adminUrl = null;
	
	/** 会话丢失后的跳转名 */
	private String lostForward = "sessionLost";
	
	/** 会话丢失后的跳转名 */
    private String lostForwardAdmin = "sessionLostAdmin";
    
	public void destroy() {
	}

	public void init() {
	}

	public String intercept(ActionInvocation invocation) throws Exception {
		log.debug("--------用户认证检测拦截器初始化----------");

		if (!invocation.getInvocationContext().getSession().containsKey(BaseAction.SESSION_USER_KEY)) {
			log.debug("--------session已丢失----------");
			if (adminUrl != null && invocation.getProxy().getConfig().getPackageName().contains(adminUrl)) {
			    return lostForwardAdmin;
			}
			return lostForward;
		} else {
			log.debug("--------session保持中------------");
			return invocation.invoke();
		}
	}

    /**
     * @param adminUrl the adminUrl to set
     */
    public void setAdminUrl(String adminUrl) {
        this.adminUrl = adminUrl;
    }

    /**
     * @param lostForward the lostForward to set
     */
    public void setLostForward(String lostForward) {
        this.lostForward = lostForward;
    }

    /**
     * @param lostForwardAdmin the lostForwardAdmin to set
     */
    public void setLostForwardAdmin(String lostForwardAdmin) {
        this.lostForwardAdmin = lostForwardAdmin;
    }
}
