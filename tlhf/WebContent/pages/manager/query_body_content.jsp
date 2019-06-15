<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%-- 分页  添加一个div用于显示数据 --%>
										<div id="querylist_show_div">
											<s:form action="query_query" method="post" id="querylist_init_form1" enctype="multipart/form-data">
											<table class="table table-bordered" style="width:98%;margin-left:1%;">
												<thead>
												<tr>
	                                            	<th>选择</th>
	                                            	<th>日期</th>
													<th>录入人</th>
													<th>联系方式</th>
													<th>查看</th>
												</tr>
												</thead>
										
												<tbody>
												<s:iterator value="serverList" status="stat">
													<tr style="background-color: #E9EFFA; height: 24px; color: black;">
														<s:hidden name="id" value="%{id1}" />
														<td style="width:5%;text-align:center;"><s:checkbox name="number" fieldValue="%{#stat.index}"></s:checkbox></td>
														<td style="width:8%;text-align:center;"><s:property value="year1" /></td>
														<td style="width:10%;text-align:center;"><s:property value="county" /></td>
														<td style="width:18%;"><s:property value="township" /></td>
														<td style="width:25%;"><s:property value="village" /></td>
														<td style="width:8%;text-align:center;"><s:property value="group1" /></td>
														<td style="width:10%;"><s:property value="name1" /></td>
														<td style="width:5%;"><s:property value="scope182" /></td>
														<td style="color:#000000;text-align:center;"><a href="#" classid="<s:property value="%{id1}"/>" class="btnEntity" style="color:#0033ff;">查看该户信息</a></td>
													</tr>
												</s:iterator>
												</tbody>
											</table>
											</s:form>
											<div>
												<%-- 分页  包含page.jsp--%>
												<%@include file="../page.jsp"%>
											</div>
										</div>
<script type="text/javascript">
	$(function($) {
		// 给分页信息添加相应事件，实现分页跳转
		$("#querylist_show_div").Page("#querylist_init_form1");
		
		//查看
		$(".btnEntity").click(function() {
			var idx = $(this).attr("classid");
			$( "#dialog" ).OpenDialog({title:"查看服务",width:1080}, "query_entity", {"id1.id1" : idx});
		});

		$("#btnDownload").click(function() {
			$("#dialog").MsgBox("是否确认下载该信息？", function() {
				$("#contentDownload").SubmitForm($("#querylist_init_form"), "query_btnDownload");
			});
		});
		
		$("#btnSelect").click(function() {
			$("#dialog").MsgBox("是否确认查詢该信息？", function() {
				$("#content").SubmitForm($("#querylist_init_form"), "query_select");
			});
		});
	});
</script>
