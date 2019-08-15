<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<link rel="stylesheet" href="${pageContext.request.contextPath}/style/css/bootstrap.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/report.css">

<div style="padding: 20px 20px 10px;" class="wrapper">
	<s:form action="materials_toadd" method="post">
		<div class="con_center">
			<h3>建筑工程室内空气质量检测协议书</h3>
		</div>
		<div>
			委托编号： <input type="text" name="materials.entrusted_id" id="entrusted_id" class="width150">
		</div>
		<div>
			委托单位（盖章）：
			<select name="materials.entrusted_chop" id="entrusted_chop" class="width40">
				<option value="--" selected="selected">--</option>
				<option value="有">有</option>
				<option value="无">无</option>
			</select>
			委托人 （签字） ：&nbsp;
			<select name="materials.entrusted_signature" id="entrusted_signature" class="width40">
				<option value="--" selected="selected">--</option>
				<option value="有">有</option>
				<option value="无">无</option>
			</select>
			委托日期 ：<input name="materials.entrusted_date" id="entrusted_date" type="date" value=""/>
		</div>
		<div>
			检测单位（盖章）：
			<select name="materials.test_chop" id="test_chop" class="width40">
				<option value="--" selected="selected">--</option>
				<option value="有">有</option>
				<option value="无">无</option>
			</select>
			授权代表（签字）：
			<select name="materials.test_signature" id="test_signature" class="width40">
				<option value="--" selected="selected">--</option>
				<option value="有">有</option>
				<option value="无">无</option>
			</select>
			受理日期 ：<input name="materials.agent_date"  id="agent_date" type="date" value=""/>
		</div>
		<table border="1" style='border:1px solid #aaa'>
			<tbody>
				<tr>
					<td rowspan='20'>&nbsp;委托单位填写&nbsp;</td>
					<td>&nbsp;登记日期&nbsp;</td>
					<td>
						<input name="materials.sign_date"  id="sign_date" type="date" value=""/>
					</td>
					<td>&nbsp;检测时间&nbsp;</td>
					<td>
						<input name="materials.test_date"  id="test_date" type="date" value=""/>
					</td>
				</tr>
				<tr>
					<td rowspan='3'>&nbsp;委托单位（人）&nbsp;</td>
					<td rowspan='3' style="height: 50.0pt">
						<input type="text" name="materials.entrusted_owner" id="entrusted_owner" style="width: 100%; height: 100%">
					</td>
					<td>&nbsp;来样日期&nbsp;</td>
					<td>
						<input name="materials.sample_date"  id="sample_date" type="date" value=""/>
					</td>
				</tr>
				<tr>
					<td>&nbsp;联系人&nbsp;</td>
					<td>
						<input type="text" name="materials.call_owner" id="call_owner" style="width: 100%; height: 100%">
					</td>
				</tr>
				<tr>
					<td>&nbsp;联系电话&nbsp;</td>
					<td>
						<input type="text" name="materials.call_num" id="call_num" style="width: 100%; height: 100%">
					</td>
				</tr>
				
				<tr>
					<td rowspan='3' style="height: 50.0pt">&nbsp;样品名称&nbsp;</td>
					<td rowspan='3'>
						<input type="text" name="materials.sample_name" id="sample_name" style="width: 100%; height: 100%">
					</td>
					<td>&nbsp;规格尺寸&nbsp;</td>
					<td>
						<input type="text" name="materials.sample_size" id="sample_size" style="width: 100%; height: 100%">
					</td>
				</tr>
				<tr>
					<td>&nbsp;类别等级&nbsp;</td>
					<td>
						<input type="text" name="materials.sample_level" id="sample_level" style="width: 100%; height: 100%">
					</td>
				</tr>
				<tr>
					<td>&nbsp;代表批号&nbsp;</td>
					<td>
						<input type="text" name="materials.sample_num" id="sample_num" style="width: 100%; height: 100%">
					</td>
				</tr>
				
				<tr>
					<td>&nbsp;生产单位厂家&nbsp;</td>
					<td>
						<input type="text" name="materials.factory" id="factory" style="width: 100%; height: 100%">
					</td>
					<td>&nbsp;使用工程名称&nbsp;</td>
					<td>
						<input type="text" name="materials.obj_name" id="obj_name" style="width: 100%; height: 100%">
					</td>
				</tr>
				
				<tr>
					<td>&nbsp;检测类别&nbsp;</td>
					<td colspan='3'>
						&nbsp;&nbsp;<input name="materials.test_type_1" type="checkbox">&nbsp;委托检测
						&nbsp;<input name="materials.test_type_2" type="checkbox">&nbsp;留样复测
						&nbsp;<input name="materials.test_type_3" type="checkbox">&nbsp;其它
					</td>
				</tr>
				
				<tr>
					<td>&nbsp;检测费用&nbsp;</td>
					<td colspan='3'>
						&nbsp;&nbsp;<input name="materials.cost_1" type="checkbox">&nbsp;已收（
						&nbsp;<input type="text" name="materials.cost_2" id="cost_2" class="width150">&nbsp;）元 、
						&nbsp;<input name="materials.cost_3" type="checkbox">&nbsp;未收（
						&nbsp;<input type="text" name="materials.cost_4" id="cost_4" class="width150">&nbsp;）元 ;
						&nbsp;<input name="materials.cost_5" type="checkbox">&nbsp;现金、
						&nbsp;<input name="materials.cost_6" type="checkbox">&nbsp;支票、
						&nbsp;<input name="materials.cost_7" type="checkbox">&nbsp;记账&nbsp;&nbsp;
					</td>
				</tr>
				
				<tr>
					<td rowspan='3'>&nbsp;提交报告方式、份数及时间&nbsp;</td>
					<td colspan='7'>
						&nbsp;&nbsp;<input name="materials.submit_1" type="checkbox">&nbsp;自取
						&nbsp;<input name="materials.submit_2" type="checkbox">&nbsp;邮寄
						&nbsp;<input name="materials.submit_3" type="checkbox">&nbsp;其它：
						&nbsp;<input type="text" name="materials.submit_4" id="submit_4" class="width150">&nbsp;&nbsp;
					</td>
				</tr>
				<tr>
					<td>
						&nbsp;邮寄地址：
					</td>
					<td colspan='3'>
						<input type="text" name="materials.submit_5" id="submit_5" style="width: 100%; height: 100%">
					</td>
				</tr>
				<tr>
					<td colspan='3'>
						&nbsp;份数：
						&nbsp;<input type="text" name="materials.submit_6" id="submit_6" class="width150">&nbsp;
						&nbsp;时间：
						<input name="materials.submit_7" id="submit_7" type="date" value=""/>
					</td>
				</tr>
				
				<tr>
					<td colspan='5'>
						
					</td>
				</tr>
				
				<tr>
					<td>&nbsp;检测项目&nbsp;</td>
					<td colspan='3'>检 测 方 法</td>
				</tr>
				<tr>
					<td>内照射指数、<p/>内照射指数(建筑材料放射性)&nbsp;</td>
					<td colspan='3'>&nbsp;<input name="materials.test1_way_1" type="checkbox">&nbsp;GB6566-2010</td>
				</tr>
				<tr>
					<td>甲醛（释放量板材）&nbsp;</td>
					<td colspan='3'>
					&nbsp;<input name="materials.test2_way_1" type="checkbox">&nbsp;GB/T17657-2013 (干燥器法)   GB/T17657-2013 (干燥器法)<p/>
					&nbsp;<input name="materials.test2_way_2" type="checkbox">&nbsp;GB/T17657-2013 (干燥器法)   GB/T17657-2013 (干燥器法)
					</td>
				</tr>
				<tr>
					<td>游离甲醛(胶粘剂、涂料)&nbsp;</td>
					<td colspan='3'>
					&nbsp;<input name="materials.test3_way_1" type="checkbox">&nbsp;GB/T18582-2008
					&nbsp;<input name="materials.test3_way_2" type="checkbox">&nbsp;GB/T18583-2008
					</td>
				</tr>
				<tr>
					<td>甲醛（壁纸）&nbsp;</td>
					<td colspan='3'>
					&nbsp;<input name="materials.test4_way_1" type="checkbox">&nbsp;GB/T18585-2001
					</td>
				</tr>
				<tr>
					<td>其他&nbsp;</td>
					<td colspan='3'>
					<input type="text" name="materials.other" id="other" style="width: 100%; height: 100%">
					</td>
				</tr>
				
				<tr>
					<td colspan='5'>
						
					</td>
				</tr>
				
				<tr>
					<td colspan='2'>&nbsp;备注&nbsp;</td>
					<td colspan='3'>
						<input type="text" name="materials.note" id="note" style="width: 100%; height: 100%">
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
