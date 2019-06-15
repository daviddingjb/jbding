package com.trusdata.page.dao;

import com.trusdata.common.Pager;

/**
 * 
 * @author JBDING
 *
 */
public interface EntityDao {
	/**
	 * 根据查询条件，查询分页信息
	 * @param t 封装的查询条件
	 * @param pageNum 查询第几页数据
	 * @param pageSize 每页显示多少条记录
	 * @return 查询结果
	 */
	public <T> Pager<T> findPager(T t, int pageNum, int pageSize);
}
