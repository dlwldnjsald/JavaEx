package com.javaex.phone;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConncetionTestHimedia {

	public static void main(String[] args) {


		String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
		String dbuser = "himedia";
		String dbpass = "himedia";
		
		Connection conn = null;
		
		try {
			// 드라이버 로드 
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 접속 문자열, 계정, 비번을 이용 데이터베이스 접속 시도
			conn = DriverManager.getConnection(dburl, dbuser, dbpass);
			
			// 데이터 베이스 접속 성공
			System.out.println(conn);
			System.out.println("connect 성공!");
		} catch (ClassNotFoundException e) {
			System.err.println("JDBC 드라이버를 로드하지 못했습니다");
			e.printStackTrace();
		} catch (SQLException e) {
			System.err.println("SQLError!");
			
		} finally {
			try {
				conn.close();
			} catch (Exception e) {
				
			}
		}

	}

}
