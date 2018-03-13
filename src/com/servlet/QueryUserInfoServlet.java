package com.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.PageUtil;
import com.model.StringUtil;
import com.model.UserInfo;
import com.service.UserInfoService;

/**
 * Servlet implementation class QueryUserInfoServlet
 */
public class QueryUserInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QueryUserInfoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		int id = 0;
		String idStr = request.getParameter("id") ; 
		if(idStr !=null && !idStr.isEmpty()){
			id = Integer.valueOf(request.getParameter("id"));
		}
		String name = request.getParameter("name");
		//解决分页时name为字符串null的情况
	if("".equals(name)||name==null||"null".equals(name.trim())) {
			name=null;
		}
		String page = request.getParameter("page");
	
		if(StringUtil.isEmpty(page)){
			page="1";
			request.setAttribute("currpage", 1);
		}else{
			
		}
		UserInfo userinfo = new UserInfo(id,name);
		userinfo.toString();
		List<UserInfo>  list = null ;
		List<UserInfo>  list1234 = null ;
		try {
			UserInfoService us = new UserInfoService();
			 list = us.list(userinfo);
			 int total =list.size();
			 String pageCode=PageUtil.getPagation(request.getContextPath()+"/QueryUserInfoServlet"+"?"+"name="+name+"&", total, Integer.parseInt(page), 7);
			 request.setAttribute("pageCode", pageCode);
			 list1234=us.list(userinfo, page);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		request.setAttribute("list", list1234);
		request.getRequestDispatcher("userlist.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
