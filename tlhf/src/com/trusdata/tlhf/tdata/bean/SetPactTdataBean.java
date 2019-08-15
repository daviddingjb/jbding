package com.trusdata.tlhf.tdata.bean;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * @author JBDING
 * 
 */
public class SetPactTdataBean {

	public static PactTdataBean setBean(PactTdataBean server) throws Exception {
		PactTdataBean insert = new PactTdataBean();

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

		if (!"".equals(server.getEntity_name())
				&& server.getEntity_name() != null) {
			insert.setEntity_name(server.getEntity_name());
		} else {
			insert.setEntity_name("");
		}

		if (!"".equals(server.getInput_name())
				&& server.getInput_name() != null) {
			insert.setInput_name(server.getInput_name());
		} else {
			insert.setInput_name("");
		}

		if (!"".equals(server.getSta_1_name())
				&& server.getSta_1_name() != null) {
			insert.setSta_1_name(server.getSta_1_name());
		} else {
			insert.setSta_1_name("");
		}

		if (!"".equals(server.getSta_1_xibei())
				&& server.getSta_1_xibei() != null) {
			insert.setSta_1_xibei(server.getSta_1_xibei());
		} else {
			insert.setSta_1_xibei("");
		}

		if (!"".equals(server.getSta_1_xinan())
				&& server.getSta_1_xinan() != null) {
			insert.setSta_1_xinan(server.getSta_1_xinan());
		} else {
			insert.setSta_1_xinan("");
		}

		if (!"".equals(server.getSta_1_zjian())
				&& server.getSta_1_zjian() != null) {
			insert.setSta_1_zjian(server.getSta_1_zjian());
		} else {
			insert.setSta_1_zjian("");
		}

		if (!"".equals(server.getSta_1_donan())
				&& server.getSta_1_donan() != null) {
			insert.setSta_1_donan(server.getSta_1_donan());
		} else {
			insert.setSta_1_donan("");
		}

		if (!"".equals(server.getSta_1_dobei())
				&& server.getSta_1_dobei() != null) {
			insert.setSta_1_dobei(server.getSta_1_dobei());
		} else {
			insert.setSta_1_dobei("");
		}

		if (!"".equals(server.getSta_2_name())
				&& server.getSta_2_name() != null) {
			insert.setSta_2_name(server.getSta_2_name());
		} else {
			insert.setSta_2_name("");
		}

		if (!"".equals(server.getSta_2_xibei())
				&& server.getSta_2_xibei() != null) {
			insert.setSta_2_xibei(server.getSta_2_xibei());
		} else {
			insert.setSta_2_xibei("");
		}

		if (!"".equals(server.getSta_2_xinan())
				&& server.getSta_2_xinan() != null) {
			insert.setSta_2_xinan(server.getSta_2_xinan());
		} else {
			insert.setSta_2_xinan("");
		}

		if (!"".equals(server.getSta_2_zjian())
				&& server.getSta_2_zjian() != null) {
			insert.setSta_2_zjian(server.getSta_2_zjian());
		} else {
			insert.setSta_2_zjian("");
		}

		if (!"".equals(server.getSta_2_donan())
				&& server.getSta_2_donan() != null) {
			insert.setSta_2_donan(server.getSta_2_donan());
		} else {
			insert.setSta_2_donan("");
		}

		if (!"".equals(server.getSta_2_dobei())
				&& server.getSta_2_dobei() != null) {
			insert.setSta_2_dobei(server.getSta_2_dobei());
		} else {
			insert.setSta_2_dobei("");
		}

		if (!"".equals(server.getSta_3_name())
				&& server.getSta_3_name() != null) {
			insert.setSta_3_name(server.getSta_3_name());
		} else {
			insert.setSta_3_name("");
		}

		if (!"".equals(server.getSta_3_xibei())
				&& server.getSta_3_xibei() != null) {
			insert.setSta_3_xibei(server.getSta_3_xibei());
		} else {
			insert.setSta_3_xibei("");
		}

		if (!"".equals(server.getSta_3_xinan())
				&& server.getSta_3_xinan() != null) {
			insert.setSta_3_xinan(server.getSta_3_xinan());
		} else {
			insert.setSta_3_xinan("");
		}

		if (!"".equals(server.getSta_3_zjian())
				&& server.getSta_3_zjian() != null) {
			insert.setSta_3_zjian(server.getSta_3_zjian());
		} else {
			insert.setSta_3_zjian("");
		}

		if (!"".equals(server.getSta_3_donan())
				&& server.getSta_3_donan() != null) {
			insert.setSta_3_donan(server.getSta_3_donan());
		} else {
			insert.setSta_3_donan("");
		}

		if (!"".equals(server.getSta_3_dobei())
				&& server.getSta_3_dobei() != null) {
			insert.setSta_3_dobei(server.getSta_3_dobei());
		} else {
			insert.setSta_3_dobei("");
		}

		if (!"".equals(server.getSta_4_name())
				&& server.getSta_4_name() != null) {
			insert.setSta_4_name(server.getSta_4_name());
		} else {
			insert.setSta_4_name("");
		}

		if (!"".equals(server.getSta_4_xibei())
				&& server.getSta_4_xibei() != null) {
			insert.setSta_4_xibei(server.getSta_4_xibei());
		} else {
			insert.setSta_4_xibei("");
		}

		if (!"".equals(server.getSta_4_xinan())
				&& server.getSta_4_xinan() != null) {
			insert.setSta_4_xinan(server.getSta_4_xinan());
		} else {
			insert.setSta_4_xinan("");
		}

		if (!"".equals(server.getSta_4_zjian())
				&& server.getSta_4_zjian() != null) {
			insert.setSta_4_zjian(server.getSta_4_zjian());
		} else {
			insert.setSta_4_zjian("");
		}

		if (!"".equals(server.getSta_4_donan())
				&& server.getSta_4_donan() != null) {
			insert.setSta_4_donan(server.getSta_4_donan());
		} else {
			insert.setSta_4_donan("");
		}

		if (!"".equals(server.getSta_4_dobei())
				&& server.getSta_4_dobei() != null) {
			insert.setSta_4_dobei(server.getSta_4_dobei());
		} else {
			insert.setSta_4_dobei("");
		}

		if (!"".equals(server.getSta_5_name())
				&& server.getSta_5_name() != null) {
			insert.setSta_5_name(server.getSta_5_name());
		} else {
			insert.setSta_5_name("");
		}

		if (!"".equals(server.getSta_5_xibei())
				&& server.getSta_5_xibei() != null) {
			insert.setSta_5_xibei(server.getSta_5_xibei());
		} else {
			insert.setSta_5_xibei("");
		}

		if (!"".equals(server.getSta_5_xinan())
				&& server.getSta_5_xinan() != null) {
			insert.setSta_5_xinan(server.getSta_5_xinan());
		} else {
			insert.setSta_5_xinan("");
		}

		if (!"".equals(server.getSta_5_zjian())
				&& server.getSta_5_zjian() != null) {
			insert.setSta_5_zjian(server.getSta_5_zjian());
		} else {
			insert.setSta_5_zjian("");
		}

		if (!"".equals(server.getSta_5_donan())
				&& server.getSta_5_donan() != null) {
			insert.setSta_5_donan(server.getSta_5_donan());
		} else {
			insert.setSta_5_donan("");
		}

		if (!"".equals(server.getSta_5_dobei())
				&& server.getSta_5_dobei() != null) {
			insert.setSta_5_dobei(server.getSta_5_dobei());
		} else {
			insert.setSta_5_dobei("");
		}

		if (!"".equals(server.getSta_6_name())
				&& server.getSta_6_name() != null) {
			insert.setSta_6_name(server.getSta_6_name());
		} else {
			insert.setSta_6_name("");
		}

		if (!"".equals(server.getSta_6_xibei())
				&& server.getSta_6_xibei() != null) {
			insert.setSta_6_xibei(server.getSta_6_xibei());
		} else {
			insert.setSta_6_xibei("");
		}

		if (!"".equals(server.getSta_6_xinan())
				&& server.getSta_6_xinan() != null) {
			insert.setSta_6_xinan(server.getSta_6_xinan());
		} else {
			insert.setSta_6_xinan("");
		}

		if (!"".equals(server.getSta_6_zjian())
				&& server.getSta_6_zjian() != null) {
			insert.setSta_6_zjian(server.getSta_6_zjian());
		} else {
			insert.setSta_6_zjian("");
		}

		if (!"".equals(server.getSta_6_donan())
				&& server.getSta_6_donan() != null) {
			insert.setSta_6_donan(server.getSta_6_donan());
		} else {
			insert.setSta_6_donan("");
		}

		if (!"".equals(server.getSta_6_dobei())
				&& server.getSta_6_dobei() != null) {
			insert.setSta_6_dobei(server.getSta_6_dobei());
		} else {
			insert.setSta_6_dobei("");
		}

		if (!"".equals(server.getSta_7_name())
				&& server.getSta_7_name() != null) {
			insert.setSta_7_name(server.getSta_7_name());
		} else {
			insert.setSta_7_name("");
		}

		if (!"".equals(server.getSta_7_xibei())
				&& server.getSta_7_xibei() != null) {
			insert.setSta_7_xibei(server.getSta_7_xibei());
		} else {
			insert.setSta_7_xibei("");
		}

		if (!"".equals(server.getSta_7_xinan())
				&& server.getSta_7_xinan() != null) {
			insert.setSta_7_xinan(server.getSta_7_xinan());
		} else {
			insert.setSta_7_xinan("");
		}

		if (!"".equals(server.getSta_7_zjian())
				&& server.getSta_7_zjian() != null) {
			insert.setSta_7_zjian(server.getSta_7_zjian());
		} else {
			insert.setSta_7_zjian("");
		}

		if (!"".equals(server.getSta_7_donan())
				&& server.getSta_7_donan() != null) {
			insert.setSta_7_donan(server.getSta_7_donan());
		} else {
			insert.setSta_7_donan("");
		}

		if (!"".equals(server.getSta_7_dobei())
				&& server.getSta_7_dobei() != null) {
			insert.setSta_7_dobei(server.getSta_7_dobei());
		} else {
			insert.setSta_7_dobei("");
		}

		if (!"".equals(server.getSta_8_name())
				&& server.getSta_8_name() != null) {
			insert.setSta_8_name(server.getSta_8_name());
		} else {
			insert.setSta_8_name("");
		}

		if (!"".equals(server.getSta_8_xibei())
				&& server.getSta_8_xibei() != null) {
			insert.setSta_8_xibei(server.getSta_8_xibei());
		} else {
			insert.setSta_8_xibei("");
		}

		if (!"".equals(server.getSta_8_xinan())
				&& server.getSta_8_xinan() != null) {
			insert.setSta_8_xinan(server.getSta_8_xinan());
		} else {
			insert.setSta_8_xinan("");
		}

		if (!"".equals(server.getSta_8_zjian())
				&& server.getSta_8_zjian() != null) {
			insert.setSta_8_zjian(server.getSta_8_zjian());
		} else {
			insert.setSta_8_zjian("");
		}

		if (!"".equals(server.getSta_8_donan())
				&& server.getSta_8_donan() != null) {
			insert.setSta_8_donan(server.getSta_8_donan());
		} else {
			insert.setSta_8_donan("");
		}

		if (!"".equals(server.getSta_8_dobei())
				&& server.getSta_8_dobei() != null) {
			insert.setSta_8_dobei(server.getSta_8_dobei());
		} else {
			insert.setSta_8_dobei("");
		}

		if (!"".equals(server.getSta_9_name())
				&& server.getSta_9_name() != null) {
			insert.setSta_9_name(server.getSta_9_name());
		} else {
			insert.setSta_9_name("");
		}

		if (!"".equals(server.getSta_9_xibei())
				&& server.getSta_9_xibei() != null) {
			insert.setSta_9_xibei(server.getSta_9_xibei());
		} else {
			insert.setSta_9_xibei("");
		}

		if (!"".equals(server.getSta_9_xinan())
				&& server.getSta_9_xinan() != null) {
			insert.setSta_9_xinan(server.getSta_9_xinan());
		} else {
			insert.setSta_9_xinan("");
		}

		if (!"".equals(server.getSta_9_zjian())
				&& server.getSta_9_zjian() != null) {
			insert.setSta_9_zjian(server.getSta_9_zjian());
		} else {
			insert.setSta_9_zjian("");
		}

		if (!"".equals(server.getSta_9_donan())
				&& server.getSta_9_donan() != null) {
			insert.setSta_9_donan(server.getSta_9_donan());
		} else {
			insert.setSta_9_donan("");
		}

		if (!"".equals(server.getSta_9_dobei())
				&& server.getSta_9_dobei() != null) {
			insert.setSta_9_dobei(server.getSta_9_dobei());
		} else {
			insert.setSta_9_dobei("");
		}

		if (!"".equals(server.getSta_10_name())
				&& server.getSta_10_name() != null) {
			insert.setSta_10_name(server.getSta_10_name());
		} else {
			insert.setSta_10_name("");
		}

		if (!"".equals(server.getSta_10_xibei())
				&& server.getSta_10_xibei() != null) {
			insert.setSta_10_xibei(server.getSta_10_xibei());
		} else {
			insert.setSta_10_xibei("");
		}

		if (!"".equals(server.getSta_10_xinan())
				&& server.getSta_10_xinan() != null) {
			insert.setSta_10_xinan(server.getSta_10_xinan());
		} else {
			insert.setSta_10_xinan("");
		}

		if (!"".equals(server.getSta_10_zjian())
				&& server.getSta_10_zjian() != null) {
			insert.setSta_10_zjian(server.getSta_10_zjian());
		} else {
			insert.setSta_10_zjian("");
		}

		if (!"".equals(server.getSta_10_donan())
				&& server.getSta_10_donan() != null) {
			insert.setSta_10_donan(server.getSta_10_donan());
		} else {
			insert.setSta_10_donan("");
		}

		if (!"".equals(server.getSta_10_dobei())
				&& server.getSta_10_dobei() != null) {
			insert.setSta_10_dobei(server.getSta_10_dobei());
		} else {
			insert.setSta_10_dobei("");
		}

		if (!"".equals(server.getSta_11_name())
				&& server.getSta_11_name() != null) {
			insert.setSta_11_name(server.getSta_11_name());
		} else {
			insert.setSta_11_name("");
		}

		if (!"".equals(server.getSta_11_xibei())
				&& server.getSta_11_xibei() != null) {
			insert.setSta_11_xibei(server.getSta_11_xibei());
		} else {
			insert.setSta_11_xibei("");
		}

		if (!"".equals(server.getSta_11_xinan())
				&& server.getSta_11_xinan() != null) {
			insert.setSta_11_xinan(server.getSta_11_xinan());
		} else {
			insert.setSta_11_xinan("");
		}

		if (!"".equals(server.getSta_11_zjian())
				&& server.getSta_11_zjian() != null) {
			insert.setSta_11_zjian(server.getSta_11_zjian());
		} else {
			insert.setSta_11_zjian("");
		}

		if (!"".equals(server.getSta_11_donan())
				&& server.getSta_11_donan() != null) {
			insert.setSta_11_donan(server.getSta_11_donan());
		} else {
			insert.setSta_11_donan("");
		}

		if (!"".equals(server.getSta_11_dobei())
				&& server.getSta_11_dobei() != null) {
			insert.setSta_11_dobei(server.getSta_11_dobei());
		} else {
			insert.setSta_11_dobei("");
		}

		if (!"".equals(server.getSta_12_name())
				&& server.getSta_12_name() != null) {
			insert.setSta_12_name(server.getSta_12_name());
		} else {
			insert.setSta_12_name("");
		}

		if (!"".equals(server.getSta_12_xibei())
				&& server.getSta_12_xibei() != null) {
			insert.setSta_12_xibei(server.getSta_12_xibei());
		} else {
			insert.setSta_12_xibei("");
		}

		if (!"".equals(server.getSta_12_xinan())
				&& server.getSta_12_xinan() != null) {
			insert.setSta_12_xinan(server.getSta_12_xinan());
		} else {
			insert.setSta_12_xinan("");
		}

		if (!"".equals(server.getSta_12_zjian())
				&& server.getSta_12_zjian() != null) {
			insert.setSta_12_zjian(server.getSta_12_zjian());
		} else {
			insert.setSta_12_zjian("");
		}

		if (!"".equals(server.getSta_12_donan())
				&& server.getSta_12_donan() != null) {
			insert.setSta_12_donan(server.getSta_12_donan());
		} else {
			insert.setSta_12_donan("");
		}

		if (!"".equals(server.getSta_12_dobei())
				&& server.getSta_12_dobei() != null) {
			insert.setSta_12_dobei(server.getSta_12_dobei());
		} else {
			insert.setSta_12_dobei("");
		}

		if (!"".equals(server.getSta_13_name())
				&& server.getSta_13_name() != null) {
			insert.setSta_13_name(server.getSta_13_name());
		} else {
			insert.setSta_13_name("");
		}

		if (!"".equals(server.getSta_13_xibei())
				&& server.getSta_13_xibei() != null) {
			insert.setSta_13_xibei(server.getSta_13_xibei());
		} else {
			insert.setSta_13_xibei("");
		}

		if (!"".equals(server.getSta_13_xinan())
				&& server.getSta_13_xinan() != null) {
			insert.setSta_13_xinan(server.getSta_13_xinan());
		} else {
			insert.setSta_13_xinan("");
		}

		if (!"".equals(server.getSta_13_zjian())
				&& server.getSta_13_zjian() != null) {
			insert.setSta_13_zjian(server.getSta_13_zjian());
		} else {
			insert.setSta_13_zjian("");
		}

		if (!"".equals(server.getSta_13_donan())
				&& server.getSta_13_donan() != null) {
			insert.setSta_13_donan(server.getSta_13_donan());
		} else {
			insert.setSta_13_donan("");
		}

		if (!"".equals(server.getSta_13_dobei())
				&& server.getSta_13_dobei() != null) {
			insert.setSta_13_dobei(server.getSta_13_dobei());
		} else {
			insert.setSta_13_dobei("");
		}

		if (!"".equals(server.getSta_14_name())
				&& server.getSta_14_name() != null) {
			insert.setSta_14_name(server.getSta_14_name());
		} else {
			insert.setSta_14_name("");
		}

		if (!"".equals(server.getSta_14_xibei())
				&& server.getSta_14_xibei() != null) {
			insert.setSta_14_xibei(server.getSta_14_xibei());
		} else {
			insert.setSta_14_xibei("");
		}

		if (!"".equals(server.getSta_14_xinan())
				&& server.getSta_14_xinan() != null) {
			insert.setSta_14_xinan(server.getSta_14_xinan());
		} else {
			insert.setSta_14_xinan("");
		}

		if (!"".equals(server.getSta_14_zjian())
				&& server.getSta_14_zjian() != null) {
			insert.setSta_14_zjian(server.getSta_14_zjian());
		} else {
			insert.setSta_14_zjian("");
		}

		if (!"".equals(server.getSta_14_donan())
				&& server.getSta_14_donan() != null) {
			insert.setSta_14_donan(server.getSta_14_donan());
		} else {
			insert.setSta_14_donan("");
		}

		if (!"".equals(server.getSta_14_dobei())
				&& server.getSta_14_dobei() != null) {
			insert.setSta_14_dobei(server.getSta_14_dobei());
		} else {
			insert.setSta_14_dobei("");
		}

		if (!"".equals(server.getSta_15_name())
				&& server.getSta_15_name() != null) {
			insert.setSta_15_name(server.getSta_15_name());
		} else {
			insert.setSta_15_name("");
		}

		if (!"".equals(server.getSta_15_xibei())
				&& server.getSta_15_xibei() != null) {
			insert.setSta_15_xibei(server.getSta_15_xibei());
		} else {
			insert.setSta_15_xibei("");
		}

		if (!"".equals(server.getSta_15_xinan())
				&& server.getSta_15_xinan() != null) {
			insert.setSta_15_xinan(server.getSta_15_xinan());
		} else {
			insert.setSta_15_xinan("");
		}

		if (!"".equals(server.getSta_15_zjian())
				&& server.getSta_15_zjian() != null) {
			insert.setSta_15_zjian(server.getSta_15_zjian());
		} else {
			insert.setSta_15_zjian("");
		}

		if (!"".equals(server.getSta_15_donan())
				&& server.getSta_15_donan() != null) {
			insert.setSta_15_donan(server.getSta_15_donan());
		} else {
			insert.setSta_15_donan("");
		}

		if (!"".equals(server.getSta_15_dobei())
				&& server.getSta_15_dobei() != null) {
			insert.setSta_15_dobei(server.getSta_15_dobei());
		} else {
			insert.setSta_15_dobei("");
		}

		if (!"".equals(server.getSta_16_name())
				&& server.getSta_16_name() != null) {
			insert.setSta_16_name(server.getSta_16_name());
		} else {
			insert.setSta_16_name("");
		}

		if (!"".equals(server.getSta_16_xibei())
				&& server.getSta_16_xibei() != null) {
			insert.setSta_16_xibei(server.getSta_16_xibei());
		} else {
			insert.setSta_16_xibei("");
		}

		if (!"".equals(server.getSta_16_xinan())
				&& server.getSta_16_xinan() != null) {
			insert.setSta_16_xinan(server.getSta_16_xinan());
		} else {
			insert.setSta_16_xinan("");
		}

		if (!"".equals(server.getSta_16_zjian())
				&& server.getSta_16_zjian() != null) {
			insert.setSta_16_zjian(server.getSta_16_zjian());
		} else {
			insert.setSta_16_zjian("");
		}

		if (!"".equals(server.getSta_16_donan())
				&& server.getSta_16_donan() != null) {
			insert.setSta_16_donan(server.getSta_16_donan());
		} else {
			insert.setSta_16_donan("");
		}

		if (!"".equals(server.getSta_16_dobei())
				&& server.getSta_16_dobei() != null) {
			insert.setSta_16_dobei(server.getSta_16_dobei());
		} else {
			insert.setSta_16_dobei("");
		}

		if (!"".equals(server.getSta_17_name())
				&& server.getSta_17_name() != null) {
			insert.setSta_17_name(server.getSta_17_name());
		} else {
			insert.setSta_17_name("");
		}

		if (!"".equals(server.getSta_17_xibei())
				&& server.getSta_17_xibei() != null) {
			insert.setSta_17_xibei(server.getSta_17_xibei());
		} else {
			insert.setSta_17_xibei("");
		}

		if (!"".equals(server.getSta_17_xinan())
				&& server.getSta_17_xinan() != null) {
			insert.setSta_17_xinan(server.getSta_17_xinan());
		} else {
			insert.setSta_17_xinan("");
		}

		if (!"".equals(server.getSta_17_zjian())
				&& server.getSta_17_zjian() != null) {
			insert.setSta_17_zjian(server.getSta_17_zjian());
		} else {
			insert.setSta_17_zjian("");
		}

		if (!"".equals(server.getSta_17_donan())
				&& server.getSta_17_donan() != null) {
			insert.setSta_17_donan(server.getSta_17_donan());
		} else {
			insert.setSta_17_donan("");
		}

		if (!"".equals(server.getSta_17_dobei())
				&& server.getSta_17_dobei() != null) {
			insert.setSta_17_dobei(server.getSta_17_dobei());
		} else {
			insert.setSta_17_dobei("");
		}

		if (!"".equals(server.getSta_18_name())
				&& server.getSta_18_name() != null) {
			insert.setSta_18_name(server.getSta_18_name());
		} else {
			insert.setSta_18_name("");
		}

		if (!"".equals(server.getSta_18_xibei())
				&& server.getSta_18_xibei() != null) {
			insert.setSta_18_xibei(server.getSta_18_xibei());
		} else {
			insert.setSta_18_xibei("");
		}

		if (!"".equals(server.getSta_18_xinan())
				&& server.getSta_18_xinan() != null) {
			insert.setSta_18_xinan(server.getSta_18_xinan());
		} else {
			insert.setSta_18_xinan("");
		}

		if (!"".equals(server.getSta_18_zjian())
				&& server.getSta_18_zjian() != null) {
			insert.setSta_18_zjian(server.getSta_18_zjian());
		} else {
			insert.setSta_18_zjian("");
		}

		if (!"".equals(server.getSta_18_donan())
				&& server.getSta_18_donan() != null) {
			insert.setSta_18_donan(server.getSta_18_donan());
		} else {
			insert.setSta_18_donan("");
		}

		if (!"".equals(server.getSta_18_dobei())
				&& server.getSta_18_dobei() != null) {
			insert.setSta_18_dobei(server.getSta_18_dobei());
		} else {
			insert.setSta_18_dobei("");
		}

		if (!"".equals(server.getSta_19_name())
				&& server.getSta_19_name() != null) {
			insert.setSta_19_name(server.getSta_19_name());
		} else {
			insert.setSta_19_name("");
		}

		if (!"".equals(server.getSta_19_xibei())
				&& server.getSta_19_xibei() != null) {
			insert.setSta_19_xibei(server.getSta_19_xibei());
		} else {
			insert.setSta_19_xibei("");
		}

		if (!"".equals(server.getSta_19_xinan())
				&& server.getSta_19_xinan() != null) {
			insert.setSta_19_xinan(server.getSta_19_xinan());
		} else {
			insert.setSta_19_xinan("");
		}

		if (!"".equals(server.getSta_19_zjian())
				&& server.getSta_19_zjian() != null) {
			insert.setSta_19_zjian(server.getSta_19_zjian());
		} else {
			insert.setSta_19_zjian("");
		}

		if (!"".equals(server.getSta_19_donan())
				&& server.getSta_19_donan() != null) {
			insert.setSta_19_donan(server.getSta_19_donan());
		} else {
			insert.setSta_19_donan("");
		}

		if (!"".equals(server.getSta_19_dobei())
				&& server.getSta_19_dobei() != null) {
			insert.setSta_19_dobei(server.getSta_19_dobei());
		} else {
			insert.setSta_19_dobei("");
		}

		if (!"".equals(server.getSta_20_name())
				&& server.getSta_20_name() != null) {
			insert.setSta_20_name(server.getSta_20_name());
		} else {
			insert.setSta_20_name("");
		}

		if (!"".equals(server.getSta_20_xibei())
				&& server.getSta_20_xibei() != null) {
			insert.setSta_20_xibei(server.getSta_20_xibei());
		} else {
			insert.setSta_20_xibei("");
		}

		if (!"".equals(server.getSta_20_xinan())
				&& server.getSta_20_xinan() != null) {
			insert.setSta_20_xinan(server.getSta_20_xinan());
		} else {
			insert.setSta_20_xinan("");
		}

		if (!"".equals(server.getSta_20_zjian())
				&& server.getSta_20_zjian() != null) {
			insert.setSta_20_zjian(server.getSta_20_zjian());
		} else {
			insert.setSta_20_zjian("");
		}

		if (!"".equals(server.getSta_20_donan())
				&& server.getSta_20_donan() != null) {
			insert.setSta_20_donan(server.getSta_20_donan());
		} else {
			insert.setSta_20_donan("");
		}

		if (!"".equals(server.getSta_20_dobei())
				&& server.getSta_20_dobei() != null) {
			insert.setSta_20_dobei(server.getSta_20_dobei());
		} else {
			insert.setSta_20_dobei("");
		}

		if (!"".equals(server.getSta_21_name())
				&& server.getSta_21_name() != null) {
			insert.setSta_21_name(server.getSta_21_name());
		} else {
			insert.setSta_21_name("");
		}

		if (!"".equals(server.getSta_21_xibei())
				&& server.getSta_21_xibei() != null) {
			insert.setSta_21_xibei(server.getSta_21_xibei());
		} else {
			insert.setSta_21_xibei("");
		}

		if (!"".equals(server.getSta_21_xinan())
				&& server.getSta_21_xinan() != null) {
			insert.setSta_21_xinan(server.getSta_21_xinan());
		} else {
			insert.setSta_21_xinan("");
		}

		if (!"".equals(server.getSta_21_zjian())
				&& server.getSta_21_zjian() != null) {
			insert.setSta_21_zjian(server.getSta_21_zjian());
		} else {
			insert.setSta_21_zjian("");
		}

		if (!"".equals(server.getSta_21_donan())
				&& server.getSta_21_donan() != null) {
			insert.setSta_21_donan(server.getSta_21_donan());
		} else {
			insert.setSta_21_donan("");
		}

		if (!"".equals(server.getSta_21_dobei())
				&& server.getSta_21_dobei() != null) {
			insert.setSta_21_dobei(server.getSta_21_dobei());
		} else {
			insert.setSta_21_dobei("");
		}

		if (!"".equals(server.getSta_22_name())
				&& server.getSta_22_name() != null) {
			insert.setSta_22_name(server.getSta_22_name());
		} else {
			insert.setSta_22_name("");
		}

		if (!"".equals(server.getSta_22_xibei())
				&& server.getSta_22_xibei() != null) {
			insert.setSta_22_xibei(server.getSta_22_xibei());
		} else {
			insert.setSta_22_xibei("");
		}

		if (!"".equals(server.getSta_22_xinan())
				&& server.getSta_22_xinan() != null) {
			insert.setSta_22_xinan(server.getSta_22_xinan());
		} else {
			insert.setSta_22_xinan("");
		}

		if (!"".equals(server.getSta_22_zjian())
				&& server.getSta_22_zjian() != null) {
			insert.setSta_22_zjian(server.getSta_22_zjian());
		} else {
			insert.setSta_22_zjian("");
		}

		if (!"".equals(server.getSta_22_donan())
				&& server.getSta_22_donan() != null) {
			insert.setSta_22_donan(server.getSta_22_donan());
		} else {
			insert.setSta_22_donan("");
		}

		if (!"".equals(server.getSta_22_dobei())
				&& server.getSta_22_dobei() != null) {
			insert.setSta_22_dobei(server.getSta_22_dobei());
		} else {
			insert.setSta_22_dobei("");
		}

		if (!"".equals(server.getSta_23_name())
				&& server.getSta_23_name() != null) {
			insert.setSta_23_name(server.getSta_23_name());
		} else {
			insert.setSta_23_name("");
		}

		if (!"".equals(server.getSta_23_xibei())
				&& server.getSta_23_xibei() != null) {
			insert.setSta_23_xibei(server.getSta_23_xibei());
		} else {
			insert.setSta_23_xibei("");
		}

		if (!"".equals(server.getSta_23_xinan())
				&& server.getSta_23_xinan() != null) {
			insert.setSta_23_xinan(server.getSta_23_xinan());
		} else {
			insert.setSta_23_xinan("");
		}

		if (!"".equals(server.getSta_23_zjian())
				&& server.getSta_23_zjian() != null) {
			insert.setSta_23_zjian(server.getSta_23_zjian());
		} else {
			insert.setSta_23_zjian("");
		}

		if (!"".equals(server.getSta_23_donan())
				&& server.getSta_23_donan() != null) {
			insert.setSta_23_donan(server.getSta_23_donan());
		} else {
			insert.setSta_23_donan("");
		}

		if (!"".equals(server.getSta_23_dobei())
				&& server.getSta_23_dobei() != null) {
			insert.setSta_23_dobei(server.getSta_23_dobei());
		} else {
			insert.setSta_23_dobei("");
		}

		if (!"".equals(server.getSta_24_name())
				&& server.getSta_24_name() != null) {
			insert.setSta_24_name(server.getSta_24_name());
		} else {
			insert.setSta_24_name("");
		}

		if (!"".equals(server.getSta_24_xibei())
				&& server.getSta_24_xibei() != null) {
			insert.setSta_24_xibei(server.getSta_24_xibei());
		} else {
			insert.setSta_24_xibei("");
		}

		if (!"".equals(server.getSta_24_xinan())
				&& server.getSta_24_xinan() != null) {
			insert.setSta_24_xinan(server.getSta_24_xinan());
		} else {
			insert.setSta_24_xinan("");
		}

		if (!"".equals(server.getSta_24_zjian())
				&& server.getSta_24_zjian() != null) {
			insert.setSta_24_zjian(server.getSta_24_zjian());
		} else {
			insert.setSta_24_zjian("");
		}

		if (!"".equals(server.getSta_24_donan())
				&& server.getSta_24_donan() != null) {
			insert.setSta_24_donan(server.getSta_24_donan());
		} else {
			insert.setSta_24_donan("");
		}

		if (!"".equals(server.getSta_24_dobei())
				&& server.getSta_24_dobei() != null) {
			insert.setSta_24_dobei(server.getSta_24_dobei());
		} else {
			insert.setSta_24_dobei("");
		}

		if (!"".equals(server.getSta_25_name())
				&& server.getSta_25_name() != null) {
			insert.setSta_25_name(server.getSta_25_name());
		} else {
			insert.setSta_25_name("");
		}

		if (!"".equals(server.getSta_25_xibei())
				&& server.getSta_25_xibei() != null) {
			insert.setSta_25_xibei(server.getSta_25_xibei());
		} else {
			insert.setSta_25_xibei("");
		}

		if (!"".equals(server.getSta_25_xinan())
				&& server.getSta_25_xinan() != null) {
			insert.setSta_25_xinan(server.getSta_25_xinan());
		} else {
			insert.setSta_25_xinan("");
		}

		if (!"".equals(server.getSta_25_zjian())
				&& server.getSta_25_zjian() != null) {
			insert.setSta_25_zjian(server.getSta_25_zjian());
		} else {
			insert.setSta_25_zjian("");
		}

		if (!"".equals(server.getSta_25_donan())
				&& server.getSta_25_donan() != null) {
			insert.setSta_25_donan(server.getSta_25_donan());
		} else {
			insert.setSta_25_donan("");
		}

		if (!"".equals(server.getSta_25_dobei())
				&& server.getSta_25_dobei() != null) {
			insert.setSta_25_dobei(server.getSta_25_dobei());
		} else {
			insert.setSta_25_dobei("");
		}

		if (!"".equals(server.getSta_26_name())
				&& server.getSta_26_name() != null) {
			insert.setSta_26_name(server.getSta_26_name());
		} else {
			insert.setSta_26_name("");
		}

		if (!"".equals(server.getSta_26_xibei())
				&& server.getSta_26_xibei() != null) {
			insert.setSta_26_xibei(server.getSta_26_xibei());
		} else {
			insert.setSta_26_xibei("");
		}

		if (!"".equals(server.getSta_26_xinan())
				&& server.getSta_26_xinan() != null) {
			insert.setSta_26_xinan(server.getSta_26_xinan());
		} else {
			insert.setSta_26_xinan("");
		}

		if (!"".equals(server.getSta_26_zjian())
				&& server.getSta_26_zjian() != null) {
			insert.setSta_26_zjian(server.getSta_26_zjian());
		} else {
			insert.setSta_26_zjian("");
		}

		if (!"".equals(server.getSta_26_donan())
				&& server.getSta_26_donan() != null) {
			insert.setSta_26_donan(server.getSta_26_donan());
		} else {
			insert.setSta_26_donan("");
		}

		if (!"".equals(server.getSta_26_dobei())
				&& server.getSta_26_dobei() != null) {
			insert.setSta_26_dobei(server.getSta_26_dobei());
		} else {
			insert.setSta_26_dobei("");
		}

		if (!"".equals(server.getSta_27_name())
				&& server.getSta_27_name() != null) {
			insert.setSta_27_name(server.getSta_27_name());
		} else {
			insert.setSta_27_name("");
		}

		if (!"".equals(server.getSta_27_xibei())
				&& server.getSta_27_xibei() != null) {
			insert.setSta_27_xibei(server.getSta_27_xibei());
		} else {
			insert.setSta_27_xibei("");
		}

		if (!"".equals(server.getSta_27_xinan())
				&& server.getSta_27_xinan() != null) {
			insert.setSta_27_xinan(server.getSta_27_xinan());
		} else {
			insert.setSta_27_xinan("");
		}

		if (!"".equals(server.getSta_27_zjian())
				&& server.getSta_27_zjian() != null) {
			insert.setSta_27_zjian(server.getSta_27_zjian());
		} else {
			insert.setSta_27_zjian("");
		}

		if (!"".equals(server.getSta_27_donan())
				&& server.getSta_27_donan() != null) {
			insert.setSta_27_donan(server.getSta_27_donan());
		} else {
			insert.setSta_27_donan("");
		}

		if (!"".equals(server.getSta_27_dobei())
				&& server.getSta_27_dobei() != null) {
			insert.setSta_27_dobei(server.getSta_27_dobei());
		} else {
			insert.setSta_27_dobei("");
		}

		if (!"".equals(server.getSta_28_name())
				&& server.getSta_28_name() != null) {
			insert.setSta_28_name(server.getSta_28_name());
		} else {
			insert.setSta_28_name("");
		}

		if (!"".equals(server.getSta_28_xibei())
				&& server.getSta_28_xibei() != null) {
			insert.setSta_28_xibei(server.getSta_28_xibei());
		} else {
			insert.setSta_28_xibei("");
		}

		if (!"".equals(server.getSta_28_xinan())
				&& server.getSta_28_xinan() != null) {
			insert.setSta_28_xinan(server.getSta_28_xinan());
		} else {
			insert.setSta_28_xinan("");
		}

		if (!"".equals(server.getSta_28_zjian())
				&& server.getSta_28_zjian() != null) {
			insert.setSta_28_zjian(server.getSta_28_zjian());
		} else {
			insert.setSta_28_zjian("");
		}

		if (!"".equals(server.getSta_28_donan())
				&& server.getSta_28_donan() != null) {
			insert.setSta_28_donan(server.getSta_28_donan());
		} else {
			insert.setSta_28_donan("");
		}

		if (!"".equals(server.getSta_28_dobei())
				&& server.getSta_28_dobei() != null) {
			insert.setSta_28_dobei(server.getSta_28_dobei());
		} else {
			insert.setSta_28_dobei("");
		}

		if (!"".equals(server.getSta_29_name())
				&& server.getSta_29_name() != null) {
			insert.setSta_29_name(server.getSta_29_name());
		} else {
			insert.setSta_29_name("");
		}

		if (!"".equals(server.getSta_29_xibei())
				&& server.getSta_29_xibei() != null) {
			insert.setSta_29_xibei(server.getSta_29_xibei());
		} else {
			insert.setSta_29_xibei("");
		}

		if (!"".equals(server.getSta_29_xinan())
				&& server.getSta_29_xinan() != null) {
			insert.setSta_29_xinan(server.getSta_29_xinan());
		} else {
			insert.setSta_29_xinan("");
		}

		if (!"".equals(server.getSta_29_zjian())
				&& server.getSta_29_zjian() != null) {
			insert.setSta_29_zjian(server.getSta_29_zjian());
		} else {
			insert.setSta_29_zjian("");
		}

		if (!"".equals(server.getSta_29_donan())
				&& server.getSta_29_donan() != null) {
			insert.setSta_29_donan(server.getSta_29_donan());
		} else {
			insert.setSta_29_donan("");
		}

		if (!"".equals(server.getSta_29_dobei())
				&& server.getSta_29_dobei() != null) {
			insert.setSta_29_dobei(server.getSta_29_dobei());
		} else {
			insert.setSta_29_dobei("");
		}

		if (!"".equals(server.getSta_30_name())
				&& server.getSta_30_name() != null) {
			insert.setSta_30_name(server.getSta_30_name());
		} else {
			insert.setSta_30_name("");
		}

		if (!"".equals(server.getSta_30_xibei())
				&& server.getSta_30_xibei() != null) {
			insert.setSta_30_xibei(server.getSta_30_xibei());
		} else {
			insert.setSta_30_xibei("");
		}

		if (!"".equals(server.getSta_30_xinan())
				&& server.getSta_30_xinan() != null) {
			insert.setSta_30_xinan(server.getSta_30_xinan());
		} else {
			insert.setSta_30_xinan("");
		}

		if (!"".equals(server.getSta_30_zjian())
				&& server.getSta_30_zjian() != null) {
			insert.setSta_30_zjian(server.getSta_30_zjian());
		} else {
			insert.setSta_30_zjian("");
		}

		if (!"".equals(server.getSta_30_donan())
				&& server.getSta_30_donan() != null) {
			insert.setSta_30_donan(server.getSta_30_donan());
		} else {
			insert.setSta_30_donan("");
		}

		if (!"".equals(server.getSta_30_dobei())
				&& server.getSta_30_dobei() != null) {
			insert.setSta_30_dobei(server.getSta_30_dobei());
		} else {
			insert.setSta_30_dobei("");
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
