<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%-- 分页  添加一个div用于显示导航栏 --%>
        <div class="col-xs-2 slider-left">
            <div class="slider">
                <div class="demo">
                    <ul class="left-nav">
                        <li><a href="/trusdata/pages/index.jsp">首页</a></li>
                        <li><a href="#">工作视图</a></li>
                        <li><a href="#">修复工作</a></li>
                        <li><a href="#">配置</a>
                            <ul>
                                <li id="conn"><a id="class_c" onclick="toggleClass()" href="${pageContext.request.contextPath}/pages/conn_init">连接配置</a></li>
                                <li id="group"><a id="class_g" href="${pageContext.request.contextPath}/pages/group_init">分组配置</a></li>
                                <li id="jobs"><a id="class_j" href="${pageContext.request.contextPath}/pages/jobs_init">工作配置</a></li>
                            </ul>
                        </li>
                        <li><a href="#">执行工作</a></li>
                        <li><a href="#">报告</a></li>
                        <li><a href="#">设置</a>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
