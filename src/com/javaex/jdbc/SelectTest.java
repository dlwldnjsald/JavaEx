package com.javaex.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectTest {

	public static void main(String[] args) {
		//DB 연결 정보: dburl, dbuser, dbpass 변수에는 데이터베이스 연결을 위한 
		//URL, 사용자 이름 및 암호가 포함되어 있습니다
		String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
		String dbuser = "hr";
		String dbpass = "hr";
		
		
		//Connection, Statement, ResultSet 변수선언 및 초기화한 영역
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		
		//try - with - resources 문 (자동 자원 정리)
		//AutoClosable 인터페이스를 구현한 클래스들을 사용 가능
		try {
				//Oracle JDBC 드라이버 클래스를 로드
				Class.forName("oracle.jdbc.driver.OracleDriver"); //JDBC 드라이버 로드: 
				//Connection 연결: DriverManager.getConnection(dburl, dbuser, dbpass)를 사용하여 데이터베이스에 연결
				conn = DriverManager.getConnection(dburl,dbuser, dbpass);
				//Statement 생성: conn.createStatement()를 호출하여 
				//SQL 쿼리를 실행할 수 있는 Statement 객체를 생성
				stmt = conn.createStatement();
				//rs = null;
			
			
				String sql = "SELECT department_id, department_name FROM departments";
				//SQL 쿼리 실행: stmt.executeQuery(sql)를 사용하여 SQL 쿼리를 실행하고 
				//결과를 담은 ResultSet 객체를 얻는다
				rs = stmt.executeQuery(sql); //DB Cursor 반환
		
				
					//ResultSet 순회
					//while 루프를 사용하여 결과 집합을 반복하고, 
			    	//rs.getInt() 및 rs.getString()을 사용하여 각 행의 열 값을 가져온다
					while (rs.next()) {
						//getXXX(컬럼 순서) or getXXX(컬럼 프로젝션 이름)
						int deptId = rs.getInt(1);  //rs.getInt("department_id")
						String deptName = rs.getString("department_name"); //rs.getString(2)
					
						//원하는 출력문 작성
						System.out.printf("%d:%s%n",deptId,deptName);
					}
				
		
		//예외 처리: ClassNotFoundException은 JDBC 드라이버 클래스를 찾을 수 없는 경우 발생, 
		} catch (ClassNotFoundException e) {
			System.err.println("JDBC 드라이버를 로드하지 못했습니다.");
			e.printStackTrace();
		//SQLException은 SQL 에러를 처리.
		} catch (SQLException e) {
			System.err.println("SQLError!");
		//finally로 마무리
		} finally {
			
			try {
				rs.close();
			} catch (Exception e) {
				
			}//1
			
			try {
				stmt.close();
			} catch(Exception e) {
				
			}//2
			
			try {
				conn.close();
			} catch (Exception e) {
				
			}//3
			
		
		}
		
		
	}
}
//
