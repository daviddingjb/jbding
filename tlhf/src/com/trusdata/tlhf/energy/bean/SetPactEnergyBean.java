package com.trusdata.tlhf.energy.bean;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * @author JBDING
 * 
 */
public class SetPactEnergyBean {

	public static PactEnergyBean setBean(PactEnergyBean server)
			throws Exception {
		PactEnergyBean insert = new PactEnergyBean();

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

		if (!"".equals(server.getEntrusted_date1())
				&& server.getEntrusted_date1() != null) {
			insert.setEntrusted_date1(server.getEntrusted_date1());
		} else {
			insert.setEntrusted_date1("");
		}

		if (!"".equals(server.getSettler()) && server.getSettler() != null) {
			insert.setSettler(server.getSettler());
		} else {
			insert.setSettler("");
		}

		if (!"".equals(server.getContract_name())
				&& server.getContract_name() != null) {
			insert.setContract_name(server.getContract_name());
		} else {
			insert.setContract_name("");
		}

		if (!"".equals(server.getContact_call())
				&& server.getContact_call() != null) {
			insert.setContact_call(server.getContact_call());
		} else {
			insert.setContact_call("");
		}

		if (!"".equals(server.getEntrusted_settler())
				&& server.getEntrusted_settler() != null) {
			insert.setEntrusted_settler(server.getEntrusted_settler());
		} else {
			insert.setEntrusted_settler("");
		}

		if (!"".equals(server.getObj_name()) && server.getObj_name() != null) {
			insert.setObj_name(server.getObj_name());
		} else {
			insert.setObj_name("");
		}

		if (!"".equals(server.getObj_addr()) && server.getObj_addr() != null) {
			insert.setObj_addr(server.getObj_addr());
		} else {
			insert.setObj_addr("");
		}

		if (!"".equals(server.getConstruction())
				&& server.getConstruction() != null) {
			insert.setConstruction(server.getConstruction());
		} else {
			insert.setConstruction("");
		}

		if (!"".equals(server.getConstruction_unit())
				&& server.getConstruction_unit() != null) {
			insert.setConstruction_unit(server.getConstruction_unit());
		} else {
			insert.setConstruction_unit("");
		}

		if (!"".equals(server.getDesign_unit())
				&& server.getDesign_unit() != null) {
			insert.setDesign_unit(server.getDesign_unit());
		} else {
			insert.setDesign_unit("");
		}

		if (!"".equals(server.getSupervision_unit())
				&& server.getSupervision_unit() != null) {
			insert.setSupervision_unit(server.getSupervision_unit());
		} else {
			insert.setSupervision_unit("");
		}

		if (!"".equals(server.getDelegate_detection())
				&& server.getDelegate_detection() != null) {
			insert.setDelegate_detection(server.getDelegate_detection());
		} else {
			insert.setDelegate_detection("");
		}

		if (!"".equals(server.getPro_acceptance())
				&& server.getPro_acceptance() != null) {
			insert.setPro_acceptance(server.getPro_acceptance());
		} else {
			insert.setPro_acceptance("");
		}

		if (!"".equals(server.getCheck_other())
				&& server.getCheck_other() != null) {
			insert.setCheck_other(server.getCheck_other());
		} else {
			insert.setCheck_other("");
		}

		if (!"".equals(server.getCheck_basis())
				&& server.getCheck_basis() != null) {
			insert.setCheck_basis(server.getCheck_basis());
		} else {
			insert.setCheck_basis("");
		}

		if (!"".equals(server.getDesign_req())
				&& server.getDesign_req() != null) {
			insert.setDesign_req(server.getDesign_req());
		} else {
			insert.setDesign_req("");
		}

		if (!"".equals(server.getDrawings_heating())
				&& server.getDrawings_heating() != null) {
			insert.setDrawings_heating(server.getDrawings_heating());
		} else {
			insert.setDrawings_heating("");
		}

		if (!"".equals(server.getDrawings_lighting())
				&& server.getDrawings_lighting() != null) {
			insert.setDrawings_lighting(server.getDrawings_lighting());
		} else {
			insert.setDrawings_lighting("");
		}

		if (!"".equals(server.getDrawings_wind())
				&& server.getDrawings_wind() != null) {
			insert.setDrawings_wind(server.getDrawings_wind());
		} else {
			insert.setDrawings_wind("");
		}

		if (!"".equals(server.getDrawings_ac())
				&& server.getDrawings_ac() != null) {
			insert.setDrawings_ac(server.getDrawings_ac());
		} else {
			insert.setDrawings_ac("");
		}

		if (!"".equals(server.getDrawings_building())
				&& server.getDrawings_building() != null) {
			insert.setDrawings_building(server.getDrawings_building());
		} else {
			insert.setDrawings_building("");
		}

		if (!"".equals(server.getDrawings_other())
				&& server.getDrawings_other() != null) {
			insert.setDrawings_other(server.getDrawings_other());
		} else {
			insert.setDrawings_other("");
		}

		if (!"".equals(server.getDoc_other()) && server.getDoc_other() != null) {
			insert.setDoc_other(server.getDoc_other());
		} else {
			insert.setDoc_other("");
		}

		if (!"".equals(server.getTest_1()) && server.getTest_1() != null) {
			insert.setTest_1(server.getTest_1());
		} else {
			insert.setTest_1("");
		}

		if (!"".equals(server.getTest_2()) && server.getTest_2() != null) {
			insert.setTest_2(server.getTest_2());
		} else {
			insert.setTest_2("");
		}

		if (!"".equals(server.getTest_3()) && server.getTest_3() != null) {
			insert.setTest_3(server.getTest_3());
		} else {
			insert.setTest_3("");
		}

		if (!"".equals(server.getTest_4()) && server.getTest_4() != null) {
			insert.setTest_4(server.getTest_4());
		} else {
			insert.setTest_4("");
		}

		if (!"".equals(server.getTest_5()) && server.getTest_5() != null) {
			insert.setTest_5(server.getTest_5());
		} else {
			insert.setTest_5("");
		}

		if (!"".equals(server.getTest_6()) && server.getTest_6() != null) {
			insert.setTest_6(server.getTest_6());
		} else {
			insert.setTest_6("");
		}

		if (!"".equals(server.getTest_7()) && server.getTest_7() != null) {
			insert.setTest_7(server.getTest_7());
		} else {
			insert.setTest_7("");
		}

		if (!"".equals(server.getTest_8()) && server.getTest_8() != null) {
			insert.setTest_8(server.getTest_8());
		} else {
			insert.setTest_8("");
		}

		if (!"".equals(server.getTest_9()) && server.getTest_9() != null) {
			insert.setTest_9(server.getTest_9());
		} else {
			insert.setTest_9("");
		}

		if (!"".equals(server.getTest_10()) && server.getTest_10() != null) {
			insert.setTest_10(server.getTest_10());
		} else {
			insert.setTest_10("");
		}

		if (!"".equals(server.getTest_11()) && server.getTest_11() != null) {
			insert.setTest_11(server.getTest_11());
		} else {
			insert.setTest_11("");
		}

		if (!"".equals(server.getTest_way_1())
				&& server.getTest_way_1() != null) {
			insert.setTest_way_1(server.getTest_way_1());
		} else {
			insert.setTest_way_1("");
		}

		if (!"".equals(server.getTest_way_2())
				&& server.getTest_way_2() != null) {
			insert.setTest_way_2(server.getTest_way_2());
		} else {
			insert.setTest_way_2("");
		}

		if (!"".equals(server.getTest_way_3())
				&& server.getTest_way_3() != null) {
			insert.setTest_way_3(server.getTest_way_3());
		} else {
			insert.setTest_way_3("");
		}

		if (!"".equals(server.getTest_way_4())
				&& server.getTest_way_4() != null) {
			insert.setTest_way_4(server.getTest_way_4());
		} else {
			insert.setTest_way_4("");
		}

		if (!"".equals(server.getTest_way_5())
				&& server.getTest_way_5() != null) {
			insert.setTest_way_5(server.getTest_way_5());
		} else {
			insert.setTest_way_5("");
		}

		if (!"".equals(server.getTest_way_6())
				&& server.getTest_way_6() != null) {
			insert.setTest_way_6(server.getTest_way_6());
		} else {
			insert.setTest_way_6("");
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
