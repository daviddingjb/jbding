<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<div style="padding: 0px 0px 0px;" class="wrapper">
	<s:form action="pact_toadd" method="post">
		<table id="oTable" border="1" style='border:1px solid #aaa'>
			<tbody>
				<tr>
					<td style="background-color:#eeeeee;font-weight:bold">&nbsp;公司名称&nbsp;</td>
					<td colspan="7">
						<input name="basic.tlhf_name" id="tlhf_name" value="北京天朗汇丰环境检测有限公司" readonly="readonly" style="background-color:#eeeeee; width: 100%; height: 100%"/>
					</td>
				</tr>
				<tr>
					<td style="background-color:#eeeeee;font-weight:bold">&nbsp;委托编号&nbsp;</td>
					<td colspan="7">
						<input type="text" name="basic.entrusted_id" id="entrusted_id" style="width: 100%; height: 100%">
					</td>
				</tr>
				<tr>
					<td style="background-color:#eeeeee;font-weight:bold">&nbsp;委托单位（人）&nbsp;</td>
					<td colspan="7">
						<input type="text" name="basic.entrusted_name" id="entrusted_name" style="width: 100%; height: 100%">
					</td>
				</tr>
				<tr>
					<td style="background-color:#eeeeee;font-weight:bold">&nbsp;工程名称&nbsp;</td>
					<td colspan="7">
						<input type="text" name="basic.obj_name" id="obj_name" style="width: 100%; height: 100%">
					</td>
				</tr>
				<tr>
					<td style="background-color:#eeeeee;font-weight:bold">&nbsp;工程地址&nbsp;</td>
					<td colspan="7">
						<input type="text" name="basic.obj_addr" id="obj_addr" style="width: 100%; height: 100%">
					</td>
				</tr>
				<tr>
					<td style="background-color:#eeeeee;font-weight:bold">&nbsp;建设单位&nbsp;</td>
					<td colspan="7">
						<input type="text" name="basic.const_name" id="const_name" style="width: 100%; height: 100%">
					</td>
				</tr>
				<tr>
					<td style="background-color:#eeeeee;font-weight:bold">&nbsp;设计单位&nbsp;</td>
					<td colspan="7">
						<input type="text" name="basic.design_name" id="design_name" style="width: 100%; height: 100%">
					</td>
				</tr>
				<tr>
					<td style="background-color:#eeeeee;font-weight:bold">&nbsp;施工单位&nbsp;</td>
					<td colspan="7">
						<input type="text" name="basic.const_unit_name" id="const_unit_name" style="width: 100%; height: 100%">
					</td>
				</tr>
				<tr>
					<td style="background-color:#eeeeee;font-weight:bold">&nbsp;监理单位&nbsp;</td>
					<td colspan="7">
						<input type="text" name="basic.supervision_name" id="supervision_name" style="width: 100%; height: 100%">
					</td>
				</tr>
				<tr>
					<td style="background-color:#eeeeee;font-weight:bold">&nbsp;结构类型&nbsp;</td>
					<td>
						<input type="text" name="basic.struc_type" id="struc_type" style="width: 100%; height: 100%">
					</td>
					<td style="background-color:#eeeeee;font-weight:bold">&nbsp;建筑面积&nbsp;</td>
					<td>
						<input type="text" name="basic.area" id="area" style="width: 100%; height: 100%">
					</td>
					<td style="background-color:#eeeeee;font-weight:bold">&nbsp;采样大气压&nbsp;</td>
					<td>
						<input type="text" name="basic.pressure" id="pressure" style="width: 100%; height: 100%">
					</td>
					<td style="background-color:#eeeeee;font-weight:bold">&nbsp;采样日期&nbsp;</td>
					<td>
						&nbsp;<input name="basic.sampling_dt" id="sampling_dt" type="date" value=""/>
					</td>
				</tr>
				<tr>
					<td style="background-color:#eeeeee;font-weight:bold">&nbsp;检测类别&nbsp;</td>
					<td>
						&nbsp;<input name="basic.check_type" type="radio">&nbsp;委托检测&nbsp;&nbsp;
						&nbsp;<input name="basic.check_type" type="radio">&nbsp;工程检测&nbsp;&nbsp;
					</td>
					<td style="background-color:#eeeeee;font-weight:bold">&nbsp;封闭时间&nbsp;</td>
					<td>
						&nbsp;<input name="basic.sealed_time" type="radio">&nbsp;1小时&nbsp;&nbsp;
						&nbsp;<input name="basic.sealed_time" type="radio">&nbsp;12小时&nbsp;&nbsp;
					</td>
					<td style="background-color:#eeeeee;font-weight:bold">&nbsp;采样湿度&nbsp;</td>
					<td>
						<input type="text" name="basic.sampling_temperature" id="sampling_temperature" style="width: 100%; height: 100%">
					</td>
					<td style="background-color:#eeeeee;font-weight:bold">&nbsp;检测日期&nbsp;</td>
					<td>
						&nbsp;<input name="basic.check_dt" id="check_dt" type="date" value=""/>
					</td>
				</tr>
				<tr>
					<td style="background-color:#eeeeee;font-weight:bold">&nbsp;检测依据及方法&nbsp;</td>
					<td colspan="7">
						&nbsp;<input name="basic.check_depend" type="radio">&nbsp;GB50325-2010(2013年版)《民用建筑工程室内环境污染控制规范》&nbsp;&nbsp;
						<p></p>
						&nbsp;<input name="basic.check_depend" type="radio">&nbsp;DB11/T1445-2017《民用建筑工程室内环境污染控制规程》&nbsp;&nbsp;
						<p></p>
						&nbsp;<input name="basic.check_depend" type="radio">&nbsp;GB50411-2007《建筑节能工程施工质量验收规范》&nbsp;&nbsp;
						<p></p>
						&nbsp;<input name="basic.check_depend" type="radio">&nbsp;GB18883-2002&nbsp;&nbsp;
					</td>
				</tr>
				<tr>
					<td style="background-color:#eeeeee;font-weight:bold">&nbsp;主要检测设备&nbsp;</td>
					<td colspan="7">
						<input type="text" name="basic.check_device" id="check_device" value="GC-8600气相色谱仪（YQSB-008）；7230G型可见分光光度计（YQSB-013）；" style="width: 100%; height: 100%">
					</td>
				</tr>
				<tr>
					<td style="background-color:#eeeeee;font-weight:bold">&nbsp;甲醛检测标准&nbsp;</td>
					<td>
						<input type="text" name="basic.jiaquan_criteria" id="jiaquan_criteria" value="0.15" style="width: 100%; height: 100%">
					</td>
					<td colspan="6">
						&nbsp;&nbsp;<input name="basic.jiaquan_check" type="radio">&nbsp;需要检测
						&nbsp;&nbsp;<input name="basic.jiaquan_check" type="radio">&nbsp;不检
					</td>
				</tr>
				<tr>
					<td style="background-color:#eeeeee;font-weight:bold">&nbsp;氨气检测标准&nbsp;</td>
					<td>
						<input type="text" name="basic.dan_criteria" id="dan_criteria" value="0.12" style="width: 100%; height: 100%">
					</td>
					<td colspan="6">
						&nbsp;&nbsp;<input name="basic.dan_check" type="radio">&nbsp;需要检测
						&nbsp;&nbsp;<input name="basic.dan_check" type="radio">&nbsp;不检
					</td>
				</tr>
				<tr>
					<td style="background-color:#eeeeee;font-weight:bold">&nbsp;苯检测标准&nbsp;</td>
					<td>
						<input type="text" name="basic.ben_criteria" id="ben_criteria" value="0.14" style="width: 100%; height: 100%">
					</td>
					<td colspan="6">
						&nbsp;&nbsp;<input name="basic.ben_check" type="radio">&nbsp;需要检测
						&nbsp;&nbsp;<input name="basic.ben_check" type="radio">&nbsp;不检
					</td>
				</tr>
				<tr>
					<td style="background-color:#eeeeee;font-weight:bold">&nbsp;TVOC检测标准&nbsp;</td>
					<td>
						<input type="text" name="basic.tvoc_criteria" id="tvoc_criteria" value="0.16" style="width: 100%; height: 100%">
					</td>
					<td colspan="6">
						&nbsp;&nbsp;<input name="basic.tvoc_check" type="radio">&nbsp;需要检测
						&nbsp;&nbsp;<input name="basic.tvoc_check" type="radio">&nbsp;不检
					</td>
				</tr>
				<tr>
					<td style="background-color:#eeeeee;font-weight:bold">&nbsp;氡检测标准&nbsp;</td>
					<td>
						<input type="text" name="basic.dong_criteria" id="dong_criteria" value="0.13" style="width: 100%; height: 100%">
					</td>
					<td colspan="6">
						&nbsp;&nbsp;<input name="basic.dong_check" type="radio">&nbsp;需要检测
						&nbsp;&nbsp;<input name="basic.dong_check" type="radio">&nbsp;不检
					</td>
				</tr>
				<tr>
					<td style="background-color:#eeeeee;font-weight:bold">&nbsp;检测位置1&nbsp;</td>
					<td colspan="7">
						<input type="text" name="basic.check_station1" id="check_station1" value="" style="width: 100%; height: 100%">
					</td>
				</tr>
			</tbody>
		</table>
		
		<input type="button" onClick="addRow();" style="font-size:16px;" value="添加检测位置"/>
		
		<div class="row">
			<div class="col-xs-12">
				<input type="submit" class="button-finally" value="保存" />
			</div>
		</div>
	</s:form>
</div>
<script>
	function addRow(){
		var oTable = document.getElementById("oTable");
		var tBodies = oTable.tBodies;
		var tbody = tBodies[0];
		var tr = tbody.insertRow(tbody.rows.length);
		var td_1 = tr.insertCell(0);
		var idx = tbody.rows.length -18;
		td_1.innerHTML = "&nbsp;检测位置"+idx+"&nbsp;";
		td_1.style = "background-color:#eeeeee;font-weight:bold";
		var td_2 = tr.insertCell(1);
		td_2.colSpan = "7";
		td_2.innerHTML = "<input type=\"text\" name=\"basic.check_station" + idx + "\" id=\"check_station" + idx + "\" value='' style='width: 100%; height: 100%'>";
	}
</script>
<!-- 
<script src="${pageContext.request.contextPath}/js/add.js"></script>
 -->
