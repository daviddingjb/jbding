package com.trusdata.integrate.jobs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trusdata.common.util.PageUtil;
import com.trusdata.integrate.jobs.bean.JobListBean;
import com.trusdata.integrate.jobs.bean.JobSearchBean;
import com.trusdata.integrate.jobs.mapper.JobsMapper;

@Service
public class JobsServiceImpl implements JobsService {

	@Autowired
	JobsMapper jobsMapper;

	@Override
	public List<JobListBean> selectAll(JobSearchBean queryBean) {

		// 查询数据总数
		int sumItems = jobsMapper.selectCount(queryBean);
		PageUtil.resetPageBean(queryBean, sumItems);
		// 查询所有信息
		return jobsMapper.selectInfo(queryBean);
	}
}
