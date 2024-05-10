package com.javaex.phone;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//마지막으로, Oracle 데이터베이스와 연동하여 
//데이터를 조회하는 PhoneBookDAOImplOracle 클래스를 작성
public class PhoneBookDAOImplOracle implements PhoneBookDAO {

	private Connection getConnection() throws SQLException {

		Connection conn = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String dburl = "jdbc:oracle:thin:@localhost:1521:xe";

			conn = DriverManager.getConnection(dburl, DatabaseConfigPh.DB_USER, DatabaseConfigPh.DB_PASS);
		} catch (ClassNotFoundException e) {
			System.err.println("CANNOT FIND DRIVER");
//            throw new SQLException("Cannot find driver", e);
		}

		return conn;
	}

	

	// --------오버라이딩 getList 메서드
	// 구현--------------------------------------------------------------------------------------------
	@Override
	public List<PhoneBookVO> getList() {

		List<PhoneBookVO> list = new ArrayList<>();

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			conn = getConnection();
			stmt = conn.createStatement();

			// ---Input 을 위한 Input 클래스 만든것 호출 ------------------- 이부분이랑 INPUT클래스 만드는것 헷갈림..
			Input input = new Input(); // Input 객체 생성
			int menu = input.getMenu(); // 사용자로부터 menu 입력 받기위한 menu 객체 생성
			

			//1번 메뉴에만 해당되는 리스트 불러오기 그래서 menu ==1로 설정
				if (menu == 1) {
					
					String sql = "SELECT id, name, hp, tel FROM PHONE_BOOK ORDER BY id";
					rs = stmt.executeQuery(sql);
	
						while (rs.next()) {
							
							int id = rs.getInt("id");
							String name = rs.getString("name");
							String hp = rs.getString("hp");
							String tel = rs.getString("tel");
		
							PhoneBookVO vo = new PhoneBookVO(id, name, hp, tel);
							list.add(vo);

						}
						
				} else {
					System.out.println("잘못된 메뉴 선택입니다.");
				}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("<1.리스트>");
		return  list;
	}

	
	//-----------------------------------------------------------------------------------------
	@Override
	public boolean insert(PhoneBookVO phonebookvo) {
	
		return lit;
		
		
		
		
	}
	
	

	@Override
	public boolean delete(PhoneBookVO phonebookvo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean search(PhoneBookVO phonebookvo) {
		// TODO Auto-generated method stub
		return false;
	}
}
