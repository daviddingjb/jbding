package com.trusdata.tlhf.input.mapper;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.trusdata.tlhf.input.bean.PactSearchBean;

/**
 * 
 * @author JBDING
 *
 */
public interface PactMapper {

	/**
	 * Group List
	 * 
	 * @param queryBean
	 * @return
	 * @throws DataAccessException
	 */
	public Integer selectCount(PactSearchBean queryBean)
			throws DataAccessException;

	public List<PactListBean> selectInfo(PactSearchBean queryBean)
			throws DataAccessException;

	public Integer insertbase(PactInsertBean insertBean)
			throws DataAccessException;

	public Integer insertTbase(PactInsertBean insertBean)
			throws DataAccessException;

	public Integer insertStatus1(PactInsertBean insertBean)
			throws DataAccessException;

	public Integer insertStatus2(PactInsertBean insertBean)
			throws DataAccessException;

	public Integer insertStatus3(PactInsertBean insertBean)
			throws DataAccessException;

	public Integer del(PactIdentifyBean delBean)
			throws DataAccessException;

	public Integer updInit(PactIdentifyBean updBean)
			throws DataAccessException;
}
