package com.trusdata.integrate.manager.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.trusdata.common.action.BasePageAction;
import com.trusdata.common.util.MD5;
import com.trusdata.integrate.manager.bean.User;
import com.trusdata.integrate.manager.bean.UserSearchBean;
import com.trusdata.integrate.manager.service.ManagerService;
import com.trusdata.integrate.report.bean.UserIdentifyBean;

/**
 * 
 * @author JBDING
 * 
 */
public class UserManageAction extends BasePageAction<UserSearchBean> {
	/**
	 * UID
	 */
	private static final long serialVersionUID = -2225527419269363691L;

	// 服务器详细信息
	private User user;
	List<User> userList;
	private UserSearchBean userSearchBean = new UserSearchBean();

	/**
	 * 资源管理Service
	 */
	@Autowired
	ManagerService service;

	public String init() {
		String rtn = "init";

		query();
		
		return rtn;
	}

	public String query() {
		String rtn = "sub";
		userList = new ArrayList<User>();
		userList = service.selectAllUser(userSearchBean);
		return rtn;
	}


	public String toAddUser() {
		String rtn = "addUser";

		rtn = addUser(user);

		return rtn;
	}

	public String addUser(User user) {
		String rtn = "addUser";

		try {
			// 页面输入检验
			if (user == null) {
				return rtn;
			} else {
				// 获取登录用户名信息
				HashMap<String, Object> usr = this.getLoginUser();
				if (usr == null) {
					rtn = ERROR;
					return rtn;
				}

				String t_password = user.getT_password();
				user.setT_password(MD5.MD5Encode(t_password));
				service.insert(user);
				rtn = "adduser_ok";
			}
		} catch (Exception e) {
			rtn = ERROR;
			return rtn;
		}

		return rtn;
	}

	public String del() {
		String rtn = "sub";
		String index[] = request.getParameterValues("number");
		String id[] = request.getParameterValues("id");

		UserIdentifyBean delBean = new UserIdentifyBean();
		delBean.setT_user(id[Integer.parseInt(index[0])]);
		service.del(delBean);
		init();

		return rtn;
	}

	@Override
	public UserSearchBean getQueryBean() {
		return userSearchBean;
	}

	@Override
	public void setQueryBean(UserSearchBean queryBean) {
		userSearchBean = queryBean;
	}

	public ManagerService getService() {
		return service;
	}

	public void setService(ManagerService service) {
		this.service = service;
	}

	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}

	public UserSearchBean getUserSearchBean() {
		return userSearchBean;
	}

	public void setUserSearchBean(UserSearchBean userSearchBean) {
		this.userSearchBean = userSearchBean;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
