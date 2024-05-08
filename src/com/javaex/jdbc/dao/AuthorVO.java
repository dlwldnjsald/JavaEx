package com.javaex.jdbc.dao;

// 데이터 전송 객체 (DTO)
// 특징 -> 
// 데이터 베이스 필드에 매칭되는 필드
// - getters/setters
// - 기본생성자
// - 로직포함 가급적 포함X
// - 객체관련된 toString() or equals() method 는 포함하기도 함
public class AuthorVO {
	
	
	//필드
	private Long authorId;      //pk
	private String authorName;
	private String authorDesc;
	
	
	//기본 생성자------------------------------------------------
	public AuthorVO() {  
		
	}//생성자명은 클래스명과 동일

	
	//전체필드 생성자--------------------------------------------
	public AuthorVO(Long authorId, 
					String authorName, 
					String authorDesc) {
		super();
		this.authorId = authorId;
		this.authorName = authorName;
		this.authorDesc = authorDesc;
	}

    //--------------------------------------------------------
	public AuthorVO(String authorName, String authorDesc) {
		super();
		this.authorName = authorName;
		this.authorDesc = authorDesc;
	}

	
	//getters, setters --------------------------------------
	public Long getAuthorId() {
		return authorId;
	}


	public void setAuthorId(Long authorId) {
		this.authorId = authorId;
	}


	public String getAuthorName() {
		return authorName;
	}


	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}


	public String getAuthorDesc() {
		return authorDesc;
	}


	public void setAuthorDesc(String authorDesc) {
		this.authorDesc = authorDesc;
	}

	
	//to string---------------------------------------------
	@Override
	public String toString() {
		return "AuthorVO [authorId=" + authorId + ", authorName=" + authorName + ", authorDesc=" + authorDesc + "]";
	}

	
	


	
	
}
