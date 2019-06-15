package com.trusdata.integrate.manager.service;

import java.util.List;

import com.trusdata.integrate.manager.bean.ManagerSearchBean;
import com.trusdata.integrate.manager.bean.User;
import com.trusdata.integrate.manager.bean.UserSearchBean;
import com.trusdata.integrate.report.bean.ReportIdentifyBean;
import com.trusdata.integrate.report.bean.ReportInsertBean;
import com.trusdata.integrate.report.bean.ReportListBean;
import com.trusdata.integrate.report.bean.UserIdentifyBean;

public interface ManagerService {

	public Integer insert(ReportInsertBean insertBean);
	public List<ReportListBean> selectAll(ManagerSearchBean queryBean);
	public ReportInsertBean look(ReportIdentifyBean bean);
	public Integer del(ReportIdentifyBean delBean);
	public Integer del(UserIdentifyBean delBean);
	public Integer updInit(ReportIdentifyBean delBean);
	public List<User> selectAllUser(UserSearchBean bean);
	public Integer insert(User insertBean);
}
