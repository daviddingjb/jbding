<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%-- 分页  添加一个div用于显示数据 --%>
								<div id="reportlist_show_div">
									<s:form action="energy_query" method="post" id="reportlist_init_form" enctype="multipart/form-data">
										<table class="table table-bordered" style="width:98%;margin-left:1%;">
											<thead>
											<tr>
                                            	<th>选择</th>
                                            	<th>录入日期</th>
												<th>录入人</th>
												<th>联系方式</th>
											</tr>
											</thead>
									
											<tbody>
											<s:iterator value="serverList" status="stat">
												<tr style="background-color: #E9EFFA; height: 24px; color: black;">
													<s:hidden name="id" value="%{id1}" />
													<td><s:checkbox name="number" fieldValue="%{#stat.index}"></s:checkbox></td>
													<td><s:property value="input_date" /></td>
													<td><s:property value="inputer" /></td>
													<td><s:property value="call_way" /></td>
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
		$("#reportlist_show_div").Page("#reportlist_init_form");

		//给新增班级按钮添加点击事件，实现信息的新增
		$("#btnNew").click(function() {
			$( "#dialog" ).OpenDialog({title:"录入服务",width:1080}, "energy_toadd", "queryBean.pageIndex=<s:property value='queryBean.pageIndex'/>");
		});

		//给删除按钮添加点击事件，实现信息的删除
		$("#linkDel").click(function() {
			var id = $(this).attr("id");
			$("#dialog").MsgBox("是否确认删除该条信息？", function() {
				$("#content").SubmitForm($("#reportlist_init_form"), "energy_del", {"queryBean.pageIndex":"<s:property value='queryBean.pageIndex'/>", "id1.id" : id});
			});
		});

		//给修改添加点击事件，实现信息的 修改
		$("#linkUpd").click(function() {
			var id = $(this).attr("id");
			$( "#dialog" ).OpenDialog({title:"编辑",width:1080}, "energy_updInit", {"queryBean.pageIndex":"<s:property value='queryBean.pageIndex'/>", "serverList.id" : id});
		});
	});
</script>