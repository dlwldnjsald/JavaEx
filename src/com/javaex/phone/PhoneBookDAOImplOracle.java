package com.javaex.phone;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

//마지막으로, Oracle 데이터베이스와 연동하여 
// PhoneBookDAO 인터페이스를 구현하는 PhoneBookDAOImplOracle 클래스를 정의중
public class PhoneBookDAOImplOracle implements PhoneBookDAO {

	//getConnection() 메서드-->>Oracle 데이터베이스에 연결을 시도중
	
	//getConnection() 메서드는->> 데이터베이스에 연결하기 위한 Connection 객체를 반환 
	// + SQLException을 던질수 있다 -->>?
	private Connection getConnection() throws SQLException {
		
		//Connection 객체인 conn을 먼저 선언하고 초기화해줌 
		Connection conn = null;
		
		//try-catch 블록
		//try 블록-> 데이터베이스에 연결하기 위한 작업시도
		try {
			//Oracle JDBC 드라이버를 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//데이터베이스의 URL을 정의
			String dburl = "jdbc:oracle:thin:@localhost:1521:xe";

			//정의한 URL과 사용자 이름, 비밀번호를 사용하여 데이터베이스에 연결
			conn = DriverManager.getConnection(dburl, 
					DatabaseConfigPh.DB_USER, DatabaseConfigPh.DB_PASS);
			
		//catch 블록-> ClassNotFoundException이 발생하면, 드라이버를 찾을 수 없다는 메시지를 출력	
		} catch (ClassNotFoundException e) {
			System.out.println("CANNOT FIND DRIVER");	
		
		}
		
		//데이터베이스에 성공적으로 연결되면, 연결된 Connection 객체를 반환
		//ClassNotFoundException이 발생한 경우 null을 반환
		return conn;
	}

	// 구현---------------------------------
	@Override
	public List<PhoneBookVO> getList() {

		List<PhoneBookVO> list = new ArrayList<>();

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			conn = getConnection();
			
			stmt = conn.createStatement();
			
			String sql = "SELECT id, name, hp, tel FROM PHONE_BOOK";
			
			rs = stmt.executeQuery(sql);

				
				while (rs.next()) {
					
					int phId = rs.getInt(1);
		            String phName = rs.getString(2);
		            String phHp = rs.getString(3);
		            String phTel = rs.getString(4);

					PhoneBookVO vo = new PhoneBookVO(phId, phName, phHp, phTel);
					list.add(vo);

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
			} catch (Exception e) {
				
			}
		}
		
		return  list;
	}


	//-----------------------------------------------------------------------------------------
	

	@Override
	public boolean insert(PhoneBookVO phonebookvo) {
	    Connection conn = null;
	    PreparedStatement pstmt = null;
	    int rowsAffected = 0;

	    try {
	        conn = getConnection();
	        
	        // SQL 쿼리를 작성하여 새로운 데이터를 삽입
	        String sql = "INSERT INTO PHONE_BOOK (id, name, hp, tel) " +
	        				"VALUES (PHONE_BOOK_SEQ.NEXTVAL, ?, ?, ?)";
	        
	        // PreparedStatement를 사용하여 SQL 쿼리를 미리 컴파일하고 매개변수를 설정하여 SQL 인젝션을 방지
	        pstmt = conn.prepareStatement(sql);
	        
	        pstmt.setString(1, phonebookvo.getName());
	        pstmt.setString(2, phonebookvo.getHp());
	        pstmt.setString(3, phonebookvo.getTel());
	        
	        // INSERT 쿼리 실행하고 성공 여부를 반환
	        rowsAffected = pstmt.executeUpdate();
	        
	    } catch (SQLException e) {
	        e.printStackTrace();
	      
	    } finally {
	        try {
	            // 리소스 닫기
	            if (pstmt != null) pstmt.close();
	            if (conn != null) conn.close();
	                
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	    return rowsAffected == 1;
	}
	
	//-----------------------------------------------------------------------------------------

	
	//@Override 어노테이션으로 인터페이스 메서드를 재정의하고 있음
	@Override
	
	//매개변수(파라미터)로 PhoneBookVO 객체를 받음
	public boolean delete(int index) {
		
		//필요한 변수들 Connection, Statement 객체 선언,초기화
		Connection conn = null;
		PreparedStatement pstmt = null;
		int rowsAffected = 0;
		
		//try-catch >>
		try {
			
			conn = getConnection();
			// SQL 쿼리를 작성하여 직접 ID 값을 포함.
	        String sql = "DELETE FROM PHONE_BOOK WHERE ID = ?";
	        pstmt = conn.prepareStatement(sql);
	        pstmt.setInt(1,index);
	      
	        
	        // DELETE 쿼리 실행후의 삭제된 행의 수를 반환
			rowsAffected = pstmt.executeUpdate();
	       
			
	    } catch (SQLException e) {
	        e.printStackTrace();
	        
	    } finally {
	        try {
	            // 리소스 닫기
	        	if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
				
	        } catch (Exception e) {
	           
	        }
	    }
		return rowsAffected == 1;
	}

	//-----------------------------------------------------------------------------------------

	@Override
	
		
	public PhoneBookVO search(int id) {
	    Connection conn = null;
	    PreparedStatement pstmt = null;
	    ResultSet rs = null;
	    PhoneBookVO vo = null;

	    try {
	        conn = getConnection();

	        String sql = "SELECT id, name, hp, tel FROM phonebook WHERE id = ?";
	        pstmt = conn.prepareStatement(sql);
	        pstmt.setInt(1, id);

	        rs = pstmt.executeQuery();

	        if (rs.next()) {
	            int listInfo1 = rs.getInt(1);
	            String insertName = rs.getString(2);
	            String insertPhone = rs.getString(3);
	            String insertHomeNumber = rs.getString(4);

	            vo = new PhoneBookVO(listInfo1, insertName, insertPhone, insertHomeNumber);
	        }

	    } catch (SQLException e) {
	        e.printStackTrace();

	    } finally {

	        try {
	            if (rs != null) rs.close();
	            if (pstmt != null) pstmt.close();
	            if (conn != null) conn.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	    return vo;
	}

}
