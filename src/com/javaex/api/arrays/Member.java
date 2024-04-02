package com.javaex.api.arrays;

public class Member implements Comparable { //<object>가 왜 붙어야되는지? 생략해도됨.

	//field
	String name;
	
	//생성자
	public Member(String name) {
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "Member [name=" + name + "]";
	}

	
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}
