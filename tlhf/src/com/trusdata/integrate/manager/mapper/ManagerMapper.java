package com.trusdata.integrate.manager.mapper;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.trusdata.integrate.manager.bean.ManagerSearchBean;
import com.trusdata.integrate.manager.bean.User;
import com.trusdata.integrate.manager.bean.UserSearchBean;
import com.trusdata.integrate.report.bean.ReportIdentifyBean;
import com.trusdata.integrate.report.bean.ReportInsertBean;
import com.trusdata.integrate.report.bean.ReportListBean;
import com.trusdata.integrate.report.bean.UserIdentifyBean;

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
	public Integer selectCount(ManagerSearchBean queryBean)
			throws DataAccessException;

	public List<ReportListBean> selectInfo(ManagerSearchBean queryBean)
			throws DataAccessException;

	public Integer selectUserCount(UserSearchBean queryBean)
			throws DataAccessException;

	public List<User> selectUserInfo(UserSearchBean queryBean)
			throws DataAccessException;
	
	public Integer insertbase(ReportInsertBean insertBean)
			throws DataAccessException;
	
	public Integer insertuser(User insertBean)
			throws DataAccessException;

	public Integer del(ReportIdentifyBean delBean)
			throws DataAccessException;

	public Integer delUser(UserIdentifyBean delBean)
			throws DataAccessException;

	public Integer updInit(ReportIdentifyBean updBean)
			throws DataAccessException;
	
	public ReportInsertBean look(ReportIdentifyBean bean)
			throws DataAccessException;
}
