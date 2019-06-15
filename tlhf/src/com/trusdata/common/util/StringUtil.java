package com.trusdata.common.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * @author JBDING
 * 
 */
public class StringUtil {

	/**
	 * 检验字符串是否是大于0的数字
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isNum(String str) {
		Pattern pattern = Pattern.compile("[1-9]{1}\\d*");
		Matcher matcher = pattern.matcher(str);
		return matcher.matches();
	}
}
