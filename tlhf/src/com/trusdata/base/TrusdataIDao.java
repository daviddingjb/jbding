/**
 * 
 */
package com.trusdata.base;

import java.util.List;
import java.util.Map;

/**
 * @author JBDING
 */
public interface TrusdataIDao<T> {
    public void insert(T t) throws Exception;

    public void delete(Object id, Class<T> clazz) throws Exception;

    public void update(T t) throws Exception;

    public T selectSingle(Object id, Class<T> clazz) throws Exception;
    
    public StringBuilder touch_sql(T t, String type) throws Exception;

    /**
     * 根据条件查询
     * @param sqlWhereMap key：条件字段名 value：条件字段值
     * @param clazz
     * @return
     * @throws Exception
     */
    public List<T> findAllByConditions(Map<String, Object> sqlWhereMap, Class<T> clazz, String orderBy) throws Exception;
}
