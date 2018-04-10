package com.trusdata.base;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.Map;

/**
 * @author JBDING
 */
public abstract class TrusdataBaseDao {

    // 连接
    private Connection conn;
    // 处理对象
    private PreparedStatement pst;

    public void setConn(Connection conn) {
        this.conn = conn;
    }

    /**
     * 查询执行
     * @param sql 执行SQL
     * @param condition 执行参数
     * @throws SQLException 执行异常
     */
    protected ResultSet execute(String sql, Map<Integer, Object> condition) throws SQLException {
        pst = conn.prepareStatement(sql);
        for (Iterator<Integer> iterator = condition.keySet().iterator(); iterator.hasNext();) {
            Integer key = (Integer) iterator.next();
            pst.setObject(key.intValue(), condition.get(key));
        }
        return pst.executeQuery();
    }

    /**
     * 追加，更新，删除执行
     * @param sql 执行SQL
     * @param condition 执行参数
     * @throws SQLException 执行异常
     */
    protected int executeUpd(String sql, Map<Integer, Object> condition) throws SQLException {
        pst = conn.prepareStatement(sql);
        for (Iterator<Integer> iterator = condition.keySet().iterator(); iterator.hasNext();) {
            Integer key = (Integer) iterator.next();
            pst.setObject(key.intValue(), condition.get(key));
        }
        return pst.executeUpdate();
    }
}
