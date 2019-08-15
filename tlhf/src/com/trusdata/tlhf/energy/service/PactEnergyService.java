package com.trusdata.tlhf.energy.service;

import java.util.List;

import com.trusdata.tlhf.energy.bean.PactEnergyBean;
import com.trusdata.tlhf.pact.bean.PactIdentifyBean;
import com.trusdata.tlhf.pact.bean.PactInputListBean;
import com.trusdata.tlhf.pact.bean.PactSearchBean;

public interface PactEnergyService {

	public List<PactInputListBean> selectAll(PactSearchBean queryBean);
	public Integer insert(PactEnergyBean insertBean);
	public Integer del(PactIdentifyBean delBean);

}
