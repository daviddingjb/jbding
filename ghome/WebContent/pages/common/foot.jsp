<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
    <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/accordion.js"></script>
    <script src="${pageContext.request.contextPath}/js/main.js"></script>
    <script src="${pageContext.request.contextPath}/js/navigation.js"></script>
    <script type="text/javascript">
	    var needHeight = $(".table").eq(0).css("height");
	    var finallyHeight = parseInt(needHeight)+100;
	    $(".white-need").css("height",finallyHeight);
        function getTableFinish(){
            $(".table-finish").show();
            $(".tabble-unfinish").hide();
            $(".change-one-img").attr("src","${pageContext.request.contextPath}/style/images/getChange.png");
            $(".change-two-img").attr("src","${pageContext.request.contextPath}/style/images/noChange.png");
        }
        function getTableUnfinish(){
            $(".table-unfinish").show();
            $(".tabble-finish").hide();
            $(".change-two-img").attr("src","${pageContext.request.contextPath}/style/images/getChange.png");
            $(".change-one-img").attr("src","${pageContext.request.contextPath}/style/images/noChange.png");
        }
    </script>