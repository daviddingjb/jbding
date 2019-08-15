package com.trusdata.tlhf.tdatajn.mapper;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.trusdata.tlhf.pact.bean.PactIdentifyBean;
import com.trusdata.tlhf.pact.bean.PactInputListBean;
import com.trusdata.tlhf.pact.bean.PactSearchBean;
import com.trusdata.tlhf.tdatajn.bean.PactTdataJnBean;

/**
 * 
 * @author JBDING
 *
 */
public interface PactTdataJnMapper {

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

	public Integer insertTdataJn(PactTdataJnBean insertBean)
			throws DataAccessException;

	public Integer del(PactIdentifyBean delBean)
			throws DataAccessException;
}
