<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
                                <s:form class="from-group-lable" action="" method="" name="screenForm">
                                	<div class="col-xs-6">
                                        <p class="lable-p-style">名称：</p>
                                        <input type="text" class="lable-style form-control">
                                        <p class="lable-p-style">连接源名称：</p>
                                        <input type="text" class="lable-style form-control">
                                	</div>
                                    <div class="col-xs-6">
                                        <p class="select-p-style">描述：</p>
                                        <input type="text" class="lable-style form-control">
                                        <p class="select-p-style">目标源名称：</p>
                                        <input type="text" class="lable-style form-control">
                                        <button type="submit" class="btn btn-default pull-right" style="background:#222933;color:white;margin-right:50px;width:100px;margin-top:5px;">确认</button>
                                    </div>
                                </s:form>