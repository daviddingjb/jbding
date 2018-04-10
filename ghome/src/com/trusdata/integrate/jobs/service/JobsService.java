package com.trusdata.integrate.jobs.service;

import java.util.List;

import com.trusdata.integrate.jobs.bean.JobListBean;
import com.trusdata.integrate.jobs.bean.JobSearchBean;

public interface JobsService {

	public List<JobListBean> selectAll(JobSearchBean queryBean);
}
