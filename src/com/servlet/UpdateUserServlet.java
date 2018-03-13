package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.UserInfo;
import com.service.UserInfoService;

/**
 * Servlet implementation class UpdateUserServlet
 */
public class UpdateUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateUserServlet() {
        super();
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
		String keyword17= request.getParameter("keyword17");
		String keyword18 = request.getParameter("keyword18");
		String keyword19 = request.getParameter("keyword19");
		String keyword20 = request.getParameter("keyword20");
		UserInfo user = new UserInfo(id, name, keyword1, keyword2, keyword3, keyword4, keyword5, keyword6, keyword7, keyword8, keyword9, keyword10, keyword11, keyword12, keyword13, keyword14, keyword15, keyword16, keyword17, keyword18, keyword19, keyword20);
		user.toString();
		System.out.println(user);
		try {
			UserInfoService u = new UserInfoService();
			u.updateUser(user);
			System.out.println("更新成功！");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("更新失败！");
		}
		response.sendRedirect("QueryUserInfoServlet");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
