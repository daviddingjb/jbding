<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>TrusData</title>
</head>
<body>

<s:form action="conn_toadd" method="post">
	<div class="container">
	    <div class="row">
	        <div class="col-xs-10 content">
	            <div class="row">
	                <div class="col-xs-12">
	                    <div class="new-line">
	                        <div class="new-line-little">
	                        	<p class="lable-p-style padding-need">名称：</p>
	                            <input name="server.t_name" id="t_name" type="text" class="lable-style form-control padding-need">
	                            <p class="lable-p-style padding-need">描述：</p>
	                            <input name="server.t_description" id="t_description" type="text" class="lable-style form-control padding-need">
	                            <p class="lable-p-style padding-need">主机名或IP地址：</p>
	                            <input name="server.t_host" id="t_host" type="text" class="lable-style form-control padding-need">
	                            <p class="lable-p-style padding-need">端口号：</p>
	                            <input name="server.t_port" id="t_port" type="text" class="lable-style form-control padding-need">
	                            <p class="lable-p-style padding-need">用户名：</p>
	                            <input name="server.t_user" id="t_user" type="text" class="lable-style form-control padding-need">
	                            <p class="lable-p-style padding-need">密码：</p>
	                            <input name="server.t_password" id="t_password" type="password" class="lable-style form-control padding-need">
	                            <p class="lable-p-style padding-need">数据库名称：</p>
	                            <input name="server.t_db_name" id="t_db_name" type="text" class="lable-style form-control padding-need">
	                            <p class="select-p-style padding-need">数据库类型：</p>
			                	<s:select list="dbmsg" name="server.t_type" id="t_type" class="select-style form-control">
			                	</s:select>
	                        </div>
	                        <div class="row">
	                            <div class="col-xs-12">
	                  				<input type="reset" class="button-finally" value="清空"/>
	                            	<input type="submit" class="button-finally" value="保存" />
	                            </div>
	                        </div>
	                    </div>
	                </div>
	            </div>
	        </div>
	    </div>
    </div>
</s:form>
</body>
</html>