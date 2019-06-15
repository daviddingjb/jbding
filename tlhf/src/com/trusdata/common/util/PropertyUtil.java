/**
 * PropertyUtil.java
 * All rights reserved by Object Information Inc.
 */
package com.trusdata.common.util;

import java.io.File;
import java.io.FileInputStream;
import java.net.URL;
import java.net.URLDecoder;
import java.util.Properties;

/**
 * 属性文件取得类
 * 
 * @author JBDING
 */
public class PropertyUtil {
	private static Properties props = null;

	/**
	 * 载入页面辞书
	 * 
	 * @param className
	 *            页面ID的Action名
	 */
	public static void loadDictionary(Class<?> clazz) {
		// 取得属性文件名
		String fileName = clazz.getName().substring(0, 7);

		// 载入属性文件
		load(clazz, fileName);
	}

	/**
	 * 载入DB配置
	 * 
	 * @param className
	 *            DB操作类名
	 */
	public static void loadDB(Class<?> clazz) {
		// 取得属性文件名
		String fileName = "db.properties";

		// 载入属性文件
		load(clazz, fileName);
	}

	/**
	 * 载入SQL辞书
	 * 
	 * @param className
	 *            DB操作类名
	 */
	public static void loadSql(Class<?> clazz) {
		// 取得属性文件名
		String fileName = "sql.properties";

		// 载入属性文件
		load(clazz, fileName);
	}

	public static void loadMessage(Class<?> clazz) {
		// 取得属性文件名
		String fileName = "message.properties";

		// 载入属性文件
		load(clazz, fileName);
	}

	public static void loadSystem(Class<?> clazz) {
		// 取得属性文件名
		String fileName = "system.properties";

		// 载入属性文件
		load(clazz, fileName);
	}

	/**
	 * 根据KEY取得值
	 * 
	 * @param key
	 * @return key的值
	 */
	public static String getProperty(String key) {
		return props.getProperty(key);
	}

	/**
	 * 取得当前类所在的文件
	 * 
	 * @param clazz
	 * @return
	 */
	private static File getClassFile(Class<?> clazz) {
		URL path = clazz.getResource(clazz.getName().substring(
				clazz.getName().lastIndexOf(".") + 1)
				+ ".classs");
		if (path == null) {
			String name = clazz.getName().replaceAll("[.]", "/");
			path = clazz.getResource("/" + name + ".class");
		}
		return new File(path.getFile());
	}

	/**
	 * 取得当前类所在的ClassPath目录，比如tomcat下的classes路径
	 * 
	 * @param clazz
	 * @return
	 */
	private static File getClassPathFile(Class<?> clazz) {
		File file = getClassFile(clazz).getParentFile();
		return file;
	}

	/**
	 * 载入属性文件
	 * 
	 * @param className
	 *            类名
	 * @param fileName
	 *            属性文件名
	 */
	private static void load(Class<?> clazz, String fileName) {
		// 属性文件路径
		String path = null;

		try {
			// 取得属性文件路径
			path = URLDecoder.decode(getClassPathFile(clazz).getAbsolutePath(),
					"UTF-8");

			// 载入属性文件
			FileInputStream fis = null;
			props = new Properties();
			fis = new FileInputStream(path + File.separator + fileName);
			props.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
