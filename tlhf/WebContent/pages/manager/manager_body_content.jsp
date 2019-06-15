<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%-- 分页  添加一个div用于显示数据 --%>
				<%-- 局部更新用 --%>
				<div id="content">
					<%-- 包含原内容 --%>
			        <div class="row">
			            <div class="col-xs-6">
			            </div>
			            <div class="col-xs-6 pull-right" style="width: 40%;margin-right: 2%;">
			                <button class="button-title" id="linkDel">删除</button>
			                <button class="button-title" id="btnNew">录入</button>
			            </div>
			        </div>
			        <div class="row">
			            <div class="col-xs-12">
			                <div class="row">
			                    <div class="col-xs-12">
			                        <p class="iten-title">&nbsp;录入清单</p>
			                    </div>
			                    <div class="col-xs-12">
			                        <div class="group-lable">
								<div id="managerlist_show_div">
									<s:form action="conn_query" method="post" id="managerlist_init_form" enctype="multipart/form-data">
										<table class="table table-bordered" style="width:98%;margin-left:1%;">
											<thead>
											<tr>
                                            	<th>选择</th>
                                            	<th>年</th>
												<th>县市</th>
												<th>乡镇</th>
												<th>村</th>
												<th>组</th>
												<th>户主姓名</th>
												<th>评估总分</th>
											</tr>
											</thead>
									
											<tbody>
											<s:iterator value="serverList" status="stat">
												<tr style="background-color: #E9EFFA; height: 24px; color: black;">
													<s:hidden name="id" value="%{id}" />
													<td><s:checkbox name="number" fieldValue="%{#stat.index}"></s:checkbox></td>
													<td><s:property value="year1" /></td>
													<td><s:property value="county" /></td>
													<td><s:property value="township" /></td>
													<td><s:property value="village" /></td>
													<td><s:property value="group1" /></td>
													<td><s:property value="name1" /></td>
													<td><s:property value="scope182" /></td>
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

		//给新增班级按钮添加点击事件，实现班级信息的新增
		$("#btnNew").click(function() {
			$( "#dialog" ).OpenDialog({title:"录入服务",width:1080}, "manager_toadd", "queryBean.pageIndex=<s:property value='queryBean.pageIndex'/>");
		});

		//给删除按钮添加点击事件，实现班级信息的删除
		$("#linkDel").click(function() {
			var serverName = $(this).attr("id");
			$("#dialog").MsgBox("是否确认删除该条信息？", function() {
				$("#content").SubmitForm($("#managerlist_init_form"), "manager_del", {"queryBean.pageIndex":"<s:property value='queryBean.pageIndex'/>", "id1.id" : serverName});
			});
		});

		//给修改添加点击事件，实现班级信息的 修改
		$("#linkUpd").click(function() {
			var serverName = $(this).attr("id");
			$( "#dialog" ).OpenDialog({title:"编辑",width:1080}, "manager_updInit", {"queryBean.pageIndex":"<s:property value='queryBean.pageIndex'/>", "serverList.id" : serverName});
		});
	});
</script>
			                        </div>
			                    </div>
			                </div>
			            </div>
			        </div>
				</div>
