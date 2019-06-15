package com.trusdata.common.action;

import com.trusdata.common.bean.PageBean;

/**
 * 
 * @author JBDING
 *
 * @param <E>
 */
public abstract  class BasePageAction<E extends PageBean> extends BaseAction {
    /**
     * 序列化版本号
     */
    private static final long serialVersionUID = -1387039478169906491L;
    
    /**
     * 获得检索对象
     * @return 检索对象
     */
    public abstract E getQueryBean();

    /**
     * 设置检索对象
     * @param queryBean 检索对象
     */
    public abstract void setQueryBean(E queryBean);
}
