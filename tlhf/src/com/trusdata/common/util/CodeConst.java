package com.trusdata.common.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.trusdata.common.bean.CodeBean;


public class CodeConst {

    /** 编码类型：活动状态 */
    public static final String TYPE_ACTIVITY_STATUS = "1";
    /** 编码类型：性别 */
    public static final String TYPE_GENDER = "2";
    /** 编码类型：文件导入类型 */
    public static final String TYPE_IMPORT = "3";
    /** 编码类型：采购状态  */
    public static final String TYPE_STATUS = "4";
    /**加减编码*/
    public static final String TYPE_COUNTJJ = "5";
    /**身份编码*/
    public static final String TYPE_USERS = "6";
    /** 保存所有编码 */
    private static final Map<String, List<CodeBean>> ALL_CODES = new HashMap<String, List<CodeBean>>();

    static {
    	
        // 性别编码列表
        List<CodeBean> list = new ArrayList<>();
        list.add(new CodeBean("1", "女"));
        list.add(new CodeBean("0", "男"));
        Collections.unmodifiableList(list);
        ALL_CODES.put(TYPE_GENDER, list);
        
        // 文件导入类型列表
        list = new ArrayList<>();
        list.add(new CodeBean("0", "未导入"));
        list.add(new CodeBean("1", "已导入"));
        list.add(new CodeBean("2", "导入失败"));
        Collections.unmodifiableList(list);
        ALL_CODES.put(TYPE_IMPORT, list);
        
        // 采购状态
        list = new ArrayList<>();
        list.add(new CodeBean("0", "正在采购"));
        list.add(new CodeBean("1", "采购入库"));
        Collections.unmodifiableList(list);
        ALL_CODES.put(TYPE_STATUS, list);

        // 活动状态
        list = new ArrayList<>();
        list.add(new CodeBean("0", "进行中"));
        list.add(new CodeBean("1", "已结束"));
        Collections.unmodifiableList(list);
        ALL_CODES.put(TYPE_ACTIVITY_STATUS, list);
        //加减状态
        list = new ArrayList<>();
        list.add(new CodeBean("0", "+"));
        list.add(new CodeBean("1", "-"));
        Collections.unmodifiableList(list);
        ALL_CODES.put(TYPE_COUNTJJ, list);
        //身份状态
        list = new ArrayList<>();
        list.add(new CodeBean("0", "市管理员"));
        list.add(new CodeBean("1", "市信息录入员"));
        list.add(new CodeBean("8", "区管理员"));
        list.add(new CodeBean("9", "区信息录入员"));
        Collections.unmodifiableList(list);
        ALL_CODES.put(TYPE_USERS, list);
    }

    /**
     * 取得值
     * 
     * @param codeType 编码类型
     * @return 编码列表
     */
    public static List<CodeBean> getCodes(String codeType) {
        return ALL_CODES.get(codeType);
    }

    /**
     * 取得编码列表
     * 
     * @param codeType 编码类型
     * @return 编码列表
     */
    public static String getCodeValue(String codeType, String code) {
        List<CodeBean> list = ALL_CODES.get(codeType);
        for (CodeBean bean : list) {
            if (bean.getCode().equals(code)) {
                return bean.getValue();
            }
        }
        return "";
    }
}
