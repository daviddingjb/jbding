<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<link rel="stylesheet" href="${pageContext.request.contextPath}/style/css/bootstrap.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/report.css">

<div style="padding: 20px 20px 10px;" class="wrapper">
	<s:form action="tdata_toadd" method="post">
		<div class="con_center">
			<h3>检测数据录入</h3>
		</div>
		<div>
			委托编号： <input type="text" name="tdata.entrusted_id" id="entrusted_id" class="width150">
		</div>
		<table border="1" style='border:1px solid #aaa'>
			<tbody>
				<tr>
					<td colspan='5'>检测项目&nbsp;
						<select name="tdata.entity_name" id="entity_name" style="width: 90%; height: 100%" onchange="changeValue();">
							<option value="--">--</option>
							<option value="甲醛检测数据">甲醛检测数据</option>
							<option value="氨气检测数据">氨气检测数据</option>
							<option value="苯检测数据">苯检测数据</option>
							<option value="TVOC检测数据">TVOC检测数据</option>
							<option value="氡检测数据">氡检测数据</option>
						</select>
					</td>
					<td>&nbsp;西北&nbsp;</td>
					<td>&nbsp;西南&nbsp;</td>
					<td>&nbsp;中间&nbsp;</td>
					<td>&nbsp;东北&nbsp;</td>
					<td>&nbsp;东南&nbsp;</td>
				</tr>
				<tr>
					<td>&nbsp;位置1&nbsp;</td>
					<td colspan='4'><input type="text" name="tdata.sta_1_name" id="sta_1_name" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_1_xibei" id="sta_1_xibei" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_1_xinan" id="sta_1_xinan" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_1_zjian" id="sta_1_zjian" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_1_donan" id="sta_1_donan" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_1_dobei" id="sta_1_dobei" style="width: 100%; height: 100%"></td>
				</tr>
				<tr>
					<td>&nbsp;位置2&nbsp;</td>
					<td colspan='4'><input type="text" name="tdata.sta_2_name" id="sta_2_name" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_2_xibei" id="sta_2_xibei" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_2_xinan" id="sta_2_xinan" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_2_zjian" id="sta_2_zjian" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_2_donan" id="sta_2_donan" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_2_dobei" id="sta_2_dobei" style="width: 100%; height: 100%"></td>
				</tr>
				<tr>
					<td>&nbsp;位置3&nbsp;</td>
					<td colspan='4'><input type="text" name="tdata.sta_3_name" id="sta_3_name" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_3_xibei" id="sta_3_xibei" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_3_xinan" id="sta_3_xinan" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_3_zjian" id="sta_3_zjian" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_3_donan" id="sta_3_donan" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_3_dobei" id="sta_3_dobei" style="width: 100%; height: 100%"></td>
				</tr>
				<tr>
					<td>&nbsp;位置4&nbsp;</td>
					<td colspan='4'><input type="text" name="tdata.sta_4_name" id="sta_4_name" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_4_xibei" id="sta_4_xibei" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_4_xinan" id="sta_4_xinan" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_4_zjian" id="sta_4_zjian" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_4_donan" id="sta_4_donan" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_4_dobei" id="sta_4_dobei" style="width: 100%; height: 100%"></td>
				</tr>
				<tr>
					<td>&nbsp;位置5&nbsp;</td>
					<td colspan='4'><input type="text" name="tdata.sta_5_name" id="sta_5_name" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_5_xibei" id="sta_5_xibei" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_5_xinan" id="sta_5_xinan" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_5_zjian" id="sta_5_zjian" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_5_donan" id="sta_5_donan" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_5_dobei" id="sta_5_dobei" style="width: 100%; height: 100%"></td>
				</tr>
				<tr>
					<td>&nbsp;位置6&nbsp;</td>
					<td colspan='4'><input type="text" name="tdata.sta_6_name" id="sta_6_name" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_6_xibei" id="sta_6_xibei" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_6_xinan" id="sta_6_xinan" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_6_zjian" id="sta_6_zjian" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_6_donan" id="sta_6_donan" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_6_dobei" id="sta_6_dobei" style="width: 100%; height: 100%"></td>
				</tr>
				<tr>
					<td>&nbsp;位置7&nbsp;</td>
					<td colspan='4'><input type="text" name="tdata.sta_7_name" id="sta_7_name" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_7_xibei" id="sta_7_xibei" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_7_xinan" id="sta_7_xinan" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_7_zjian" id="sta_7_zjian" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_7_donan" id="sta_7_donan" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_7_dobei" id="sta_7_dobei" style="width: 100%; height: 100%"></td>
				</tr>
				<tr>
					<td>&nbsp;位置8&nbsp;</td>
					<td colspan='4'><input type="text" name="tdata.sta_8_name" id="sta_8_name" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_8_xibei" id="sta_8_xibei" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_8_xinan" id="sta_8_xinan" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_8_zjian" id="sta_8_zjian" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_8_donan" id="sta_8_donan" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_8_dobei" id="sta_8_dobei" style="width: 100%; height: 100%"></td>
				</tr>
				<tr>
					<td>&nbsp;位置9&nbsp;</td>
					<td colspan='4'><input type="text" name="tdata.sta_9_name" id="sta_9_name" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_9_xibei" id="sta_9_xibei" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_9_xinan" id="sta_9_xinan" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_9_zjian" id="sta_9_zjian" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_9_donan" id="sta_9_donan" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_9_dobei" id="sta_9_dobei" style="width: 100%; height: 100%"></td>
				</tr>
				<tr>
					<td>&nbsp;位置10&nbsp;</td>
					<td colspan='4'><input type="text" name="tdata.sta_10_name" id="sta_10_name" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_10_xibei" id="sta_10_xibei" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_10_xinan" id="sta_10_xinan" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_10_zjian" id="sta_10_zjian" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_10_donan" id="sta_10_donan" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_10_dobei" id="sta_10_dobei" style="width: 100%; height: 100%"></td>
				</tr>
				<tr>
					<td>&nbsp;位置11&nbsp;</td>
					<td colspan='4'><input type="text" name="tdata.sta_11_name" id="sta_11_name" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_11_xibei" id="sta_11_xibei" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_11_xinan" id="sta_11_xinan" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_11_zjian" id="sta_11_zjian" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_11_donan" id="sta_11_donan" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_11_dobei" id="sta_11_dobei" style="width: 100%; height: 100%"></td>
				</tr>
				<tr>
					<td>&nbsp;位置12&nbsp;</td>
					<td colspan='4'><input type="text" name="tdata.sta_12_name" id="sta_12_name" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_12_xibei" id="sta_12_xibei" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_12_xinan" id="sta_12_xinan" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_12_zjian" id="sta_12_zjian" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_12_donan" id="sta_12_donan" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_12_dobei" id="sta_12_dobei" style="width: 100%; height: 100%"></td>
				</tr>
				<tr>
					<td>&nbsp;位置13&nbsp;</td>
					<td colspan='4'><input type="text" name="tdata.sta_13_name" id="sta_13_name" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_13_xibei" id="sta_13_xibei" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_13_xinan" id="sta_13_xinan" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_13_zjian" id="sta_13_zjian" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_13_donan" id="sta_13_donan" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_13_dobei" id="sta_13_dobei" style="width: 100%; height: 100%"></td>
				</tr>
				<tr>
					<td>&nbsp;位置14&nbsp;</td>
					<td colspan='4'><input type="text" name="tdata.sta_14_name" id="sta_14_name" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_14_xibei" id="sta_14_xibei" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_14_xinan" id="sta_14_xinan" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_14_zjian" id="sta_14_zjian" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_14_donan" id="sta_14_donan" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_14_dobei" id="sta_14_dobei" style="width: 100%; height: 100%"></td>
				</tr>
				<tr>
					<td>&nbsp;位置15&nbsp;</td>
					<td colspan='4'><input type="text" name="tdata.sta_15_name" id="sta_15_name" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_15_xibei" id="sta_15_xibei" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_15_xinan" id="sta_15_xinan" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_15_zjian" id="sta_15_zjian" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_15_donan" id="sta_15_donan" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_15_dobei" id="sta_15_dobei" style="width: 100%; height: 100%"></td>
				</tr>
				<tr>
					<td>&nbsp;位置16&nbsp;</td>
					<td colspan='4'><input type="text" name="tdata.sta_16_name" id="sta_16_name" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_16_xibei" id="sta_16_xibei" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_16_xinan" id="sta_16_xinan" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_16_zjian" id="sta_16_zjian" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_16_donan" id="sta_16_donan" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_16_dobei" id="sta_16_dobei" style="width: 100%; height: 100%"></td>
				</tr>
				<tr>
					<td>&nbsp;位置17&nbsp;</td>
					<td colspan='4'><input type="text" name="tdata.sta_17_name" id="sta_17_name" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_17_xibei" id="sta_17_xibei" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_17_xinan" id="sta_17_xinan" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_17_zjian" id="sta_17_zjian" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_17_donan" id="sta_17_donan" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_17_dobei" id="sta_17_dobei" style="width: 100%; height: 100%"></td>
				</tr>
				<tr>
					<td>&nbsp;位置18&nbsp;</td>
					<td colspan='4'><input type="text" name="tdata.sta_18_name" id="sta_18_name" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_18_xibei" id="sta_18_xibei" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_18_xinan" id="sta_18_xinan" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_18_zjian" id="sta_18_zjian" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_18_donan" id="sta_18_donan" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_18_dobei" id="sta_18_dobei" style="width: 100%; height: 100%"></td>
				</tr>
				<tr>
					<td>&nbsp;位置19&nbsp;</td>
					<td colspan='4'><input type="text" name="tdata.sta_19_name" id="sta_19_name" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_19_xibei" id="sta_19_xibei" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_19_xinan" id="sta_19_xinan" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_19_zjian" id="sta_19_zjian" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_19_donan" id="sta_19_donan" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_19_dobei" id="sta_19_dobei" style="width: 100%; height: 100%"></td>
				</tr>
				<tr>
					<td>&nbsp;位置20&nbsp;</td>
					<td colspan='4'><input type="text" name="tdata.sta_20_name" id="sta_20_name" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_20_xibei" id="sta_20_xibei" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_20_xinan" id="sta_20_xinan" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_20_zjian" id="sta_20_zjian" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_20_donan" id="sta_20_donan" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_20_dobei" id="sta_20_dobei" style="width: 100%; height: 100%"></td>
				</tr>
				<tr>
					<td>&nbsp;位置21&nbsp;</td>
					<td colspan='4'><input type="text" name="tdata.sta_21_name" id="sta_21_name" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_21_xibei" id="sta_21_xibei" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_21_xinan" id="sta_21_xinan" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_21_zjian" id="sta_21_zjian" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_21_donan" id="sta_21_donan" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_21_dobei" id="sta_21_dobei" style="width: 100%; height: 100%"></td>
				</tr>
				<tr>
					<td>&nbsp;位置22&nbsp;</td>
					<td colspan='4'><input type="text" name="tdata.sta_22_name" id="sta_22_name" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_22_xibei" id="sta_22_xibei" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_22_xinan" id="sta_22_xinan" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_22_zjian" id="sta_22_zjian" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_22_donan" id="sta_22_donan" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_22_dobei" id="sta_22_dobei" style="width: 100%; height: 100%"></td>
				</tr>
				<tr>
					<td>&nbsp;位置23&nbsp;</td>
					<td colspan='4'><input type="text" name="tdata.sta_23_name" id="sta_23_name" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_23_xibei" id="sta_23_xibei" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_23_xinan" id="sta_23_xinan" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_23_zjian" id="sta_23_zjian" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_23_donan" id="sta_23_donan" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_23_dobei" id="sta_23_dobei" style="width: 100%; height: 100%"></td>
				</tr>
				<tr>
					<td>&nbsp;位置24&nbsp;</td>
					<td colspan='4'><input type="text" name="tdata.sta_24_name" id="sta_24_name" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_24_xibei" id="sta_24_xibei" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_24_xinan" id="sta_24_xinan" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_24_zjian" id="sta_24_zjian" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_24_donan" id="sta_24_donan" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_24_dobei" id="sta_24_dobei" style="width: 100%; height: 100%"></td>
				</tr>
				<tr>
					<td>&nbsp;位置25&nbsp;</td>
					<td colspan='4'><input type="text" name="tdata.sta_25_name" id="sta_25_name" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_25_xibei" id="sta_25_xibei" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_25_xinan" id="sta_25_xinan" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_25_zjian" id="sta_25_zjian" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_25_donan" id="sta_25_donan" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_25_dobei" id="sta_25_dobei" style="width: 100%; height: 100%"></td>
				</tr>
				<tr>
					<td>&nbsp;位置26&nbsp;</td>
					<td colspan='4'><input type="text" name="tdata.sta_26_name" id="sta_26_name" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_26_xibei" id="sta_26_xibei" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_26_xinan" id="sta_26_xinan" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_26_zjian" id="sta_26_zjian" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_26_donan" id="sta_26_donan" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_26_dobei" id="sta_26_dobei" style="width: 100%; height: 100%"></td>
				</tr>
				<tr>
					<td>&nbsp;位置27&nbsp;</td>
					<td colspan='4'><input type="text" name="tdata.sta_27_name" id="sta_27_name" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_27_xibei" id="sta_27_xibei" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_27_xinan" id="sta_27_xinan" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_27_zjian" id="sta_27_zjian" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_27_donan" id="sta_27_donan" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_27_dobei" id="sta_27_dobei" style="width: 100%; height: 100%"></td>
				</tr>
				<tr>
					<td>&nbsp;位置28&nbsp;</td>
					<td colspan='4'><input type="text" name="tdata.sta_28_name" id="sta_28_name" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_28_xibei" id="sta_28_xibei" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_28_xinan" id="sta_28_xinan" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_28_zjian" id="sta_28_zjian" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_28_donan" id="sta_28_donan" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_28_dobei" id="sta_28_dobei" style="width: 100%; height: 100%"></td>
				</tr>
				<tr>
					<td>&nbsp;位置29&nbsp;</td>
					<td colspan='4'><input type="text" name="tdata.sta_29_name" id="sta_29_name" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_29_xibei" id="sta_29_xibei" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_29_xinan" id="sta_29_xinan" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_29_zjian" id="sta_29_zjian" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_29_donan" id="sta_29_donan" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_29_dobei" id="sta_29_dobei" style="width: 100%; height: 100%"></td>
				</tr>
				<tr>
					<td>&nbsp;位置30&nbsp;</td>
					<td colspan='4'><input type="text" name="tdata.sta_30_name" id="sta_30_name" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_30_xibei" id="sta_30_xibei" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_30_xinan" id="sta_30_xinan" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_30_zjian" id="sta_30_zjian" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_30_donan" id="sta_30_donan" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdata.sta_30_dobei" id="sta_30_dobei" style="width: 100%; height: 100%"></td>
				</tr>
				
			</tbody>
		</table>
		<div class="row">
			<div class="col-xs-12">
				<input type="submit" class="button-finally" value="保存" />
			</div>
		</div>
	</s:form>
</div>
<!-- 
<script src="${pageContext.request.contextPath}/js/add.js"></script>
 -->
