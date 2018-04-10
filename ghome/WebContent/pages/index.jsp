<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<title>TrusData</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/style/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/style/css/style.css">
</head>
<body>
	<div class="container-fluid">
	    <s:include value="/pages/common/head.jsp" />
	    <div class="row">
			<s:include value="/pages/common/navigation.jsp" />
        	<div class="col-xs-10 content">
        	</div>
	    </div>
	</div>
    <script src="${pageContext.request.contextPath}/jslib/jquery/jquery-1.10.1.min.js"></script>
	<s:include value="/pages/common/foot.jsp" />
</body>
</html>
