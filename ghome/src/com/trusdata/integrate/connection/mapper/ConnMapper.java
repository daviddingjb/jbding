package com.trusdata.integrate.connection.mapper;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.trusdata.integrate.connection.bean.ConnListBean;
import com.trusdata.integrate.connection.bean.ConnSearchBean;

/**
 * 
 * @author JBDING
 *
 */
public interface ConnMapper {

	public Integer selectCount(ConnSearchBean queryBean)
			throws DataAccessException;

	public List<ConnListBean> selectInfo(ConnSearchBean queryBean)
			throws DataAccessException;
}
