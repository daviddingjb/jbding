package com.trusdata.integrate.login.action;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.servlet.ServletInputStream;
import javax.servlet.http.Cookie;

import com.trusdata.common.action.BaseAction;
import com.trusdata.common.db.GenericDao;
import com.trusdata.common.util.MD5;
import com.trusdata.common.util.TrusdataLogger;
import com.trusdata.integrate.db.bean.P_user;
import com.trusdata.integrate.login.bean.VLoginBean;

/**
 * 
 * @author JBDING
 *
 */
public class LoginAction extends BaseAction {
    // UID
    private static final long serialVersionUID = 8378340619329845207L;

    // 日志
    TrusdataLogger logger = new TrusdataLogger(LoginAction.class);

    // 登錄项目
    private VLoginBean user;
    
    private HashMap<String, Object> useMap = new HashMap<String, Object>();

	/**
     * 画面初始化
     * 
     * @return init
     */
    public String init() {
        return "init";
    }

    @Override
    public String execute() throws Exception {
        // logger.enter();
        String rtn = ERROR;
        
        Enumeration<String> parNames = request.getParameterNames();
        while (parNames.hasMoreElements()) {
        	String parString = parNames.nextElement();
            System.out.println("request.getParameterNames=[" + parString + "]");
            System.out.println(parString   + "[" + request.getParameterValues(parString) + "]");
		}

        Enumeration<String> heaNames = request.getHeaderNames();
        while (heaNames.hasMoreElements()) {
        	String element = heaNames.nextElement();
            System.out.println("request.getHeaderNames=   [" + element + "]");
            System.out.println(element   + "[" + request.getHeader(element) + "]");
		}

        System.out.println("request.getContentType=  [" + request.getContentType() + "]");
        System.out.println("request.getContextPath=  [" + request.getContextPath() + "]");
        System.out.println("request.getContentLength=[" + request.getContentLength() + "]");
        System.out.println("request.getAuthType=     [" + request.getAuthType() + "]");
        
        Enumeration<String> att = request.getAttributeNames();
        while (att.hasMoreElements()) {
            System.out.println("request.getAttributeNames=[" + att.nextElement() + "]");
		}
        
        ServletInputStream inStream = request.getInputStream();
        System.out.println("request.getInputStream=  [" + inStream.toString() + "]");
        
//        Cookie[] coo = request.getCookies();
//        System.out.println("request.getCookies=      [" + coo.toString() + "]");
        
        
        initSession();
        
        try {
            // 用户验证
            if (!checkUser(user)) {
                // logger.end();
                return rtn;
            } else {
                Map<String, Object> sqlWhereMap = new TreeMap<String, Object>();
                sqlWhereMap.put("t_user", user.getUname());
                sqlWhereMap.put("t_password", MD5.MD5Encode(user.getPword()));
                GenericDao<P_user> gdao = new GenericDao<P_user>();
                List<P_user> userInfo = gdao.findAllByConditions(sqlWhereMap, P_user.class, null);
                if (userInfo.size() != 0) {
        			// 把用户信息存放session中
                	P_user userBean = userInfo.get(0);
                	if (!useMap.containsKey("p_user")) {
                		useMap.put("p_user", userBean);
					}
        			saveLoginUser(useMap);
        			if ("0".equals(userBean.getT_level())) {
        				rtn = "manager";
					} else if ("1".equals(userBean.getT_level())) {
        				rtn = "reporter";
					} else if ("8".equals(userBean.getT_level())) {
        				rtn = "manager";
					} else if ("9".equals(userBean.getT_level())) {
        				rtn = "reporter";
					} else {
        				rtn = "other";
					}
        			
                } else {
                	rtn = ERROR;
                    return rtn;
                }
            }
        } catch (Exception e) {
            // logger.fatal(e.getMessage());
        	rtn = ERROR;
            return rtn;
        } finally {
            // logger.end();
        }
        return rtn;
    }

    /**
     * 检验用户是否正确
     * 
     * @param str
     *            用户名/密码
     * @return
     */
    private boolean validate(String str) {
        if (str != null && !"".equals(str.trim())) {
            return true;
        }
        return false;
    }
    
    /**
     * 
     */
    private boolean checkUser(VLoginBean user) {
        if (this.validate(user.getUname()) 
         && this.validate(user.getPword())) {
            return true;
        }
        return false;
    }

    /**
     * get user.
     * 
     * @return user
     */
    public VLoginBean getUser() {
        return user;
    }

    /**
     * set user.
     * 
     * @param user
     */
    public void setUser(VLoginBean user) {
        this.user = user;
    }
}
