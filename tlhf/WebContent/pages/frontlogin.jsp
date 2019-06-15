<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/style/css/login.css">
<title>系统登录</title>
</head>
<body>
<div>
  <form id="login" method="post" action="login_execute">
  		<h1>系统登录</h1>
	    <fieldset id="inputs">
	        <input id="loginName" type="text" name="user.uname" placeholder="用户名" autofocus required>   
	        <input id="passwd" type="password" name="user.pword" placeholder="密码" required>
	    </fieldset>
	    <fieldset id="actions">
	        <input type="submit" id="submit" value="登录">
	    </fieldset>
  </form>
</div>
</body>
</html>
