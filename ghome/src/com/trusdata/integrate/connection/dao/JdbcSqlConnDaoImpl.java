package com.trusdata.integrate.connection.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.trusdata.common.Pager;
import com.trusdata.common.action.BaseAction;
import com.trusdata.integrate.db.bean.Trus_user;
import com.trusdata.page.dao.EntityDao;
/**
 * 使用MySql数据库LIMIT关键字实现分页
 * 
 * @author JBDING
 */
public class JdbcSqlConnDaoImpl extends BaseAction implements EntityDao {

	private static final long serialVersionUID = -6130815102386469527L;

	@Override
	public <T> Pager<T> findPager(T t, int pageNum, int pageSize) {
        Class<?> clazz = t.getClass();
		Pager<T> pager = null;
		
		// 存放查詢參數
		List<Object> paramList = new ArrayList<Object>();

        StringBuilder sql_count = new StringBuilder();
        sql_count.append(SQLConstConnection.GET_CONN_LIST_COUNT);

		// 起始索引
		int fromIndex = pageSize * (pageNum - 1);
		
		// 获取登录用户名
		HashMap<String, Object> loginUser = this.getLoginUser();
		Trus_user userBean = (Trus_user) loginUser.get("trus_user");
		String t_work_user = userBean.getT_user();

        StringBuilder sql = new StringBuilder();
        sql.append(SQLConstConnection.GET_CONN_LIST);
        
		return pager;
	}
	
}
