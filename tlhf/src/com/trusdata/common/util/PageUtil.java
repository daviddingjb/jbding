package com.trusdata.common.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.trusdata.common.bean.PageBean;

public class PageUtil {

    /** 生成检索SQL的参数时使用的Key：开始序号 */
    public static final String SQL_MAP_KEY_START = "itemStart";
    /** 生成检索SQL的参数时使用的Key：检索件数 */
    public static final String SQL_MAP_KEY_ITEMS = "itemsInPage";
    
	/** 显示的页码数（当前页前后） */
	private final static int PAGE_NO_MAX = 3;
	/** 每页显示条数 */
	private final static int ITEMS_IN_PAGE = 8;
	/** 默认显示页号 */
	private static final int DEFAULT_INDEX = 1;

	/**
	 * 重置分页对象<br>
	 * @param page 原分页对象
	 * @param sumItems 总条数
	 * @param index 当前页号 当分页对象存在时，或略该参数
	 * @return 分页对象
	 */
    public static void resetPageBean(PageBean page, int sumItems) {
        if (null == page) {
            throw new IllegalArgumentException("PageBean");
        }
        // 初始化当前页
        int index = page.getPageIndex();
        // 每页显示的条数
        int per = page.getItemsInPage() == 0 ? ITEMS_IN_PAGE : page.getItemsInPage();
        // 总页数
        int total = (sumItems % per == 0) ? sumItems / per : sumItems / per + 1;
        // 当前页
        if ((index < DEFAULT_INDEX) || (total < index)) {
            index = DEFAULT_INDEX;
        }

        int star = per * (index - 1) + 1;
        int end = per * index;

        // 当前页前表示的页码
        int showS = (DEFAULT_INDEX < index - PAGE_NO_MAX) ?  index - PAGE_NO_MAX : DEFAULT_INDEX;
        // 当前页后表示的页码
        int showE = (total < index + PAGE_NO_MAX) ? total : index + PAGE_NO_MAX;
        // 生成需要表示的页码
        List<Integer> ps = new ArrayList<Integer>();
        for (int j = showS; j <= showE; j++) {
            ps.add(j);
        }

        page.setPageTotal(total);
        page.setPageIndex(index);
        page.setSumItems(sumItems);
        page.setItemsInPage(per);
        page.setItemStart(star);
        page.setItemEnd(end);
        page.setPageNo2Show(ps);
    }

    /**
     * 生成用于SQL检索的参数Map
     * 
     * @param page 分页bean
     * @param map 检索参数Map
     * @return
     */
    public static Map<String, Object> toParamMap(PageBean page, Map<String, Object> map) {
        if (null != map) {
            map = new HashMap<String, Object>();
        }
        map.put(SQL_MAP_KEY_START, page.getItemStart());
        map.put(SQL_MAP_KEY_ITEMS, page.getItemsInPage());
        return map;
    }
}
