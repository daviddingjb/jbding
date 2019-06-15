/**
 * 
 */
package com.trusdata.common.db;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.trusdata.base.TrusdataIDao;
import com.trusdata.common.Const;
import com.trusdata.common.annotation.Column;
import com.trusdata.common.annotation.Id;
import com.trusdata.common.annotation.PrimaryKey;

/**
 * 泛型DAO的JDBC实现
 * @author JBDING
 * @version 1.0
 */
public class GenericDao<T> implements TrusdataIDao<T> {
    /*
     *此方法用于自增长主键插入. 
     *  如表中无自增长主键,请用customDao 的inset().
     */
    @Override
    public void insert(T t) throws Exception {
        Class<?> clazz = t.getClass();
        // 获得表名
        String tableName = DBCommonUtil.getTableName(clazz);
        // 获得字段
        StringBuilder fieldNames = new StringBuilder(); // 字段名
        List<Object> fieldValues = new ArrayList<Object>(); // 字段值
        StringBuilder placeholders = new StringBuilder(); // 占位符
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            PropertyDescriptor pd = new PropertyDescriptor(field.getName(), t.getClass());
            if (field.isAnnotationPresent(Id.class)) {
                continue;
            } else if (field.isAnnotationPresent(Column.class)) {
                if(null == pd.getReadMethod().invoke(t)){
                    continue;
                }
                fieldNames.append(field.getAnnotation(Column.class).value()).append(",");
                fieldValues.add(pd.getReadMethod().invoke(t));
            }
            placeholders.append("?").append(",");
        }
        // 删除最后一个逗号
        fieldNames.deleteCharAt(fieldNames.length() - 1);
        placeholders.deleteCharAt(placeholders.length() - 1);

