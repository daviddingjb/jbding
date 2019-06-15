package com.trusdata.common.db;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.trusdata.base.TrusdataBaseDao;
import com.trusdata.base.TrusdataIDao;
import com.trusdata.common.Const;
import com.trusdata.common.Page;
import com.trusdata.common.annotation.Column;
import com.trusdata.common.annotation.Entity;
import com.trusdata.common.annotation.Id;
import com.trusdata.common.annotation.PrimaryKey;

/**
 * 
 * @author JBDING
 *
 * @param <T>
 */
public class CustomDao<T> extends TrusdataBaseDao implements TrusdataIDao<T> {
    /**
     * 此方法用于无自增长主键插入. annotation 信息为PrimaryKey
     */
    @Override
    public void insert(T t) throws Exception {
        Class<?> clazz = t.getClass();
        String tableName = DBCommonUtil.getTableName(clazz);
        StringBuilder sql = new StringBuilder(); // sql
        StringBuilder placeholders = new StringBuilder();
        // 主键字段
        String pkFieldName = "";
        Object pkFieldValue = "";
        // 字段名.字段值
        List<Object> columnNamesList = new ArrayList<Object>();
        List<Object> columnValuesList = new ArrayList<Object>();
        PropertyDescriptor pd;
        Field[] fields = clazz.getDeclaredFields();
        for (Field f : fields) {
            pd = new PropertyDescriptor(f.getName(), clazz);
            if (f.isAnnotationPresent(PrimaryKey.class)) {
                pkFieldName = f.getAnnotation(PrimaryKey.class).value();
                pkFieldValue = pd.getReadMethod().invoke(t);
            } else if (f.isAnnotationPresent(Column.class)) {
                if (null != pd.getReadMethod().invoke(t)) {
                    columnNamesList.add(f.getAnnotation(Column.class).value());
                    columnValuesList.add(pd.getReadMethod().invoke(t));
                    placeholders.append("?,");
                }
            }
        }
        // 拼接字符串
        sql.append("INSERT INTO ").append(tableName).append("( ").append(pkFieldName).append(",");
        int index = columnNamesList.size();
        for (int i = 0; i < index; i++) {
            sql.append(columnNamesList.get(i)).append(",");
        }
        sql.deleteCharAt(sql.length() - 1).append(") ").append("VALUE").append("( ").append("?,").append(placeholders);
        sql.deleteCharAt(sql.length() - 1).append(" ) ");
        columnValuesList.add(0, pkFieldValue);
        PreparedStatement ps = DBConnection.getConnection().prepareStatement(sql.toString());
        System.out.println(sql.toString());
        // 赋值
        ps = DBCommonUtil.setParameter(columnValuesList, ps, false);
        // 执行SQL
        ps.execute();
        System.out.println("插入成功  : " + pkFieldValue);
        // 释放数据库资源
        DBConnection.closeRes(null, ps);

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
            } else if(field.isAnnotationPresent(PrimaryKey.class)){
                idFieldName = field.getAnnotation(PrimaryKey.class).value();
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
        // 表名
        String tableName = DBCommonUtil.getTableName(clazz);
        // 主键字段
        String pkFieldName = "";
        Object pkFieldValue = "";
        // 字段名.字段值
        List<Object> columnNames = new ArrayList<Object>();
        List<Object> columnValues = new ArrayList<Object>();
        // sql
        StringBuilder sql = new StringBuilder();
        Field[] fields = clazz.getDeclaredFields();
        PropertyDescriptor pd;
        for (Field f : fields) {
            pd = new PropertyDescriptor(f.getName(), clazz);
            if (f.isAnnotationPresent(PrimaryKey.class)) {
                pkFieldName = f.getAnnotation(PrimaryKey.class).value();
                pkFieldValue = pd.getReadMethod().invoke(t);
            } else if (f.isAnnotationPresent(Id.class)) {
                pkFieldName = f.getAnnotation(Id.class).value();
                pkFieldValue = pd.getReadMethod().invoke(t);
            }else if (f.isAnnotationPresent(Column.class)) {
                if (null != pd.getReadMethod().invoke(t)) {
                    columnNames.add(f.getAnnotation(Column.class).value());
                    columnValues.add(pd.getReadMethod().invoke(t));
                }
            } 
        }
        // 拼接sql
        sql.append("UPDATE ").append(tableName).append(" SET ");
        int index = columnNames.size();
        for (int i = 0; i < index; i++) {
            sql.append(columnNames.get(i)).append(" = ").append("?").append(",");
        }
        sql.deleteCharAt(sql.length() - 1).append(" WHERE ").append(pkFieldName).append(" = ").append("?");
        // 将主键值加入值链表
        columnValues.add(pkFieldValue);
        // 设置SQL参数占位符的值
        PreparedStatement ps = DBConnection.getConnection().prepareStatement(sql.toString());
        ps = DBCommonUtil.setParameter(columnValues, ps, false);
        // 执行SQL
        ps.execute();
        DBConnection.closeRes(null, ps);
        System.out.println(sql.toString() + "\n" + clazz.getSimpleName() + "修改成功.");
    }
    
