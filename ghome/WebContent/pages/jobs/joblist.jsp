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
<title>trusData</title>
</head>
<body>
	<div class="container-fluid">
	    <s:include value="/pages/common/head.jsp" />
	    <div class="row">
			<s:include value="/pages/common/navigation_jobs.jsp" />
			
			<div class="col-xs-10 content">
	            <div class="row">
	                <div class="col-xs-6">
	                    <p class="newWelcome">工程配置-新建</p>
	                </div>
	            </div>
				<%-- 局部更新用 --%>
				<div id="content">
					<%-- 包含原内容 --%>
			        <div class="row">
			            <div class="col-xs-6">
			            </div>
			            <div class="col-xs-6 pull-right" style="width: 40%;margin-right: 2%;">
			                <button class="button-title" id="btnDel">删除</button>
			                <button class="button-title" id="btnUpd">编辑</button>
			                <button class="button-title" id="btnNew">新建</button>
			            </div>
			        </div>
			        <div class="row">
			        	<div class="col-xs-12">
			        		<div class="row">
			        			<div class="col-xs-12">
			        				<p class="iten-title">&nbsp;筛选</p>
			        			</div>
			        			<div class="col-xs-12" style="padding-bottom:30px;">
			        				<div class="group-lable" style="padding-bottom:15px;">
										<s:include value="joblist_body_head.jsp" />
										<s:include value="joblist_body_content.jsp" />
			        				</div>
			        			</div>
			        		</div>
			        	</div>
			        </div>
				</div>
    			<button id="runJob" class="btn btn-default pull-right buttom-abolute" style="background:#222933;color:white;margin-right:20px;width:100px">执行</button>
			</div>
	    </div>
	</div>
	<%-- 弹出框用 --%>
	<div id="dialog" title="Basic dialog" class="display:none;"></div>
	<s:include value="/pages/common/foot.jsp" />
</body>
</html>
