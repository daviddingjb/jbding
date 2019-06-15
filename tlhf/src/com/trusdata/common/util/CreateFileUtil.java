package com.trusdata.common.util;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


/**
 * 
 * @author JBDING
 * 
 */
public class CreateFileUtil {
	
	public static void createExcel() throws Exception {
		// 创建 Excel 文件的输入流对象
		FileInputStream excelFileInputStream = new FileInputStream("src/com/trusdata/common/util/demo.xls");
		// XSSFWorkbook 就代表一个 Excel 文件
		// 创建其对象，就打开这个 Excel 文件
		XSSFWorkbook workbook = new XSSFWorkbook(excelFileInputStream);
		// 输入流使用后，及时关闭！这是文件流操作中极好的一个习惯！
		excelFileInputStream.close();
		// XSSFSheet 代表 Excel 文件中的一张表格
		// 我们通过 getSheetAt(0) 指定表格索引来获取对应表格
		// 注意表格索引从 0 开始！
		XSSFSheet sheet = workbook.getSheetAt(0);
	}
	
	public static void main(String[] args) {
		try {
			createExcel();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
