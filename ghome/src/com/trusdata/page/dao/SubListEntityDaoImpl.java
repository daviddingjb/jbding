package com.trusdata.page.dao;

import java.util.ArrayList;
import java.util.List;

import com.trusdata.common.Pager;

/**
 * 
 * @author JBDING
 *
 */
public class SubListEntityDaoImpl implements EntityDao {

	@Override
	public <T> Pager<T> findPager(T t, int pageNum, int pageSize) {
		List<T> allList = getAllT(t);
		
		Pager<T> pager = new Pager<T>(pageNum, pageSize, allList);
		return pager;
	}
	
	/**
	 * 获取所有数据
	 * @return
	 */
	@SuppressWarnings("unused")
	private <T> List<T> getAllT(T t){
		Class<?> clazz = t.getClass();
		// 拼SQL语句，查询结果放到 result 里
		List<T> result = new ArrayList<T>();
		return result;
	}
}
