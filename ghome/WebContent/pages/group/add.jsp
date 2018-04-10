<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>TrusData</title>
</head>
<body>
<s:form action="group_toadd" method="post">
	<div class="container">
	    <div class="row">
	        <div class="col-xs-10 content">
	            <div class="row">
	                <div class="col-xs-12">
	                    <div class="new-line">
	                        <div class="new-line-little">
	                        	<p class="lable-p-style padding-need">名称：</p>
	                            <input name=mapping.t_name id="t_name" type="text" class="lable-style form-control padding-need">
	                            <p class="lable-p-style padding-need">描述：</p>
	                            <input name="mapping.t_description" id="t_description" type="text" class="lable-style form-control padding-need">
	                            <p class="select-p-style padding-need">数据源：</p>
			                	<s:select list="sourceDB" name="mapping.t_source_name" id="t_source_name" class="select-style form-control">
			                	</s:select>
	                            <p class="select-p-style padding-need">目标数据：</p>
			                	<s:select list="targetDB" name="mapping.t_target_name" id="t_target_name" class="select-style form-control">
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