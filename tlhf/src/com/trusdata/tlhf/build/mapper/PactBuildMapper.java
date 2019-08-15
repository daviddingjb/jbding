package com.trusdata.tlhf.build.mapper;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.trusdata.tlhf.build.bean.PactBuildBean;
import com.trusdata.tlhf.pact.bean.PactIdentifyBean;
import com.trusdata.tlhf.pact.bean.PactInputListBean;
import com.trusdata.tlhf.pact.bean.PactSearchBean;

/**
 * 
 * @author JBDING
 *
 */
public interface PactBuildMapper {

	/**
	 * Group List
	 * 
	 * @param queryBean
	 * @return
	 * @throws DataAccessException
	 */
	public Integer selectCount(PactSearchBean queryBean)
			throws DataAccessException;

	public List<PactInputListBean> selectInfo(PactSearchBean queryBean)
			throws DataAccessException;

	public Integer insertBuild(PactBuildBean insertBean)
			throws DataAccessException;

	public Integer del(PactIdentifyBean delBean)
			throws DataAccessException;
}
