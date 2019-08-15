<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<link rel="stylesheet" href="${pageContext.request.contextPath}/style/css/bootstrap.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/report.css">

<div style="padding: 20px 20px 10px;" class="wrapper">
	<s:form action="pact_toadd" method="post">
		<div class="con_center">
			<h3>室内空气检测协议书</h3>
		</div>
		<div>
			委托编号： <input type="text" name="indoor.entrusted_id" id="entrusted_id" class="width150">
		</div>
		<div>
			委托单位（盖章）：
			<select name="indoor.entrusted_chop" id="entrusted_chop" class="width40">
				<option value="--" selected="selected">--</option>
				<option value="有">有</option>
				<option value="无">无</option>
			</select>
			委托人 （签字） ：&nbsp;
			<select name="indoor.entrusted_signature" id="entrusted_signature" class="width40">
				<option value="--" selected="selected">--</option>
				<option value="有">有</option>
				<option value="无">无</option>
			</select>
			委托日期 ：<input name="indoor.entrusted_date" id="entrusted_date" type="date" value=""/>
		</div>
		<div>
			检测单位（盖章）：
			<select name="indoor.test_chop" id="test_chop" class="width40">
				<option value="--" selected="selected">--</option>
				<option value="有">有</option>
				<option value="无">无</option>
			</select>
			授权代表（签字）：
			<select name="indoor.test_signature" id="test_signature" class="width40">
				<option value="--" selected="selected">--</option>
				<option value="有">有</option>
				<option value="无">无</option>
			</select>
			受理日期 ：<input name="indoor.test_date"  id="test_date" type="date" value=""/>
		</div>
		<table border="1" style='border:1px solid #aaa'>
			<tbody>
				<tr>
					<td rowspan='25'>&nbsp;委托单位填写&nbsp;</td>
					<td>&nbsp;登记时间&nbsp;</td>
					<td>
						<input name="indoor.registered_date" id="registered_date" type="date" value=""/>
					</td>
					<td>&nbsp;检测时间&nbsp;</td>
					<td>
						<input name="indoor.testing_date" id="testing_date" type="date" value=""/>
					</td>
				</tr>
				<tr>
					<td>&nbsp;委托单位（人）&nbsp;</td>
					<td colspan="3">
						<input type="text" name="indoor.entrusted_settler" id="entrusted_settler" style="width: 100%; height: 100%">
					</td>
				</tr>
				<tr>
					<td>&nbsp;工程名称&nbsp;</td>
					<td colspan='3'>
						<input type="text" name="indoor.obj_name" id="obj_name" style="width: 100%; height: 100%">
					</td>
				</tr>
				<tr>
					<td>&nbsp;联系人&nbsp;</td>
					<td>
						<input type="text" name="indoor.contract_name" id="contract_name" style="width: 100%; height: 100%">
					</td>
					<td>&nbsp;联系电话&nbsp;</td>
					<td>
						<input type="text" name="indoor.contact_call" id="contact_call" style="width: 100%; height: 100%">
					</td>
				</tr>
				<tr>
					<td>&nbsp;检测地址&nbsp;</td>
					<td colspan='3'>
						<input type="text" name="indoor.test_addr" id="test_addr" style="width: 100%; height: 100%">
					</td>
				</tr>
				<tr>
					<td>&nbsp;判定依据&nbsp;</td>
					<td colspan='3'>
						&nbsp;<input name="indoor.check_ref1" type="checkbox">&nbsp;DB11/T1445-2017&nbsp;&nbsp;
						&nbsp;<input name="indoor.check_ref2" type="checkbox">&nbsp;GB50325-2010（2013年版）&nbsp;&nbsp;
						&nbsp;<input name="indoor.check_ref3" type="checkbox">&nbsp;GB18883-2002&nbsp;&nbsp;
					</td>
				</tr>
				<tr>
					<td>&nbsp;检测类别&nbsp;</td>
					<td colspan='3'>
						&nbsp;<input name="indoor.check_type" type="checkbox">&nbsp;委托检测&nbsp;&nbsp;
						&nbsp;<input name="indoor.check_other" type="checkbox">&nbsp;其它&nbsp;&nbsp;
					</td>
				</tr>
				
				<tr>
					<td>&nbsp;检测费用&nbsp;</td>
					<td colspan='3'>
						&nbsp;[&nbsp;<input name="indoor.check_receive" type="checkbox">&nbsp;已收（
						&nbsp;<input type="text" name="indoor.check_receive_rmb" id="check_receive_rmb" class="width150">&nbsp;）元 、
						&nbsp;<input name="indoor.check_not_receive" type="checkbox">&nbsp;未收（
						&nbsp;<input type="text" name="indoor.check_not_receive_rmb" id="check_not_receive_rmb" class="width150">&nbsp;）元 ;
						&nbsp;<input name="indoor.check_cash" type="checkbox">&nbsp;现金、
						&nbsp;<input name="indoor.check_cheque" type="checkbox">&nbsp;支票、
						&nbsp;<input name="indoor.check_billing" type="checkbox">&nbsp;记账&nbsp;]&nbsp;
					</td>
				</tr>
				
				<tr>
					<td rowspan='3'>&nbsp;提交报告方式份数及时间&nbsp;</td>
					<td colspan='3'>
						&nbsp;[&nbsp;<input name="indoor.report_typr" type="checkbox">&nbsp;自取
						&nbsp;<input name="indoor.report_courier" type="checkbox">&nbsp;邮寄
						&nbsp;<input name="indoor.report_other" type="checkbox">&nbsp;其它：
						&nbsp;<input type="text" name="indoor.report_other_detail" id="report_other_detail" class="width150">&nbsp;]&nbsp;
					</td>
				</tr>
				<tr>
					<td>
						&nbsp;邮寄地址：
					</td>
					<td colspan='2'>
						<input type="text" name="indoor.report_courier_addr" id="report_courier_addr" style="width: 100%; height: 100%">
					</td>
				</tr>
				<tr>
					<td colspan='3'>
						&nbsp;份数：
						&nbsp;<input type="text" name="indoor.report_num" id="report_num" class="width150">&nbsp;
						&nbsp;时间：
						<input name="indoor.report_date" id="report_date" type="date" value=""/>
					</td>
				</tr>
				
				<tr>
					<td colspan='4'>
						
					</td>
				</tr>
				
				<tr>
					<td>&nbsp;检测项目&nbsp;</td>
					<td>&nbsp;数量（点）&nbsp;</td>
					<td colspan='2'>
						&nbsp;检 测 方 法&nbsp;
					</td>
				</tr>
				
				<tr>
					<td>&nbsp;苯&nbsp;</td>
					<td><input type="text" name="indoor.entity_benzene" id="entity_benzene" style="width: 100%; height: 100%"></td>
					<td colspan='2'>
						&nbsp;<input name="indoor.entity_benzene_1" type="checkbox">&nbsp;GB50325-2010（2013年版）附录F&nbsp;
						GB11737-89&nbsp;
						&nbsp;<input name="indoor.entity_benzene_2" type="checkbox">&nbsp;二硫化碳提取法&nbsp;
						&nbsp;<input name="indoor.entity_benzene_3" type="checkbox">&nbsp;热解吸法&nbsp;
						&nbsp;<input name="indoor.entity_benzene_4" type="checkbox">&nbsp;GB18883-2002附录B
					</td>
				</tr>
				
				<tr>
					<td>&nbsp;甲苯\二甲苯&nbsp;</td>
					<td><input type="text" name="indoor.entity_toluene" id="entity_toluene" style="width: 100%; height: 100%"></td>
					<td colspan='2'>
						&nbsp;GB11737-89&nbsp;
						&nbsp;<input name="indoor.entity_toluene_1" type="checkbox">&nbsp;二硫化碳提取法&nbsp;
						&nbsp;<input name="indoor.entity_toluene_2" type="checkbox">&nbsp;热解吸法
					</td>
				</tr>
				
				<tr>
					<td>&nbsp;甲醛&nbsp;</td>
					<td><input type="text" name="indoor.entity_formal" id="entity_formal" style="width: 100%; height: 100%"></td>
					<td colspan='2'>
						&nbsp;<input name="indoor.entity_formal_1" type="checkbox">&nbsp;GB/T18204.2-2014酚试剂分光光度法&nbsp;
						&nbsp;<input name="indoor.entity_formal_2" type="checkbox">&nbsp;DB11/T1445-2017 (仪器法) &nbsp;
						&nbsp;<input name="indoor.entity_formal_3" type="checkbox">&nbsp;GB50325-2010（2013年版）(仪器法)
					</td>
				</tr>
				
				<tr>
					<td>&nbsp;氨&nbsp;</td>
					<td><input type="text" name="indoor.entity_n" id="entity_n" style="width: 100%; height: 100%"></td>
					<td colspan='2'>
						&nbsp;<input name="indoor.entity_n_1" type="checkbox">&nbsp;GB/T18204.2-2014(靛酚蓝分光光度法)
					</td>
				</tr>
				
				<tr>
					<td>&nbsp;TVOC&nbsp;</td>
					<td><input type="text" name="indoor.entity_tvoc" id="entity_tvoc" style="width: 100%; height: 100%"></td>
					<td colspan='2'>
						&nbsp;<input name="indoor.entity_tvoc_1" type="checkbox">&nbsp;DB11/T1445-2017附录B&nbsp;
						&nbsp;<input name="indoor.entity_tvoc_2" type="checkbox">&nbsp;GB50325-2010（2013年版）附录G
					</td>
				</tr>
				
				<tr>
					<td>&nbsp;氡&nbsp;</td>
					<td><input type="text" name="indoor.entity_rn" id="entity_rn" style="width: 100%; height: 100%"></td>
					<td colspan='2'>
						&nbsp;<input name="indoor.entity_rn_1" type="checkbox">&nbsp;GB/T14582-1993（活性碳盒法）&nbsp;
						&nbsp;<input name="indoor.entity_rn_2" type="checkbox">&nbsp;GB/T16147-1995&nbsp;
						&nbsp;<input name="indoor.entity_rn_3" type="checkbox">&nbsp;DB11/T1445-2017附录A
					</td>
				</tr>
				
				<tr>
					<td>&nbsp;臭氧&nbsp;</td>
					<td><input type="text" name="indoor.entity_o3" id="entity_o3" style="width: 100%; height: 100%"></td>
					<td colspan='2'>
						&nbsp;<input name="indoor.entity_o3_1" type="checkbox">&nbsp;GB/T18204.2-2014 (靛蓝二磺酸钠分光光度法)
					</td>
				</tr>
				
				<tr>
					<td>&nbsp;二氧化硫&nbsp;</td>
					<td><input type="text" name="indoor.entity_so2" id="entity_so2" style="width: 100%; height: 100%"></td>
					<td colspan='2'>
						&nbsp;<input name="indoor.entity_so2_1" type="checkbox">&nbsp;GB/T16128-1995
					</td>
				</tr>
				
				<tr>
					<td>&nbsp;二氧化氮&nbsp;</td>
					<td><input type="text" name="indoor.entity_no2" id="entity_no2" style="width: 100%; height: 100%"></td>
					<td colspan='2'>
						&nbsp;<input name="indoor.entity_no2_1" type="checkbox">&nbsp;GB/T12372-1990 
					</td>
				</tr>
				
				<tr>
					<td colspan='4'>
						
					</td>
				</tr>
				
				<tr>
					<td>&nbsp;其他&nbsp;</td>
					<td colspan='3'>
						<input type="text" name="indoor.other" id="other" style="width: 100%; height: 100%">
					</td>
				</tr>
				
				<tr>
					<td colspan='4'>
						
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
