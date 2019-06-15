<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>随州市贫困户脱贫销号第三方评估抽样核查表</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/report.css">
</head>
<body>
<div style="padding: 20px 20px 10px;" class="wrapper">
	<s:form action="query_entity" method="post">
		<div class="con_center">
			<h3>随州市贫困户脱贫销号第三方评估抽样核查表</h3>
		</div>
		<div><s:textfield name="entity.year1" id="year1" style="width: 60px" readonly="true"></s:textfield>&nbsp;年度
		</div>
		<div>
			<s:textfield name="entity.county" id="county" style="width: 140px" readonly="true"></s:textfield>&nbsp;县市&nbsp;
			<s:textfield name="entity.township" id="township" style="width: 100px" readonly="true"></s:textfield>&nbsp;乡镇&nbsp;
			<s:textfield name="entity.village" id="village" style="width: 150px" readonly="true"></s:textfield>&nbsp;村&nbsp;
			<s:textfield name="entity.group1" id="group1" style="width: 50px" readonly="true"></s:textfield>&nbsp;组
		</div>
		<div>
			<div>
				户主姓名：<s:textfield name="entity.name1" id="name1" style="width: 70px" readonly="true"></s:textfield>&nbsp;
				家庭人口：<s:textfield name="entity.family_size" id="family_size" style="width: 30px" readonly="true"></s:textfield>&nbsp;人，
				其中：劳动力人口&nbsp;<s:textfield name="entity.workers_size" id="workers_size" style="width: 30px" readonly="true"></s:textfield>&nbsp;人，
				低保人口&nbsp;<s:textfield name="entity.dibao_size" id="dibao_size" style="width: 30px" readonly="true"></s:textfield>&nbsp;人，
				五保人口&nbsp;<s:textfield name="entity.wudao_size" id="wudao_size" style="width: 30px" readonly="true"></s:textfield>&nbsp;人。
			</div>
			<div>
				贫困户属性：
				<input name="entity.poverty_level1" type="checkbox" ${entity.poverty_level1 eq 1?"checked":""}>&nbsp;一般贫困户&nbsp;
				<input name="entity.poverty_level2" type="checkbox" ${entity.poverty_level2 eq 1?"checked":""}>&nbsp;低保户&nbsp;
				<input name="entity.poverty_level3" type="checkbox" ${entity.poverty_level3 eq 1?"checked":""}>&nbsp;五保户&nbsp;
				<input name="entity.poverty_level4" type="checkbox" ${entity.poverty_level4 eq 1?"checked":""}>&nbsp;低保贫困户&nbsp;
			</div>
		</div>
		<table border="1" style='border:1px solid #aaa'>
			<thead>
			<tr>
				<th colspan="2">指标名称</th>
				<th>脱贫状况评估</th>
				<th>分值</th>
				<th>验收量分标准</th>
				<th>市州核查得分</th>
			</tr>
			</thead>
			<tbody>
			<tr>
				<td rowspan='9'>一、收入状况</td>
				<td>当年增收致富主导产业</td>
				<td>
					<input name="entity.industry1" type="checkbox" ${entity.industry1 eq 1?"checked":""}>种植业&nbsp;&nbsp;&nbsp;
					<input name="entity.industry2" type="checkbox" ${entity.industry2 eq 1?"checked":""}>养殖业&nbsp;&nbsp;&nbsp;
					<input name="entity.industry3" type="checkbox" ${entity.industry3 eq 1?"checked":""}>乡村旅游业&nbsp;&nbsp;
					<input name="entity.industry4" type="checkbox" ${entity.industry4 eq 1?"checked":""}>特色手工业
					<input name="entity.industry5" type="checkbox" ${entity.industry5 eq 1?"checked":""}>农业服务业&nbsp;&nbsp;
					<input name="entity.industry6" type="checkbox" ${entity.industry6 eq 1?"checked":""}>商贸流通业<br/>
					<input name="entity.industry7" type="checkbox" ${entity.industry7 eq 1?"checked":""}>&nbsp;其他&nbsp;
					<s:textfield name="entity.content7" id="content7" style="width: 150px" readonly="true"></s:textfield>&nbsp;
					<input name="entity.industry8" type="checkbox" ${entity.industry8 eq 1?"checked":""}>&nbsp;无主导产业&nbsp;
				</td>
				<td><s:textfield name="entity.scope11" id="scope11" style="width: 40px" readonly="true"></s:textfield>&nbsp;
				</td>
				
				<td>如该户有劳动力，有一项以上增<br/>
					收致富主导产业计满分，无不得分<br/>
					如该户无劳动力，直接计满分</td>
				<td><s:textfield name="entity.scope12" id="scope12" style="width: 40px" readonly="true"></s:textfield>
				</td>
			</tr>
			<tr>
				<td>家庭成员就业创业技能</td>
				<td>
					<input name="entity.skill1" type="checkbox" ${entity.skill1 eq 1?"checked":""}>务农技能&nbsp;&nbsp;
					<input name="entity.skill2" type="checkbox" ${entity.skill2 eq 1?"checked":""}>&nbsp;务工技能&nbsp;&nbsp;
					<input name="entity.skill3" type="checkbox" ${entity.skill3 eq 1?"checked":""}>&nbsp;创业技能&nbsp;&nbsp;
					<input name="entity.skill4" type="checkbox" ${entity.skill4 eq 1?"checked":""}>&nbsp;其他技能&nbsp;
					<s:textfield name="entity.content4" id="content4" style="width: 150px" readonly="true"></s:textfield><br/>
					<input name="entity.skill5" type="checkbox" ${entity.skill5 eq 1?"checked":""}>无就业创业技能
				</td>
				<td><s:textfield name="entity.scope21" id="scope21" style="width: 40px" readonly="true"></s:textfield>&nbsp;</td>
				<td>如该户有劳动力，掌握一门以上<br/>
					就业创业技能计满分，无不得分<br/>
					如该户无劳动力，直接计满分</td>
				<td><s:textfield name="entity.scope22" id="scope22" style="width: 40px" readonly="true"></s:textfield></td>
			</tr>
			<tr>
				<td>上年人均可支配收入</td>
				<td>根据附表测算，约为&nbsp;<s:textfield name="entity.money1" id="money1" style="width: 120px" readonly="true"></s:textfield>&nbsp;元</td>
				<td>&nbsp;—&nbsp;</td>
				<td>&nbsp;—&nbsp;</td>
				<td>&nbsp;—&nbsp;</td>
			</tr>
			<tr>
				<td rowspan="4">本年人均可支配收入</td>
				<td>根据附表测算，约为&nbsp;<s:textfield name="entity.money2" id="money2" style="width: 120px" readonly="true"></s:textfield>&nbsp;元</td>
				<td>&nbsp;—&nbsp;</td>
				<td>&nbsp;—&nbsp;</td>
				<td>&nbsp;—&nbsp;</td>
			</tr>
			<tr>
				<td>是否超过同期国家扶贫标准（&nbsp;<s:textfield name="entity.fupinbz" id="fupinbz" style="width: 80px" readonly="true"></s:textfield>&nbsp;元）：
					<input name="entity.check1y" type="checkbox" ${entity.check1y eq 1?"checked":""}>&nbsp;是&nbsp;&nbsp;&nbsp;
					<input name="entity.check1n" type="checkbox" ${entity.check1n eq 1?"checked":""}>&nbsp;否&nbsp;
				</td>
				<td><s:textfield name="entity.scope31" id="scope31" style="width: 40px" readonly="true"></s:textfield></td>
				<td>“是”计满分，“否”不得分</td>
				<td><s:textfield name="entity.scope32" id="scope32" style="width: 40px" readonly="true"></s:textfield></td>
			</tr>
			<tr>
				<td>是否达到同期本县（市）农村居民人均可支配收入（&nbsp;<s:textfield name="entity.renjun" id="renjun" style="width: 80px" readonly="true"></s:textfield>&nbsp;元）的70%：<br/>
					<input name="entity.check2y" type="checkbox" ${entity.check2y eq 1?"checked":""}>&nbsp;是&nbsp;&nbsp;&nbsp;
					<input name="entity.check2n" type="checkbox" ${entity.check2n eq 1?"checked":""}>&nbsp;否&nbsp;
				</td>
				<td><s:textfield name="entity.scope41" id="scope41" style="width: 40px" readonly="true"></s:textfield></td>
				<td>“是”计满分，“否”不得分</td>
				<td><s:textfield name="entity.scope42" id="scope42" style="width: 40px" readonly="true"></s:textfield></td>
			</tr>
			<tr>
				<td>该户低保、五保对象年人均保障性收入为&nbsp;<s:textfield name="entity.income" id="income" style="width: 80px" readonly="true"></s:textfield>&nbsp;
					元，是否超过同期国家扶贫标准：
					<input name="entity.check3y" type="checkbox" ${entity.check3y eq 1?"checked":""}>&nbsp;是&nbsp;&nbsp;&nbsp;
					<input name="entity.check3n" type="checkbox" ${entity.check3n eq 1?"checked":""}>&nbsp;否&nbsp;
					<input name="entity.check3o" type="checkbox" ${entity.check3o eq 1?"checked":""}>&nbsp;本户无低保、五保对象&nbsp;
				</td>
				<td><s:textfield name="entity.scope51" id="scope51" style="width: 40px" readonly="true"></s:textfield></td>
				<td>“是”计满分，“否”不得分。如该户无低保、五保对象，直接计满分</td>
				<td><s:textfield name="entity.scope52" id="scope52" style="width: 40px" readonly="true"></s:textfield></td>
			</tr>
			<tr>
				<td rowspan="2">人均可支配收入增幅（%）</td>
				<td>增幅约为&nbsp;<s:textfield name="entity.increase" id="increase" style="width: 40px" readonly="true"></s:textfield>&nbsp;%（本年人均可支配收入/上年人均可支配收入-1）×100%</td>
				<td>&nbsp;—&nbsp;</td>
				<td>&nbsp;—&nbsp;</td>
				<td>&nbsp;—&nbsp;</td>
			</tr>
			<tr>
				<td>是否高于同期全省农村居民人均可支配收入平均增幅（&nbsp;
					<s:textfield name="entity.ave_increase" id="ave_increase" style="width: 40px" readonly="true"></s:textfield>&nbsp;%）：
					<input name="entity.check4y" type="checkbox" ${entity.check4y eq 1?"checked":""}>&nbsp;是&nbsp;&nbsp;&nbsp;
					<input name="entity.check4n" type="checkbox" ${entity.check4n eq 1?"checked":""}>&nbsp;否&nbsp;
				</td>
				<td><s:textfield name="entity.scope61" id="scope61" style="width: 40px" readonly="true"></s:textfield></td>
				<td>“是”计满分，“否”不得分</td>
				<td><s:textfield name="entity.scope62" id="scope62" style="width: 40px" readonly="true"></s:textfield></td>
			</tr>
			<tr>
				<td rowspan="2">二、生存基本状况</td>
				<td>是否不愁吃</td>
				<td>
					<input name="entity.eat_y" type="checkbox" ${entity.eat_y eq 1?"checked":""}>&nbsp;是（一日三餐有保障，家庭成员不存在饿肚子的现象）&nbsp;&nbsp;&nbsp;
					<input name="entity.eat_n" type="checkbox" ${entity.eat_n eq 1?"checked":""}>&nbsp;否&nbsp;
				</td>
				<td>&nbsp;—&nbsp;</td>
				<td>如选择否，该户脱贫一票否决</td>
				<td><s:textfield name="entity.scope72" id="scope72" style="width: 40px" readonly="true"></s:textfield></td>
			</tr>
			<tr>
				<td>是否不愁穿</td>
				<td>
					<input name="entity.wear_y" type="checkbox" ${entity.wear_y eq 1?"checked":""}>&nbsp;是（有应季衣被，家庭成员不存在挨冷受冻的现象）&nbsp;&nbsp;&nbsp;
					<input name="entity.wear_n" type="checkbox" ${entity.wear_n eq 1?"checked":""}>&nbsp;否&nbsp;
				</td>
				<td>&nbsp;—&nbsp;</td>
				<td>如选择否，该户脱贫一票否决</td>
				<td><s:textfield name="entity.scope82" id="scope82" style="width: 40px" readonly="true"></s:textfield></td>
			</tr>
			<tr>
				<td rowspan="9">三、生产生活条件及基本公共服务</td>
				<td>家庭主要住房状况</td>
				<td>
					<input name="entity.house1" type="checkbox" ${entity.house1 eq 1?"checked":""}>&nbsp;①非危房&nbsp;&nbsp;&nbsp;
					<input name="entity.house2" type="checkbox" ${entity.house2 eq 1?"checked":""}>&nbsp;②危房&nbsp;
				</td>
				<td><s:textfield name="entity.scope91" id="scope91" style="width: 40px" readonly="true"></s:textfield></td>
				<td>①计满分，②不得分、且该户脱贫一票否决</td>
				<td><s:textfield name="entity.scope92" id="scope92" style="width: 40px" readonly="true"></s:textfield></td>
			</tr>
			<tr>
				<td>家庭人均住房面积</td>
				<td>
					<input name="entity.house_y" type="checkbox" ${entity.house_y eq 1?"checked":""}>&nbsp;①20㎡以上（含20㎡）&nbsp;&nbsp;&nbsp;
					<input name="entity.house_n" type="checkbox" ${entity.house_n eq 1?"checked":""}>&nbsp;②20㎡以下<br/>（住房总面积&nbsp;
					<s:textfield name="entity.house_size" id="house_size" style="width: 30px" readonly="true"></s:textfield>&nbsp;㎡/
					<s:textfield name="entity.family_n" id="family_n" style="width: 30px" readonly="true"></s:textfield>&nbsp;人=
					<s:textfield name="entity.people_size" id="people_size" style="width: 30px" readonly="true"></s:textfield>&nbsp;㎡/人）
				</td>
				<td><s:textfield name="entity.scope101" id="scope101" style="width: 40px" readonly="true"></s:textfield></td>
				<td>①计满分，②不得分</td>
				<td><s:textfield name="entity.scope102" id="scope102" style="width: 40px" readonly="true"></s:textfield></td>
			</tr>
			<tr>
				<td>饮水状况</td>
				<td>
					<input name="entity.water1" type="checkbox" ${entity.water1 eq 1?"checked":""}>&nbsp;①自来水（包括集中供应和分散供应）&nbsp;&nbsp;
					<input name="entity.water2" type="checkbox" ${entity.water2 eq 1?"checked":""}>&nbsp;②无自来水但用水有保障（水井、水窖等较近）&nbsp;&nbsp;
					<input name="entity.water3" type="checkbox" ${entity.water3 eq 1?"checked":""}>&nbsp;③饮水困难
				</td>
				<td><s:textfield name="entity.scope111" id="scope111" style="width: 40px" readonly="true"></s:textfield></td>
				<td>①计满分，②计4分，③不得分</td>
				<td><s:textfield name="entity.scope112" id="scope112" style="width: 40px" readonly="true"></s:textfield></td>
			</tr>
			<tr>
				<td>用电状况</td>
				<td>
					<input name="entity.electricity1" type="checkbox" ${entity.electricity1 eq 1?"checked":""}>&nbsp;①通电且电压合格&nbsp;&nbsp;
					<input name="entity.electricity2" type="checkbox" ${entity.electricity2 eq 1?"checked":""}>&nbsp;②通电但电压较低（380伏用户低于353伏,220伏用户低于198伏）&nbsp;&nbsp;
					<input name="entity.electricity3" type="checkbox" ${entity.electricity3 eq 1?"checked":""}>&nbsp;③不通电
				</td>
				<td><s:textfield name="entity.scope121" id="scope121" style="width: 40px" readonly="true"></s:textfield></td>
				<td>①计满分，②计2分，③不得分</td>
				<td><s:textfield name="entity.scope122" id="scope122" style="width: 40px" readonly="true"></s:textfield></td>
			</tr>
			<tr>
				<td>交通状况</td>
				<td>
					<input name="entity.traffic1" type="checkbox" ${entity.traffic1 eq 1?"checked":""}>&nbsp;①所属村民小组（20户以上）通公路或砂石路（能通车）<br/>
					<input name="entity.traffic2" type="checkbox" ${entity.traffic2 eq 1?"checked":""}>&nbsp;②所属村民小组（20户以下）未通公路或砂石路但出行方便<br/>
					<input name="entity.traffic3" type="checkbox" ${entity.traffic3 eq 1?"checked":""}>&nbsp;③所属村民小组未通公路或砂石路且出行困难
				</td>
				<td><s:textfield name="entity.scope131" id="scope131" style="width: 40px" readonly="true"></s:textfield></td>
				<td>①计满分，②计1分，③不得分</td>
				<td><s:textfield name="entity.scope132" id="scope132" style="width: 40px" readonly="true"></s:textfield></td>
			</tr>
			<tr>
				<td>教育保障</td>
				<td>该户是否有适龄家庭成员因贫辍学现象发生：
					<input name="entity.education1" type="checkbox" ${entity.education1 eq 1?"checked":""}>&nbsp;是&nbsp;&nbsp;&nbsp;
					<input name="entity.education2" type="checkbox" ${entity.education2 eq 1?"checked":""}>&nbsp;否&nbsp;&nbsp;&nbsp;
				</td>
				<td><s:textfield name="entity.scope141" id="scope141" style="width: 40px" readonly="true"></s:textfield></td>
				<td>“是”不得分，且该户脱贫一票否决；“否”计满分</td>
				<td><s:textfield name="entity.scope142" id="scope142" style="width: 40px" readonly="true"></s:textfield></td>
			</tr>
			<tr>
				<td rowspan="2">医疗保障</td>
				<td>该户符合参合条件的家庭成员是否全部参加新型农村合作医疗：<br/>
					<input name="entity.medical_treatment11" type="checkbox" ${entity.medical_treatment11 eq 1?"checked":""}>&nbsp;是&nbsp;&nbsp;&nbsp;
					<input name="entity.medical_treatment12" type="checkbox" ${entity.medical_treatment12 eq 1?"checked":""}>&nbsp;否
				</td>
				<td><s:textfield name="entity.scope151" id="scope151" style="width: 40px" readonly="true"></s:textfield></td>
				<td>“是”计满分，“否”不得分</td>
				<td><s:textfield name="entity.scope152" id="scope152" style="width: 40px" readonly="true"></s:textfield></td>
			</tr>
			<tr>
				<td>有重大疾病的家庭成员是否享受到大病救助政策：<br/>
					<input name="entity.medical_treatment21" type="checkbox" ${entity.medical_treatment21 eq 1?"checked":""}>&nbsp;是&nbsp;&nbsp;
					<input name="entity.medical_treatment22" type="checkbox" ${entity.medical_treatment22 eq 1?"checked":""}>&nbsp;否&nbsp;&nbsp;
					<input name="entity.medical_treatment23" type="checkbox" ${entity.medical_treatment23 eq 1?"checked":""}>&nbsp;无大病情况
				</td>
				<td><s:textfield name="entity.scope161" id="scope161" style="width: 40px" readonly="true"></s:textfield></td>
				<td>“是”计满分，“否”不得分。无大病情况直接计满分</td>
				<td><s:textfield name="entity.scope162" id="scope162" style="width: 40px" readonly="true"></s:textfield></td>
			</tr>
			<tr>
				<td>养老保障</td>
				<td>符合参保条件并有参保意愿的家庭成员是否全部参加城乡居民基本养老保险：
					<input name="entity.pension1" type="checkbox" ${entity.pension1 eq 1?"checked":""}>&nbsp;是&nbsp;&nbsp;&nbsp;
					<input name="entity.pension2" type="checkbox" ${entity.pension2 eq 1?"checked":""}>&nbsp;否&nbsp;&nbsp;&nbsp;
				</td>
				<td><s:textfield name="entity.scope171" id="scope171" style="width: 40px" readonly="true"></s:textfield></td>
				<td>“是”计满分，“否”不得分</td>
				<td><s:textfield name="entity.scope172" id="scope172" style="width: 40px" readonly="true"></s:textfield></td>
			</tr>
			<tr>
				<td colspan="5">该  户  评  估  总  分 </td>
				<td><s:textfield name="entity.scope182" id="scope182" style="width: 40px" readonly="true"></s:textfield></td>
			</tr>
			<tr>
				<td colspan="2" rowspan="3">户主确认签字</td>
				<td colspan="4">经本人认真核对，本表所填内容为本户真实情况，并无异议</td>
			</tr>
			<tr>
				<td colspan="4">户主（签字）：<s:textfield name="entity.sign1" id="sign1" style="width: 80px" readonly="true"></s:textfield></td>
			</tr>
			<tr>
				<td colspan="4">日期：
					<s:textfield name="entity.sign_date" id="sign_date" style="width: 100px" readonly="true"></s:textfield>
				</td>
			</tr>
			</tbody>
		</table>
	</s:form>
</div>
</body>
</html>