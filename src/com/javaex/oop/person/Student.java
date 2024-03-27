package com.javaex.oop.person;

public class Student extends Person {    //Person클래스를 상속받은 Student 클래스 만들기
	
	
	//필드 만들기-----------------------
	private String schoolName;
	
	//생성자---------------------------
	//Person클래스에서 기본 생성자인 
    //public Person() { }를 선언했으므로
	
	public Student(String schoolName) {
		this.schoolName = schoolName;
		
	} //로 작성해주고
	
	public Student (String name, int age, String schoolName) {
		super(name,age);			//부모 생성자 호출하기?
		this.schoolName = schoolName;
	
		
	}
	
	//------------------------------------------------		
			//getter, setter
			public String getschoolName() {
				return schoolName;	 //schoolName를 돌려준다 리턴
			}
			
			public void setschoolName(String schoolName) {   //리턴이 필요없으므로 void
				this.schoolName = schoolName;
			}
    //------------------------------------------------
			//showInfo() 영역 만들기
			
	
	
	
	









}