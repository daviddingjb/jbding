package com.trusdata.tlhf.build.bean;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * @author JBDING
 * 
 */
public class SetPactBuildBean {

	public static PactBuildBean setBean(PactBuildBean server) throws Exception {
		PactBuildBean insert = new PactBuildBean();

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

		if (!"".equals(server.getTest_date())
				&& server.getTest_date() != null) {
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

		if (!"".equals(server.getEntrusted_call())
				&& server.getEntrusted_call() != null) {
			insert.setEntrusted_call(server.getEntrusted_call());
		} else {
			insert.setEntrusted_call("");
		}

		if (!"".equals(server.getBuild_area())
				&& server.getBuild_area() != null) {
			insert.setBuild_area(server.getBuild_area());
		} else {
			insert.setBuild_area("");
		}

		if (!"".equals(server.getTest_point())
				&& server.getTest_point() != null) {
			insert.setTest_point(server.getTest_point());
		} else {
			insert.setTest_point("");
		}

		if (!"".equals(server.getEntrusted_settler())
				&& server.getEntrusted_settler() != null) {
			insert.setEntrusted_settler(server.getEntrusted_settler());
		} else {
			insert.setEntrusted_settler("");
		}

		if (!"".equals(server.getObj_name())
				&& server.getObj_name() != null) {
			insert.setObj_name(server.getObj_name());
		} else {
			insert.setObj_name("");
		}

		if (!"".equals(server.getObj_addr())
				&& server.getObj_addr() != null) {
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

		if (!"".equals(server.getDesign_unit())
				&& server.getDesign_unit() != null) {
			insert.setDesign_unit(server.getDesign_unit());
		} else {
			insert.setDesign_unit("");
		}

		if (!"".equals(server.getConstruction_unit())
				&& server.getConstruction_unit() != null) {
			insert.setConstruction_unit(server.getConstruction_unit());
		} else {
			insert.setConstruction_unit("");
		}

		if (!"".equals(server.getSupervision_unit())
				&& server.getSupervision_unit() != null) {
			insert.setSupervision_unit(server.getSupervision_unit());
		} else {
			insert.setSupervision_unit("");
		}

		if (!"".equals(server.getTest_1())
				&& server.getTest_1() != null) {
			insert.setTest_1(server.getTest_1());
		} else {
			insert.setTest_1("");
		}

		if (!"".equals(server.getTest_2())
				&& server.getTest_2() != null) {
			insert.setTest_2(server.getTest_2());
		} else {
			insert.setTest_2("");
		}

		if (!"".equals(server.getTest_3())
				&& server.getTest_3() != null) {
			insert.setTest_3(server.getTest_3());
		} else {
			insert.setTest_3("");
		}

		if (!"".equals(server.getTest_4())
				&& server.getTest_4() != null) {
			insert.setTest_4(server.getTest_4());
		} else {
			insert.setTest_4("");
		}

		if (!"".equals(server.getTest_5())
				&& server.getTest_5() != null) {
			insert.setTest_5(server.getTest_5());
		} else {
			insert.setTest_5("");
		}

		if (!"".equals(server.getTest_6())
				&& server.getTest_6() != null) {
			insert.setTest_6(server.getTest_6());
		} else {
			insert.setTest_6("");
		}

		if (!"".equals(server.getTest_7())
				&& server.getTest_7() != null) {
			insert.setTest_7(server.getTest_7());
		} else {
			insert.setTest_7("");
		}

		if (!"".equals(server.getTest_8())
				&& server.getTest_8() != null) {
			insert.setTest_8(server.getTest_8());
		} else {
			insert.setTest_8("");
		}

		if (!"".equals(server.getTest_ref_1())
				&& server.getTest_ref_1() != null) {
			insert.setTest_ref_1(server.getTest_ref_1());
		} else {
			insert.setTest_ref_1("");
		}

		if (!"".equals(server.getTest_ref_2())
				&& server.getTest_ref_2() != null) {
			insert.setTest_ref_2(server.getTest_ref_2());
		} else {
			insert.setTest_ref_2("");
		}

		if (!"".equals(server.getTest_ref_3())
				&& server.getTest_ref_3() != null) {
			insert.setTest_ref_3(server.getTest_ref_3());
		} else {
			insert.setTest_ref_3("");
		}

		if (!"".equals(server.getStart_dt())
				&& server.getStart_dt() != null) {
			insert.setStart_dt(server.getStart_dt());
		} else {
			insert.setStart_dt("");
		}

		if (!"".equals(server.getEnd_dt())
				&& server.getEnd_dt() != null) {
			insert.setEnd_dt(server.getEnd_dt());
		} else {
			insert.setEnd_dt("");
		}

		if (!"".equals(server.getSlotted_dt())
				&& server.getSlotted_dt() != null) {
			insert.setSlotted_dt(server.getSlotted_dt());
		} else {
			insert.setSlotted_dt("");
		}

		if (!"".equals(server.getStruc_type())
				&& server.getStruc_type() != null) {
			insert.setStruc_type(server.getStruc_type());
		} else {
			insert.setStruc_type("");
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

		if (!"".equals(server.getTest_type_4())
				&& server.getTest_type_4() != null) {
			insert.setTest_type_4(server.getTest_type_4());
		} else {
			insert.setTest_type_4("");
		}

		if (!"".equals(server.getDoor_install_1())
				&& server.getDoor_install_1() != null) {
			insert.setDoor_install_1(server.getDoor_install_1());
		} else {
			insert.setDoor_install_1("");
		}

		if (!"".equals(server.getDoor_install_2())
				&& server.getDoor_install_2() != null) {
			insert.setDoor_install_2(server.getDoor_install_2());
		} else {
			insert.setDoor_install_2("");
		}

		if (!"".equals(server.getObj_type_1())
				&& server.getObj_type_1() != null) {
			insert.setObj_type_1(server.getObj_type_1());
		} else {
			insert.setObj_type_1("");
		}

		if (!"".equals(server.getObj_type_2())
				&& server.getObj_type_2() != null) {
			insert.setObj_type_2(server.getObj_type_2());
		} else {
			insert.setObj_type_2("");
		}

		if (!"".equals(server.getObj_type_3())
				&& server.getObj_type_3() != null) {
			insert.setObj_type_3(server.getObj_type_3());
		} else {
			insert.setObj_type_3("");
		}

		if (!"".equals(server.getFitment_1())
				&& server.getFitment_1() != null) {
			insert.setFitment_1(server.getFitment_1());
		} else {
			insert.setFitment_1("");
		}

		if (!"".equals(server.getFitment_2())
				&& server.getFitment_2() != null) {
			insert.setFitment_2(server.getFitment_2());
		} else {
			insert.setFitment_2("");
		}

		if (!"".equals(server.getFitment_3())
				&& server.getFitment_3() != null) {
			insert.setFitment_3(server.getFitment_3());
		} else {
			insert.setFitment_3("");
		}

		if (!"".equals(server.getBuilding_type_1())
				&& server.getBuilding_type_1() != null) {
			insert.setBuilding_type_1(server.getBuilding_type_1());
		} else {
			insert.setBuilding_type_1("");
		}

		if (!"".equals(server.getBuilding_type_2())
				&& server.getBuilding_type_2() != null) {
			insert.setBuilding_type_2(server.getBuilding_type_2());
		} else {
			insert.setBuilding_type_2("");
		}

		if (!"".equals(server.getFloor_num())
				&& server.getFloor_num() != null) {
			insert.setFloor_num(server.getFloor_num());
		} else {
			insert.setFloor_num("");
		}

		if (!"".equals(server.getCost_1())
				&& server.getCost_1() != null) {
			insert.setCost_1(server.getCost_1());
		} else {
			insert.setCost_1("");
		}

		if (!"".equals(server.getCost_2())
				&& server.getCost_2() != null) {
			insert.setCost_2(server.getCost_2());
		} else {
			insert.setCost_2("");
		}

		if (!"".equals(server.getCost_3())
				&& server.getCost_3() != null) {
			insert.setCost_3(server.getCost_3());
		} else {
			insert.setCost_3("");
		}

		if (!"".equals(server.getCost_4())
				&& server.getCost_4() != null) {
			insert.setCost_4(server.getCost_4());
		} else {
			insert.setCost_4("");
		}

		if (!"".equals(server.getCost_5())
				&& server.getCost_5() != null) {
			insert.setCost_5(server.getCost_5());
		} else {
			insert.setCost_5("");
		}

		if (!"".equals(server.getCost_6())
				&& server.getCost_6() != null) {
			insert.setCost_6(server.getCost_6());
		} else {
			insert.setCost_6("");
		}

		if (!"".equals(server.getCost_7())
				&& server.getCost_7() != null) {
			insert.setCost_7(server.getCost_7());
		} else {
			insert.setCost_7("");
		}

		if (!"".equals(server.getSubmit_1())
				&& server.getSubmit_1() != null) {
			insert.setSubmit_1(server.getSubmit_1());
		} else {
			insert.setSubmit_1("");
		}

		if (!"".equals(server.getSubmit_2())
				&& server.getSubmit_2() != null) {
			insert.setSubmit_2(server.getSubmit_2());
		} else {
			insert.setSubmit_2("");
		}

		if (!"".equals(server.getSubmit_3())
				&& server.getSubmit_3() != null) {
			insert.setSubmit_3(server.getSubmit_3());
		} else {
			insert.setSubmit_3("");
		}

		if (!"".equals(server.getSubmit_4())
				&& server.getSubmit_4() != null) {
			insert.setSubmit_4(server.getSubmit_4());
		} else {
			insert.setSubmit_4("");
		}

		if (!"".equals(server.getSubmit_5())
				&& server.getSubmit_5() != null) {
			insert.setSubmit_5(server.getSubmit_5());
		} else {
			insert.setSubmit_5("");
		}

		if (!"".equals(server.getSubmit_6())
				&& server.getSubmit_6() != null) {
			insert.setSubmit_6(server.getSubmit_6());
		} else {
			insert.setSubmit_6("");
		}

		if (!"".equals(server.getSubmit_7())
				&& server.getSubmit_7() != null) {
			insert.setSubmit_7(server.getSubmit_7());
		} else {
			insert.setSubmit_7("");
		}

		if (!"".equals(server.getNote())
				&& server.getNote() != null) {
			insert.setNote(server.getNote());
		} else {
			insert.setNote("");
		}

		if (!"".equals(server.getOther())
				&& server.getOther() != null) {
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
