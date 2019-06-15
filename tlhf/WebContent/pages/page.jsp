<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%><%--
概要：本jsp用于显示分页信息
说明：jsp需要从action中取得分页所需的数据，并能提交指定的表单，绑定到action的数据中
使用方法：
      1.在jsp中适当的位置用include引入本jsp，不能在form内部
      2.在document加载后调用Page方法初始化，例如：$("#content").Page("#zy01_Form");
        "content"是一个div的id,zy01_Form是检索条件所在的表单id
      3.在响应的action中实现queryBean的set和get方法，并且queryBean必须是com.object.weblib.common.bean.PageBean的子类
依赖文件:
      1.page.css
      2.jquery.js
      3.jquery.page.js
 --%><link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/page.css" />
<div id="page_menulist_all_show">
共  <s:property value="queryBean.pageTotal" /> 页   / <s:property value="queryBean.sumItems" /> 条记录

<s:if test="queryBean.pageTotal > 1">
&nbsp;&nbsp;&nbsp; 
<span class="page_menulist_show" id="page_menulist_show"> 
	<span class="_page_index_first">首页</span> 
	<span class="_page_index_prev">上页</span> 
				<s:iterator value="queryBean.pageNo2Show">
					<span class="_page_index_number" index="<s:property/>"><s:property/></span> 
				</s:iterator>	
	<span class="_page_index_next">下页</span> 
	<span class="_page_index_last">末页</span> 
</span>
</s:if>
<span style="display:none;"><s:form action="#" method="post" id="_page_from_default"></s:form></span>
</div>
<script type="text/javascript">
$(function($){
	// 如果分页没有定义
	if ((! ZHSWL) || (typeof ZHSWL == 'undefined')) {
	    ZHSWL = new Object();
	    ZHSWL = {
	        PAGE : null,
	        MESSAGE : ""
	    };
	    ZHSWL.PAGE = {
	            index : 1,
	            searchflag : 0,
	            total : 1,
	            iteams : 1,
	            form : "#_page_from_default"
	    };
	}
	ZHSWL.PAGE.index = "${queryBean.pageIndex}",
	ZHSWL.PAGE.total = "${queryBean.pageTotal}",
	ZHSWL.PAGE.items = "${queryBean.sumItems}";
	var _MMIK = $("#page_menulist_show");
	_MMIK.find("span._page_index_number").each(function(it,nt){
		if($(nt).attr("index") == ZHSWL.PAGE.index) $(nt).addClass("PAGE_INDEX");
	});
	_MMIK.find("span").hover(function(event){
			$(event.target).addClass("PAGE_HOVER");
		},function(event){
			$(event.target).removeClass("PAGE_HOVER");
	});
});
</script>
<script type="text/javascript" src="${pageContext.request.contextPath}/jslib/jquery/jquery.page.js"></script>