    public void update(Map<String,Object> setNewValue , Class<T> clazz) throws Exception {
        String tableName = DBCommonUtil.getTableName(clazz);
        String pkFieldName = null;
        Object pkValue = null;
        StringBuilder sql = new StringBuilder();
        Field[] fields = clazz.getDeclaredFields();
        for (Field f : fields) {
            if (f.isAnnotationPresent(PrimaryKey.class)) {
                pkFieldName = f.getAnnotation(PrimaryKey.class).value();
            } else if (f.isAnnotationPresent(Id.class)) {
                pkFieldName = f.getAnnotation(Id.class).value();
            }
            
        }
        List<Object> Values = new ArrayList<Object>();
        if(null != pkFieldName && null != setNewValue.get(pkFieldName)){
            pkValue = setNewValue.get(pkFieldName);
            setNewValue.remove(pkFieldName);
            sql.append("UPDATE ").append(tableName).append(" SET ");
            for(Map.Entry<String,Object> entry :setNewValue.entrySet()){
                sql.append(entry.getKey()).append(" = ?").append(",");
                Values.add(entry.getValue());
            }
            sql.deleteCharAt(sql.length() - 1);
            Values.add(pkValue);
            sql.append(" WHERE ").append(pkFieldName).append(" = ?");
        }
        
        System.out.println(sql.toString());
        PreparedStatement ps = DBConnection.getConnection().prepareStatement(sql.toString());
        ps = DBCommonUtil.setParameter(Values, ps, false);
        // 执行SQL
        ps.execute();
        DBConnection.closeRes(null, ps);
        System.out.println(clazz.getSimpleName() + "修改成功.");
    }
    

    @Override
    public T selectSingle(Object primaryKey, Class<T> clazz) throws Exception {
        String tableName = DBCommonUtil.getTableName(clazz);
        String idFieldName = "";
        Field[] fields = clazz.getDeclaredFields();
        StringBuilder fieldsString = new StringBuilder();
        fieldsString.append("SELECT ");
        boolean flag = false;
        for (Field field : fields) {
            if (field.isAnnotationPresent(Id.class)) {
                idFieldName = field.getAnnotation(Id.class).value();
                flag = true;
                fieldsString.append(idFieldName).append(",");
            }else if(field.isAnnotationPresent(PrimaryKey.class)){
                idFieldName = field.getAnnotation(PrimaryKey.class).value();
                flag = true;
                fieldsString.append(idFieldName).append(",");
            }else if(field.isAnnotationPresent(Column.class)){
                fieldsString.append(field.getAnnotation(Column.class).value()).append(",");
            }
        }
        fieldsString.deleteCharAt(fieldsString.length() - 1).append(" FROM ").append(tableName).append(" WHERE ").append(idFieldName).append(" = ?");
        System.out.println(fieldsString.toString());
        if (!flag) {
            throw new Exception(clazz.getName() + " object not found id property.");
        }
        PreparedStatement ps = null;
        List<Object> val = new ArrayList<Object>();
        List<T> result = new ArrayList<T>();
        val.add(primaryKey);
        ps = DBConnection.getConnection().prepareStatement(fieldsString.toString());
        ps = DBCommonUtil.setParameter(val, ps, false);
        // 执行SQL
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            T t = clazz.newInstance();
            result.add(DBCommonUtil.initObject(t, fields, rs));
        }
        return result.size() > 0 ? result.get(0) : null;
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<T> findAllByConditions(Map<String, Object> sqlWhereMap, Class<T> clazz, String orderBy)
            throws Exception {
        List<T> list = new ArrayList<T>();
        String tableName = DBCommonUtil.getTableName(clazz);
        Field[] fields = clazz.getDeclaredFields();
        List<Field> fies = new ArrayList<Field>();
        for(Field f : fields){
            if(!f.isAnnotationPresent(PrimaryKey.class) 
               && !f.isAnnotationPresent(Id.class) && !f.isAnnotationPresent(Column.class)){
                continue;
            }
            fies.add(f);
        }
        int size = fies.size();
        Field[] fieldsx = new Field[size];
        for(int i = 0; i < size; i ++){
            fieldsx[i] = fies.get(i);
        }

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
            list.add(DBCommonUtil.initObject(t, fieldsx, rs));
        }

