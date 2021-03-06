package com.trusdata.tlhf.pact.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trusdata.common.util.PageUtil;
import com.trusdata.tlhf.common.bean.TlhfTopicBean;
import com.trusdata.tlhf.common.bean.TlhfUserBean;
import com.trusdata.tlhf.pact.bean.BasicBean;
import com.trusdata.tlhf.pact.bean.PactIdentifyBean;
import com.trusdata.tlhf.pact.bean.PactInputListBean;
import com.trusdata.tlhf.pact.mapper.PactMapper;

@Service
public class PactServiceImpl implements PactService {
	@Autowired
	PactMapper mapper;
	
	@Override
	public List<TlhfTopicBean> selectTopic(TlhfUserBean queryBean) {

		// 查询数据总数
		int sumItems = mapper.selectTopicCount(queryBean);
		PageUtil.resetPageBean(queryBean, sumItems);
		// 查询所有信息
		return mapper.selectTopicInfo(queryBean);
	}
	
	@Override
	public List<PactInputListBean> selectAll(TlhfUserBean queryBean) {

		// 查询数据总数
		int sumItems = mapper.selectCount(queryBean);
		PageUtil.resetPageBean(queryBean, sumItems);
		// 查询所有信息
		return mapper.selectInfo(queryBean);
	}

	@Override
	public Integer insert(BasicBean insertBean) {
		int flg = 0;
		mapper.insertBasic(insertBean);
		return flg;
	}

	@Override
	public Integer del(PactIdentifyBean delBean) {
		mapper.del(delBean);
		return 1;
	}
}
