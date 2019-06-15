package com.trusdata.page.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.trusdata.common.action.BaseAction;
import com.trusdata.page.service.PageService;
import com.trusdata.page.service.SublistPageServiceImpl;

public class SublistServlet extends BaseAction {

	private static final long serialVersionUID = -4187956342738482103L;
	
	private PageService service = new SublistPageServiceImpl();

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 接收request里的参数
		String stuName = request.getParameter("stuName");
		
		String pageNumStr = request.getParameter("pageNum");
		int pageNum = Integer.parseInt(pageNumStr); // 显示第几页数据
		
		String pagesizeStr = request.getParameter("pageSize");
		int pageSize = Integer.parseInt(pagesizeStr); // 每页显示多少条记录
		
		// 组装查询条件
		
		// 调用service获取查询结果
//		Pager<T> result = PageService.findPager(t, pageNum, pageSize);
		
		// 返回结果到页面
//		request.setAttribute("result", result);
		
		request.getRequestDispatcher("xxxx.jsp").forward(request, response);
	}
}
