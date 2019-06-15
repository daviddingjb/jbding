<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isErrorPage="true"
import="java.util.*,java.lang.*,java.io.*"
%><%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html >
<html>
<head>
<meta charset=UTF-8 />
<script type="text/javascript">
	(function(doc) {
		var kk = 4;
		setTimeout(function(){
			doc.getElementById("_this_link").click();
		}, 5000);
		setInterval(function(){
			doc.getElementById("h4").innerHTML = showT();
		}, 1000);
		
		function showT(){
			return "<label style='color : #f00'>"+ (kk--) +".....</label>";
		}
	})(document);
</script>
</head>
<body>
	<h2>
		<label style='color : #f00'>内部错误,请联系管理员.</label>
	</h2>
	<h4>请求地址：<%=request.getHeader("Referer") %></h4>
	<h4>异常内容: <s:property value="exception" /> </h4>
	<h4>异常细节: <s:property value="exceptionStack" /></h4> 
	<h4 id="h4">
		<label style='color : #f00'>5....</label>
	</h4>
	<div style="display: none">
	<% if (request.getHeader("Referer") != null && request.getHeader("Referer").contains("/admin")) {
	    %><a href="${pageContext.request.contextPath}/admin/backlogin.jsp"  id="_this_link" target="_top"></a>
	<% } else { 
	    %><a href="${pageContext.request.contextPath}/pages/frontlogin.jsp"  id="_this_link" target="_top"></a>
	<% }%>
	</div>
</body>
</html>
