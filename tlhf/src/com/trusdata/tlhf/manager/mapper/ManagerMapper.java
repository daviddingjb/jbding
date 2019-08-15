package com.trusdata.tlhf.manager.mapper;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.trusdata.integrate.report.bean.ReportIdentifyBean;
import com.trusdata.integrate.report.bean.ReportInsertBean;
import com.trusdata.integrate.report.bean.UserIdentifyBean;
import com.trusdata.tlhf.manager.bean.ManagerTopicListBean;
import com.trusdata.tlhf.pact.bean.PactSearchBean;

/**
 * 
 * @author JBDING
 *
 */
public interface ManagerMapper {

	/**
	 * Group List
	 * 
	 * @param queryBean
	 * @return
	 * @throws DataAccessException
	 */
	public Integer selectCount(PactSearchBean queryBean)
			throws DataAccessException;

	public List<ManagerTopicListBean> selectInfo(PactSearchBean queryBean)
			throws DataAccessException;

//	public Integer selectUserCount(UserSearchBean queryBean)
//			throws DataAccessException;
//
//	public List<User> selectUserInfo(UserSearchBean queryBean)
//			throws DataAccessException;
	
	public Integer insertbase(ReportInsertBean insertBean)
			throws DataAccessException;
	
//	public Integer insertuser(User insertBean)
//			throws DataAccessException;

	public Integer del(ReportIdentifyBean delBean)
			throws DataAccessException;

	public Integer delUser(UserIdentifyBean delBean)
			throws DataAccessException;

	public Integer updInit(ReportIdentifyBean updBean)
			throws DataAccessException;
	
	public ReportInsertBean look(ReportIdentifyBean bean)
			throws DataAccessException;
}
