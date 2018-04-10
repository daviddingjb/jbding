<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%-- 分页  添加一个div用于显示数据 --%>
                                <s:form class="from-group-lable" action="" method="">
                                    <div class="col-xs-6">
                                        <p class="lable-p-style">工作名称：</p>
                                        <input type="text" class="lable-style form-control">
                                        <p class="lable-p-style">描述：</p>
                                        <input type="text" class="lable-style form-control">
                                    </div>
                                    <div class="col-xs-6">
                                        <p class="select-p-style">数据库类型：</p>
                                        <select class="select-style form-control">
                                            <option>MySQL</option>
                                            <option>Oracle</option>
                                            <option>SQL&nbsp;Server</option>
                                            <option>Sybase</option>
                                            <option>DB2</option>
                                            <option>Teradata</option>
                                            <option>Informix</option>
                                        </select>
                                        <button type="submit" class="btn btn-default pull-right" style="background:#222933;color:white;margin-right:50px;width:100px;margin-top:5px;">确认</button>
                                    </div>
                                </s:form>
