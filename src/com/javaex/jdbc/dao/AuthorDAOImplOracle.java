package com.javaex.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AuthorDAOImplOracle implements AuthorDAO {

	// 접속 메서드 작성

	private Connection getConnection() throws SQLException {
		Connection conn = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // driver 로드
			String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
			// 오라클의 :thindriver : ip:port번호:서비스아이디

			conn = DriverManager.getConnection(dburl, DatabaseConfig.DB_USER, DatabaseConfig.DB_PASS);

		} catch (ClassNotFoundException e) {
			System.err.println("드라이버를 찾을 수 없습니다.");

		}

		return conn;
	}

	@Override
	public List<AuthorVO> getList() {
		List<AuthorVO> list = new ArrayList<>();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			// 1. connection
			conn = getConnection();
			// 2. statement
			stmt = conn.createStatement();
			// 3. SQL 쿼리 만들어 전송 -> ResultSet
			String sql = "SELECT author_id, author_name, author_desc FROM author";
			rs = stmt.executeQuery(sql);
			// 4. ResultSet 순회 -> 레코드를 AuthorVO 로 변경하고 List 에 추가
			while (rs.next()) {
				Long authorId = rs.getLong(1);
				String authorName = rs.getString(2);
				String authorDesc = rs.getString(3);

				AuthorVO vo = new AuthorVO(authorId, authorName, authorDesc);
				list.add(vo);
			}

			// 5. List 를 반환

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

		return list;
	}

	@Override
	public AuthorVO get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insert(AuthorVO authorVo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int insertedCount = 0;	//Insert 결과 영향받은 레코드 수
		
		try {
			//커낵션 생성
			conn = getConnection();
			//실행계획 준비
			String sql = "INSERT INTO author (author_id ,author_name, author_desc) " +
						 "VALUES (seq_author_id.NEXTVAL,?,?)";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, authorVo.getAuthorName());
			pstmt.setString(2, authorVo.getAuthorDesc());
			
			//쿼리 수행
			insertedCount = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
				
			} catch (Exception e) { }
		}
		return insertedCount == 1;   
	}

	@Override
	public boolean delete(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(AuthorVO authorVo) {
		// TODO Auto-generated method stub
		return false;
	}

	
}
