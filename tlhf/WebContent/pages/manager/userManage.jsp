<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/style/css/dialog.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/style/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/style/css/style.css">
<jsp:include page="/jslib/inc_jquery.jsp" />
<title>随州脱贫验收系统</title>
</head>
<body>
	<div class="container-fluid">
	    <s:include value="/pages/common/head.jsp" />
	    <div class="row">
			<s:include value="/pages/common/navigation_user.jsp" />
        	<div class="col-xs-10 content">
	            <div class="row">
	                <div class="col-xs-6">
	                    <p class="newWelcome">系统-用户管理</p>
	                </div>
	            </div>
				<%-- 局部更新用 --%>
				<div id="content">
					<%-- 包含原内容 --%>
			        <div class="row">
			            <div class="col-xs-6">
			            </div>
			            <div class="col-xs-6 pull-right" style="width: 40%;margin-right: 2%;">
			                <button class="button-title" id="linkDel">删除</button>
			                <button class="button-title" id="btnNew">新建</button>
			            </div>
			        </div>
			        <div class="row">
			            <div class="col-xs-12">
			                <div class="row">
			                    <div class="col-xs-12">
			                        <p class="iten-title">&nbsp;用户清单</p>
			                    </div>
			                    <div class="col-xs-12">
			                        <div class="group-lable">
										<s:include value="userManage_body_content.jsp" />
			                        </div>
			                    </div>
			                </div>
			            </div>
			        </div>
				</div>
			</div>
		</div>
	</div>
	<%-- 弹出框用 --%>
	<div id="dialog" title="Basic dialog" class="display:none;"></div>
	<s:include value="/pages/common/foot.jsp" />
</body>
</html>
