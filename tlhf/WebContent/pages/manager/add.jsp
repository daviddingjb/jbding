<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<link rel="stylesheet" href="${pageContext.request.contextPath}/style/css/bootstrap.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/report.css">

<div style="padding: 20px 20px 10px;" class="wrapper">
	<s:form action="manager_toadd" method="post">
		<div class="con_center">
			<h3>随州市贫困户脱贫销号第三方评估抽样核查表</h3>
		</div>
		<div>
			<select name="server.year1" id="year1" class="width60">
				<option value="2015">2015</option>
				<option value="2016" selected="selected">2016</option>
				<option value="2017">2017</option>
				<option value="2018">2018</option>
			</select>
			&nbsp;年度
		</div>
		<div><select name="server.county" id="county" class="width60" onchange="changeValue();">
				<option value="--">--</option>
				<option value="曾都">曾都</option>
				<option value="随县">随县</option>
				<option value="广水">广水</option>
				<option value="高新区">高新区</option>
				<option value="大洪山风景区">大洪山风景区</option>
			</select>&nbsp;县市&nbsp;
			<input type="text" name="server.township" id="township" class="width100">&nbsp;乡镇&nbsp;
			<input type="text" name="server.village" id="village" class="width150">&nbsp;村&nbsp;
			<input type="text" name="server.group1" id="group1" class="width50"> 组
		</div>
		<div>
			<div>
				户主姓名：<input type="text" name="server.name1" id="name1" class="width70">&nbsp;
				家庭人口：<input type="text" name="server.family_size" id="family_size" class="width30" maxlength="3">&nbsp;人，
				其中：劳动力人口&nbsp;<input type="text" name="server.workers_size" id="workers_size" class="width30" maxlength="3">&nbsp;人，
				低保人口&nbsp;<input type="text" name="server.dibao_size" id="dibao_size" class="width30" maxlength="3">&nbsp;人，
				五保人口&nbsp;<input type="text" name="server.wudao_size" id="wudao_size" class="width30" maxlength="3">&nbsp;人。
			</div>
			<div>
				贫困户属性：
				<input name="server.poverty_level1" type="checkbox">&nbsp;一般贫困户&nbsp;
				<input name="server.poverty_level2" type="checkbox">&nbsp;低保户&nbsp;
				<input name="server.poverty_level3" type="checkbox">&nbsp;五保户&nbsp;
				<input name="server.poverty_level4" type="checkbox">&nbsp;低保贫困户&nbsp;
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
					<input name="server1.industry1" type="checkbox">种植业&nbsp;&nbsp;&nbsp;
					<input name="server1.industry2" type="checkbox">养殖业&nbsp;&nbsp;&nbsp;
					<input name="server1.industry3" type="checkbox">乡村旅游业&nbsp;&nbsp;
					<input name="server1.industry4" type="checkbox">特色手工业
					<input name="server1.industry5" type="checkbox">农业服务业&nbsp;&nbsp;
					<input name="server1.industry6" type="checkbox">商贸流通业<br/>
					<input name="server1.industry7" type="checkbox">&nbsp;其他&nbsp;
					<input name="server1.content7" type="text" id="industry7" class="width150">&nbsp;
					<input name="server1.industry8" type="checkbox">&nbsp;无主导产业&nbsp;
				</td>
				<td>
					<input type="number" name="server1.scope11" id="scope11" class="width40" maxlength="2" value="10">&nbsp;
				</td>
				<td>如该户有劳动力，有一项以上增<br/>
					收致富主导产业计满分，无不得分<br/>
					如该户无劳动力，直接计满分</td>
				<td><input type="number" name="server1.scope12" id="scope12" class="width40" maxlength="2"></td>
			</tr>
			<tr>
				<td>家庭成员就业创业技能</td>
				<td>
					<input name="server1.skill1" type="checkbox">务农技能&nbsp;&nbsp;
					<input name="server1.skill2" type="checkbox">&nbsp;务工技能&nbsp;&nbsp;
					<input name="server1.skill3" type="checkbox">&nbsp;创业技能&nbsp;&nbsp;
					<input name="server1.skill4" type="checkbox">&nbsp;其他技能&nbsp;
					<input name="server1.content4" type="text" id="skill4" class="width150"><br/>
					<input name="server1.skill5" type="checkbox">无就业创业技能
				</td>
				<td><input type="number" name="server1.scope21" id="scope21" class="width40" maxlength="2" value="10">&nbsp;</td>
				<td>如该户有劳动力，掌握一门以上<br/>
					就业创业技能计满分，无不得分<br/>
					如该户无劳动力，直接计满分</td>
				<td><input type="number" name="server1.scope22" id="scope22" class="width40" maxlength="2"></td>
			</tr>
			<tr>
				<td>上年人均可支配收入</td>
				<td>根据附表测算，约为&nbsp;<input type="number" name="server1.money1" id="money1" class="width120">&nbsp;元</td>
				<td>&nbsp;—&nbsp;</td>
				<td>&nbsp;—&nbsp;</td>
				<td>&nbsp;—&nbsp;</td>
			</tr>
			<tr>
				<td rowspan="4">本年人均可支配收入</td>
				<td>根据附表测算，约为&nbsp;<input type="number" name="server1.money2" id="money2" class="width120">&nbsp;元</td>
				<td>&nbsp;—&nbsp;</td>
				<td>&nbsp;—&nbsp;</td>
				<td>&nbsp;—&nbsp;</td>
			</tr>
			<tr>
				<td>是否超过同期国家扶贫标准（&nbsp;<input type="number" name="server1.fupinbz" id="money_module" value="4000" class="width80">&nbsp;元）：
					<input name="server1.check1y" type="checkbox">&nbsp;是&nbsp;&nbsp;&nbsp;
					<input name="server1.check1n" type="checkbox">&nbsp;否&nbsp;
				</td>
				<td><input type="number" name="server1.scope31" id="scope31" class="width40" maxlength="2" value="20"></td>
				<td>“是”计满分，“否”不得分</td>
				<td><input type="number" name="server1.scope32" id="scope32" class="width40" maxlength="2"></td>
			</tr>
			<tr>
				<td>是否达到同期本县（市）农村居民人均可支配收入（&nbsp;<input type="number" name="server1.renjun" id="renjun" class="width80">&nbsp;元）的70%：<br/>
					<input name="server1.check2y" type="checkbox">&nbsp;是&nbsp;&nbsp;&nbsp;
					<input name="server1.check2n" type="checkbox">&nbsp;否&nbsp;
				</td>
				<td><input type="number" name="server1.scope41" id="scope41" class="width40" maxlength="2" value="2"></td>
				<td>“是”计满分，“否”不得分</td>
				<td><input type="number" name="server1.scope42" id="scope42" class="width40" maxlength="2"></td>
			</tr>
			<tr>
				<td>该户低保、五保对象年人均保障性收入为&nbsp;<input type="number" name="server1.income" id="xxxxxxx" class="width80">&nbsp;
					元，是否超过同期国家扶贫标准：
					<input name="server1.check3y" type="checkbox">&nbsp;是&nbsp;&nbsp;&nbsp;
					<input name="server1.check3n" type="checkbox">&nbsp;否&nbsp;
					<input name="server1.check3o" type="checkbox">&nbsp;本户无低保、五保对象&nbsp;
				</td>
				<td><input type="number" name="server1.scope51" id="scope51" class="width40" maxlength="2" value="10"></td>
				<td>“是”计满分，“否”不得分。如该户无低保、五保对象，直接计满分</td>
				<td><input type="number" name="server1.scope52" id="scope52" class="width40" maxlength="2"></td>
			</tr>
			<tr>
				<td rowspan="2">人均可支配收入增幅（%）</td>
				<td>增幅约为&nbsp;<input type="number" name="server1.increase" id="increase" class="width40" maxlength="2" value="9.2">&nbsp;%（本年人均可支配收入/上年人均可支配收入-1）×100%</td>
				<td>&nbsp;—&nbsp;</td>
				<td>&nbsp;—&nbsp;</td>
				<td>&nbsp;—&nbsp;</td>
			</tr>
			<tr>
				<td>是否高于同期全省农村居民人均可支配收入平均增幅（&nbsp;
					<input type="number" name="server1.ave_increase" id="money2" class="width40" maxlength="2">&nbsp;%）：
					<input name="server1.check4y" type="checkbox">&nbsp;是&nbsp;&nbsp;&nbsp;
					<input name="server1.check4n" type="checkbox">&nbsp;否&nbsp;
				</td>
				<td><input type="number" name="server1.scope61" id="scope61" class="width40" maxlength="2" value="8"></td>
				<td>“是”计满分，“否”不得分</td>
				<td><input type="number" name="server1.scope62" id="scope62" class="width40" maxlength="2"></td>
			</tr>
			<tr>
				<td rowspan="2">二、生存基本状况</td>
				<td>是否不愁吃</td>
				<td>
					<input name="server2.eat_y" type="checkbox">&nbsp;是（一日三餐有保障，家庭成员不存在饿肚子的现象）&nbsp;&nbsp;&nbsp;
					<input name="server2.eat_n" type="checkbox">&nbsp;否&nbsp;
				</td>
				<td>&nbsp;—&nbsp;</td>
				<td>如选择否，该户脱贫一票否决</td>
				<td><input type="number" name="server2.scope72" id="scope72" class="width40" maxlength="2"></td>
			</tr>
			<tr>
				<td>是否不愁穿</td>
				<td>
					<input name="server2.wear_y" type="checkbox">&nbsp;是（有应季衣被，家庭成员不存在挨冷受冻的现象）&nbsp;&nbsp;&nbsp;
					<input name="server2.wear_n" type="checkbox">&nbsp;否&nbsp;
				</td>
				<td>&nbsp;—&nbsp;</td>
				<td>如选择否，该户脱贫一票否决</td>
				<td><input type="number" name="server2.scope82" id="scope82" class="width40" maxlength="2"></td>
			</tr>
			<tr>
				<td rowspan="9">三、生产生活条件及基本公共服务</td>
				<td>家庭主要住房状况</td>
				<td>
					<input name="server3.house1" type="checkbox">&nbsp;①非危房&nbsp;&nbsp;&nbsp;
					<input name="server3.house2" type="checkbox">&nbsp;②危房&nbsp;
				</td>
				<td><input type="number" name="server3.scope91" id="scope91" class="width40" maxlength="2" value="5"></td>
				<td>①计满分，②不得分、且该户脱贫一票否决</td>
				<td><input type="number" name="server3.scope92" id="scope92" class="width40" maxlength="2"></td>
			</tr>
			<tr>
				<td>家庭人均住房面积</td>
				<td>
					<input name="server3.house_y" type="checkbox">&nbsp;①20㎡以上（含20㎡）&nbsp;&nbsp;&nbsp;
					<input name="server3.house_n" type="checkbox">&nbsp;②20㎡以下<br/>（住房总面积&nbsp;
					<input name="server3.house_size" type="text" id="money2" class="width30" maxlength="2">&nbsp;㎡/
					<input name="server3.family_n" type="text" id="money2" class="width30" maxlength="2">&nbsp;人=
					<input name="server3.people_size" type="text" id="money2" class="width30" maxlength="2">&nbsp;㎡/人）
				</td>
				<td><input type="number" name="server3.scope101" id="scope101" class="width40" maxlength="2" value="5"></td>
				<td>①计满分，②不得分</td>
				<td><input type="number" name="server3.scope102" id="scope102" class="width40" maxlength="2"></td>
			</tr>
			<tr>
				<td>饮水状况</td>
				<td>
					<input name="server3.water1" type="checkbox">&nbsp;①自来水（包括集中供应和分散供应）&nbsp;&nbsp;
					<input name="server3.water2" type="checkbox">&nbsp;②无自来水但用水有保障（水井、水窖等较近）&nbsp;&nbsp;
					<input name="server3.water3" type="checkbox">&nbsp;③饮水困难
				</td>
				<td><input type="number" name="server3.scope111" id="scope111" class="width40" maxlength="2" value="5"></td>
				<td>①计满分，②计4分，③不得分</td>
				<td><input type="number" name="server3.scope112" id="scope112" class="width40" maxlength="2"></td>
			</tr>
			<tr>
				<td>用电状况</td>
				<td>
					<input name="server3.electricity1" type="checkbox">&nbsp;①通电且电压合格&nbsp;&nbsp;
					<input name="server3.electricity2" type="checkbox">&nbsp;②通电但电压较低（380伏用户低于353伏,220伏用户低于198伏）&nbsp;&nbsp;
					<input name="server3.electricity3" type="checkbox">&nbsp;③不通电
				</td>
				<td><input type="number" name="server3.scope121" id="scope121" class="width40" maxlength="2" value="5"></td>
				<td>①计满分，②计2分，③不得分</td>
				<td><input type="number" name="server3.scope122" id="scope122" class="width40" maxlength="2"></td>
			</tr>
			<tr>
				<td>交通状况</td>
				<td>
					<input name="server3.traffic1" type="checkbox">&nbsp;①所属村民小组（20户以上）通公路或砂石路（能通车）<br/>
					<input name="server3.traffic2" type="checkbox">&nbsp;②所属村民小组（20户以下）未通公路或砂石路但出行方便<br/>
					<input name="server3.traffic3" type="checkbox">&nbsp;③所属村民小组未通公路或砂石路且出行困难
				</td>
				<td><input type="number" name="server3.scope131" id="scope131" class="width40" maxlength="2" value="2"></td>
				<td>①计满分，②计1分，③不得分</td>
				<td><input type="number" name="server3.scope132" id="scope132" class="width40" maxlength="2"></td>
			</tr>
			<tr>
				<td>教育保障</td>
				<td>该户是否有适龄家庭成员因贫辍学现象发生：
					<input name="server3.education1" type="checkbox">&nbsp;是&nbsp;&nbsp;&nbsp;
					<input name="server3.education2" type="checkbox">&nbsp;否&nbsp;&nbsp;&nbsp;
				</td>
				<td><input type="number" name="server3.scope141" id="scope141" class="width40" maxlength="2" value="5"></td>
				<td>“是”不得分，且该户脱贫一票否决；“否”计满分</td>
				<td><input type="number" name="server3.scope142" id="scope142" class="width40" maxlength="2"></td>
			</tr>
			<tr>
				<td rowspan="2">医疗保障</td>
				<td>该户符合参合条件的家庭成员是否全部参加新型农村合作医疗：<br/>
					<input name="server3.medical_treatment11" type="checkbox">&nbsp;是&nbsp;&nbsp;&nbsp;
					<input name="server3.medical_treatment12" type="checkbox">&nbsp;否
				</td>
				<td><input type="number" name="server3.scope151" id="scope151" class="width40" maxlength="2" value="5"></td>
				<td>“是”计满分，“否”不得分</td>
				<td><input type="number" name="server3.scope152" id="scope152" class="width40" maxlength="2"></td>
			</tr>
			<tr>
				<td>有重大疾病的家庭成员是否享受到大病救助政策：<br/>
					<input name="server3.medical_treatment21" type="checkbox">&nbsp;是&nbsp;&nbsp;
					<input name="server3.medical_treatment22" type="checkbox">&nbsp;否&nbsp;&nbsp;
					<input name="server3.medical_treatment23" type="checkbox">&nbsp;无大病情况
				</td>
				<td><input type="number" name="server3.scope161" id="scope161" class="width40" maxlength="2" value="5"></td>
				<td>“是”计满分，“否”不得分。无大病情况直接计满分</td>
				<td><input type="number" name="server3.scope162" id="scope162" class="width40" maxlength="2"></td>
			</tr>
			<tr>
				<td>养老保障</td>
				<td>符合参保条件并有参保意愿的家庭成员是否全部参加城乡居民基本养老保险：
					<input name="server3.pension1" type="checkbox">&nbsp;是&nbsp;&nbsp;&nbsp;
					<input name="server3.pension2" type="checkbox">&nbsp;否&nbsp;&nbsp;&nbsp;
				</td>
				<td><input type="number" name="server3.scope171" id="scope171" class="width40" maxlength="2" value="3"></td>
				<td>“是”计满分，“否”不得分</td>
				<td><input type="number" name="server3.scope172" id="scope172" class="width40" maxlength="2"></td>
			</tr>
			<tr>
				<td colspan="5">该  户  评  估  总  分 </td>
				<td><input type="number" name="server3.scope182" id="scope182" class="width40" maxlength="3"></td>
			</tr>
			<tr>
				<td colspan="2" rowspan="3">户主确认签字</td>
				<td colspan="4">经本人认真核对，本表所填内容为本户真实情况，并无异议</td>
			</tr>
			<tr>
				<td colspan="4">户主（签字）：<input type="text" name="server3.sign" name="server.sign" id="scope182" class="width80"></td>
			</tr>
			<tr>
				<td colspan="4">日期：
					<s:textfield name="server.sign_date" cssClass="sign_date" id="sign_date" style="width: 100px" readonly="true"></s:textfield>
				</td>
			</tr>
			<tr>
				<td colspan="6">注：按2010年国家扶贫标准2300元不变价推算，预计贫困线2015年可比价约为3072元，2016年约为3255元，2017年约为3449元，2018年约为3655元，2019年约为3873元，2020年约为4103元（推算数据仅作参考）
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
<script src="${pageContext.request.contextPath}/js/add.js"></script>
