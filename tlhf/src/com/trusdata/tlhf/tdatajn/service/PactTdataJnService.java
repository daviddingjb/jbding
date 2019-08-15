package com.trusdata.tlhf.tdatajn.service;

import java.util.List;

import com.trusdata.tlhf.pact.bean.PactIdentifyBean;
import com.trusdata.tlhf.pact.bean.PactInputListBean;
import com.trusdata.tlhf.pact.bean.PactSearchBean;
import com.trusdata.tlhf.tdatajn.bean.PactTdataJnBean;

public interface PactTdataJnService {

	public List<PactInputListBean> selectAll(PactSearchBean queryBean);
	public Integer insert(PactTdataJnBean insertBean);
	public Integer del(PactIdentifyBean delBean);

}
