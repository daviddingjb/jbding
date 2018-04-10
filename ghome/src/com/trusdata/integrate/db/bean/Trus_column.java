package com.trusdata.integrate.db.bean;

import com.trusdata.common.annotation.Column;
import com.trusdata.common.annotation.Entity;
import com.trusdata.common.annotation.PrimaryKey;

/**
 * 
 * @author JBDING
 * 
 */
@Entity("trus_column")
public class Trus_column {
	@PrimaryKey("t_name")
	@Column("t_name")
	private Double t_name;
	@Column("t_server_name")
	private String t_server_name;
	@Column("t_db_name")
	private String t_db_name;
	@Column("t_table_name")
	private String t_table_name;
	@Column("t_field_name")
	private String t_field_name;
	@Column("t_data_type")
	private String t_data_type;
	@Column("t_len")
	private int t_len;

	public Double getT_name() {
		return t_name;
	}

	public void setT_name(Double t_name) {
		this.t_name = t_name;
	}

	public String getT_server_name() {
		return t_server_name;
	}

	public void setT_server_name(String t_server_name) {
		this.t_server_name = t_server_name;
	}

	public String getT_db_name() {
		return t_db_name;
	}

	public void setT_db_name(String t_db_name) {
		this.t_db_name = t_db_name;
	}

	public String getT_table_name() {
		return t_table_name;
	}

	public void setT_table_name(String t_table_name) {
		this.t_table_name = t_table_name;
	}

	public String getT_field_name() {
		return t_field_name;
	}

	public void setT_field_name(String t_field_name) {
		this.t_field_name = t_field_name;
	}

	public String getT_data_type() {
		return t_data_type;
	}

	public void setT_data_type(String t_data_type) {
		this.t_data_type = t_data_type;
	}

	public int getT_len() {
		return t_len;
	}

	public void setT_len(int t_len) {
		this.t_len = t_len;
	}
}
