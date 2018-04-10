<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%-- 分页  添加一个div用于显示数据 --%>
			<div id="pair_show_div">
                <s:form action="group_queryPair" method="post" id="pair_init_form" enctype="multipart/form-data">
                    <div class="new-line" style="background: #e8edf1;border: 1px solid white;">
                        <div class="new-line-little" style="margin-left: 0;width:100%">
                        	<s:hidden name="t_name" value="%{t_name}" />
                            <p class="p-title-style padding-need">组名称：</p>
                            <p class="p-style padding-need"><s:property value="t_name" /></p>
                            <p class="p-title-style padding-need">描述：</p>
                            <p class="p-style padding-need"><s:property value="t_description" /></p>
                            <p class="p-title-style padding-need">源链接：</p>
                            <p class="p-style padding-need"><s:property value="t_source_name" /></p>
                            <p class="p-title-style padding-need" style="margin-bottom: 20px;">目标连接：</p>
                            <p class="p-style padding-need"><s:property value="t_target_name" /></p>
                        </div>
                    </div>
                    <table class="table table-bordered">
                        <thead>
                        <tr>
                            <th>选择</th>
                            <th>对比名称</th>
                            <th>映射列</th>
                            <th>源模式</th>
                            <th>目标模式</th>
                            <th>校验状态</th>
                        </tr>
                        </thead>
                        
                        <tbody>
                        <s:iterator value="pairGroupList" status="stat">
                        <tr>
                        	<s:hidden name="pair_group_name" value="%{pair_group_name}" />
                        	<s:hidden name="source_tbl_name" value="%{source_tbl_name}" />
                        	<s:hidden name="target_tbl_name" value="%{target_tbl_name}" />
                        	
                            <td><s:checkbox name="number" fieldValue="%{#stat.index}"></s:checkbox></td>
                            <td><s:label name="pair_group_name"></s:label></td>
                            <td></td>
                            <td><s:label name="source_tbl_name"></s:label></td>
                            <td><s:label name="target_tbl_name"></s:label></td>
                            <td></td>
                        </tr>
                        </s:iterator>
                        </tbody>
                    </table>
                </s:form>
				<div>
					<%-- 分页  包含page.jsp--%>
					<%@include file="../page.jsp"%>
				</div>
                <button id="savePair" class="btn btn-default pull-right buttom-abolute" style="background:#222933;color:white;margin-right:20px;width:100px;margin-top:5px;">保存</button>
            </div>
<script type="text/javascript">
	$(function($) {
		// 给分页信息添加相应事件，实现分页跳转
		$("#pair_show_div").Page("#pair_init_form");

		$("#savePair").click(function() {
			var groupName = $(this).attr("t_name");
			$("#dialog").MsgBox("是否确认配对该组信息？", function() {
				$("#content").SubmitForm($("#pair_init_form"), "pairGroup_savePair", {"queryBean.pageIndex":"<s:property value='queryBean.pageIndex'/>", "t_name" : groupName});
			});
		});
	});
</script>