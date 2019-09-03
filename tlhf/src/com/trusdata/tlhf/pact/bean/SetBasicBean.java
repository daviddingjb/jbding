package com.trusdata.tlhf.pact.bean;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * @author JBDING
 * 
 */
public class SetBasicBean {

	public static BasicBean setBean(BasicBean server) throws Exception {
		BasicBean insert = new BasicBean();

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

		if (!"".equals(server.getUpd_name()) && server.getUpd_name() != null) {
			insert.setUpd_name(server.getUpd_name());
		} else {
			insert.setUpd_name("");
		}

		if (!"".equals(server.getTlhf_name()) && server.getTlhf_name() != null) {
			insert.setTlhf_name(server.getTlhf_name());
		} else {
			insert.setTlhf_name("北京天朗汇丰环境检测有限公司");
		}

		if (!"".equals(server.getEntrusted_name()) && server.getEntrusted_name() != null) {
			insert.setEntrusted_name(server.getEntrusted_name());
		} else {
			insert.setEntrusted_name("");
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

		if (!"".equals(server.getConst_name()) && server.getConst_name() != null) {
			insert.setConst_name(server.getConst_name());
		} else {
			insert.setConst_name("");
		}

		if (!"".equals(server.getConst_unit_name()) && server.getConst_unit_name() != null) {
			insert.setConst_unit_name(server.getConst_unit_name());
		} else {
			insert.setConst_unit_name("");
		}

		if (!"".equals(server.getDesign_name()) && server.getDesign_name() != null) {
			insert.setDesign_name(server.getDesign_name());
		} else {
			insert.setDesign_name("");
		}

		if (!"".equals(server.getSupervision_name()) && server.getSupervision_name() != null) {
			insert.setSupervision_name(server.getSupervision_name());
		} else {
			insert.setSupervision_name("");
		}

		if (!"".equals(server.getStruc_type()) && server.getStruc_type() != null) {
			insert.setStruc_type(server.getStruc_type());
		} else {
			insert.setStruc_type("");
		}

		if (!"".equals(server.getArea()) && server.getArea() != null) {
			insert.setArea(server.getArea());
		} else {
			insert.setArea("");
		}

		if (!"".equals(server.getPressure()) && server.getPressure() != null) {
			insert.setPressure(server.getPressure());
		} else {
			insert.setPressure("");
		}

		if (!"".equals(server.getCheck_type()) && server.getCheck_type() != null) {
			insert.setCheck_type(server.getCheck_type());
		} else {
			insert.setCheck_type("");
		}

		if (!"".equals(server.getSealed_time()) && server.getSealed_time() != null) {
			insert.setSealed_time(server.getSealed_time());
		} else {
			insert.setSealed_time("");
		}

		if (!"".equals(server.getSampling_temperature()) && server.getSampling_temperature() != null) {
			insert.setSampling_temperature(server.getSampling_temperature());
		} else {
			insert.setSampling_temperature("");
		}

		if (!"".equals(server.getCheck_depend()) && server.getCheck_depend() != null) {
			insert.setCheck_depend(server.getCheck_depend());
		} else {
			insert.setCheck_depend("");
		}

		if (!"".equals(server.getCheck_device()) && server.getCheck_device() != null) {
			insert.setCheck_device(server.getCheck_device());
		} else {
			insert.setCheck_device("");
		}

		if (!"".equals(server.getSampling_dt()) && server.getSampling_dt() != null) {
			insert.setSampling_dt(server.getSampling_dt());
		} else {
//			insert.setSampling_dt(new Date());
		}

		if (!"".equals(server.getCheck_dt()) && server.getCheck_dt() != null) {
			insert.setCheck_dt(server.getCheck_dt());
		} else {
//			insert.setCheck_dt(new Date());
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
