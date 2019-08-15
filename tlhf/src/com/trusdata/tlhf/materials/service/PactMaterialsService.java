package com.trusdata.tlhf.materials.service;

import java.util.List;

import com.trusdata.tlhf.materials.bean.PactMaterialsBean;
import com.trusdata.tlhf.pact.bean.PactIdentifyBean;
import com.trusdata.tlhf.pact.bean.PactInputListBean;
import com.trusdata.tlhf.pact.bean.PactSearchBean;

public interface PactMaterialsService {

	public List<PactInputListBean> selectAll(PactSearchBean queryBean);
	public Integer insert(PactMaterialsBean insertBean);
	public Integer del(PactIdentifyBean delBean);

}
