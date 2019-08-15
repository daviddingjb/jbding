<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<link rel="stylesheet" href="${pageContext.request.contextPath}/style/css/bootstrap.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/report.css">

<div style="padding: 20px 20px 10px;" class="wrapper">
	<s:form action="tdatajn_toadd" method="post">
		<div class="con_center">
			<h3>检测数据录入</h3>
		</div>
		<div>
			委托编号： <input type="text" name="tdatajn.entrusted_id" id="entrusted_id" class="width150">
		</div>
		<table border="1" style='border:1px solid #aaa'>
			<tbody>
				<tr>
					<td rowspan='3'>&nbsp;检测位置&nbsp;</td>
					<td rowspan='3'>&nbsp;房间面积m²（长*宽）&nbsp;</td>
					<td rowspan='3'>&nbsp;测点高度（m）&nbsp;</td>
					<td rowspan='3'>&nbsp;测点间距（m）&nbsp;</td>
					<td colspan='10' rowspan='3'>&nbsp;照度检测值（lx）（表格自左至右、自上至下各测点编号为1、2、3、4……）/（灯规格、数量）&nbsp;</td>
					<td colspan='3'>&nbsp;平均照度&nbsp;</td>
					<td colspan='4'>&nbsp;照明功率密度&nbsp;</td>
				</tr>
				<tr>
					<td rowspan='2'>&nbsp;实测值（lx）&nbsp;</td>
					<td rowspan='2'>&nbsp;设计值（lx）&nbsp;</td>
					<td rowspan='2'>&nbsp;偏差（%）&nbsp;</td>
					<td rowspan='2'>&nbsp;电流（A）&nbsp;</td>
					<td rowspan='2'>&nbsp;电压(V)&nbsp;</td>
					<td rowspan='2'>&nbsp;实测值（W/m2）&nbsp;</td>
					<td rowspan='2'>&nbsp;设计值（W/m2）&nbsp;</td>
				</tr>
				<tr></tr>
				<tr>
					<td rowspan='12' style="height: 260.0pt"><input type="text" name="tdatajn.sta_name" id="sta_name" style="width: 100%; height: 100%"></td>
					<td rowspan='12' style="height: 260.0pt"><input type="text" name="tdatajn.sta_size" id="sta_size" style="width: 100%; height: 100%"></td>
					<td rowspan='12' style="height: 260.0pt"><input type="text" name="tdatajn.sta_high" id="sta_high" style="width: 100%; height: 100%"></td>
					<td rowspan='12' style="height: 260.0pt"><input type="text" name="tdatajn.sta_length" id="sta_length" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_1" id="sta_value_1" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_2" id="sta_value_2" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_3" id="sta_value_3" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_4" id="sta_value_4" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_5" id="sta_value_5" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_6" id="sta_value_6" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_7" id="sta_value_7" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_8" id="sta_value_8" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_9" id="sta_value_9" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_10" id="sta_value_10" style="width: 100%; height: 100%"></td>
					<td rowspan='12' style="height: 260.0pt"><input type="text" name="tdatajn.sta_avg_value" id="sta_avg_value" style="width: 100%; height: 100%"></td>
					<td rowspan='12' style="height: 260.0pt"><input type="text" name="tdatajn.sta_des_value" id="sta_des_value" style="width: 100%; height: 100%"></td>
					<td rowspan='12' style="height: 260.0pt"><input type="text" name="tdatajn.sta_bias" id="sta_bias" style="width: 100%; height: 100%"></td>
					<td rowspan='12' style="height: 260.0pt"><input type="text" name="tdatajn.sta_electricity" id="sta_electricity" style="width: 100%; height: 100%"></td>
					<td rowspan='12' style="height: 260.0pt"><input type="text" name="tdatajn.sta_diany" id="sta_diany" style="width: 100%; height: 100%"></td>
					<td rowspan='12' style="height: 260.0pt"><input type="text" name="tdatajn.sta_act_value" id="sta_act_value" style="width: 100%; height: 100%"></td>
					<td rowspan='12' style="height: 260.0pt"><input type="text" name="tdatajn.sta_wm2_value" id="sta_wm2_value" style="width: 100%; height: 100%"></td>
				</tr>
				<tr>
					<td><input type="text" name="tdatajn.sta_value_11 id=sta_value_11" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_12 id=sta_value_12" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_13 id=sta_value_13" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_14 id=sta_value_14" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_15 id=sta_value_15" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_16 id=sta_value_16" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_17 id=sta_value_17" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_18 id=sta_value_18" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_19 id=sta_value_19" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_20 id=sta_value_20" style="width: 100%; height: 100%"></td>
				</tr>
				<tr>
					<td><input type="text" name="tdatajn.sta_value_21 id=sta_value_21" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_22 id=sta_value_22" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_23 id=sta_value_23" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_24 id=sta_value_24" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_25 id=sta_value_25" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_26 id=sta_value_26" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_27 id=sta_value_27" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_28 id=sta_value_28" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_29 id=sta_value_29" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_30 id=sta_value_30" style="width: 100%; height: 100%"></td>
				</tr>
				<tr>
					<td><input type="text" name="tdatajn.sta_value_31 id=sta_value_31" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_32 id=sta_value_32" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_33 id=sta_value_33" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_34 id=sta_value_34" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_35 id=sta_value_35" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_36 id=sta_value_36" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_37 id=sta_value_37" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_38 id=sta_value_38" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_39 id=sta_value_39" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_40 id=sta_value_40" style="width: 100%; height: 100%"></td>
				</tr>
				<tr>
					<td><input type="text" name="tdatajn.sta_value_41 id=sta_value_41" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_42 id=sta_value_42" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_43 id=sta_value_43" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_44 id=sta_value_44" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_45 id=sta_value_45" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_46 id=sta_value_46" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_47 id=sta_value_47" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_48 id=sta_value_48" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_49 id=sta_value_49" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_50 id=sta_value_50" style="width: 100%; height: 100%"></td>
				</tr>
				<tr>
					<td><input type="text" name="tdatajn.sta_value_51 id=sta_value_51" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_52 id=sta_value_52" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_53 id=sta_value_53" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_54 id=sta_value_54" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_55 id=sta_value_55" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_56 id=sta_value_56" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_57 id=sta_value_57" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_58 id=sta_value_58" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_59 id=sta_value_59" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_60 id=sta_value_60" style="width: 100%; height: 100%"></td>
				</tr>
				<tr>
					<td><input type="text" name="tdatajn.sta_value_61 id=sta_value_61" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_62 id=sta_value_62" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_63 id=sta_value_63" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_64 id=sta_value_64" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_65 id=sta_value_65" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_66 id=sta_value_66" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_67 id=sta_value_67" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_68 id=sta_value_68" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_69 id=sta_value_69" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_70 id=sta_value_70" style="width: 100%; height: 100%"></td>
				</tr>
				<tr>
					<td><input type="text" name="tdatajn.sta_value_71 id=sta_value_71" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_72 id=sta_value_72" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_73 id=sta_value_73" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_74 id=sta_value_74" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_75 id=sta_value_75" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_76 id=sta_value_76" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_77 id=sta_value_77" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_78 id=sta_value_78" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_79 id=sta_value_79" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_80 id=sta_value_80" style="width: 100%; height: 100%"></td>
				</tr>
				<tr>
					<td><input type="text" name="tdatajn.sta_value_81 id=sta_value_81" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_82 id=sta_value_82" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_83 id=sta_value_83" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_84 id=sta_value_84" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_85 id=sta_value_85" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_86 id=sta_value_86" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_87 id=sta_value_87" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_88 id=sta_value_88" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_89 id=sta_value_89" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_90 id=sta_value_90" style="width: 100%; height: 100%"></td>
				</tr>
				<tr>
					<td><input type="text" name="tdatajn.sta_value_91 id=sta_value_91" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_92 id=sta_value_92" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_93 id=sta_value_93" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_94 id=sta_value_94" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_95 id=sta_value_95" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_96 id=sta_value_96" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_97 id=sta_value_97" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_98 id=sta_value_98" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_99 id=sta_value_99" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_100 id=sta_value_100" style="width: 100%; height: 100%"></td>
				</tr>
				<tr>
					<td><input type="text" name="tdatajn.sta_value_101 id=sta_value_101" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_102 id=sta_value_102" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_103 id=sta_value_103" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_104 id=sta_value_104" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_105 id=sta_value_105" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_106 id=sta_value_106" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_107 id=sta_value_107" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_108 id=sta_value_108" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_109 id=sta_value_109" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_110 id=sta_value_110" style="width: 100%; height: 100%"></td>
				</tr>
				<tr>
					<td><input type="text" name="tdatajn.sta_value_111 id=sta_value_111" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_112 id=sta_value_112" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_113 id=sta_value_113" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_114 id=sta_value_114" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_115 id=sta_value_115" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_116 id=sta_value_116" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_117 id=sta_value_117" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_118 id=sta_value_118" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_119 id=sta_value_119" style="width: 100%; height: 100%"></td>
					<td><input type="text" name="tdatajn.sta_value_120 id=sta_value_120" style="width: 100%; height: 100%"></td>
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
