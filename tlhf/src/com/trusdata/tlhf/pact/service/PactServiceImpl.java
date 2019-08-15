package com.trusdata.tlhf.pact.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trusdata.common.util.PageUtil;
import com.trusdata.tlhf.common.bean.TlhfUserBean;
import com.trusdata.tlhf.pact.bean.IndoorAirBean;
import com.trusdata.tlhf.pact.bean.PactIdentifyBean;
import com.trusdata.tlhf.pact.bean.PactInputListBean;
import com.trusdata.tlhf.pact.mapper.PactMapper;

@Service
public class PactServiceImpl implements PactService {
	@Autowired
	PactMapper mapper;
	
	@Override
	public List<PactInputListBean> selectAll(TlhfUserBean queryBean) {

		// 查询数据总数
		int sumItems = mapper.selectCount(queryBean);
		PageUtil.resetPageBean(queryBean, sumItems);
		// 查询所有信息
		return mapper.selectInfo(queryBean);
	}

	@Override
	public Integer insert(IndoorAirBean insertBean) {
		int flg = 0;
		mapper.insertIndoorAir(insertBean);
		return flg;
	}

	@Override
	public Integer del(PactIdentifyBean delBean) {
		mapper.del(delBean);
		return 1;
	}
}
