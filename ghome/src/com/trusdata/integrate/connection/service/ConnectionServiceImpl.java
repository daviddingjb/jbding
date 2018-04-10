package com.trusdata.integrate.connection.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trusdata.common.util.PageUtil;
import com.trusdata.integrate.connection.bean.ConnListBean;
import com.trusdata.integrate.connection.bean.ConnSearchBean;
import com.trusdata.integrate.connection.mapper.ConnMapper;

@Service
public class ConnectionServiceImpl implements ConnectionService {

	@Autowired
	ConnMapper connMapper;

	@Override
	public List<ConnListBean> selectAll(ConnSearchBean queryBean) {

		// 查询数据总数
		int sumItems = connMapper.selectCount(queryBean);
		PageUtil.resetPageBean(queryBean, sumItems);
		// 查询所有信息
		return connMapper.selectInfo(queryBean);
	}
}
