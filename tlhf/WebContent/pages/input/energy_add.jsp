<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<link rel="stylesheet" href="${pageContext.request.contextPath}/style/css/bootstrap.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/report.css">

<div style="padding: 20px 20px 10px;" class="wrapper">
	<s:form action="energy_toadd" method="post">
		<div class="con_center">
			<h3>系统节能检测协议书</h3>
		</div>
		<div>
			委托编号： <input type="text" name="energy.entrusted_id" id="entrusted_id" class="width150">
		</div>
		<div>
			委托单位（盖章）：
			<select name="energy.entrusted_chop" id="entrusted_chop" class="width40">
				<option value="--" selected="selected">--</option>
				<option value="有">有</option>
				<option value="无">无</option>
			</select>
			委托人 （签字） ：&nbsp;
			<select name="energy.entrusted_signature" id="entrusted_signature" class="width40">
				<option value="--" selected="selected">--</option>
				<option value="有">有</option>
				<option value="无">无</option>
			</select>
			委托日期 ：<input name="energy.entrusted_date" id="entrusted_date" type="date" value=""/>
		</div>
		<div>
			检测单位（盖章）：
			<select name="energy.test_chop" id="test_chop" class="width40">
				<option value="--" selected="selected">--</option>
				<option value="有">有</option>
				<option value="无">无</option>
			</select>
			授权代表（签字）：
			<select name="energy.test_signature" id="test_signature" class="width40">
				<option value="--" selected="selected">--</option>
				<option value="有">有</option>
				<option value="无">无</option>
			</select>
			受理日期 ：<input name="energy.test_date"  id="test_date" type="date" value=""/>
		</div>
		<table border="1" style='border:1px solid #aaa'>
			<tbody>
				<tr>
					<td rowspan='28'>&nbsp;委托单位填写&nbsp;</td>
					<td>&nbsp;委托日期&nbsp;</td>
					<td>
						<input name="energy.entrusted_date1" id="entrusted_date1" type="date" value=""/>
					</td>
					<td>&nbsp;委托人&nbsp;</td>
					<td>
						<input type="text" name="energy.settler" id="settler" style="width: 100%; height: 100%">
					</td>
					<td>&nbsp;联系人&nbsp;</td>
					<td>
						<input type="text" name="energy.contract_name" id="contract_name" style="width: 100%; height: 100%">
					</td>
					<td>&nbsp;联系电话&nbsp;</td>
					<td>
						<input type="text" name="energy.contact_call" id="contact_call" style="width: 100%; height: 100%">
					</td>
				</tr>
				<tr>
					<td>&nbsp;委托单位&nbsp;</td>
					<td colspan="7">
						<input type="text" name="energy.entrusted_settler" id="entrusted_settler" style="width: 100%; height: 100%">
					</td>
				</tr>
				<tr>
					<td>&nbsp;工程名称&nbsp;</td>
					<td colspan='7'>
						<input type="text" name="energy.obj_name" id="obj_name" style="width: 100%; height: 100%">
					</td>
				</tr>
				<tr>
					<td>&nbsp;工程地址&nbsp;</td>
					<td colspan='7'>
						<input type="text" name="energy.obj_addr" id="obj_addr" style="width: 100%; height: 100%">
					</td>
				</tr>
				<tr>
					<td>&nbsp;建设单位&nbsp;</td>
					<td colspan='7'>
						<input type="text" name="energy.construction" id="construction" style="width: 100%; height: 100%">
					</td>
				</tr>
				<tr>
					<td>&nbsp;施工单位&nbsp;</td>
					<td colspan='7'>
						<input type="text" name="energy.construction_unit" id="construction_unit" style="width: 100%; height: 100%">
					</td>
				</tr>
				<tr>
					<td>&nbsp;设计单位&nbsp;</td>
					<td colspan='7'>
						<input type="text" name="energy.design_unit" id="design_unit" style="width: 100%; height: 100%">
					</td>
				</tr>
				<tr>
					<td>&nbsp;监理单位&nbsp;</td>
					<td colspan='7'>
						<input type="text" name="energy.supervision_unit" id="supervision_unit" style="width: 100%; height: 100%">
					</td>
				</tr>
				<tr>
					<td>&nbsp;检测类别&nbsp;</td>
					<td colspan='7'>
						&nbsp;<input name="energy.delegate_detection" type="checkbox">&nbsp;委托检测&nbsp;&nbsp;
						&nbsp;<input name="energy.pro_acceptance" type="checkbox">&nbsp;工程验收&nbsp;&nbsp;
						&nbsp;<input name="energy.check_other" type="checkbox">&nbsp;其它&nbsp;&nbsp;
					</td>
				</tr>
				<tr>
					<td>&nbsp;检测依据&nbsp;</td>
					<td colspan='7'>GB50411-2007《建筑节能工程施工质量验收规范》
					</td>
				</tr>
				<tr>
					<td>&nbsp;设计要求&nbsp;</td>
					<td colspan='7'>
						<input type="text" name="energy.design_req" id="design_req" style="width: 100%; height: 100%">
					</td>
				</tr>
				<tr>
					<td>&nbsp;图纸&nbsp;</td>
					<td colspan='7'>
						&nbsp;<input name="energy.drawings_heating" type="checkbox">&nbsp;暖通图&nbsp;&nbsp;
						&nbsp;<input name="energy.drawings_lighting" type="checkbox">&nbsp;照明电气图&nbsp;&nbsp;
						&nbsp;<input name="energy.drawings_wind" type="checkbox">&nbsp;通风系统图&nbsp;&nbsp;
						&nbsp;<input name="energy.drawings_ac" type="checkbox">&nbsp;空调系统图&nbsp;&nbsp;
						&nbsp;<input name="energy.drawings_building" type="checkbox">&nbsp;建筑平面图&nbsp;&nbsp;
						&nbsp;<input name="energy.drawings_other" type="checkbox">&nbsp;其他&nbsp;&nbsp;
					</td>
				</tr>
				<tr>
					<td>&nbsp;其他资料&nbsp;</td>
					<td colspan='7'>
						<input type="text" name="energy.doc_other" id="doc_other" style="width: 100%; height: 100%">
					</td>
				</tr>
				<tr>
					<td rowspan='10'>&nbsp;检测项目&nbsp;</td>
					<td colspan='2'>
						&nbsp;<input name="energy.test_1" type="checkbox">&nbsp;室内温度&nbsp;&nbsp;
					</td>
					<td rowspan='10'>&nbsp;检测方法&nbsp;</td>
					<td rowspan='2' colspan='4'>&nbsp;<input name="energy.test_way_1" type="checkbox">&nbsp;JGJ/T132-2009《居住建筑节能检测标准》&nbsp;&nbsp;</td>
				</tr>
				<tr><td colspan='2'>&nbsp;<input name="energy.test_2" type="checkbox">&nbsp;供热系统室外管网的水力平衡度&nbsp;&nbsp;</td></tr>
				<tr><td colspan='2'>&nbsp;<input name="energy.test_3" type="checkbox">&nbsp;供热系统的补水率&nbsp;&nbsp;</td><td rowspan='2' colspan='4'>&nbsp;<input name="energy.test_way_2" type="checkbox">&nbsp;DB11/T555-2015《民用建筑节能工程现场检验标准》&nbsp;&nbsp;</td></tr>
				<tr><td colspan='2'>&nbsp;<input name="energy.test_4" type="checkbox">&nbsp;室外管网的热输送效率&nbsp;&nbsp;</td></tr>
				<tr><td colspan='2'>&nbsp;<input name="energy.test_5" type="checkbox">&nbsp;各风口风量&nbsp;&nbsp;</td><td rowspan='2' colspan='4'>&nbsp;<input name="energy.test_way_3" type="checkbox">&nbsp;JGJ/T177-2009《公共建筑节能检测标准》&nbsp;&nbsp;</td></tr>
				<tr><td colspan='2'>&nbsp;<input name="energy.test_6" type="checkbox">&nbsp;通风与空调系统的总风量&nbsp;&nbsp;</td></tr>
				<tr><td colspan='2'>&nbsp;<input name="energy.test_7" type="checkbox">&nbsp;空调机组的水流量&nbsp;&nbsp;</td><td rowspan='3' colspan='4'>&nbsp;<input name="energy.test_way_4" type="checkbox">&nbsp;GB/T5700-2008《照明测量方法》&nbsp;&nbsp;</td></tr>
				<tr><td colspan='2'>&nbsp;<input name="energy.test_8" type="checkbox">&nbsp;空调系统冷热水、冷却水总流量&nbsp;&nbsp;</td></tr>
				<tr><td colspan='2'>&nbsp;<input name="energy.test_9" type="checkbox">&nbsp;平均照度与照明功率密度&nbsp;&nbsp;</td></tr>
				<tr><td colspan='2'>&nbsp;<input name="energy.test_10" type="checkbox">&nbsp;钻芯法外墙节能构造&nbsp;&nbsp;</td><td colspan='4'>&nbsp;<input name="energy.test_way_5" type="checkbox">&nbsp;GB50411-2007《建筑节能工程施工质量验收规范》&nbsp;&nbsp;</td></tr>
				
				<tr>
					<td>&nbsp;检测费用&nbsp;</td>
					<td colspan='7'>
						&nbsp;&nbsp;<input name="energy.cost_1" type="checkbox">&nbsp;已收（
						&nbsp;<input type="text" name="energy.cost_2" id="cost_2" class="width150">&nbsp;）元 、
						&nbsp;<input name="energy.cost_3" type="checkbox">&nbsp;未收（
						&nbsp;<input type="text" name="energy.cost_4" id="cost_4" class="width150">&nbsp;）元 ;
						&nbsp;<input name="energy.cost_5" type="checkbox">&nbsp;现金、
						&nbsp;<input name="energy.cost_6" type="checkbox">&nbsp;支票、
						&nbsp;<input name="energy.cost_7" type="checkbox">&nbsp;记账&nbsp;&nbsp;
					</td>
				</tr>
				
				<tr>
					<td rowspan='3'>&nbsp;提交报告方式份数及时间&nbsp;</td>
					<td colspan='7'>
						&nbsp;&nbsp;<input name="energy.submit_1" type="checkbox">&nbsp;自取
						&nbsp;<input name="energy.submit_2" type="checkbox">&nbsp;邮寄
						&nbsp;<input name="energy.submit_3" type="checkbox">&nbsp;其它：
						&nbsp;<input type="text" name="energy.submit_4" id="submit_4" class="width150">&nbsp;&nbsp;
					</td>
				</tr>
				<tr>
					<td>
						&nbsp;邮寄地址：
					</td>
					<td colspan='6'>
						<input type="text" name="energy.submit_5" id="submit_5" style="width: 100%; height: 100%">
					</td>
				</tr>
				<tr>
					<td colspan='7'>
						&nbsp;份数：
						&nbsp;<input type="text" name="energy.submit_6" id="submit_6" class="width150">&nbsp;
						&nbsp;时间：
						<input name="energy.submit_7" id="submit_7" type="date" value=""/>
					</td>
				</tr>
				
				<tr>
					<td colspan='8'>
						
					</td>
				</tr>
				
				<tr>
					<td colspan='2'>&nbsp;备注&nbsp;</td>
					<td colspan='7'>
						<input type="text" name="energy.note" id="note" style="width: 100%; height: 100%">
					</td>
				</tr>
				
				<tr>
					<td colspan='8'>
						
					</td>
				</tr>
				
				<tr>
					<td colspan='9'>
						委托声明： 1.委托单位（人）对所提供的样品及资料的真实性、代表性及来源的合法性负责。 
						&nbsp;&nbsp;&nbsp;&nbsp;2.保证现场检测条件和检测人员及设备安全。
						&nbsp;&nbsp;&nbsp;&nbsp;3.检测机构对检测结果的准确性负责，保护委托单位（人）的机密和所有权。
						&nbsp;&nbsp;&nbsp;&nbsp;3.检测机构对检测结果的准确性负责，保护委托单位（人）的机密和所有权。
						&nbsp;&nbsp;&nbsp;&nbsp;4.本协议书一式两联，委托单位与检测单位各执一联，委托方取检测报告时需出示此协议书。
						&nbsp;&nbsp;&nbsp;&nbsp;5.如委托方没有指定检测依据或所指定的检测依据已废止，我公司将按主管部门认证通过的现行标准检测。
					</td>
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
