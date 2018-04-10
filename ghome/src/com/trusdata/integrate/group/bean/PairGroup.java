package com.trusdata.integrate.group.bean;

/**
 * 
 * @author JBDING
 * 
 */
public class PairGroup {
	private String pair_group_name;
	private String source_tbl_name;
	private String target_tbl_name;

	public String getPair_group_name() {
		return pair_group_name;
	}

	public void setPair_group_name(String pair_group_name) {
		this.pair_group_name = pair_group_name;
	}

	public String getSource_tbl_name() {
		return source_tbl_name;
	}

	public void setSource_tbl_name(String source_tbl_name) {
		this.source_tbl_name = source_tbl_name;
	}

	public String getTarget_tbl_name() {
		return target_tbl_name;
	}

	public void setTarget_tbl_name(String target_tbl_name) {
		this.target_tbl_name = target_tbl_name;
	}
}
