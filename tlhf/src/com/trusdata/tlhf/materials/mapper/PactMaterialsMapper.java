package com.trusdata.tlhf.materials.mapper;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.trusdata.tlhf.materials.bean.PactMaterialsBean;
import com.trusdata.tlhf.pact.bean.PactIdentifyBean;
import com.trusdata.tlhf.pact.bean.PactInputListBean;
import com.trusdata.tlhf.pact.bean.PactSearchBean;

/**
 * 
 * @author JBDING
 *
 */
public interface PactMaterialsMapper {

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

	public Integer insertMaterials(PactMaterialsBean insertBean)
			throws DataAccessException;

	public Integer del(PactIdentifyBean delBean)
			throws DataAccessException;
}
