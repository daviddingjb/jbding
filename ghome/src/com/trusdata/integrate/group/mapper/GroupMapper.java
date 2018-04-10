package com.trusdata.integrate.group.mapper;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.trusdata.integrate.group.bean.GroupMappingListBean;
import com.trusdata.integrate.group.bean.GroupSearchBean;
import com.trusdata.integrate.group.bean.PairGroup;
import com.trusdata.integrate.group.bean.PairGroupSearchBean;

/**
 * 
 * @author JBDING
 *
 */
public interface GroupMapper {

	/**
	 * Group List
	 * 
	 * @param queryBean
	 * @return
	 * @throws DataAccessException
	 */
	public Integer selectCount(GroupSearchBean queryBean)
			throws DataAccessException;

	public List<GroupMappingListBean> selectInfo(GroupSearchBean queryBean)
			throws DataAccessException;

	/**
	 * Pair List
	 * 
	 * @param queryBean
	 * @return
	 * @throws DataAccessException
	 */
	public Integer pairCount(PairGroupSearchBean queryBean)
			throws DataAccessException;

	public List<PairGroup> pairInfo(PairGroupSearchBean queryBean)
			throws DataAccessException;
}
