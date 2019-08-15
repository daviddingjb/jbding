package com.trusdata.tlhf.pact.service;

import java.util.List;

import com.trusdata.tlhf.common.bean.TlhfUserBean;
import com.trusdata.tlhf.pact.bean.IndoorAirBean;
import com.trusdata.tlhf.pact.bean.PactIdentifyBean;
import com.trusdata.tlhf.pact.bean.PactInputListBean;

public interface PactService {

	public List<PactInputListBean> selectAll(TlhfUserBean queryBean);
	public Integer insert(IndoorAirBean insertBean);
	public Integer del(PactIdentifyBean delBean);

}
