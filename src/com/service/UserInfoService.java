package com.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.db.DBUtils;
import com.model.UserInfo;
import com.mysql.jdbc.PreparedStatement;

public class UserInfoService extends DBUtils{

	Connection conn = null ;
	
	public UserInfoService() throws SQLException{
		conn = getCon() ;
	}
	
	/**
	 * 新增用户
	 * @param u
	 * @return
	 */
	public boolean add(UserInfo u){
		PreparedStatement ps = null;
		boolean flag = false ;
		try {
			String sql = "insert into userinfo(name,keyword1,keyword2,keyword3,keyword4,keyword5,keyword6,keyword7,keyword8,keyword9,keyword10,keyword11,keyword12,keyword13,keyword14,keyword15,keyword16,keyword17,keyword18,keyword19,keyword20) values ('" 
					+ u.getName()+"',"
					+ u.getKeyword1()+",'"
					+ u.getKeyword2()+"','"
					+ u.getKeyword3()+"','"+u.getKeyword4()+"','"+u.getKeyword5()+"','"+u.getKeyword6()+"','"+u.getKeyword7()+"','"+u.getKeyword8()+"','"+u.getKeyword9()+"','"+u.getKeyword10()+"','"+u.getKeyword11()+"','"+u.getKeyword12()+"','"+u.getKeyword13()+"','"+u.getKeyword14()+"','"+u.getKeyword15()+"','"+u.getKeyword16()+"','"+u.getKeyword17()+"','"+u.getKeyword18()+"','"+u.getKeyword19()+"','"+u.getKeyword20()
					+ "')" ;
			System.out.println(sql);
			 ps  = (PreparedStatement) conn.prepareStatement(sql);
			 ps.execute();
			 flag = true ;
			 System.out.println("注册结果:"+flag);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag ;
	}
	
	/**
	 * 根据查询条件查询用户列表
	 * @param u
	 * @return
	 */
	public List<UserInfo> list(UserInfo u,String page){
		PreparedStatement ps = null;
		List<UserInfo> list = new ArrayList<UserInfo>();
		UserInfo userInfo = null;
		try {
			String name = u.getName();
			String keyword1 = u.getKeyword1();
			String keyword2 = u.getKeyword2();
			String keyword3 = u.getKeyword3();
			String keyword4 = u.getKeyword4();
			String keyword5 = u.getKeyword5();
			String keyword6 = u.getKeyword6();
			String keyword7 = u.getKeyword7();
			String keyword8 = u.getKeyword8();
			String keyword9 = u.getKeyword9();
			String keyword10 = u.getKeyword10();
			String keyword11 = u.getKeyword11();
			String keyword12 = u.getKeyword12();
			String keyword13 = u.getKeyword13();
			String keyword14 = u.getKeyword14();
			String keyword15 = u.getKeyword15();
			String keyword16 = u.getKeyword16();
			String keyword17 = u.getKeyword17();
			String keyword18 = u.getKeyword18();
			String keyword19 = u.getKeyword19();
			String keyword20 = u.getKeyword20();
			int id = u.getId();
			
			String sql = "select * from userinfo where 1=1 ";
			if(id != 0 ){
				sql = sql + " and id ="+id ;
			}
			if(name != null && !name.isEmpty()){
				sql = sql + " and name like '%"+name+"%'" ;
			}
			
			System.out.println(sql);
			ps  = (PreparedStatement) conn.prepareStatement(sql);
			ResultSet  rs= ps.executeQuery();
			while (rs.next()) {
				userInfo = new UserInfo(rs.getString("name"), 
						rs.getString("keyword1"),rs.getString("keyword2"),rs.getString("keyword3"),rs.getString("keyword4"),rs.getString("keyword5"),rs.getString("keyword6"),rs.getString("keyword7"),rs.getString("keyword8"),rs.getString("keyword9"),rs.getString("keyword10"),rs.getString("keyword11"),rs.getString("keyword12"),rs.getString("keyword13"),rs.getString("keyword14"),rs.getString("keyword15"),rs.getString("keyword16"),rs.getString("keyword17"),rs.getString("keyword18"),rs.getString("keyword19"),
						rs.getString("keyword20"));
				userInfo.setId(rs.getInt("id"));
				list.add(userInfo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		int total=list.size();
		com.model.PageBean pageBean=new com.model.PageBean(Integer.parseInt(page),7);
		List<UserInfo> list12345 =new  ArrayList<UserInfo>();
		if(total!=0) {			
			for(int i=pageBean.getStart();i<(pageBean.getStart()+7)&&i<total;i++) {
				list12345.add(list.get(i));		
			}
		}
		return list12345;
	}
	public List<UserInfo> list(UserInfo u){
		PreparedStatement ps = null;
		List<UserInfo> list = new ArrayList<UserInfo>();
		UserInfo userInfo = null;
		try {
			String name = u.getName();
			String keyword1 = u.getKeyword1();
			String keyword2 = u.getKeyword2();
			String keyword3 = u.getKeyword3();
			String keyword4 = u.getKeyword4();
			String keyword5 = u.getKeyword5();
			String keyword6 = u.getKeyword6();
			String keyword7 = u.getKeyword7();
			String keyword8 = u.getKeyword8();
			String keyword9 = u.getKeyword9();
			String keyword10 = u.getKeyword10();
			String keyword11 = u.getKeyword11();
			String keyword12 = u.getKeyword12();
			String keyword13 = u.getKeyword13();
			String keyword14 = u.getKeyword14();
			String keyword15 = u.getKeyword15();
			String keyword16 = u.getKeyword16();
			String keyword17 = u.getKeyword17();
			String keyword18 = u.getKeyword18();
			String keyword19 = u.getKeyword19();
			String keyword20 = u.getKeyword20();
			int id = u.getId();
			
			String sql = "select * from userinfo where 1=1 ";
			if(id != 0 ){
				sql = sql + " and id ="+id ;
			}
			if(name != null && !name.isEmpty()){
				sql = sql + " and name like '%"+name+"%'" ;
			}
			
			System.out.println(sql);
			ps  = (PreparedStatement) conn.prepareStatement(sql);
			ResultSet  rs= ps.executeQuery();
			while (rs.next()) {
				userInfo = new UserInfo(rs.getString("name"), 
						rs.getString("keyword1"),rs.getString("keyword2"),rs.getString("keyword3"),rs.getString("keyword4"),rs.getString("keyword5"),rs.getString("keyword6"),rs.getString("keyword7"),rs.getString("keyword8"),rs.getString("keyword9"),rs.getString("keyword10"),rs.getString("keyword11"),rs.getString("keyword12"),rs.getString("keyword13"),rs.getString("keyword14"),rs.getString("keyword15"),rs.getString("keyword16"),rs.getString("keyword17"),rs.getString("keyword18"),rs.getString("keyword19"),
						rs.getString("keyword20"));
				userInfo.setId(rs.getInt("id"));
				list.add(userInfo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	/**
	 * 根据主键删除用户
	 * @param id
	 * @throws SQLException
	 */
	public void deleteuserInfo(int id) throws SQLException {
		String sql = "DELETE FROM userinfo WHERE id = ?" ;
		System.out.println("删除userinfo");
		 PreparedStatement pst = (PreparedStatement) conn.prepareStatement(sql) ;
		 pst.setInt(1, id);
		 pst.executeUpdate();
	}
	
	/**
	 * 根据ID查询用户
	 * @param id
	 * @return
	 * @throws SQLException 
	 */
	public UserInfo findUserById(int id) throws SQLException{
		String sql = "select * from userinfo where id = ?" ;
		PreparedStatement pst = (PreparedStatement) conn.prepareStatement(sql) ;
		pst.setInt(1, id);
		ResultSet rs =pst.executeQuery();
		UserInfo userInfo = null ;
		while (rs.next()) {
			userInfo = new UserInfo(rs.getString("name"), 
					rs.getString("keyword1"),rs.getString("keyword2"),rs.getString("keyword3"),rs.getString("keyword4"),rs.getString("keyword5"),rs.getString("keyword6"),rs.getString("keyword7"),rs.getString("keyword8"),rs.getString("keyword9"),rs.getString("keyword10"),rs.getString("keyword11"),rs.getString("keyword12"),rs.getString("keyword13"),rs.getString("keyword14"),rs.getString("keyword15"),rs.getString("keyword16"),rs.getString("keyword17"),rs.getString("keyword18"),rs.getString("keyword19"),
					rs.getString("keyword20"));
			userInfo.setId(id);
		}
		return userInfo ;
	}
	
	/**
	 * 修改用户
	 * @param u
	 * @return
	 * @throws SQLException 
	 */
	public void updateUser(UserInfo u) throws SQLException{
		String sql = "update userinfo set name=?,keyword1=?,keyword2=?,keyword3=?,keyword4=?,keyword5=?,keyword6=?,keyword7=?,keyword8=?,keyword9=?,keyword10=?,keyword11=?,keyword12=?,keyword13=?,keyword14=?,keyword15=?,keyword16=?,keyword17=?,keyword18=?,keyword19=?,keyword20=? where id = ?" ;
		PreparedStatement pst = (PreparedStatement) conn.prepareStatement(sql) ;
		pst.setString(1, u.getName());
		pst.setString(2,u.getKeyword1() );
		pst.setString(3,u.getKeyword2() );
		pst.setString(4,u.getKeyword3() );
		pst.setString(5,u.getKeyword4() );
		pst.setString(6,u.getKeyword5() );
		pst.setString(7,u.getKeyword6() );
		pst.setString(8,u.getKeyword7() );
		pst.setString(9,u.getKeyword8() );
		pst.setString(10,u.getKeyword9() );
		pst.setString(11,u.getKeyword10() );
		pst.setString(12,u.getKeyword11() );
		pst.setString(13,u.getKeyword12() );
		pst.setString(14,u.getKeyword13() );
		pst.setString(15,u.getKeyword14() );
		pst.setString(16,u.getKeyword15() );
		pst.setString(17,u.getKeyword16() );
		pst.setString(18,u.getKeyword17() );
		pst.setString(19,u.getKeyword18() );
		pst.setString(20,u.getKeyword19() );
		pst.setString(21,u.getKeyword20() );
		pst.setInt(22, u.getId());
        int i =pst.executeUpdate();
        System.out.println(i);
        if(i != 0){ 
        	System.out.println("执行成功");
        } 
	}
}
