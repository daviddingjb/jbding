package com.trusdata.integrate.login.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.trusdata.common.action.BaseAction;
import com.trusdata.common.db.CustomDao;
import com.trusdata.common.db.GenericDao;
import com.trusdata.common.util.MD5;
import com.trusdata.common.util.TrusdataLogger;
import com.trusdata.integrate.db.bean.Trus_dbconfig;
import com.trusdata.integrate.db.bean.Trus_user;
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
                GenericDao<Trus_user> gdao = new GenericDao<Trus_user>();
                List<Trus_user> userInfo = gdao.findAllByConditions(sqlWhereMap, Trus_user.class, null);
                if (userInfo.size() != 0) {
        			// 把用户信息存放session中
                	Trus_user userBean = userInfo.get(0);
                	if (!useMap.containsKey("trus_user")) {
                		useMap.put("trus_user", userBean);
					}
                	
                	// 把DB配置信息放入session中
                	HashMap<String, HashMap<String, String>> dbconfList = new HashMap<String, HashMap<String, String>>();
                	CustomDao<Trus_dbconfig> cdao = new CustomDao<Trus_dbconfig>();
                	String sqlWhereString = "";
                	List<Trus_dbconfig> dbmsgList = cdao.findAllByConditions(sqlWhereString, Trus_dbconfig.class, null);
                    for (Trus_dbconfig detail : dbmsgList) {
                    	HashMap<String, String> dbconf = new HashMap<String, String>();
                    	dbconf.put("t_driver", detail.getT_driver());
                    	dbconf.put("t_url_start", detail.getT_url_start());
                    	dbconf.put("t_url_end", detail.getT_url_end());
                        dbconfList.put(detail.getT_type(), dbconf);
                    }
                	if (!useMap.containsKey("trus_dbconfig")) {
                    	useMap.put("trus_dbconfig", dbconfList);
					}
            		
        			saveLoginUser(useMap);
        			
        			rtn = "integrate";
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
