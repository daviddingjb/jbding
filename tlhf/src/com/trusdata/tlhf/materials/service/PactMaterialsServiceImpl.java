package com.trusdata.tlhf.materials.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trusdata.common.util.PageUtil;
import com.trusdata.tlhf.materials.bean.PactMaterialsBean;
import com.trusdata.tlhf.materials.mapper.PactMaterialsMapper;
import com.trusdata.tlhf.pact.bean.PactIdentifyBean;
import com.trusdata.tlhf.pact.bean.PactInputListBean;
import com.trusdata.tlhf.pact.bean.PactSearchBean;

@Service
public class PactMaterialsServiceImpl implements PactMaterialsService {
	@Autowired
	PactMaterialsMapper mapper;
	
	@Override
	public List<PactInputListBean> selectAll(PactSearchBean queryBean) {

		// 查询数据总数
		int sumItems = mapper.selectCount(queryBean);
		PageUtil.resetPageBean(queryBean, sumItems);
		// 查询所有信息
		return mapper.selectInfo(queryBean);
	}

	@Override
	public Integer insert(PactMaterialsBean insertBean) {
		int flg = 0;
		mapper.insertMaterials(insertBean);
		return flg;
	}

	@Override
	public Integer del(PactIdentifyBean delBean) {
		mapper.del(delBean);
		return 1;
	}
}
