package com.trusdata.tlhf.input.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trusdata.common.util.PageUtil;
import com.trusdata.integrate.report.bean.ReportIdentifyBean;
import com.trusdata.integrate.report.bean.ReportListBean;
import com.trusdata.integrate.report.bean.ReportStatus1Bean;
import com.trusdata.integrate.report.bean.ReportStatus2Bean;
import com.trusdata.integrate.report.bean.ReportStatus3Bean;
import com.trusdata.integrate.report.bean.ReportTbaseBean;
import com.trusdata.tlhf.input.bean.IndoorAirBean;
import com.trusdata.tlhf.input.bean.PactSearchBean;
import com.trusdata.tlhf.input.mapper.PactMapper;

@Service
public class PactServiceImpl implements PactService {

	@Autowired
	PactMapper mapper;

	@Override
	public List<ReportListBean> selectAll(PactSearchBean queryBean) {

		// 查询数据总数
		int sumItems = mapper.selectCount(queryBean);
		PageUtil.resetPageBean(queryBean, sumItems);
		// 查询所有信息
		return mapper.selectInfo(queryBean);
	}

	@Override
	public Integer insert(IndoorAirBean insertBean) {
		int flg = 0;
		mapper.insertbase(insertBean);
		return flg;
	}

	@Override
	public Integer del(ReportIdentifyBean delBean) {
		mapper.del(delBean);
		return 1;
	}

	@Override
	public Integer updInit(ReportIdentifyBean updBean) {
		return mapper.updInit(updBean);
	}

	@Override
	public ReportTbaseBean select1(ReportIdentifyBean updBean) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ReportStatus1Bean select2(ReportIdentifyBean updBean) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ReportStatus2Bean select3(ReportIdentifyBean updBean) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ReportStatus3Bean select4(ReportIdentifyBean updBean) {
		// TODO Auto-generated method stub
		return null;
	}

}
