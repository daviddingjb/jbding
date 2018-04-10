package com.trusdata.common.bean;

import java.util.List;

/**
 * 
 * @author JBDING
 *
 */
public class PageBean implements java.io.Serializable {
    private static final long serialVersionUID = -721050709238590344L;

    /** 开始数据从1开始 */
    private int itemStart = 1;

    /** 结束数据从1开始 */
    private int itemEnd = 1;

    /** 数据总条数 */
    private int sumItems = 0;

    /** 当前页码从1开始 */
    private int pageIndex = 1;

    /** 总页数 */
    private int pageTotal = 0;

    /** 每页显示的条数 */
    private int itemsInPage = 0;

    /** 页内数据 */
    private List<Integer> pageNo2Show;

    /** 查询标志 */
    private int searchFlag;

    /**
     * 构造函数
     */
    public PageBean() {
    }

    /**
     * 构造函数
     * 
     * @param itemsInPage 每页显示的条数
     * @param itemStart 开始数据
     * @param itemEnd 结束数据
     * @param pageIndex 当前页码
     * @param pageTotal 总页数
     * @param sumItems 数据总条数
     * @param searchFlag 查询标志
     * @param pageNo2Show 页内数据
     */
    public PageBean(int itemsInPage, int itemStart, int itemEnd, int pageIndex, int pageTotal, int sumItems,
            int searchFlag, List<Integer> pageNo2Show) {
        super();
        this.itemsInPage = itemsInPage;
        this.itemStart = itemStart;
        this.itemEnd = itemEnd;
        this.pageIndex = pageIndex;
        this.pageTotal = pageTotal;
        this.sumItems = sumItems;
        this.searchFlag = searchFlag;
        this.pageNo2Show = pageNo2Show;
    }

    /**
     * 取得 每页显示的条数
     * 
     * @return 每页显示的条数
     */
    public int getItemsInPage() {
        return itemsInPage;
    }

    /**
     * 设置每页显示的条数
     * 
     * @param pagePer 每页显示的条数的 设定值
     */
    public void setItemsInPage(int pagePer) {
        this.itemsInPage = pagePer;
    }

    /**
     * 取得 开始数据index
     * 
     * @return 开始数据index
     */
    public int getItemStart() {
        return itemStart;
    }

    /**
     * 取得 开始数据index
     * 
     * @return 开始数据index
     */
    public int getItemStart4Sql() {
        return itemStart - 1;
    }

    /**
     * 设置开始数据index
     * 
     * @param itemStart 开始数据的 设定值index
     */
    public void setItemStart(int itemStart) {
        this.itemStart = itemStart;
    }

    /**
     * 取得 结束数据index
     * 
     * @return 结束数据index
     */
    public int getItemEnd() {
        return itemEnd;
    }

    /**
     * 设置结束数据
     * 
     * @param itemEnd 结束数据的 设定值
     */
    public void setItemEnd(int itemEnd) {
        this.itemEnd = itemEnd;
    }

    /**
     * 取得 当前页码
     * 
     * @return 当前页码
     */
    public int getPageIndex() {
        return pageIndex;
    }

    /**
     * 设置当前页码
     * 
     * @param pageIndex 当前页码的 设定值
     */
    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }

    /**
     * 取得 总页数
     * 
     * @return 总页数
     */
    public int getPageTotal() {
        return pageTotal;
    }

    /**
     * 设置总页数
     * 
     * @param pageTotal 总页数的 设定值
     */
    public void setPageTotal(int pageTotal) {
        this.pageTotal = pageTotal;
    }

    /**
     * 取得 数据总条数
     * 
     * @return 数据总条数
     */
    public int getSumItems() {
        return sumItems;
    }

    /**
     * 设置数据总条数
     * 
     * @param sumItems 数据总条数的 设定值
     */
    public void setSumItems(int sumItems) {
        this.sumItems = sumItems;
    }

    /**
     * 取得 页内数据
     * 
     * @return 页内数据
     */
    public List<Integer> getPageNo2Show() {
        return pageNo2Show;
    }

    /**
     * 设置页内数据
     * 
     * @param pageNo2Show 页内数据的 设定值
     */
    public void setPageNo2Show(List<Integer> pageNo2Show) {
        this.pageNo2Show = pageNo2Show;
    }

    /**
     * 取得 查询标志
     * 
     * @return 查询标志
     */
    public int getSearchFlag() {
        return searchFlag;
    }

    /**
     * 设置查询标志
     * 
     * @param searchFlag 查询标志的 设定值
     */
    public void setSearchFlag(int searchFlag) {
        this.searchFlag = searchFlag;
    }

}
