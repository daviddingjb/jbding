package com.trusdata.tlhf.tdata.service;

import java.util.List;

import com.trusdata.tlhf.pact.bean.PactIdentifyBean;
import com.trusdata.tlhf.pact.bean.PactInputListBean;
import com.trusdata.tlhf.pact.bean.PactSearchBean;
import com.trusdata.tlhf.tdata.bean.PactTdataBean;

public interface PactTdataService {

	public List<PactInputListBean> selectAll(PactSearchBean queryBean);
	public Integer insert(PactTdataBean insertBean);
	public Integer del(PactIdentifyBean delBean);

}
