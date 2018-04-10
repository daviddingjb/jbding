<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%-- 分页  添加一个div用于显示数据 --%>
<div id="jobslist_show_div">
	<s:form action="jobs_init" method="post" id="jobs_init_form" enctype="multipart/form-data">
		<table class="table table-bordered" style="width:98%;margin-left:1%;">
			<thead>
			<tr>
				<th>Check</th>
				<th>Name</th>
				<th>Description</th>
				<th>Mapping Name</th>
				<th>Source Name</th>
				<th>Target Name</th>
			</tr>
			</thead>

			<tbody>
			<s:iterator value="jobsList" status="stat">
				<tr style="background-color: #E9EFFA; height: 24px; color: black;">
                    <s:hidden name="t_name" value="%{t_name}" />
                    <s:hidden name="t_mapping_name" value="%{t_mapping_name}" />
                    <s:hidden name="t_source_name" value="%{t_source_name}" />
                    <s:hidden name="t_target_name" value="%{t_target_name}" />
					<td><s:checkbox name="number" fieldValue="%{#stat.index}"></s:checkbox></td>
					<td><s:property value="t_name" /></td>
					<td><s:property value="t_description" /></td>
					<td><s:property value="t_mapping_name" /></td>
					<td><s:property value="t_source_name" /></td>
					<td><s:property value="t_target_name" /></td>
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
		$("#jobslist_show_div").Page("#jobs_init_form");

		$("#btnNew").click(function() {
			$( "#dialog" ).OpenDialog({title:"新增服务",width:980}, "group_toadd", "queryBean.pageIndex=<s:property value='queryBean.pageIndex'/>");
		});

		$(".btnDel").click(function() {
			var serverName = $(this).attr("t_name");
			var updDate = $(this).attr("updDate");
			$("#dialog").MsgBox("是否确认删除该条信息？", function() {
				$("#content").SubmitForm($("#grouplist_init_form"), "group_del", {"queryBean.pageIndex":"<s:property value='queryBean.pageIndex'/>", "serverList.t_name" : serverName,"serverList.updDate" : updDate});
			});
		});

		$(".btnUpd").click(function() {
			var serverName = $(this).attr("t_name");
			var updDate = $(this).attr("updDate");
			$( "#dialog" ).OpenDialog({title:"编辑",width:980}, "group_updInit", {"queryBean.pageIndex":"<s:property value='queryBean.pageIndex'/>", "serverList.t_name" : serverName,"serverList.updDate" : updDate});
		});

		$(".runJob").click(function() {
			var serverName = $(this).attr("t_name");
			var updDate = $(this).attr("updDate");
			$( "#dialog" ).OpenDialog({title:"执行",width:980}, "jobs_runjob", {"queryBean.pageIndex":"<s:property value='queryBean.pageIndex'/>", "serverList.t_name" : serverName,"serverList.updDate" : updDate});
		});
	});
</script>
