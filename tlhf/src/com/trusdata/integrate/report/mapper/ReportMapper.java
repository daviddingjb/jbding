package com.trusdata.integrate.report.mapper;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.trusdata.integrate.report.bean.ReportIdentifyBean;
import com.trusdata.integrate.report.bean.ReportInsertBean;
import com.trusdata.integrate.report.bean.ReportListBean;
import com.trusdata.integrate.report.bean.ReportSearchBean;

/**
 * 
 * @author JBDING
 *
 */
public interface ReportMapper {

	/**
	 * Group List
	 * 
	 * @param queryBean
	 * @return
	 * @throws DataAccessException
	 */
	public Integer selectCount(ReportSearchBean queryBean)
			throws DataAccessException;

	public List<ReportListBean> selectInfo(ReportSearchBean queryBean)
			throws DataAccessException;

	public Integer insertbase(ReportInsertBean insertBean)
			throws DataAccessException;

	public Integer insertTbase(ReportInsertBean insertBean)
			throws DataAccessException;

	public Integer insertStatus1(ReportInsertBean insertBean)
			throws DataAccessException;

	public Integer insertStatus2(ReportInsertBean insertBean)
			throws DataAccessException;

	public Integer insertStatus3(ReportInsertBean insertBean)
			throws DataAccessException;

	public Integer del(ReportIdentifyBean delBean)
			throws DataAccessException;

	public Integer updInit(ReportIdentifyBean updBean)
			throws DataAccessException;
}
