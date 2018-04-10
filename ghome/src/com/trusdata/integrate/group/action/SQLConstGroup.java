package com.trusdata.integrate.group.action;

/**
 * 常量定义
 * 
 * @author JBDING
 */
public class SQLConstGroup {

	public static final String GET_PAIR_GROUP = 
			"select distinct " + 
					"	case " +
					"		when s.t_table_name = t.t_table_name then concat(s.t_table_name, '=', t.t_table_name) " +
					"		when s.t_table_name is null then concat('=', t.t_table_name) " +
					"		when t.t_table_name is null then concat(s.t_table_name, '=') " +
					"	end as pair_group_name , " +
					"	s.t_table_name as source_tbl_name, " +
					"	t.t_table_name as target_tbl_name " +
					" from " +
					" (select distinct t_db_name,t_table_name from trusdata.trus_column where t_server_name = ?) s " +
					" left outer join " +
					" (select distinct t_db_name,t_table_name from trusdata.trus_column where t_server_name = ?) t " +
					"on s.t_db_name = t.t_db_name and s.t_table_name = t.t_table_name ";

	public static final String PAIR_GROUP_INSERT = 
			"insert into trusdata.trus_group_pair";
}
