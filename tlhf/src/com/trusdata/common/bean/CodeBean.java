package com.trusdata.common.bean;
/**
 * 
 * @author JBDING
 *
 */
public class CodeBean {

	/** 编码 */
	private String code = null;
	/** 编码对应的显示值 */
	private String value = null;

	/**
	 * 构造方法
	 * 
	 * @param code 编码
	 * @param value 编码对应的显示值
	 */
	public CodeBean(String code, String value) {
		super();
		this.value = value;
		this.code = code;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
