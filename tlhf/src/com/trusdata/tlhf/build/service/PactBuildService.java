package com.trusdata.tlhf.build.service;

import java.util.List;

import com.trusdata.tlhf.build.bean.PactBuildBean;
import com.trusdata.tlhf.pact.bean.PactIdentifyBean;
import com.trusdata.tlhf.pact.bean.PactInputListBean;
import com.trusdata.tlhf.pact.bean.PactSearchBean;

public interface PactBuildService {

	public List<PactInputListBean> selectAll(PactSearchBean queryBean);
	public Integer insert(PactBuildBean insertBean);
	public Integer del(PactIdentifyBean delBean);

}
