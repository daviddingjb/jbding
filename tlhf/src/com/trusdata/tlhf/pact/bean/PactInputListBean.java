package com.trusdata.tlhf.pact.bean;

import com.trusdata.common.bean.PageBean;

/**
 * 
 * @author JBDING
 * 
 */
public class PactInputListBean extends PageBean {

	private static final long serialVersionUID = -3222102443527097903L;
	private String id1;
	private String input_date;
	private String inputer;
	private String call_way;

	public String getId1() {
		return id1;
	}

	public void setId1(String id1) {
		this.id1 = id1;
	}

	public String getInput_date() {
		return input_date;
	}

	public void setInput_date(String input_date) {
		this.input_date = input_date;
	}

	public String getInputer() {
		return inputer;
	}

	public void setInputer(String inputer) {
		this.inputer = inputer;
	}

	public String getCall_way() {
		return call_way;
	}

	public void setCall_way(String call_way) {
		this.call_way = call_way;
	}
}
