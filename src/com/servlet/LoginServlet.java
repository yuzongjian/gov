package com.servlet;
	import java.io.IOException;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.SQLException;

	import javax.servlet.ServletException;
	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;
	import javax.servlet.http.HttpSession;

	import com.mysql.jdbc.Connection;
	import com.mysql.jdbc.Statement;

	/**
	 * Servlet implementation class LoginServlet
	 */
	@WebServlet("/LoginServlet")
	public class LoginServlet extends HttpServlet {
	    private static final long serialVersionUID = 1L;

	    /**
	     * @see HttpServlet#HttpServlet()
	     */
	    public LoginServlet() {
	        super();
	        // TODO Auto-generated constructor stub
	    }

	    /**
	     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	     *      response)
	     */
	    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        // TODO Auto-generated method stub
	        response.getWriter().append("Served at: ").append(request.getContextPath());
	    }

	    /**
	     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	     *      response)
	     */
	    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        // TODO Auto-generated method stub

	        response.setContentType("text/html;charset=utf-8");
	        request.setCharacterEncoding("utf-8");
	        String username = request.getParameter("username");
	        String password = request.getParameter("password");
	        try {
	            Class.forName("com.mysql.jdbc.Driver");
	        } catch (ClassNotFoundException e) {
	            e.printStackTrace();
	            System.out.println("�Ҳ������� ");
	        }
	        // ����URL                    ��������ַ                       �˿ں�    ���ݿ���
	        String url = "jdbc:mysql://localhost:3306/test";
	        Connection conn = null;
	        Statement stmt = null;
	        ResultSet rs = null;

	        try {                                                    //���ݿɵĵ�¼��  ��¼����
	            conn = (Connection) DriverManager.getConnection(url, "root", "root");
	            stmt = (Statement) conn.createStatement();
	            // SQL���
	            String sql = "select * from user where username='" + username + "' and password= '" + password + "'";
	            rs = stmt.executeQuery(sql);// ���ز�ѯ���
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        HttpSession session = request.getSession();
	        session.setAttribute("username", username);
	        try {
	            if (rs.next()) {
	                // �����¼���ǿգ�������ƥ����û��������룬��½�ɹ�
	                response.sendRedirect("userlist.jsp");
	            } else {
	                session.setAttribute("message", "�û��������벻ƥ�䡣");
	                System.out.println("XXXXXXXXXX");
	                response.sendRedirect("login.jsp");
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }

	    }

	}