        // 释放资源
        DBConnection.closeRes(null, ps, rs);

        System.out.println(sql);
        return list;
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
        List<Field> fies = new ArrayList<Field>();
        for(Field f : fields){
            if(!f.isAnnotationPresent(PrimaryKey.class) 
               && !f.isAnnotationPresent(Id.class) && !f.isAnnotationPresent(Column.class)){
                continue;
            }
            fies.add(f);
        }
        int size = fies.size();
        Field[] fieldsx = new Field[size];
        for(int i = 0; i < size; i ++){
            fieldsx[i] = fies.get(i);
        }
        // 拼装SQL
        String sql = "";
        if("".equals(sqlWhereString.trim())){
            sql = "SELECT " + this.getSelect(clazz) + " FROM " + tableName + " " + Const.TABLE_ALIAS;
        }else{
            sql = "SELECT " + this.getSelect(clazz) + " FROM " + tableName + " " + Const.TABLE_ALIAS + " WHERE " + sqlWhereString;
        }

        ps = DBConnection.getConnection().prepareStatement(sql);
        // 执行SQL
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            T t = clazz.newInstance();
            list.add(DBCommonUtil.initObject(t, fieldsx, rs));
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

    /**
     * 指定SQL查询.
     * 
     * @param sql
     *            SQL语句
     * @param values
     *            SQL条件值(?的顺序)
     * @param clazz
     *            返回类型
     * @return 结果集
     * @throws Exception
     *             DB异常
     */
    public List<T> query(String sql, List<Object> values, Class<T> clazz) throws Exception {
        List<T> result = new ArrayList<T>();
        PreparedStatement ps = null;

        Field[] fields = clazz.getDeclaredFields();
        if (null != sql) {
            ps = DBConnection.getConnection().prepareStatement(sql);
            ps = DBCommonUtil.setParameter(values, ps, false);
            // 执行SQL
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                T t = clazz.newInstance();
                result.add(DBCommonUtil.initObject(t, fields, rs));
            }
        }
        return result;
    }
    public List<T> query(String sql, List<Object> values, Class<T> clazz,Page page) throws Exception {
        List<T> result = new ArrayList<T>();
        PreparedStatement ps = null;

        Field[] fields = clazz.getDeclaredFields();
        if (null != sql) {
            if(page.getPageCount() != 0){
                sql += " LIMIT " + (page.getPageIndex() - 1 ) * page.getPageIteams() + "," + page.getPageIteams();
            }
            ps = DBConnection.getConnection().prepareStatement(sql);
            ps = DBCommonUtil.setParameter(values, ps, false);
            // 执行SQL
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                T t = clazz.newInstance();
                result.add(DBCommonUtil.initObject(t, fields, rs));
            }
        }
        return result;
    }
    /**
     * 此方法查询表中的Column字段的存在行数
     * 
     * @param Column
     *            :待查询的字段,全表查询请传null
     * @param clazz
     *            :用于获取表名,此参数不可为空
     * @param sqlwhere
     *            :where 子句 ,不带条件,请传null
     * @param whereValue
     *            : 值链表.如若此参数传null,sqlwhere中应写定值,不可出现 占位符"?"
     * @return 字段中存在行数
     * @throws Exception
     */
    public int count(String column, Class<T> clazz, String sqlwhere, List<Object> whereValue) throws Exception {
        // 获取表名
        String tableName = DBCommonUtil.getTableName(clazz);
        StringBuilder sql = new StringBuilder();
        String col = "";
        String where = "";
        // 带子句,查全表,用主键查询.不带子句查全表用count(*)
        if (null == column && null == sqlwhere) {
            col = "*";
        } else if (null == column && null != sqlwhere) {
            DatabaseMetaData dbMetaData = DBConnection.getConnection().getMetaData();
            ResultSet rs = dbMetaData.getPrimaryKeys(null, null, tableName);
            rs.absolute(1);
            col = rs.getString("COLUMN_NAME");
        } else {
            col = String.valueOf(column);
        }
        if (null == sqlwhere) {
            where = "";
        } else {
            where = sqlwhere;
        }
        // 拼接字符串
        sql.append("SELECT COUNT( ").append(col).append(" ) FROM ").append(tableName).append(" WHERE ").append(where);
        String sqlString = sql.toString().replaceAll(" WHERE\\s*$", "");
        PreparedStatement ps = DBConnection.getConnection().prepareStatement(sqlString);
        if (null != whereValue) {
            ps = DBCommonUtil.setParameter(whereValue, ps, false);
        }
        System.out.println(sqlString);
        ResultSet rsx = ps.executeQuery();
        rsx.absolute(1);
        int count = rsx.getInt(1);
        DBConnection.closeRes(null, ps);
        return count;
    }
    
    /**
     * 非主键,非自增字段的当前最大值.
     * 
     * @param args
     * @throws Exception
     */
    public int max(String column, Class<T> clazz) throws Exception {
        // 获取表名
        String tableName = DBCommonUtil.getTableName(clazz);
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT MAX(CAST( ").append(column).append(" AS UNSIGNED))").append(" FROM ").append(tableName);
        PreparedStatement ps = DBConnection.getConnection().prepareStatement(sql.toString());
        ResultSet rsx = ps.executeQuery();
        rsx.absolute(1);
        int max = rsx.getInt(1);
        System.out.println(sql.toString());
        DBConnection.closeRes(null, ps);
        return max;
    }

    /**
     * 判断表中主键是否存在,用于新建数据时的(ajax)验证
     * 
     * @param column
     *            : 待验证的主键字段值.
     * @throws Exception
     */
    public boolean isExist(Object value, Class<T> clazz) throws Exception {
        String PK = "";
        String tableName = clazz.getAnnotation(Entity.class).value();

        StringBuilder sql = new StringBuilder();
        Field[] fields = clazz.getDeclaredFields();
        for (Field f : fields) {
            if (f.isAnnotationPresent(PrimaryKey.class)) {
                PK = f.getAnnotation(PrimaryKey.class).value();
                break;
            }else if(f.isAnnotationPresent(Id.class)){
                PK = f.getAnnotation(Id.class).value();
                break;
            }
        }
        // 拼接sql
        sql.append("SELECT ").append(PK).append(" FROM ").append(tableName).append(" WHERE ").append(PK).append(" = ?");
        System.out.println(sql.toString());
        // 值链表
        List<Object> whereValue = new ArrayList<Object>();
        whereValue.add(value);
        PreparedStatement ps = DBConnection.getConnection().prepareStatement(sql.toString());
        // 设置值
        ps = DBCommonUtil.setParameter(whereValue, ps, false);
        //执行
        try{
            ResultSet rsx = ps.executeQuery();
            rsx.absolute(1);
            System.out.println(rsx.getObject(1));
            DBConnection.closeRes(null, ps);
            return true;
        }catch (Exception e) {
            DBConnection.closeRes(null, ps);
            return false;
        }
    }
    
    /**
     * 判断表中 普通字段是否存在,用于新建数据时的(ajax)验证
     * 
     * @param column
     *            : 待验证的字段名.
     *            @param value:待验证的字段值.
     * @throws Exception
     */
    public boolean isExist(String column,Object value, Class<T> clazz) throws Exception {
        String tableName = clazz.getAnnotation(Entity.class).value();
        StringBuilder sql = new StringBuilder();
        Field[] fields = clazz.getDeclaredFields();
        boolean flagx = false;
        for (Field f : fields) {
            if (f.isAnnotationPresent(Column.class) && column.equals(f.getAnnotation(Column.class).value())){
                flagx = true;
                break;
            }
        }
        if(!flagx){
            throw new Exception("字段不存在");
        }
        // 拼接sql
        sql.append("SELECT ").append(column).append(" FROM ").append(tableName).append(" WHERE ").append(column).append(" = ?");
        System.out.println(sql.toString());
        // 值链表
        List<Object> whereValue = new ArrayList<Object>();
        whereValue.add(value);
        PreparedStatement ps = DBConnection.getConnection().prepareStatement(sql.toString());
        // 设置值
        ps = DBCommonUtil.setParameter(whereValue, ps, false);
        //执行
        try{
            ResultSet rsx = ps.executeQuery();
            rsx.absolute(1);
            System.out.println(rsx.getObject(1));
            DBConnection.closeRes(null, ps);
            return true;
        }catch (Exception e) {
            DBConnection.closeRes(null, ps);
            return false;
        }
    }    
    /**
     * 分页查询.
     * @throws Exception 
     */
    public List<T> pageQuery(Class<T> clazz,String sqlWhere,String orderby,Page page) throws Exception{
        StringBuilder sql = new StringBuilder();
        String tablename = clazz.getAnnotation(Entity.class).value();
        List<T> result = new ArrayList<T>();
       
        Field[] fields = clazz.getDeclaredFields();
        if(null == sqlWhere){
            sqlWhere = " WHERE ";
        }
        if(null == orderby){
            orderby = "ORDER BY";
        }
        int start = page.getPageIndex();
        int itea = page.getPageIteams();
        start = (start - 1) * itea;
        sql.append("SELECT ").append("*").append(" FROM ").append(tablename).append(" WHERE ").append(sqlWhere).append(" ORDER BY ").append(orderby).append(" LIMIT ").append(start).append(",").append(itea);
        String sqlx = sql.toString().replaceAll("WHERE\\s*WHERE", " ");
        sqlx = sqlx.replaceAll("ORDER BY\\s*ORDER BY", " ");
        PreparedStatement ps = DBConnection.getConnection().prepareStatement(sqlx);
        try {
            // 执行SQL
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                T t = clazz.newInstance();
                result.add(DBCommonUtil.initObject(t, fields, rs));
            }
            DBConnection.closeRes(null, ps);
            System.out.println("page:  " + sqlx);
            return result;
        } catch (SQLException e) {
            DBConnection.closeRes(null, ps);
            e.printStackTrace();
        }
        return result;
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
        StringBuilder rtn = new StringBuilder();
		if ("insert".equals(type)) {
	        Class<?> clazz = t.getClass();
	        String tableName = DBCommonUtil.getTableName(clazz);
	        StringBuilder sql = new StringBuilder(); // sql
	        StringBuilder placeholders = new StringBuilder();
	        // 主键字段
	        String pkFieldName = "";
	        Object pkFieldValue = "";
	        // 字段名.字段值
	        List<Object> columnNamesList = new ArrayList<Object>();
	        List<Object> columnValuesList = new ArrayList<Object>();
	        PropertyDescriptor pd;
	        Field[] fields = clazz.getDeclaredFields();
	        for (Field f : fields) {
	            pd = new PropertyDescriptor(f.getName(), clazz);
	            if (f.isAnnotationPresent(PrimaryKey.class)) {
	                pkFieldName = f.getAnnotation(PrimaryKey.class).value();
	                pkFieldValue = pd.getReadMethod().invoke(t);
	            } else if (f.isAnnotationPresent(Column.class)) {
	                if (null != pd.getReadMethod().invoke(t)) {
	                    columnNamesList.add(f.getAnnotation(Column.class).value());
	                    columnValuesList.add(pd.getReadMethod().invoke(t));
	                    placeholders.append("?,");
	                }
	            }
	        }
	        // 拼接字符串
	        sql.append("INSERT INTO ").append(tableName).append("( ").append(pkFieldName).append(",");
	        int index = columnNamesList.size();
	        for (int i = 0; i < index; i++) {
	            sql.append(columnNamesList.get(i)).append(",");
	        }
	        sql.deleteCharAt(sql.length() - 1).append(") ").append("VALUE").append("( ").append("?,").append(placeholders);
	        sql.deleteCharAt(sql.length() - 1).append(" ) ");
	        columnValuesList.add(0, pkFieldValue);
	        PreparedStatement ps = DBConnection.getConnection().prepareStatement(sql.toString());
	        System.out.println(sql.toString());
	        // 赋值
	        ps = DBCommonUtil.setParameter(columnValuesList, ps, false);
	        System.out.println(ps.toString());
	        String tmp = ps.toString();
	        tmp = tmp.substring(tmp.indexOf("INSERT INTO"));
	        rtn.append(tmp).append("\n");
		}
		return rtn;
	}
}
