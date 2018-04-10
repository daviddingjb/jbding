package com.trusdata.integrate.jobs.action;

/**
 * 常量定义
 * 
 * @author JBDING
 */
public class SQLConstJobs {

	public static final String GET_JOB_LIST = 
			" select t1.t_name as t_name,t1.t_description as t_description,t1.t_work_user as t_work_user,t1.t_mapping_name as t_mapping_name," + 
				"    t2.t_source_name as t_source_name,t2.t_target_name as t_target_name " + 
			" from trusdata.trus_jobs t1, trusdata.trus_mapping t2 " +
			" where t1.t_work_user = ? and " +
				"   t1.t_mapping_name = t2.t_name ";
    
}
