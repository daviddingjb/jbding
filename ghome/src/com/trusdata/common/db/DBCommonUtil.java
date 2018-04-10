package com.trusdata.common.db;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.sql.Types;
import java.text.ParseException;
import java.util.Date;
import java.util.List;

import com.trusdata.common.annotation.Entity;
import com.trusdata.common.util.DateUtil;

/**
 * 数据库共通.
 * @author JBDING
 */
public class DBCommonUtil {

    /**
     * 获得表名.
     * @param clazz tableBean
     * @return 表名
     */
    public static String getTableName(Class<?> clazz) {
        String result = null;
        if (clazz.isAnnotationPresent(Entity.class)) {
            Entity entity = clazz.getAnnotation(Entity.class);
            result = entity.value();
        }
        return result;
    }

    /**
     * 根据结果集初始化对象.
     * @param t tableBean
     * @param fields 字段
     * @param rs 结果集
     * @return tableBean
     * @throws Exception DB异常
     */
    public static <T> T initObject(T t, Field[] fields, ResultSet rs) throws Exception {
        for (Field field : fields) {
            String propertyName = field.getName();
            Object paramVal = null;
            Class<?> clazzField = field.getType();
            if (clazzField == String.class) {
                paramVal = rs.getString(propertyName);
            } else if (clazzField == short.class || clazzField == Short.class) {
                paramVal = rs.getShort(propertyName);
            } else if (clazzField == int.class || clazzField == Integer.class) {
                paramVal = rs.getInt(propertyName);
            } else if (clazzField == long.class || clazzField == Long.class) {
                paramVal = rs.getLong(propertyName);
            } else if (clazzField == float.class || clazzField == Float.class) {
                paramVal = rs.getFloat(propertyName);
            } else if (clazzField == double.class || clazzField == Double.class) {
                paramVal = rs.getDouble(propertyName);
            } else if (clazzField == boolean.class || clazzField == Boolean.class) {
                paramVal = rs.getBoolean(propertyName);
            } else if (clazzField == byte.class || clazzField == Byte.class) {
                paramVal = rs.getByte(propertyName);
            } else if (clazzField == char.class || clazzField == Character.class) {
                paramVal = rs.getCharacterStream(propertyName);
            } else if (clazzField == Date.class) {
                paramVal = DateUtil.formatDate(rs.getTimestamp(propertyName));
            } else if (clazzField.isArray()) {
                paramVal = rs.getString(propertyName).split(","); // 以逗号分隔的字符串
            }
            PropertyDescriptor pd = new PropertyDescriptor(propertyName, t.getClass());
            pd.getWriteMethod().invoke(t, paramVal);
        }
        return t;
    }

    /**
     * 设置SQL参数占位符的值.
     * @param values 占位符的值
     * @param ps PreparedStatement
     * @param isSearch Like
     * @return PreparedStatement
     * @throws SQLException DB异常
     * @throws ParseException 
     */
    public static PreparedStatement setParameter(List<Object> values, PreparedStatement ps, boolean isSearch)
            throws SQLException, ParseException {
        for (int i = 1; i <= values.size(); i++) {
            Object fieldValue = values.get(i - 1);
            Class<?> clazzValue = fieldValue.getClass();
            if (clazzValue == String.class) {
                ps.setString(i, isSearch ? "%" + (String) fieldValue + "%" : (String) fieldValue);
            } else if (clazzValue == boolean.class || clazzValue == Boolean.class) {
                ps.setBoolean(i, (Boolean) fieldValue);
            } else if (clazzValue == byte.class || clazzValue == Byte.class) {
                ps.setByte(i, (Byte) fieldValue);
            } else if (clazzValue == char.class || clazzValue == Character.class) {
                ps.setObject(i, fieldValue, Types.CHAR);
            } else if (clazzValue == Date.class) {
                ps.setTimestamp(i, new Timestamp(((Date) fieldValue).getTime()));
            } else if (clazzValue.isArray()) {
                Object[] arrayValue = (Object[]) fieldValue;
                StringBuffer sb = new StringBuffer();
                for (int j = 0; j < arrayValue.length; j++) {
                    sb.append(arrayValue[j]).append("、");
                }
                ps.setString(i, sb.deleteCharAt(sb.length() - 1).toString());
            } else {
                ps.setObject(i, fieldValue, Types.NUMERIC);
            }
        }
        return ps;
    }
}
