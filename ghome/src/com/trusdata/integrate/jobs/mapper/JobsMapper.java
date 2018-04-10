package com.trusdata.integrate.jobs.mapper;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.trusdata.integrate.jobs.bean.JobListBean;
import com.trusdata.integrate.jobs.bean.JobSearchBean;

/**
 * 
 * @author JBDING
 *
 */
public interface JobsMapper {

	public Integer selectCount(JobSearchBean queryBean)
			throws DataAccessException;

	public List<JobListBean> selectInfo(JobSearchBean queryBean)
			throws DataAccessException;
}
