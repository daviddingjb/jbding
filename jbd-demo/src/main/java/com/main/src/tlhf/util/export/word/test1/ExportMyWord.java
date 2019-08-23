package com.main.src.tlhf.util.export.word.test1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import sun.misc.BASE64Encoder;
import freemarker.core.ParseException;
import freemarker.log.Logger;
import freemarker.template.Configuration;
import freemarker.template.MalformedTemplateNameException;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateExceptionHandler;
import freemarker.template.TemplateNotFoundException;

/**
 * @Description 利用FreeMarker导出Word
 */
public class ExportMyWord {

	private Logger log = Logger.getLogger(ExportMyWord.class.toString());
	private Configuration config = null;

	public ExportMyWord() {
		config = new Configuration(Configuration.VERSION_2_3_28);
		config.setDefaultEncoding("utf-8");
	}

	/**
	 * FreeMarker生成Word
	 * 
	 * @param dataMap
	 *            数据
	 * @param templateName
	 *            目标名
	 * @param saveFilePath
	 *            保存文件路径的全路径名（路径+文件名）
	 */
	public void createWord(Map<String, Object> dataMap, String templateName,
			String saveFilePath) {
		// 加载模板(路径)数据
		config.setClassForTemplateLoading(this.getClass(), "");
		// 设置异常处理器 这样的话 即使没有属性也不会出错 如：${list.name}...不会报错
		config.setTemplateExceptionHandler(TemplateExceptionHandler.IGNORE_HANDLER);
		Template template = null;
		if (templateName.endsWith(".ftl")) {
			templateName = templateName.substring(0,
					templateName.indexOf(".ftl"));
		}
		try {
			template = config.getTemplate(templateName + ".ftl");
		} catch (TemplateNotFoundException e) {
			log.error("模板文件未找到", e);
			e.printStackTrace();
		} catch (MalformedTemplateNameException e) {
			log.error("模板类型不正确", e);
			e.printStackTrace();
		} catch (ParseException e) {
			log.error("解析模板出错，请检查模板格式", e);
			e.printStackTrace();
		} catch (IOException e) {
			log.error("IO读取失败", e);
			e.printStackTrace();
		}
		File outFile = new File(saveFilePath);
		if (!outFile.getParentFile().exists()) {
			outFile.getParentFile().mkdirs();
		}
		Writer out = null;
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(outFile);
		} catch (FileNotFoundException e) {
			log.error("输出文件时未找到文件", e);
			e.printStackTrace();
		}
		out = new BufferedWriter(new OutputStreamWriter(fos));
		// 将模板中的预先的代码替换为数据
		try {
			template.process(dataMap, out);
		} catch (TemplateException e) {
			log.error("填充模板时异常", e);
			e.printStackTrace();
		} catch (IOException e) {
			log.error("IO读取时异常", e);
			e.printStackTrace();
		}
		log.info("由模板文件：" + templateName + ".ftl" + " 生成文件 ：" + saveFilePath
				+ " 成功！！");
		try {
			out.close();// web项目不可关闭
		} catch (IOException e) {
			log.error("关闭Write对象出错", e);
			e.printStackTrace();
		}
	}

	/**
	 * 获得图片的Base64编码
	 * 
	 * @param imgFile
	 * @return
	 */
	public String getImageStr(String imgFile) {
		InputStream in = null;
		byte[] data = null;
		try {
			in = new FileInputStream(imgFile);
		} catch (FileNotFoundException e) {
			log.error("加载图片未找到", e);
			e.printStackTrace();
		}
		try {
			data = new byte[in.available()];
			// 注：FileInputStream.available()方法可以从输入流中阻断由下一个方法调用这个输入流中读取的剩余字节数
			in.read(data);
			in.close();
		} catch (IOException e) {
			log.error("IO操作图片错误", e);
			e.printStackTrace();
		}
		BASE64Encoder encoder = new BASE64Encoder();
		return encoder.encode(data);

	}

	public static List<IndoorEnvBean> initData(List<IndoorEnvBean> list) {
		IndoorEnvBean user = new IndoorEnvBean();
		user.setCheck_nm("1");
		user.setCheck_name("甲醛");
		user.setLimit_value("≤0.08mg/m³");
		user.setCheck_station("二十一层（A4-1）-（A4-3）/（A4-C）-（A4-E）");
		user.setCheck_point("1");
		user.setCheck_value("0.01");
		user.setCheck_average("—");
		user.setCheck_rtn("合格");
		list.add(user);

		IndoorEnvBean user2 = new IndoorEnvBean();
		user2.setCheck_nm("1");
		user2.setCheck_name("甲醛");
		user2.setLimit_value("≤0.08mg/m³");
		user2.setCheck_station("二十一层（A4-12）-（A4-14）/（A4-B）-（A4-D）");
		user2.setCheck_point("2");
		user2.setCheck_value("0.01");
		user2.setCheck_average("—");
		user2.setCheck_rtn("合格");
		list.add(user2);

		IndoorEnvBean user3 = new IndoorEnvBean();
		user3.setCheck_nm("1");
		user3.setCheck_name("甲醛");
		user3.setLimit_value("≤0.08mg/m³");
		user3.setCheck_station("二十一层（A4-25）-（A4-27）/（A4-B）-（A4-D）");
		user3.setCheck_point("3");
		user3.setCheck_value("0.01");
		user3.setCheck_average("—");
		user3.setCheck_rtn("合格");
		list.add(user3);

		IndoorEnvBean user4 = new IndoorEnvBean();
		user4.setCheck_nm("1");
		user4.setCheck_name("甲醛");
		user4.setLimit_value("≤0.08mg/m³");
		user4.setCheck_station("二十一层（A4-36）-（A4-38）/（A4-C）-（A4-E）");
		user4.setCheck_point("4");
		user4.setCheck_value("0.01");
		user4.setCheck_average("—");
		user4.setCheck_rtn("合格");
		list.add(user4);

		IndoorEnvBean user5 = new IndoorEnvBean();
		user5.setCheck_nm("1");
		user5.setCheck_name("甲醛");
		user5.setLimit_value("≤0.08mg/m³");
		user5.setCheck_station("十一层（A4-1）-（A4-3）/（A4-C）-（A4-E）");
		user5.setCheck_point("5");
		user5.setCheck_value("0.01");
		user5.setCheck_average("—");
		user5.setCheck_rtn("合格");
		list.add(user5);

		IndoorEnvBean user6 = new IndoorEnvBean();
		user6.setCheck_nm("1");
		user6.setCheck_name("甲醛");
		user6.setLimit_value("≤0.08mg/m³");
		user6.setCheck_station("十一层（A4-6）-（A4-8）/（A4-A）-（A4-B）");
		user6.setCheck_point("6");
		user6.setCheck_value("0.01");
		user6.setCheck_average("—");
		user6.setCheck_rtn("合格");
		list.add(user6);

		IndoorEnvBean user7 = new IndoorEnvBean();
		user7.setCheck_nm("1");
		user7.setCheck_name("甲醛");
		user7.setLimit_value("≤0.08mg/m³");
		user7.setCheck_station("十一层（A4-12）-（A4-14）/（A4-B）-（A4-D）");
		user7.setCheck_point("7");
		user7.setCheck_value("0.01");
		user7.setCheck_average("—");
		user7.setCheck_rtn("合格");
		list.add(user7);

		IndoorEnvBean user8 = new IndoorEnvBean();
		user8.setCheck_nm("1");
		user8.setCheck_name("甲醛");
		user8.setLimit_value("≤0.08mg/m³");
		user8.setCheck_station("十一层（A4-25）-（A4-27）/（A4-B）-（A4-D）");
		user8.setCheck_point("8");
		user8.setCheck_value("0.01");
		user8.setCheck_average("—");
		user8.setCheck_rtn("合格");
		list.add(user8);

		IndoorEnvBean user9 = new IndoorEnvBean();
		user9.setCheck_nm("1");
		user9.setCheck_name("甲醛");
		user9.setLimit_value("≤0.08mg/m³");
		user9.setCheck_station("十一层（A4-36）-（A4-38）/（A4-C）-（A4-E）");
		user9.setCheck_point("9");
		user9.setCheck_value("0.01");
		user9.setCheck_average("—");
		user9.setCheck_rtn("合格");
		list.add(user9);

		IndoorEnvBean user10 = new IndoorEnvBean();
		user10.setCheck_nm("1");
		user10.setCheck_name("甲醛");
		user10.setLimit_value("≤0.08mg/m³");
		user10.setCheck_station("四层（A4-1）-（A4-3）/（A4-C）-（A4-E）");
		user10.setCheck_point("10");
		user10.setCheck_value("0.01");
		user10.setCheck_average("—");
		user10.setCheck_rtn("合格");
		list.add(user10);

		IndoorEnvBean user11 = new IndoorEnvBean();
		user11.setCheck_nm("1");
		user11.setCheck_name("甲醛");
		user11.setLimit_value("≤0.08mg/m³");
		user11.setCheck_station("四层（A4-12）-（A4-14）/（A4-B）-（A4-D）");
		user11.setCheck_point("11");
		user11.setCheck_value("0.01");
		user11.setCheck_average("—");
		user11.setCheck_rtn("合格");
		list.add(user11);

		IndoorEnvBean user12 = new IndoorEnvBean();
		user12.setCheck_nm("1");
		user12.setCheck_name("甲醛");
		user12.setLimit_value("≤0.08mg/m³");
		user12.setCheck_station("四层（A4-25）-（A4-27）/（A4-B）-（A4-D）");
		user12.setCheck_point("12");
		user12.setCheck_value("0.01");
		user12.setCheck_average("—");
		user12.setCheck_rtn("合格");
		list.add(user12);

		IndoorEnvBean user13 = new IndoorEnvBean();
		user13.setCheck_nm("1");
		user13.setCheck_name("甲醛");
		user13.setLimit_value("≤0.08mg/m³");
		user13.setCheck_station("四层（A4-36）-（A4-38）/（A4-C）-（A4-E）");
		user13.setCheck_point("13");
		user13.setCheck_value("0.01");
		user13.setCheck_average("—");
		user13.setCheck_rtn("合格");
		list.add(user13);

		IndoorEnvBean user14 = new IndoorEnvBean();
		user14.setCheck_nm("1");
		user14.setCheck_name("甲醛");
		user14.setLimit_value("≤0.08mg/m³");
		user14.setCheck_station("首层（A4-31）-（A4-33）/（A4-0A）-（A4-B）");
		user14.setCheck_point("14");
		user14.setCheck_value("0.01");
		user14.setCheck_average("0.01");
		user14.setCheck_rtn("合格");
		list.add(user14);

		IndoorEnvBean user15 = new IndoorEnvBean();
		user15.setCheck_nm("1");
		user15.setCheck_name("甲醛");
		user15.setLimit_value("≤0.08mg/m³");
		user15.setCheck_station("首层（A4-31）-（A4-33）/（A4-0A）-（A4-B）");
		user15.setCheck_point("15");
		user15.setCheck_value("0.01");
		user15.setCheck_average("0.01");
		user15.setCheck_rtn("合格");
		list.add(user15);

		IndoorEnvBean user16 = new IndoorEnvBean();
		user16.setCheck_nm("1");
		user16.setCheck_name("甲醛");
		user16.setLimit_value("≤0.08mg/m³");
		user16.setCheck_station("首层（A4-01）-（A4-9）/（A4-K）-（A4-L）");
		user16.setCheck_point("16");
		user16.setCheck_value("0.01");
		user16.setCheck_average("0.01");
		user16.setCheck_rtn("合格");
		list.add(user16);

		IndoorEnvBean user17 = new IndoorEnvBean();
		user17.setCheck_nm("1");
		user17.setCheck_name("甲醛");
		user17.setLimit_value("≤0.08mg/m³");
		user17.setCheck_station("首层（A4-01）-（A4-9）/（A4-K）-（A4-L）");
		user17.setCheck_point("17");
		user17.setCheck_value("0.01");
		user17.setCheck_average("0.01");
		user17.setCheck_rtn("合格");
		list.add(user17);

		IndoorEnvBean user18 = new IndoorEnvBean();
		user18.setCheck_nm("1");
		user18.setCheck_name("甲醛");
		user18.setLimit_value("≤0.08mg/m³");
		user18.setCheck_station("首层（A4-01）-（A4-9）/（A4-K）-（A4-L）");
		user18.setCheck_point("18");
		user18.setCheck_value("0.01");
		user18.setCheck_average("0.01");
		user18.setCheck_rtn("合格");
		list.add(user18);

		return list;
	}

	public static List<IndoorEnvBean> checkList(List<IndoorEnvBean> list) {
		String start = "<w:vMerge w:val='restart'/>";
		String end = "<w:vMerge/>";

		for (int i = 0; i < list.size(); i++) {
			if (i == 0) {
				continue;
			}
			if (list.get(i).getCheck_nm().equals(list.get(i - 1).getCheck_nm())) {
				list.get(i).setCheck_nm_end(end);
				if (list.get(i - 1).getCheck_nm_end() == null) {
					list.get(i - 1).setCheck_nm_start(start);
				}
			}
			if (list.get(i).getCheck_name()
					.equals(list.get(i - 1).getCheck_name())) {
				list.get(i).setCheck_name_end(end);
				if (list.get(i - 1).getCheck_name_end() == null) {
					list.get(i - 1).setCheck_name_start(start);
				}
			}
			if (list.get(i).getLimit_value()
					.equals(list.get(i - 1).getLimit_value())) {
				list.get(i).setLimit_value_end(end);
				if (list.get(i - 1).getLimit_value_end() == null) {
					list.get(i - 1).setLimit_value_start(start);
				}
			}
			if (list.get(i).getCheck_station()
					.equals(list.get(i - 1).getCheck_station())) {
				list.get(i).setCheck_station_end(end);
				list.get(i).setCheck_average_end(end);
				if (list.get(i - 1).getCheck_station_end() == null) {
					list.get(i - 1).setCheck_station_start(start);
					list.get(i - 1).setCheck_average_start(start);
				}
			}
//			if (list.get(i).getCheck_average()
//					.equals(list.get(i - 1).getCheck_average())) {
//				list.get(i).setCheck_average_end(end);
//				if (list.get(i - 1).getCheck_average_end() == null) {
//					list.get(i - 1).setCheck_average_start(start);
//				}
//			}
		}

		return list;
	}

	public static void main(String[] args) {
		ExportMyWord emw = new ExportMyWord();
		Map<String, Object> dataMap = new HashMap<String, Object>();
		dataMap.put("tlhf_name", "北京天朗汇丰环境检测有限公司");
		dataMap.put("entrusted_name", "华瀚投资集团有限公司");
		dataMap.put("obj_name", "朝阳区东坝驹东经济适用房A地块项目（A-1经适房住宅楼及裙房等17项）—A-4经适房住宅楼及裙房");
		dataMap.put("const_name", "华瀚投资集团有限公司");
		dataMap.put("design_name", "北京冠亚伟业民用建筑设计有限公司");
		dataMap.put("const_unit_name", "北京市朝阳田华建筑集团公司");
		dataMap.put("supervision_name", "北京旭日明工程管理有限公司");
		dataMap.put("struc_type", "钢筋混凝土剪力墙");
		dataMap.put("level", "地上22层、地下1层");
		dataMap.put("area", "16616.11");
		dataMap.put("check_type", "I类");
		dataMap.put("bh_year", "2019");
		dataMap.put("bh_nm", "0111-04");
		dataMap.put("qf_year", "2019");
		dataMap.put("qf_month", "04");
		dataMap.put("qf_day", "12");
		dataMap.put("obj_addr", "朝阳区东坝乡");
		dataMap.put("check_list", "甲醛、氨、苯、TVOC、氡 ");
		dataMap.put("conclusion", "符合");

		List<IndoorEnvBean> userList = new ArrayList<IndoorEnvBean>();
		userList = initData(userList);

		dataMap.put("items", checkList(userList));

		emw.createWord(dataMap, "室内环境质量_test.ftl", "C:\\work\\test\\demo23.doc");
	}
}
