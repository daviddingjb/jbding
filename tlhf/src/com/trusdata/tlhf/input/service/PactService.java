package com.trusdata.tlhf.input.service;

import java.util.List;

import com.trusdata.integrate.report.bean.ReportIdentifyBean;
import com.trusdata.integrate.report.bean.ReportListBean;
import com.trusdata.integrate.report.bean.ReportSearchBean;
import com.trusdata.integrate.report.bean.ReportStatus1Bean;
import com.trusdata.integrate.report.bean.ReportStatus2Bean;
import com.trusdata.integrate.report.bean.ReportStatus3Bean;
import com.trusdata.integrate.report.bean.ReportTbaseBean;
import com.trusdata.tlhf.input.bean.IndoorAirBean;

public interface PactService {

	public Integer insert(IndoorAirBean insertBean);

	public List<ReportListBean> selectAll(ReportSearchBean queryBean);

	public Integer del(ReportIdentifyBean delBean);

	public Integer updInit(ReportIdentifyBean delBean);

	public ReportTbaseBean select1(ReportIdentifyBean updBean);

	public ReportStatus1Bean select2(ReportIdentifyBean updBean);

	public ReportStatus2Bean select3(ReportIdentifyBean updBean);

	public ReportStatus3Bean select4(ReportIdentifyBean updBean);
}