        // 拼接sql
        StringBuilder sql = new StringBuilder("");
        sql.append("INSERT INTO ").append(tableName).append(" (").append(fieldNames.toString()).append(") VALUES (")
                .append(placeholders).append(")");
        PreparedStatement ps = DBConnection.getConnection().prepareStatement(sql.toString());
        // 设置SQL参数占位符的值
        ps = DBCommonUtil.setParameter(fieldValues, ps, false);
        // 执行SQL
        ps.execute();
        DBConnection.closeRes(null, ps);
    }
    
    /*
     * 重载的insert 方法.可以反回当前插入的值的ID
     */
    public int insert(T t,boolean f) throws Exception{
        Class<?> clazz = t.getClass();
         // 获得表名
         String tableName = DBCommonUtil.getTableName(clazz);
         // 获得字段
         StringBuilder fieldNames = new StringBuilder(); // 字段名
         List<Object> fieldValues = new ArrayList<Object>(); // 字段值
         StringBuilder placeholders = new StringBuilder(); // 占位符
         Field[] fields = clazz.getDeclaredFields();
         for (Field field : fields) {
             PropertyDescriptor pd = new PropertyDescriptor(field.getName(), t.getClass());
             if (field.isAnnotationPresent(Id.class)) {
                 continue;
             } else if (field.isAnnotationPresent(Column.class)) {
                 if(null == pd.getReadMethod().invoke(t)){
                     continue;
                 }
                 fieldNames.append(field.getAnnotation(Column.class).value()).append(",");
                 fieldValues.add(pd.getReadMethod().invoke(t));
             }
             placeholders.append("?").append(",");
         }
         // 删除最后一个逗号
         fieldNames.deleteCharAt(fieldNames.length() - 1);
         placeholders.deleteCharAt(placeholders.length() - 1);

         // 拼接sql
         StringBuilder sql = new StringBuilder("");
         sql.append("INSERT INTO ").append(tableName).append(" (").append(fieldNames.toString()).append(") VALUES (")
                 .append(placeholders).append(")");
         Connection conn = DBConnection.getConnection();
         PreparedStatement ps = conn.prepareStatement(sql.toString());
         
         // 设置SQL参数占位符的值
         ps = DBCommonUtil.setParameter(fieldValues, ps, false);
         // 执行SQL
         ps.execute();
         PreparedStatement psx = conn.prepareStatement("SELECT @@IDENTITY");
         ResultSet rs = psx.executeQuery();
         rs.absolute(1);
         int resx = rs.getInt(1);
         DBConnection.closeRes(null, ps);
         return resx;
    }

    @Override
    public void delete(Object id, Class<T> clazz) throws Exception {
        // 获得表名
        String tableName = DBCommonUtil.getTableName(clazz);
        // 获得ID字段名和值
        String idFieldName = "";
        boolean flag = false;
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(Id.class)) {
                idFieldName = field.getAnnotation(Id.class).value();
                flag = true;
                break;
            }
        }
        if (!flag) {
            throw new Exception(clazz.getName() + " object not found id property.");
        }

        // 拼装sql
        String sql = "DELETE FROM " + tableName + " WHERE " + idFieldName + "=?";
        PreparedStatement ps = DBConnection.getConnection().prepareStatement(sql);
        ps.setObject(1, id);
        // 执行SQL
        ps.execute();
        DBConnection.closeRes(null, ps);

        System.out.println(sql + "\n" + clazz.getSimpleName() + "删除成功!");
    }

    @Override
    public void update(T t) throws Exception {
        Class<?> clazz = t.getClass();

        // 获得表名
        String tableName = DBCommonUtil.getTableName(clazz);

        // 字段名
        List<Object> fieldNames = new ArrayList<Object>();
        // 字段值
        List<Object> fieldValues = new ArrayList<Object>();
        // 占位符
        List<String> placeholders = new ArrayList<String>();
        String idFieldName = "";
        Object idFieldValue = "";
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            PropertyDescriptor pd = new PropertyDescriptor(field.getName(), t.getClass());
            if (field.isAnnotationPresent(Id.class)) {
                idFieldName = field.getAnnotation(Id.class).value();
                idFieldValue = pd.getReadMethod().invoke(t);
            } else if (field.isAnnotationPresent(Column.class)) {
                if (null != pd.getReadMethod().invoke(t)) {
                    fieldNames.add(field.getAnnotation(Column.class).value());
                    fieldValues.add(pd.getReadMethod().invoke(t));
                    placeholders.add("?");
                }
            }
        }
        // ID作为更新条件，放在集合中的最后一个元素
        fieldNames.add(idFieldName);
        fieldValues.add(idFieldValue);
        placeholders.add("?");

        // 拼接sql
        StringBuilder sql = new StringBuilder("");
        sql.append("UPDATE ").append(tableName).append(" SET ");
        int index = fieldNames.size() - 1;
        for (int i = 0; i < index; i++) {
            sql.append(fieldNames.get(i)).append("=").append(placeholders.get(i)).append(",");
        }
        sql.deleteCharAt(sql.length() - 1).append(" WHERE ").append(fieldNames.get(index)).append("=").append("?");

        // 设置SQL参数占位符的值
        PreparedStatement ps = DBConnection.getConnection().prepareStatement(sql.toString());
        ps = DBCommonUtil.setParameter(fieldValues, ps, false);

        // 执行SQL
        ps.execute();
        DBConnection.closeRes(null, ps);

        System.out.println(sql + "\n" + clazz.getSimpleName() + "修改成功.");
    }

    @Override
    public T selectSingle(Object primaryKey, Class<T> clazz) throws Exception {
        String idFieldName = "";
        Field[] fields = clazz.getDeclaredFields();
        boolean flag = false;
        for (Field field : fields) {
            if (field.isAnnotationPresent(Id.class)) {
                idFieldName = field.getAnnotation(Id.class).value();
                flag = true;
                break;
            }else if(field.isAnnotationPresent(PrimaryKey.class)){
                idFieldName = field.getAnnotation(PrimaryKey.class).value();
                flag = true;
                break;
            }
        }

        if (!flag) {
            throw new Exception(clazz.getName() + " object not found id property.");
        }

        // 拼装SQL
        Map<String, Object> sqlWhereMap = new HashMap<String, Object>();
        sqlWhereMap.put(Const.TABLE_ALIAS + "." + idFieldName, primaryKey);

        List<T> list = findAllByConditions(sqlWhereMap, clazz, null);
        return list.size() > 0 ? list.get(0) : null;
    }

    /**
     * 指定条件查询处理
     * @param sqlWhereString 指定条件
     * @param clazz 表对应的BEAN
     * @param orderBy 排序条件
     * @return 指定条件查询结果集
     * @throws Exception
     */
    public List<T> findAllByConditions(String sqlWhereString, Class<T> clazz, String orderBy) throws Exception {
        List<T> list = new ArrayList<T>();
        PreparedStatement ps = null;

        Field[] fields = clazz.getDeclaredFields();
        String tableName = DBCommonUtil.getTableName(clazz);
        // 拼装SQL
        String sql = "SELECT " + this.getSelect(clazz) + " FROM " + tableName + " " + Const.TABLE_ALIAS + " WHERE "
                + sqlWhereString;

        ps = DBConnection.getConnection().prepareStatement(sql);
        // 执行SQL
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            T t = clazz.newInstance();
            list.add(DBCommonUtil.initObject(t, fields, rs));
        }

        // order by
        if (null != orderBy) {
            sql = sql + " ORDER BY " + orderBy;
        }

        // 释放资源
        DBConnection.closeRes(null, ps, rs);

        System.out.println(sql);
        return list;
    }

     
   
    @SuppressWarnings("unchecked")
    @Override
    public List<T> findAllByConditions(Map<String, Object> sqlWhereMap, Class<T> clazz, String orderBy)
            throws Exception {
        List<T> list = new ArrayList<T>();
        String tableName = DBCommonUtil.getTableName(clazz);
        Field[] fields = clazz.getDeclaredFields();

        // 拼装SQL
        String sql = "SELECT " + this.getSelect(clazz) + " FROM " + tableName + " " + Const.TABLE_ALIAS;
        PreparedStatement ps = null;
        List<Object> values = null;
        if (0 != sqlWhereMap.size()) {
            List<Object> sqlWhereWithValues = getSqlWhereWithValues(sqlWhereMap);
            if (sqlWhereWithValues != null) {
                // 拼接SQL条件
                String sqlWhere = (String) sqlWhereWithValues.get(0);
                sql += sqlWhere;
                // 得到SQL条件中占位符的值
                values = (List<Object>) sqlWhereWithValues.get(1);
            }
        }

        if (null != orderBy) {
            sql = sql + " ORDER BY " + orderBy;
        }

        // 设置参数占位符的值
        if (values != null) {
            ps = DBConnection.getConnection().prepareStatement(sql);
            ps = DBCommonUtil.setParameter(values, ps, false);
        } else {
            ps = DBConnection.getConnection().prepareStatement(sql);
        }

        // 执行SQL
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            T t = clazz.newInstance();
            list.add(DBCommonUtil.initObject(t, fields, rs));
        }

        // 释放资源
        DBConnection.closeRes(null, ps, rs);

        System.out.println(sql);
        return list;
    }

    /**
     * 获得SELECT部分
     * @param clazz 表对应的Bean
     * @return 取得字段
     */
    private String getSelect(Class<T> clazz) {
        StringBuffer result = new StringBuffer();
        String idFieldName = "";

        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            String propertyName = field.getName();
            if (field.isAnnotationPresent(Id.class)) {
                idFieldName = field.getAnnotation(Id.class).value();
                result.append(Const.TABLE_ALIAS + "." + idFieldName).append(" AS ").append(propertyName).append(",");
            } else if (field.isAnnotationPresent(Column.class)) {
                result.append(Const.TABLE_ALIAS + "." + field.getAnnotation(Column.class).value()).append(" AS ")
                        .append(propertyName).append(",");
            }else if (field.isAnnotationPresent(PrimaryKey.class)){
                idFieldName = field.getAnnotation(PrimaryKey.class).value();
                result.append(Const.TABLE_ALIAS + "." + idFieldName).append(" AS ").append(propertyName).append(",");
            }
        }
        result.deleteCharAt(result.length() - 1);

        return result.toString();
    }

    /**
     * 根据条件，返回sql条件和条件中占位符的值
     * @param sqlWhereMap key：字段名 value：字段值
     * @return 第一个元素为SQL条件，第二个元素为SQL条件中占位符的值
     */
    private List<Object> getSqlWhereWithValues(Map<String, Object> sqlWhereMap) {
        if (sqlWhereMap.size() < 1)
            return null;
        List<Object> list = new ArrayList<Object>();
        List<Object> fieldValues = new ArrayList<Object>();
        StringBuffer sqlWhere = new StringBuffer(" WHERE ");
        Set<Entry<String, Object>> entrySets = sqlWhereMap.entrySet();
        for (Iterator<Entry<String, Object>> iteraotr = entrySets.iterator(); iteraotr.hasNext();) {
            Entry<String, Object> entrySet = iteraotr.next();
            fieldValues.add(entrySet.getValue());
            Object value = entrySet.getValue();
            if (value.getClass() == String.class) {
                sqlWhere.append(entrySet.getKey()).append(" LIKE ").append("?").append(" AND ");
            } else {
                sqlWhere.append(entrySet.getKey()).append("=").append("?").append(" AND ");
            }
        }
        sqlWhere.delete(sqlWhere.lastIndexOf("AND"), sqlWhere.length());
        list.add(sqlWhere.toString());
        list.add(fieldValues);
        return list;
    }

	@Override
	public StringBuilder touch_sql(T t, String type) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
}