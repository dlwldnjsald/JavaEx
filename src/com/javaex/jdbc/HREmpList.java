package com.javaex.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class HREmpList {

	public static void main(String[] args) {
		
		// db 연결 위한 dburl, dbuser, dbpass 선언 (접속정보)
		String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
		String dbuser = "hr";
		String dbpass = "hr";
		
		
		//변수 선언 및 초기화 
		//접속객체, 문맥객체(sql), 레코드(커서)객체 
		Connection c = null;  // 식별자쓸땐 주로 소문자로 해주기
		Statement s = null;
		ResultSet r = null;
		
		
		//try-catch
		try {
			//JDBC 드라이버 로드: Oracle JDBC 드라이버 클래스를 로드
			Class.forName("oracle.jdbc.driver.OracleDriver"); 
			//Connection 연결: DriverManager.getConnection(dburl, dbuser, dbpass)를 사용하여 데이터베이스에 연결
			c = DriverManager.getConnection(dburl,dbuser,dbpass);
			//Statement 생성: conn.createStatement()를 호출하여 
			//SQL 쿼리를 실행할 수 있는 Statement 객체를 생성
			s = c.createStatement();
			//rs = null;
			
				//sql 쿼리 작성
				String sql = "SELECT emp.first_name || ' ' || emp.last_name empl,"+ //name으로 별칭을 지어줌
						 "mgr.first_name || ' ' || mgr.last_name "+  //공백 주의..//2번인덱스
						 "FROM employees emp JOIN employees mgr "+
						 "ON emp.employee_id = mgr.employee_id "+
						 "ORDER BY empl DESC";	
				System.out.println("Query: " + sql);
			
				r = s.executeQuery(sql);
			 
			
					while (r.next()) {
						//getXXX(컬럼 순서) or getXXX(컬럼 프로젝션 이름)
						String ename = r.getString("empl"); //별칭 대신 String ename = r.getString(l); 해도됨
						String mname = r.getString(2); // 2번줄의 인덱스를 그대로 찍어도 됨
					
						//원하는 출력문 작성
						System.out.println("name: " + ename + ", manager: " + mname );
					}
			
			
		} catch (ClassNotFoundException e) {
			System.err.println("JDBC 드라이버를 로드하지 못했습니다.");
			e.printStackTrace();
			
		} catch (SQLException e) {
			System.err.println("SQLException");
			e.printStackTrace();
			
		} finally { 
			
			try {
				r.close();
			} catch (Exception e) {
				
			}//1
			
			try {
				c.close();
			} catch (Exception e) {
				
			}//2
			
			try {
				s.close();
			} catch (Exception e) {
				
			}//3

			
		}
		

		
	}
}
