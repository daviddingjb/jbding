<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%-- 分页  添加一个div用于显示数据 --%>
								<div id="connlist_show_div">
									<s:form action="conn_query" method="post" id="connlist_init_form" enctype="multipart/form-data">
										<table class="table table-bordered" style="width:98%;margin-left:1%;">
											<thead>
											<tr>
                                            	<th>选择</th>
												<th>名称</th>
												<th>描述</th>
												<th>数据库类型</th>
											</tr>
											</thead>
									
											<tbody>
											<s:iterator value="serverList" status="stat">
												<tr style="background-color: #E9EFFA; height: 24px; color: black;">
		                                            <td><s:checkbox name="number" fieldValue="%{#stat.index}"></s:checkbox></td>
													<td><s:property value="t_name" /></td>
													<td><s:property value="t_description" /></td>
													<td><s:property value="t_type" /></td>
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
		$("#connlist_show_div").Page("#connlist_init_form");

		//给新增班级按钮添加点击事件，实现班级信息的新增
		$("#btnNew").click(function() {
			$( "#dialog" ).OpenDialog({title:"新增服务",width:980}, "conn_toadd", "queryBean.pageIndex=<s:property value='queryBean.pageIndex'/>");
		});

		//给删除按钮添加点击事件，实现班级信息的删除
		$(".linkDel").click(function() {
			var serverName = $(this).attr("t_name");
			var updDate = $(this).attr("updDate");
			$("#dialog").MsgBox("是否确认删除该条班级信息？", function() {
				$("#content").SubmitForm($("#connlist_init_form"), "conn_del", {"queryBean.pageIndex":"<s:property value='queryBean.pageIndex'/>", "serverList.t_name" : serverName,"serverList.updDate" : updDate});
			});
		});

		//给修改添加点击事件，实现班级信息的 修改
		$(".linkUpd").click(function() {
			var serverName = $(this).attr("t_name");
			var updDate = $(this).attr("updDate");
			$( "#dialog" ).OpenDialog({title:"编辑",width:980}, "conn_updInit", {"queryBean.pageIndex":"<s:property value='queryBean.pageIndex'/>", "serverList.t_name" : serverName,"serverList.updDate" : updDate});
		});
	});
</script>
