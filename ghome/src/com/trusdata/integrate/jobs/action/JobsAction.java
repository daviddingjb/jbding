package com.trusdata.integrate.jobs.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.trusdata.common.action.BasePageAction;
import com.trusdata.common.db.CustomDao;
import com.trusdata.integrate.db.bean.Trus_jobs;
import com.trusdata.integrate.db.bean.Trus_mapping;
import com.trusdata.integrate.db.bean.Trus_user;
import com.trusdata.integrate.jobs.bean.JobListBean;
import com.trusdata.integrate.jobs.bean.JobSearchBean;
import com.trusdata.integrate.jobs.service.JobsService;
import com.trusdata.integrate.pages.bean.Jobs;

/**
 * 
 * @author JBDING
 * 
 */
public class JobsAction extends BasePageAction<JobSearchBean> {

	/**
	 * serialVersionUID.
	 */
	private static final long serialVersionUID = 3415699919957092684L;

	private Trus_jobs trus_jobs;
	private Jobs jobs;
	private List<String> mapping_name;
	List<Trus_mapping> mappingList;
	List<JobListBean> jobsList;
	private JobSearchBean jobSearchBean = new JobSearchBean();
	
	/**
	 * 资源管理Service
	 */
	@Autowired
	JobsService jobsService;

	/**
	 * 画面初始化
	 * 
	 * @return init
	 */
	public String init() {
		query();
		return "init";
	}

	/**
	 * 查询当前用户所有映射信息
	 * 
	 * @return mappingList
	 */
	public String query() {
		String rtn = "query";

		// 获取登录用户名
		HashMap<String, Object> loginUser = this.getLoginUser();
		if (loginUser == null) {
			rtn = ERROR;
			return rtn;
		}
		Trus_user userBean = (Trus_user) loginUser.get("trus_user");
		jobSearchBean.setT_work_user(userBean.getT_user());

		jobsList = new ArrayList<JobListBean>();
		jobsList = jobsService.selectAll(jobSearchBean);
		return rtn;
	}

	public String toadd() {
		String rtn = "add";

		rtn = add(trus_jobs);

		return rtn;
	}

	public String add(Trus_jobs trus_jobs) {
		String rtn = "add";

		try {
			if (trus_jobs == null) {
				mapping_name = new ArrayList<String>();

				// 获取登录用户名
				HashMap<String, Object> usr = this.getLoginUser();
				if (usr == null) {
		        	rtn = ERROR;
		            return rtn;
				}
				Trus_user loginUser = (Trus_user) usr.get("trus_user");

				CustomDao<Trus_mapping> cdao = new CustomDao<Trus_mapping>();
				String sqlWhereString = "t_work_user = " + "'"
						+ loginUser.getT_user() + "'";
				try {
					mappingList = cdao.findAllByConditions(sqlWhereString,
							Trus_mapping.class, null);
				} catch (Exception e) {
					rtn = ERROR;
				}

				for (Trus_mapping mapping : mappingList) {
					mapping_name.add(mapping.getT_name());
				}

				return rtn;
				// 页面输入检查
			} else if (!checkUserInput(trus_jobs)) {
				return rtn;
			} else {
				// 获取登录用户名
				HashMap<String, Object> usr = this.getLoginUser();
				if (usr == null) {
		        	rtn = ERROR;
		            return rtn;
				}
				Trus_user loginUser = (Trus_user) usr.get("trus_user");

				CustomDao<Trus_jobs> cdao = new CustomDao<Trus_jobs>();
				trus_jobs.setT_work_user(loginUser.getT_user());

				cdao.insert(trus_jobs);

				rtn = "add_ok";
			}
		} catch (Exception e) {
			rtn = ERROR;
			return rtn;
		}
		return rtn;
	}

	public String runjob() {
		String rtn = "run";

		String checkbox[] = request.getParameterValues("number");
		String t_names[] = request.getParameterValues("t_name");
		String t_mapping_names[] = request.getParameterValues("t_mapping_name");
		String t_source_names[] = request.getParameterValues("t_source_name");
		String t_target_names[] = request.getParameterValues("t_target_name");
		return rtn;
	}

	/**
	 * 检验用户输入是否正确
	 * 
	 * @param str
	 * @return
	 */
	private boolean validate(String str) {
		if (str != null && !"".equals(str.trim())) {
			return true;
		}
		return false;
	}

	/**
     * 
     */
	private boolean checkUserInput(Trus_jobs jobs) {
		if (this.validate(jobs.getT_name())) {
			return true;
		}
		return false;
	}

	public Trus_jobs getTrus_jobs() {
		return trus_jobs;
	}

	public void setTrus_jobs(Trus_jobs trus_jobs) {
		this.trus_jobs = trus_jobs;
	}

	public Jobs getJobs() {
		return jobs;
	}

	public void setJobs(Jobs jobs) {
		this.jobs = jobs;
	}

	public List<JobListBean> getJobsList() {
		return jobsList;
	}

	public void setJobsList(List<JobListBean> jobsList) {
		this.jobsList = jobsList;
	}

	public List<String> getMapping_name() {
		return mapping_name;
	}

	public void setMapping_name(List<String> mapping_name) {
		this.mapping_name = mapping_name;
	}

	public List<Trus_mapping> getMappingList() {
		return mappingList;
	}

	public void setMappingList(List<Trus_mapping> mappingList) {
		this.mappingList = mappingList;
	}

	@Override
	public JobSearchBean getQueryBean() {
		return jobSearchBean;
	}

	@Override
	public void setQueryBean(JobSearchBean queryBean) {
		jobSearchBean = queryBean;
	}

	public JobSearchBean getJobSearchBean() {
		return jobSearchBean;
	}

	public void setJobSearchBean(JobSearchBean jobSearchBean) {
		this.jobSearchBean = jobSearchBean;
	}
}
