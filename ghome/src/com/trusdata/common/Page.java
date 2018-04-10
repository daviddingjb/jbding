package com.trusdata.common;

import java.util.List;

/**
 * 
 * @author JBDING
 *
 */
public class Page {
    //每一页的条目数
    private int pageIteams = Const.PAGE_ITEAMS;
    //要查询的页码编号
    private int pageIndex;
    //总页条目数
    private int pageCount;
    //总页目数
    private int pageSize;
    //页面显示的信息
    private List<String> pageList;
    
   
    public int getPageIteams() {
        return pageIteams;
    }

    public void setPageIteams(int pageIteams) {
        this.pageIteams = pageIteams;
    }

    public int getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
    
    public List<String> getPageList() {
        return pageList;
    }

    public void setPageList(List<String> pageList) {
        this.pageList = pageList;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
      
}
