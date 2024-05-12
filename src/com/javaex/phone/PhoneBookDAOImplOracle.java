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
			conn = DriverManager.getConnection(dburl, DatabaseConfigPh.DB_USER, DatabaseConfigPh.DB_PASS);
			
		//catch 블록-> ClassNotFoundException이 발생하면, 드라이버를 찾을 수 없다는 메시지를 출력	
		} catch (ClassNotFoundException e) {
			System.err.println("CANNOT FIND DRIVER");
//            throw new SQLException("Cannot find driver", e);
		}
		
		//데이터베이스에 성공적으로 연결되면, 연결된 Connection 객체를 반환
		//ClassNotFoundException이 발생한 경우 null을 반환
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
				e.printStackTrace();
			}
		}
		
		System.out.println("<1.리스트>");
		return  list;
	}

	
	//-----------------------------------------------------------------------------------------
	

	@Override
	public boolean insert(PhoneBookVO phonebookvo) {
	    Connection conn = null;
	    PreparedStatement pstmt = null;

	    try {
	        conn = getConnection();
	        
	        // SQL 쿼리를 작성하여 새로운 데이터를 삽입
	        String sql = "INSERT INTO PHONE_BOOK (id, name, hp, tel) VALUES (PHONE_BOOK_SEQ.NEXTVAL, ?, ?, ?)";
	        
	        // PreparedStatement를 사용하여 SQL 쿼리를 미리 컴파일하고 매개변수를 설정하여 SQL 인젝션을 방지
	        pstmt = conn.prepareStatement(sql);
	        pstmt.setString(1, phonebookvo.getName());
	        pstmt.setString(2, phonebookvo.getHp());
	        pstmt.setString(3, phonebookvo.getTel());
	        
	        // INSERT 쿼리 실행하고 성공 여부를 반환
	        int rowsAffected = pstmt.executeUpdate();
	        
	        // 삽입된 행의 수가 1 이상이면 true 반환
	        return rowsAffected > 0;
	        
	    } catch (SQLException e) {
	        e.printStackTrace();
	        
	        // 삽입 실패를 나타내는 false 반환
	        return false;
	        
	    } finally {
	        try {
	            // 리소스 닫기
	            if (pstmt != null)
	                pstmt.close();
	            if (conn != null)
	                conn.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}
	
	//-----------------------------------------------------------------------------------------

	
	//@Override 어노테이션으로 인터페이스 메서드를 재정의하고 있음
	@Override
	
	//매개변수(파라미터)로 PhoneBookVO 객체를 받음
	public boolean delete(PhoneBookVO phonebookvo) {
		
		//필요한 변수들 Connection, Statement 객체 선언,초기화
		Connection conn = null;
		Statement stmt = null;
		

		//try-catch >>
		try {
			
			// SQL 쿼리를 작성하여 직접 ID 값을 포함.
	        String sql = "DELETE FROM PHONE_BOOK WHERE ID = " + phonebookvo.getId();

	        // DELETE 쿼리 실행후의 삭제된 행의 수를 반환
	        @SuppressWarnings("null")
			int rowsAffected = stmt.executeUpdate(sql);
	        
	        // 삭제된 행의 수가 1 이상이면 true 를 반환
	        return rowsAffected > 0;

	    } catch (SQLException e) {
	        e.printStackTrace();
	        
	     // 삭제 실패를 나타내는 false를 반환
	        return false; 
	        
	    } finally {
	        try {
	            // 리소스 닫기
	            if (stmt != null)
	                stmt.close();
	            if (conn != null)
	                conn.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}

	//-----------------------------------------------------------------------------------------

	@Override
	public public PhoneBookVO search(int id) {
		
		List<PhoneBookVO> newList = new ArrayList<>();

	    Connection conn = null;
	    PreparedStatement pstmt = null;
	    ResultSet rs = null;
	    PhoneBookVO vo = null; // 검색 결과를 저장할 객체 초기화

	    try {
	        conn = getConnection();

	        // SQL 쿼리를 작성하여 PreparedStatement 객체를 생성합
	        String sql = "SELECT * FROM PHONE_BOOK WHERE id = ?";
	        pstmt = conn.prepareStatement(sql);

	        // PreparedStatement에 검색할 리스트 정보를 설정
	        pstmt.setInt(1, id);

	        // SQL쿼리 실행후의 결과를 ResultSet에 저장
	        rs = pstmt.executeQuery();

	        // if문
	        if (rs.next()) {
	            int id = rs.getInt(1);
	            String name = rs.getString(2);
	            String hp = rs.getString(3);
	            String tel = rs.getString(4);

	            vo = new PhoneBookVO(id, name, hp, tel);
	            
	        }
	        
	    } catch (SQLException e) {
	        e.printStackTrace();
	        
	    } finally {
	        try {
	        	if (rs != null) rs.close();
				if (pstmt != null)pstmt.close();
				if (conn != null) conn.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	    return newList;
	}
	


}
