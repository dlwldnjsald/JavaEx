package com.javaex.oop.person;

public class Person {
	
	//---------------------------------------
	private String name;
	private int age;		//필드 name,age 변수 선언
	
	//---------------------------------------
	//기본생성자 만들기
//	public Person() {
//		
//	}
	
	//----------------------------------------
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		System.out.println("     Inside Person Constructor");
		
	}								//생성자 name,age	
	//----------------------------------------
	
	//name과 age에 대한 getter,setter
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//-------------------------------------------------------------
	//showInfo() 영역 만들기
	public void showInfo() {
		System.out.println("Name: " + name + ", Age: " + age);
		
	}
	
	///------------------------------------------------------------
	
	
	
	
	

}
