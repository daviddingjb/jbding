package com.trusdata.page.service;

import com.trusdata.common.Pager;
import com.trusdata.page.dao.EntityDao;
import com.trusdata.page.dao.SubListEntityDaoImpl;

public class SublistPageServiceImpl implements PageService {

	private EntityDao dao;

	public SublistPageServiceImpl() {
		// 创建service实现类时，初始化dao对象
		dao = new SubListEntityDaoImpl();
	}

	@Override
	public <T> Pager<T> findPager(T t, int pageNum, int pageSize) {
		Pager<T> result = dao.findPager(t, pageNum, pageSize);
		return result;
	}

	public EntityDao getDao() {
		return dao;
	}

	public void setDao(EntityDao dao) {
		this.dao = dao;
	}

}
