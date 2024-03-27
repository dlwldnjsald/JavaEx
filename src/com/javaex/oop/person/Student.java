package com.javaex.oop.person;

public class Student extends Person {    //Person클래스를 상속받은 Student 클래스 만들기
	
	
	//필드 만들기-----------------------
	private String schoolName;
	
	//생성자---------------------------
	//Person클래스에서 기본 생성자인 
    //public Person() { }를 선언했으므로
	
	public Student(String name, int age, String schoolName) {
		super(name, age);
		this.schoolName = schoolName;
		
		System.out.println( "   Student (3 parameter))");
	} //로 작성해주고
	
	//------------------------------------------------		
			//getter, setter
			public Student(String schoolName) {
				super("Unknown", 0);
				this.schoolName = schoolName;
				
				System.out.println( " stuent (1 parameter))");//schoolName를 돌려준다 리턴
			}
			
			public String getSchoolName() {
				return schoolName;
			}
			
			public void setSchoolName() {
				this.schoolName = schoolName;
				
			}
			
			@Override
			public void showInfo() {
				super.showInfo();
				System.out.println("School: " + schoolName);
				
			}
    //------------------------------------------------
			//showInfo() 영역 만들기
			
	
	
	
	









}