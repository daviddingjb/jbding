<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<link rel="stylesheet" href="${pageContext.request.contextPath}/style/css/bootstrap.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/report.css">

<div style="padding: 20px 20px 10px;" class="wrapper">
	<s:form action="userManage_toAddUser" method="post">
		<div class="con_center">
			<h3>添加用户管理</h3>
		</div>
		<div>
			用户：<input type="text" name="user.t_user" id="t_user" class="width150"><br/>
			密码：<input type="password" name="user.t_password" id="t_password" class="width150"><br/>
			身份：<select name="user.t_level" id="t_level" class="width150">
					<option value="--">--</option>
					<option value="1">市信息录入员</option>
					<option value="9">区管理员</option>
					<option value="8">区信息录入员</option>
				</select>
		</div>
		<div class="row">
			<div class="col-xs-12">
				<input type="submit" class="button-finally" value="添加用户" />
			</div>
		</div>
	</s:form>
</div>
