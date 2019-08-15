package com.trusdata.tlhf.tdata.mapper;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.trusdata.tlhf.pact.bean.PactIdentifyBean;
import com.trusdata.tlhf.pact.bean.PactInputListBean;
import com.trusdata.tlhf.pact.bean.PactSearchBean;
import com.trusdata.tlhf.tdata.bean.PactTdataBean;

/**
 * 
 * @author JBDING
 *
 */
public interface PactTdataMapper {

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

	public Integer insertTdata(PactTdataBean insertBean)
			throws DataAccessException;

	public Integer del(PactIdentifyBean delBean)
			throws DataAccessException;
}
