package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {
	
	String url = "jdbc:mysql://localhost:3306/test?"
            + "user=root&password=root&useUnicode=true&characterEncoding=UTF8";
	Connection conn = null;
	
	public   Connection getCon() throws SQLException{
		try {
			Class.forName("com.mysql.jdbc.Driver"); // ����mysq����
			conn = DriverManager.getConnection(url);
			return conn ;
		} catch (ClassNotFoundException e) {
			System.out.println("�������ش���");
			e.printStackTrace();// ��ӡ������ϸ��Ϣ
		}
		return null ;
	}
}