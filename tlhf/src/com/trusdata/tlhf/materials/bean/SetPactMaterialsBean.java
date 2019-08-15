package com.trusdata.tlhf.materials.bean;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * @author JBDING
 * 
 */
public class SetPactMaterialsBean {

	public static PactMaterialsBean setBean(PactMaterialsBean server)
			throws Exception {
		PactMaterialsBean insert = new PactMaterialsBean();

		if (!"".equals(server.getId()) && server.getId() != null) {
			insert.setId(server.getId());
		} else {
			insert.setId("");
		}

		if (!"".equals(server.getEntrusted_id())
				&& server.getEntrusted_id() != null) {
			insert.setEntrusted_id(server.getEntrusted_id());
		} else {
			insert.setEntrusted_id("");
		}

		if (!"".equals(server.getInput_name())
				&& server.getInput_name() != null) {
			insert.setInput_name(server.getInput_name());
		} else {
			insert.setInput_name("");
		}

		if (!"".equals(server.getEntrusted_chop())
				&& server.getEntrusted_chop() != null) {
			insert.setEntrusted_chop(server.getEntrusted_chop());
		} else {
			insert.setEntrusted_chop("");
		}

		if (!"".equals(server.getEntrusted_signature())
				&& server.getEntrusted_signature() != null) {
			insert.setEntrusted_signature(server.getEntrusted_signature());
		} else {
			insert.setEntrusted_signature("");
		}

		if (!"".equals(server.getEntrusted_date())
				&& server.getEntrusted_date() != null) {
			insert.setEntrusted_date(server.getEntrusted_date());
		} else {
			insert.setEntrusted_date("");
		}

		if (!"".equals(server.getTest_chop()) && server.getTest_chop() != null) {
			insert.setTest_chop(server.getTest_chop());
		} else {
			insert.setTest_chop("");
		}

		if (!"".equals(server.getTest_signature())
				&& server.getTest_signature() != null) {
			insert.setTest_signature(server.getTest_signature());
		} else {
			insert.setTest_signature("");
		}

		if (!"".equals(server.getAgent_date())
				&& server.getAgent_date() != null) {
			insert.setAgent_date(server.getAgent_date());
		} else {
			insert.setAgent_date("");
		}

		if (!"".equals(server.getSign_date()) && server.getSign_date() != null) {
			insert.setSign_date(server.getSign_date());
		} else {
			insert.setSign_date("");
		}

		if (!"".equals(server.getTest_date()) && server.getTest_date() != null) {
			insert.setTest_date(server.getTest_date());
		} else {
			insert.setTest_date("");
		}

		if (!"".equals(server.getEntrusted_owner())
				&& server.getEntrusted_owner() != null) {
			insert.setEntrusted_owner(server.getEntrusted_owner());
		} else {
			insert.setEntrusted_owner("");
		}

		if (!"".equals(server.getSample_date())
				&& server.getSample_date() != null) {
			insert.setSample_date(server.getSample_date());
		} else {
			insert.setSample_date("");
		}

		if (!"".equals(server.getCall_owner())
				&& server.getCall_owner() != null) {
			insert.setCall_owner(server.getCall_owner());
		} else {
			insert.setCall_owner("");
		}

		if (!"".equals(server.getCall_num()) && server.getCall_num() != null) {
			insert.setCall_num(server.getCall_num());
		} else {
			insert.setCall_num("");
		}

		if (!"".equals(server.getSample_name())
				&& server.getSample_name() != null) {
			insert.setSample_name(server.getSample_name());
		} else {
			insert.setSample_name("");
		}

		if (!"".equals(server.getSample_size())
				&& server.getSample_size() != null) {
			insert.setSample_size(server.getSample_size());
		} else {
			insert.setSample_size("");
		}

		if (!"".equals(server.getSample_level())
				&& server.getSample_level() != null) {
			insert.setSample_level(server.getSample_level());
		} else {
			insert.setSample_level("");
		}

		if (!"".equals(server.getSample_num())
				&& server.getSample_num() != null) {
			insert.setSample_num(server.getSample_num());
		} else {
			insert.setSample_num("");
		}

		if (!"".equals(server.getFactory()) && server.getFactory() != null) {
			insert.setFactory(server.getFactory());
		} else {
			insert.setFactory("");
		}

		if (!"".equals(server.getObj_name()) && server.getObj_name() != null) {
			insert.setObj_name(server.getObj_name());
		} else {
			insert.setObj_name("");
		}

		if (!"".equals(server.getTest_type_1())
				&& server.getTest_type_1() != null) {
			insert.setTest_type_1(server.getTest_type_1());
		} else {
			insert.setTest_type_1("");
		}

		if (!"".equals(server.getTest_type_2())
				&& server.getTest_type_2() != null) {
			insert.setTest_type_2(server.getTest_type_2());
		} else {
			insert.setTest_type_2("");
		}

		if (!"".equals(server.getTest_type_3())
				&& server.getTest_type_3() != null) {
			insert.setTest_type_3(server.getTest_type_3());
		} else {
			insert.setTest_type_3("");
		}

		if (!"".equals(server.getCost_1()) && server.getCost_1() != null) {
			insert.setCost_1(server.getCost_1());
		} else {
			insert.setCost_1("");
		}

		if (!"".equals(server.getCost_2()) && server.getCost_2() != null) {
			insert.setCost_2(server.getCost_2());
		} else {
			insert.setCost_2("");
		}

		if (!"".equals(server.getCost_3()) && server.getCost_3() != null) {
			insert.setCost_3(server.getCost_3());
		} else {
			insert.setCost_3("");
		}

		if (!"".equals(server.getCost_4()) && server.getCost_4() != null) {
			insert.setCost_4(server.getCost_4());
		} else {
			insert.setCost_4("");
		}

		if (!"".equals(server.getCost_5()) && server.getCost_5() != null) {
			insert.setCost_5(server.getCost_5());
		} else {
			insert.setCost_5("");
		}

		if (!"".equals(server.getCost_6()) && server.getCost_6() != null) {
			insert.setCost_6(server.getCost_6());
		} else {
			insert.setCost_6("");
		}

		if (!"".equals(server.getCost_7()) && server.getCost_7() != null) {
			insert.setCost_7(server.getCost_7());
		} else {
			insert.setCost_7("");
		}

		if (!"".equals(server.getSubmit_1()) && server.getSubmit_1() != null) {
			insert.setSubmit_1(server.getSubmit_1());
		} else {
			insert.setSubmit_1("");
		}

		if (!"".equals(server.getSubmit_2()) && server.getSubmit_2() != null) {
			insert.setSubmit_2(server.getSubmit_2());
		} else {
			insert.setSubmit_2("");
		}

		if (!"".equals(server.getSubmit_3()) && server.getSubmit_3() != null) {
			insert.setSubmit_3(server.getSubmit_3());
		} else {
			insert.setSubmit_3("");
		}

		if (!"".equals(server.getSubmit_4()) && server.getSubmit_4() != null) {
			insert.setSubmit_4(server.getSubmit_4());
		} else {
			insert.setSubmit_4("");
		}

		if (!"".equals(server.getSubmit_5()) && server.getSubmit_5() != null) {
			insert.setSubmit_5(server.getSubmit_5());
		} else {
			insert.setSubmit_5("");
		}

		if (!"".equals(server.getSubmit_6()) && server.getSubmit_6() != null) {
			insert.setSubmit_6(server.getSubmit_6());
		} else {
			insert.setSubmit_6("");
		}

		if (!"".equals(server.getSubmit_7()) && server.getSubmit_7() != null) {
			insert.setSubmit_7(server.getSubmit_7());
		} else {
			insert.setSubmit_7("");
		}

		if (!"".equals(server.getTest_1()) && server.getTest_1() != null) {
			insert.setTest_1(server.getTest_1());
		} else {
			insert.setTest_1("");
		}

		if (!"".equals(server.getTest1_way_1())
				&& server.getTest1_way_1() != null) {
			insert.setTest1_way_1(server.getTest1_way_1());
		} else {
			insert.setTest1_way_1("");
		}

		if (!"".equals(server.getTest_2()) && server.getTest_2() != null) {
			insert.setTest_2(server.getTest_2());
		} else {
			insert.setTest_2("");
		}

		if (!"".equals(server.getTest2_way_1())
				&& server.getTest2_way_1() != null) {
			insert.setTest2_way_1(server.getTest2_way_1());
		} else {
			insert.setTest2_way_1("");
		}

		if (!"".equals(server.getTest2_way_2())
				&& server.getTest2_way_2() != null) {
			insert.setTest2_way_2(server.getTest2_way_2());
		} else {
			insert.setTest2_way_2("");
		}

		if (!"".equals(server.getTest_3()) && server.getTest_3() != null) {
			insert.setTest_3(server.getTest_3());
		} else {
			insert.setTest_3("");
		}

		if (!"".equals(server.getTest3_way_1())
				&& server.getTest3_way_1() != null) {
			insert.setTest3_way_1(server.getTest3_way_1());
		} else {
			insert.setTest3_way_1("");
		}

		if (!"".equals(server.getTest3_way_2())
				&& server.getTest3_way_2() != null) {
			insert.setTest3_way_2(server.getTest3_way_2());
		} else {
			insert.setTest3_way_2("");
		}

		if (!"".equals(server.getTest_4()) && server.getTest_4() != null) {
			insert.setTest_4(server.getTest_4());
		} else {
			insert.setTest_4("");
		}

		if (!"".equals(server.getTest4_way_1())
				&& server.getTest4_way_1() != null) {
			insert.setTest4_way_1(server.getTest4_way_1());
		} else {
			insert.setTest4_way_1("");
		}

		if (!"".equals(server.getNote()) && server.getNote() != null) {
			insert.setNote(server.getNote());
		} else {
			insert.setNote("");
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
