package com.trusdata.integrate.manager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trusdata.common.util.PageUtil;
import com.trusdata.integrate.manager.bean.ManagerSearchBean;
import com.trusdata.integrate.manager.bean.User;
import com.trusdata.integrate.manager.bean.UserSearchBean;
import com.trusdata.integrate.manager.mapper.ManagerMapper;
import com.trusdata.integrate.report.bean.ReportIdentifyBean;
import com.trusdata.integrate.report.bean.ReportInsertBean;
import com.trusdata.integrate.report.bean.ReportListBean;
import com.trusdata.integrate.report.bean.UserIdentifyBean;

@Service
public class ManagerServiceImpl implements ManagerService {

	@Autowired
	ManagerMapper mapper;

	@Override
	public List<ReportListBean> selectAll(ManagerSearchBean queryBean) {

		// 查询数据总数
		int sumItems = mapper.selectCount(queryBean);
		PageUtil.resetPageBean(queryBean, sumItems);
		// 查询所有信息
		return mapper.selectInfo(queryBean);
	}

	@Override
	public Integer insert(ReportInsertBean insertBean) {
		int flg = 0;
		mapper.insertbase(insertBean);
		return flg;
	}

	@Override
	public Integer insert(User insertBean) {
		int flg = 0;
		mapper.insertuser(insertBean);
		return flg;
	}

	@Override
	public Integer del(ReportIdentifyBean delBean) {
		mapper.del(delBean);
		return 1;
	}

	@Override
	public Integer del(UserIdentifyBean delBean) {
		mapper.delUser(delBean);
		return 1;
	}

	@Override
	public Integer updInit(ReportIdentifyBean updBean) {
		return mapper.updInit(updBean);
	}

	@Override
	public ReportInsertBean look(ReportIdentifyBean bean) {
		return mapper.look(bean);
	}

	@Override
	public List<User> selectAllUser(UserSearchBean queryBean) {

		// 查询数据总数
		int sumItems = mapper.selectUserCount(queryBean);
		PageUtil.resetPageBean(queryBean, sumItems);
		// 查询所有信息
		return mapper.selectUserInfo(queryBean);
	}
}
