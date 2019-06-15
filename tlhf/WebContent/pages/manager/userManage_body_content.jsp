<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%-- 分页  添加一个div用于显示数据 --%>
								<div id="managerlist_show_div">
									<s:form action="userManage_query" method="post" id="managerlist_init_form" enctype="multipart/form-data">
										<table class="table table-bordered" style="width:98%;margin-left:1%;">
											<thead>
											<tr>
                                            	<th>选择</th>
                                            	<th>用户</th>
												<th>身份</th>
											</tr>
											</thead>
									
											<tbody>
											<s:iterator value="userList" status="stat">
												<tr style="background-color: #E9EFFA; height: 24px; color: black;">
													<s:hidden name="id" value="%{t_user}" />
													<td><s:checkbox name="number" fieldValue="%{#stat.index}"></s:checkbox></td>
													<td><s:property value="t_user" /></td>
													<td><s:property value="statusText" /></td>
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
		$("#managerlist_show_div").Page("#managerlist_init_form");

		$("#btnNew").click(function() {
			$( "#dialog" ).OpenDialog({title:"添加用戶服务",width:500}, "userManage_toAddUser", "queryBean.pageIndex=<s:property value='queryBean.pageIndex'/>");
		});

		$("#linkDel").click(function() {
			var serverName = $(this).attr("id");
			$("#dialog").MsgBox("是否确认删除该条信息？", function() {
				$("#content").SubmitForm($("#managerlist_init_form"), "userManage_del", {"queryBean.pageIndex":"<s:property value='queryBean.pageIndex'/>", "id1.id" : serverName});
			});
		});
	});
</script>
