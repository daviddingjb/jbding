package com.trusdata.tlhf.pact.bean;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * @author JBDING
 * 
 */
public class SetIndoorAirBean {

	public static IndoorAirBean setBean(IndoorAirBean server) throws Exception {
		IndoorAirBean insert = new IndoorAirBean();

//		int scope = 0;
//		int flg1 = 0;
//		int flg2 = 0;
		if (!"".equals(server.getId()) && server.getId() != null) {
			insert.setId(server.getId());
		} else {
			insert.setId("");
		}
		
		if (!"".equals(server.getEntrusted_id()) && server.getEntrusted_id() != null) {
			insert.setEntrusted_id(server.getEntrusted_id());
		} else {
			insert.setEntrusted_id("");
		}
		
		if (!"".equals(server.getInput_name()) && server.getInput_name() != null) {
			insert.setInput_name(server.getInput_name());
		} else {
			insert.setInput_name("");
		}
		
		if (!"".equals(server.getEntrusted_chop()) && server.getEntrusted_chop() != null) {
			insert.setEntrusted_chop(server.getEntrusted_chop());
		} else {
			insert.setEntrusted_chop("");
		}
		
		if (!"".equals(server.getEntrusted_signature()) && server.getEntrusted_signature() != null) {
			insert.setEntrusted_signature(server.getEntrusted_signature());
		} else {
			insert.setEntrusted_signature("");
		}
		
		if (!"".equals(server.getEntrusted_date()) && server.getEntrusted_date() != null) {
			insert.setEntrusted_date(server.getEntrusted_date());
		} else {
			insert.setEntrusted_date("");
		}
		
		if (!"".equals(server.getTest_chop()) && server.getTest_chop() != null) {
			insert.setTest_chop(server.getTest_chop());
		} else {
			insert.setTest_chop("");
		}
		
		if (!"".equals(server.getTest_signature()) && server.getTest_signature() != null) {
			insert.setTest_signature(server.getTest_signature());
		} else {
			insert.setTest_signature("");
		}
		
		if (!"".equals(server.getTest_date()) && server.getTest_date() != null) {
			insert.setTest_date(server.getTest_date());
		} else {
			insert.setTest_date("");
		}
		
		if (!"".equals(server.getRegistered_date()) && server.getRegistered_date() != null) {
			insert.setRegistered_date(server.getRegistered_date());
		} else {
			insert.setRegistered_date("");
		}
		
		if (!"".equals(server.getTesting_date()) && server.getTesting_date() != null) {
			insert.setTesting_date(server.getTesting_date());
		} else {
			insert.setTesting_date("");
		}
		
		if (!"".equals(server.getEntrusted_settler()) && server.getEntrusted_settler() != null) {
			insert.setEntrusted_settler(server.getEntrusted_settler());
		} else {
			insert.setEntrusted_settler("");
		}
		
		if (!"".equals(server.getObj_name()) && server.getObj_name() != null) {
			insert.setObj_name(server.getObj_name());
		} else {
			insert.setObj_name("");
		}
		
		if (!"".equals(server.getContract_name()) && server.getContract_name() != null) {
			insert.setContract_name(server.getContract_name());
		} else {
			insert.setContract_name("");
		}
		
		if (!"".equals(server.getContact_call()) && server.getContact_call() != null) {
			insert.setContact_call(server.getContact_call());
		} else {
			insert.setContact_call("");
		}
		
		if (!"".equals(server.getTest_addr()) && server.getTest_addr() != null) {
			insert.setTest_addr(server.getTest_addr());
		} else {
			insert.setTest_addr("");
		}
		
		if (!"".equals(server.getCheck_ref1()) && server.getCheck_ref1() != null) {
			insert.setCheck_ref1("DB11/T1445-2017");
		} else {
			insert.setCheck_ref1("");
		}
		
		if (!"".equals(server.getCheck_ref2()) && server.getCheck_ref2() != null) {
			insert.setCheck_ref2("GB50325-2010（2013年版）");
		} else {
			insert.setCheck_ref2("");
		}
		
		if (!"".equals(server.getCheck_ref3()) && server.getCheck_ref3() != null) {
			insert.setCheck_ref3("GB18883-2002");
		} else {
			insert.setCheck_ref3("");
		}
		
		if (!"".equals(server.getCheck_type()) && server.getCheck_type() != null) {
			insert.setCheck_type("委托检测");
		} else {
			insert.setCheck_type("");
		}
		
		if (!"".equals(server.getCheck_other()) && server.getCheck_other() != null) {
			insert.setCheck_other("其它");
		} else {
			insert.setCheck_other("");
		}
		
		if (!"".equals(server.getCheck_receive()) && server.getCheck_receive() != null) {
			insert.setCheck_receive("已收（");
		} else {
			insert.setCheck_receive("");
		}
		
		if (!"".equals(server.getCheck_receive_rmb()) && server.getCheck_receive_rmb() != null) {
			insert.setCheck_receive_rmb(server.getCheck_receive_rmb());
		} else {
			insert.setCheck_receive_rmb("");
		}
		
		if (!"".equals(server.getCheck_not_receive()) && server.getCheck_not_receive() != null) {
			insert.setCheck_not_receive("未收（");
		} else {
			insert.setCheck_not_receive("");
		}
		
		if (!"".equals(server.getCheck_not_receive_rmb()) && server.getCheck_not_receive_rmb() != null) {
			insert.setCheck_not_receive_rmb(server.getCheck_not_receive_rmb());
		} else {
			insert.setCheck_not_receive_rmb("");
		}
		
		if (!"".equals(server.getCheck_cash()) && server.getCheck_cash() != null) {
			insert.setCheck_cash("现金、");
		} else {
			insert.setCheck_cash("");
		}
		
		if (!"".equals(server.getCheck_cheque()) && server.getCheck_cheque() != null) {
			insert.setCheck_cheque("支票、");
		} else {
			insert.setCheck_cheque("");
		}
		
		if (!"".equals(server.getCheck_billing()) && server.getCheck_billing() != null) {
			insert.setCheck_billing("记账");
		} else {
			insert.setCheck_billing("");
		}
		
		if (!"".equals(server.getReport_typr()) && server.getReport_typr() != null) {
			insert.setReport_typr("自取");
		} else {
			insert.setReport_typr("");
		}
		
		if (!"".equals(server.getReport_courier()) && server.getReport_courier() != null) {
			insert.setReport_courier("邮寄");
		} else {
			insert.setReport_courier("");
		}
		
		if (!"".equals(server.getReport_other()) && server.getReport_other() != null) {
			insert.setReport_other("其它：");
		} else {
			insert.setReport_other("");
		}
		
		if (!"".equals(server.getReport_other_detail()) && server.getReport_other_detail() != null) {
			insert.setReport_other_detail(server.getReport_other_detail());
		} else {
			insert.setReport_other_detail("");
		}
		
		if (!"".equals(server.getReport_courier_addr()) && server.getReport_courier_addr() != null) {
			insert.setReport_courier_addr(server.getReport_courier_addr());
		} else {
			insert.setReport_courier_addr("");
		}
		
		if (!"".equals(server.getReport_num()) && server.getReport_num() != null) {
			insert.setReport_num(server.getReport_num());
		} else {
			insert.setReport_num("");
		}
		
		if (!"".equals(server.getReport_date()) && server.getReport_date() != null) {
			insert.setReport_date(server.getReport_date());
		} else {
			insert.setReport_date("");
		}
		
		if (!"".equals(server.getEntity_benzene()) && server.getEntity_benzene() != null) {
			insert.setEntity_benzene(server.getEntity_benzene());
		} else {
			insert.setEntity_benzene("");
		}
		
		if (!"".equals(server.getEntity_benzene_1()) && server.getEntity_benzene_1() != null) {
			insert.setEntity_benzene_1("GB50325-2010（2013年版）附录F");
		} else {
			insert.setEntity_benzene_1("");
		}
		
		if (!"".equals(server.getEntity_benzene_2()) && server.getEntity_benzene_2() != null) {
			insert.setEntity_benzene_2("二硫化碳提取法");
		} else {
			insert.setEntity_benzene_2("");
		}
		
		if (!"".equals(server.getEntity_benzene_3()) && server.getEntity_benzene_3() != null) {
			insert.setEntity_benzene_3("热解吸法");
		} else {
			insert.setEntity_benzene_3("");
		}
		
		if (!"".equals(server.getEntity_benzene_4()) && server.getEntity_benzene_4() != null) {
			insert.setEntity_benzene_4("GB18883-2002附录B");
		} else {
			insert.setEntity_benzene_4("");
		}
		
		if (!"".equals(server.getEntity_toluene()) && server.getEntity_toluene() != null) {
			insert.setEntity_toluene(server.getEntity_toluene());
		} else {
			insert.setEntity_toluene("");
		}
		
		if (!"".equals(server.getEntity_toluene_1()) && server.getEntity_toluene_1() != null) {
			insert.setEntity_toluene_1("二硫化碳提取法");
		} else {
			insert.setEntity_toluene_1("");
		}
		
		if (!"".equals(server.getEntity_toluene_2()) && server.getEntity_toluene_2() != null) {
			insert.setEntity_toluene_2("热解吸法");
		} else {
			insert.setEntity_toluene_2("");
		}
		
		if (!"".equals(server.getEntity_formal()) && server.getEntity_formal() != null) {
			insert.setEntity_formal(server.getEntity_formal());
		} else {
			insert.setEntity_formal("");
		}
		
		if (!"".equals(server.getEntity_formal_1()) && server.getEntity_formal_1() != null) {
			insert.setEntity_formal_1("GB/T18204.2-2014酚试剂分光光度法");
		} else {
			insert.setEntity_formal_1("");
		}
		
		if (!"".equals(server.getEntity_formal_2()) && server.getEntity_formal_2() != null) {
			insert.setEntity_formal_2("DB11/T1445-2017 (仪器法)");
		} else {
			insert.setEntity_formal_2("");
		}
		
		if (!"".equals(server.getEntity_formal_3()) && server.getEntity_formal_3() != null) {
			insert.setEntity_formal_3("GB50325-2010（2013年版）(仪器法)");
		} else {
			insert.setEntity_formal_3("");
		}
		
		if (!"".equals(server.getEntity_n()) && server.getEntity_n() != null) {
			insert.setEntity_n("GB/T18204.2-2014(靛酚蓝分光光度法)");
		} else {
			insert.setEntity_n("");
		}
		
		if (!"".equals(server.getEntity_n_1()) && server.getEntity_n_1() != null) {
			insert.setEntity_n_1(server.getEntity_n_1());
		} else {
			insert.setEntity_n_1("");
		}
		
		if (!"".equals(server.getEntity_tvoc()) && server.getEntity_tvoc() != null) {
			insert.setEntity_tvoc(server.getEntity_tvoc());
		} else {
			insert.setEntity_tvoc("");
		}
		
		if (!"".equals(server.getEntity_tvoc_1()) && server.getEntity_tvoc_1() != null) {
			insert.setEntity_tvoc_1("DB11/T1445-2017附录B");
		} else {
			insert.setEntity_tvoc_1("");
		}
		
		if (!"".equals(server.getEntity_tvoc_2()) && server.getEntity_tvoc_2() != null) {
			insert.setEntity_tvoc_2("GB50325-2010（2013年版）附录G");
		} else {
			insert.setEntity_tvoc_2("");
		}
		
		if (!"".equals(server.getEntity_rn()) && server.getEntity_rn() != null) {
			insert.setEntity_rn(server.getEntity_rn());
		} else {
			insert.setEntity_rn("");
		}
		
		if (!"".equals(server.getEntity_rn_1()) && server.getEntity_rn_1() != null) {
			insert.setEntity_rn_1("GB/T14582-1993（活性碳盒法）");
		} else {
			insert.setEntity_rn_1("");
		}
		
		if (!"".equals(server.getEntity_rn_2()) && server.getEntity_rn_2() != null) {
			insert.setEntity_rn_2("GB/T16147-1995");
		} else {
			insert.setEntity_rn_2("");
		}
		
		if (!"".equals(server.getEntity_rn_3()) && server.getEntity_rn_3() != null) {
			insert.setEntity_rn_3("DB11/T1445-2017附录A");
		} else {
			insert.setEntity_rn_3("");
		}
		
		if (!"".equals(server.getEntity_o3()) && server.getEntity_o3() != null) {
			insert.setEntity_o3(server.getEntity_o3());
		} else {
			insert.setEntity_o3("");
		}
		
		if (!"".equals(server.getEntity_o3_1()) && server.getEntity_o3_1() != null) {
			insert.setEntity_o3_1("GB/T18204.2-2014 (靛蓝二磺酸钠分光光度法)");
		} else {
			insert.setEntity_o3_1("");
		}
		
		if (!"".equals(server.getEntity_so2()) && server.getEntity_so2() != null) {
			insert.setEntity_so2(server.getEntity_so2());
		} else {
			insert.setEntity_so2("");
		}
		
		if (!"".equals(server.getEntity_so2_1()) && server.getEntity_so2_1() != null) {
			insert.setEntity_so2_1("GB/T16128-1995");
		} else {
			insert.setEntity_so2_1("");
		}
		
		if (!"".equals(server.getEntity_no2()) && server.getEntity_no2() != null) {
			insert.setEntity_no2(server.getEntity_no2());
		} else {
			insert.setEntity_no2("");
		}
		
		if (!"".equals(server.getEntity_no2_1()) && server.getEntity_no2_1() != null) {
			insert.setEntity_no2_1("GB/T12372-1990");
		} else {
			insert.setEntity_no2_1("");
		}
		
		if (!"".equals(server.getOther()) && server.getOther() != null) {
			insert.setOther(server.getOther());
		} else {
			insert.setOther("");
		}
		
		return insert;
	}

	public static Date strToDate(String dateString) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		return sdf.parse(dateString);
	}

	public static int strToInt(String intString) throws Exception {
		return Integer.parseInt(intString);
	}

	public static Double strToDouble(String intString) throws Exception {
		return Double.parseDouble(intString);
	}
}
