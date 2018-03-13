package com.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.UserInfo;
import com.service.UserInfoService;

/**
 * Servlet implementation class AddUserServlet
 */
public class AddUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddUserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("name");
		String keyword1 = request.getParameter("keyword1");
		String keyword2 = request.getParameter("keyword2");
		String keyword3 = request.getParameter("keyword3");
		String keyword4 = request.getParameter("keyword4");
		String keyword5 = request.getParameter("keyword5");
		String keyword6 = request.getParameter("keyword6");
		String keyword7 = request.getParameter("keyword7");
		String keyword8 = request.getParameter("keyword8");
		String keyword9 = request.getParameter("keyword9");
		String keyword10 = request.getParameter("keyword10");
		String keyword11 = request.getParameter("keyword11");
		String keyword12 = request.getParameter("keyword12");
		String keyword13 = request.getParameter("keyword13");
		String keyword14 = request.getParameter("keyword14");
		String keyword15 = request.getParameter("keyword15");
		String keyword16 = request.getParameter("keyword16");
		String keyword17 = request.getParameter("keyword17");
		String keyword18 = request.getParameter("keyword18");
		String keyword19 = request.getParameter("keyword19");
		String keyword20 = request.getParameter("keyword20");
		UserInfo userinfo = new UserInfo(name, keyword1, keyword2, keyword3,keyword4,keyword5,keyword6,keyword7,keyword8,keyword9,keyword10,keyword11,keyword12,keyword13,keyword14,keyword15,keyword16,keyword17,keyword18,keyword19,keyword20);
		userinfo.toString();
		boolean result = false ;
		try {
			UserInfoService us = new UserInfoService();
			result = us.add(userinfo);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if(result){
			System.out.println("add userinfo success .");
			response.sendRedirect("QueryUserInfoServlet"); 
		}else{
			response.sendRedirect("error.jsp"); 
		}
		
		//request.getRequestDispatcher("QueryUserInfoServlet").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
