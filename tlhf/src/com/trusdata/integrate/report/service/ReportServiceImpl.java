package com.trusdata.integrate.report.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trusdata.common.util.PageUtil;
import com.trusdata.integrate.report.bean.ReportIdentifyBean;
import com.trusdata.integrate.report.bean.ReportInsertBean;
import com.trusdata.integrate.report.bean.ReportListBean;
import com.trusdata.integrate.report.bean.ReportSearchBean;
import com.trusdata.integrate.report.bean.ReportStatus1Bean;
import com.trusdata.integrate.report.bean.ReportStatus2Bean;
import com.trusdata.integrate.report.bean.ReportStatus3Bean;
import com.trusdata.integrate.report.bean.ReportTbaseBean;
import com.trusdata.integrate.report.mapper.ReportMapper;

@Service
public class ReportServiceImpl implements ReportService {

	@Autowired
	ReportMapper mapper;

	@Override
	public List<ReportListBean> selectAll(ReportSearchBean queryBean) {

		// 查询数据总数
		int sumItems = mapper.selectCount(queryBean);
		PageUtil.resetPageBean(queryBean, sumItems);
		// 查询所有信息
		return mapper.selectInfo(queryBean);
	}

	@Override
	public Integer insert(ReportInsertBean insertBean) {
		int flg = 0;
		mapper.insertbase(insertBean);
//		mapper.insertTbase(insertBean);
//		mapper.insertStatus1(insertBean);
//		mapper.insertStatus2(insertBean);
//		mapper.insertStatus3(insertBean);
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
