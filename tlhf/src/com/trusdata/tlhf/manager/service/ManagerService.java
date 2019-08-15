package com.trusdata.tlhf.manager.service;

import java.util.List;

import com.trusdata.tlhf.manager.bean.ManagerTopicListBean;
import com.trusdata.tlhf.pact.bean.PactSearchBean;

public interface ManagerService {

//	public Integer insert(ReportInsertBean insertBean);
	public List<ManagerTopicListBean> selectAll(PactSearchBean queryBean);
//	public ReportInsertBean look(ReportIdentifyBean bean);
//	public Integer del(ReportIdentifyBean delBean);
//	public Integer del(UserIdentifyBean delBean);
//	public Integer updInit(ReportIdentifyBean delBean);
//	public List<User> selectAllUser(UserSearchBean bean);
//	public Integer insert(User insertBean);
}
