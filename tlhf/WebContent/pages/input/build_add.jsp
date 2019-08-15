<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<link rel="stylesheet" href="${pageContext.request.contextPath}/style/css/bootstrap.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/report.css">

<div style="padding: 20px 20px 10px;" class="wrapper">
	<s:form action="build_toadd" method="post">
		<div class="con_center">
			<h3>建筑工程室内空气质量检测协议书</h3>
		</div>
		<div>
			委托编号： <input type="text" name="build.entrusted_id" id="entrusted_id" class="width150">
		</div>
		<div>
			委托单位（盖章）：
			<select name="build.entrusted_chop" id="entrusted_chop" class="width40">
				<option value="--" selected="selected">--</option>
				<option value="有">有</option>
				<option value="无">无</option>
			</select>
			委托人 （签字） ：&nbsp;
			<select name="build.entrusted_signature" id="entrusted_signature" class="width40">
				<option value="--" selected="selected">--</option>
				<option value="有">有</option>
				<option value="无">无</option>
			</select>
			委托日期 ：<input name="build.entrusted_date" id="entrusted_date" type="date" value=""/>
		</div>
		<div>
			检测单位（盖章）：
			<select name="build.test_chop" id="test_chop" class="width40">
				<option value="--" selected="selected">--</option>
				<option value="有">有</option>
				<option value="无">无</option>
			</select>
			授权代表（签字）：
			<select name="build.test_signature" id="test_signature" class="width40">
				<option value="--" selected="selected">--</option>
				<option value="有">有</option>
				<option value="无">无</option>
			</select>
			受理日期 ：<input name="build.agent_date"  id="agent_date" type="date" value=""/>
		</div>
		<table border="1" style='border:1px solid #aaa'>
			<tbody>
				<tr>
					<td rowspan='20'>&nbsp;委托单位填写&nbsp;</td>
					<td>&nbsp;委托时间&nbsp;</td>
					<td>
						<input name="build.entrusted_date1"  id="entrusted_date1" type="date" value=""/>
					</td>
					<td>&nbsp;检测时间&nbsp;</td>
					<td>
						<input name="build.test_date"  id="test_date" type="date" value=""/>
					</td>
				</tr>
				<tr>
					<td>&nbsp;委托(联系)人&nbsp;</td>
					<td>
						<input type="text" name="build.entrusted_owner" id="entrusted_owner" style="width: 100%; height: 100%">
					</td>
					<td>&nbsp;联系电话&nbsp;</td>
					<td>
						<input type="text" name="build.entrusted_call" id="entrusted_call" style="width: 100%; height: 100%">
					</td>
				</tr>
				<tr>
					<td>&nbsp;建筑面积&nbsp;</td>
					<td>
						<input type="text" name="build.build_area" id="build_area" style="width: 90%; height: 100%">&nbsp;m²
					</td>
					<td>&nbsp;检测点数&nbsp;</td>
					<td>
						<input type="text" name="build.test_point" id="test_point" style="width: 100%; height: 100%">
					</td>
				</tr>
				<tr>
					<td>&nbsp;委托单位&nbsp;</td>
					<td colspan="3">
						<input type="text" name="build.entrusted_settler" id="entrusted_settler" style="width: 100%; height: 100%">
					</td>
				</tr>
				<tr>
					<td>&nbsp;工程名称&nbsp;</td>
					<td colspan='3'>
						<input type="text" name="build.obj_name" id="obj_name" style="width: 100%; height: 100%">
					</td>
				</tr>
				<tr>
					<td>&nbsp;工程地址&nbsp;</td>
					<td colspan='3'>
						<input type="text" name="build.obj_addr" id="obj_addr" style="width: 100%; height: 100%">
					</td>
				</tr>
				<tr>
					<td>&nbsp;建设单位&nbsp;</td>
					<td colspan='3'>
						<input type="text" name="build.construction" id="construction" style="width: 100%; height: 100%">
					</td>
				</tr>
				<tr>
					<td>&nbsp;设计单位&nbsp;</td>
					<td colspan='3'>
						<input type="text" name="build.design_unit" id="design_unit" style="width: 100%; height: 100%">
					</td>
				</tr>
				<tr>
					<td>&nbsp;施工单位&nbsp;</td>
					<td colspan='3'>
						<input type="text" name="build.construction_unit" id="construction_unit" style="width: 100%; height: 100%">
					</td>
				</tr>
				<tr>
					<td>&nbsp;监理单位&nbsp;</td>
					<td colspan='3'>
						<input type="text" name="build.supervision_unit" id="supervision_unit" style="width: 100%; height: 100%">
					</td>
				</tr>
				<tr>
					<td>&nbsp;检测项目&nbsp;</td>
					<td colspan='3'>
						&nbsp;<input name="build.test_1" type="checkbox">&nbsp;甲醛&nbsp;&nbsp;
						&nbsp;<input name="build.test_2" type="checkbox">&nbsp;氨&nbsp;&nbsp;
						&nbsp;<input name="build.test_3" type="checkbox">&nbsp;苯&nbsp;&nbsp;
						&nbsp;<input name="build.test_4" type="checkbox">&nbsp;氡&nbsp;&nbsp;
						&nbsp;<input name="build.test_5" type="checkbox">&nbsp;总挥发性有机物（TVOC）  &nbsp;&nbsp;
						&nbsp;<input name="build.test_6" type="checkbox">&nbsp;土壤中氡浓度&nbsp;&nbsp;
						&nbsp;<input name="build.test_7" type="checkbox">&nbsp;房间室内新风量&nbsp;&nbsp;
					</td>
				</tr>
				<tr>
					<td>&nbsp;检测依据&nbsp;</td>
					<td colspan='3'>
						&nbsp;<input name="build.test_ref_1" type="checkbox">&nbsp;DB11/T1445-2017《民用建筑工程室内环境污染控制规程》&nbsp;&nbsp;
						<p/>
						&nbsp;<input name="build.test_ref_2" type="checkbox">&nbsp;GB50325-2010(2013年版)《民用建筑工程室内环境污染控制规范》&nbsp;&nbsp;
					</td>
				</tr>
				<tr>
					<td>&nbsp;开完工时间/开槽日期&nbsp;</td>
					<td>
						<input name="build.start_dt"  id="start_dt" type="date" value=""/>
					</td>
					<td>&nbsp;结构类型&nbsp;</td>
					<td>
						<input type="text" name="build.struc_type" id="struc_type" style="width: 100%; height: 100%">
					</td>
				</tr>
				<tr>
					<td>&nbsp;检测类别&nbsp;</td>
					<td>
						&nbsp;<input name="build.test_type_1" type="checkbox">&nbsp;委托检测&nbsp;&nbsp;
						&nbsp;<input name="build.test_type_2" type="checkbox">&nbsp;竣工验收&nbsp;&nbsp;
						&nbsp;<input name="build.test_type_3" type="checkbox">&nbsp;样板间&nbsp;&nbsp;
						&nbsp;<input name="build.test_type_4" type="checkbox">&nbsp;其他&nbsp;&nbsp;
					</td>
					<td>&nbsp;各房间门&nbsp;</td>
					<td>
						&nbsp;<input name="build.door_install_1" type="checkbox">&nbsp;已装&nbsp;&nbsp;
						&nbsp;<input name="build.door_install_2" type="checkbox">&nbsp;未装&nbsp;&nbsp;
					</td>
				</tr>
				<tr>
					<td>&nbsp;项目类型&nbsp;</td>
					<td>
						&nbsp;<input name="build.obj_type_1" type="checkbox">&nbsp;新建&nbsp;&nbsp;
						&nbsp;<input name="build.obj_type_2" type="checkbox">&nbsp;改扩建&nbsp;&nbsp;
						&nbsp;<input name="build.obj_type_3" type="checkbox">&nbsp;二次建筑&nbsp;&nbsp;
					</td>
					<td>&nbsp;装修情况&nbsp;</td>
					<td>
						&nbsp;<input name="build.fitment_1" type="checkbox">&nbsp;毛坯&nbsp;&nbsp;
						&nbsp;<input name="build.fitment_2" type="checkbox">&nbsp;初装&nbsp;&nbsp;
						&nbsp;<input name="build.fitment_3" type="checkbox">&nbsp;精装&nbsp;&nbsp;
					</td>
				</tr>
				<tr>
					<td>&nbsp;建筑类型&nbsp;</td>
					<td>
						&nbsp;<input name="build.building_type_1" type="checkbox">&nbsp;Ⅰ民用建筑&nbsp;&nbsp;
						&nbsp;<input name="build.building_type_2" type="checkbox">&nbsp;Ⅱ民用建筑&nbsp;&nbsp;
					</td>
					<td>&nbsp;层数&nbsp;</td>
					<td>
						<input type="text" name="build.floor_num" id="settler" style="width: 100%; height: 100%">
					</td>
				</tr>
				<tr>
					<td>&nbsp;检测费用&nbsp;</td>
					<td colspan='3'>
						&nbsp;&nbsp;<input name="build.cost_1" type="checkbox">&nbsp;已收（
						&nbsp;<input type="text" name="build.cost_2" id="cost_2" class="width150">&nbsp;）元 、
						&nbsp;<input name="build.cost_3" type="checkbox">&nbsp;未收（
						&nbsp;<input type="text" name="build.cost_4" id="cost_4" class="width150">&nbsp;）元 ;
						&nbsp;<input name="build.cost_5" type="checkbox">&nbsp;现金、
						&nbsp;<input name="build.cost_6" type="checkbox">&nbsp;支票、
						&nbsp;<input name="build.cost_7" type="checkbox">&nbsp;记账&nbsp;&nbsp;
					</td>
				</tr>
				
				<tr>
					<td rowspan='3'>&nbsp;提交报告方式、份数及时间&nbsp;</td>
					<td colspan='7'>
						&nbsp;&nbsp;<input name="build.submit_1" type="checkbox">&nbsp;自取
						&nbsp;<input name="build.submit_2" type="checkbox">&nbsp;邮寄
						&nbsp;<input name="build.submit_3" type="checkbox">&nbsp;其它：
						&nbsp;<input type="text" name="build.submit_4" id="submit_4" class="width150">&nbsp;&nbsp;
					</td>
				</tr>
				<tr>
					<td>
						&nbsp;邮寄地址：
					</td>
					<td colspan='3'>
						<input type="text" name="build.submit_5" id="submit_5" style="width: 100%; height: 100%">
					</td>
				</tr>
				<tr>
					<td colspan='3'>
						&nbsp;份数：
						&nbsp;<input type="text" name="build.submit_6" id="submit_6" class="width150">&nbsp;
						&nbsp;时间：
						<input name="build.submit_7" id="submit_7" type="date" value=""/>
					</td>
				</tr>
				
				<tr>
					<td colspan='5'>
						
					</td>
				</tr>
				
				<tr>
					<td colspan='2'>&nbsp;备注&nbsp;</td>
					<td colspan='3'>
						<input type="text" name="build.note" id="note" style="width: 100%; height: 100%">
					</td>
				</tr>
				
				<tr>
					<td colspan='5'>
						
					</td>
				</tr>
				
				<tr>
					<td colspan='5'>
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
