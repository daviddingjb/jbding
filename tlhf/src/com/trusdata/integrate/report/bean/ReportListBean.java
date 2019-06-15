package com.trusdata.integrate.report.bean;

import com.trusdata.common.bean.PageBean;

/**
 * 
 * @author JBDING
 * 
 */
public class ReportListBean extends PageBean {

	private static final long serialVersionUID = -3222102443527097903L;
	private String id1;
	private String year1;
	private String county;
	private String township;
	private String village;
	private String group1;
	private String name1;
	private String scope182;
  
    public ReportListBean() {  
        super();  
    }  
  
	public String getId1() {
		return id1;
	}

	public void setId1(String id1) {
		this.id1 = id1;
	}

	public String getYear1() {
		return year1;
	}

	public void setYear1(String year1) {
		this.year1 = year1;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getTownship() {
		return township;
	}

	public void setTownship(String township) {
		this.township = township;
	}

	public String getVillage() {
		return village;
	}

	public void setVillage(String village) {
		this.village = village;
	}

	public String getGroup1() {
		return group1;
	}

	public void setGroup1(String group1) {
		this.group1 = group1;
	}

	public String getName1() {
		return name1;
	}

	public void setName1(String name1) {
		this.name1 = name1;
	}

	public String getScope182() {
		return scope182;
	}

	public void setScope182(String scope182) {
		this.scope182 = scope182;
	}
}
