package com.trusdata.integrate.connection.service;

import java.util.List;

import com.trusdata.integrate.connection.bean.ConnListBean;
import com.trusdata.integrate.connection.bean.ConnSearchBean;

public interface ConnectionService {

	public List<ConnListBean> selectAll(ConnSearchBean queryBean);
}
