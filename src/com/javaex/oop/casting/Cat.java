package com.javaex.oop.casting;

public class Cat extends Animal {	//애니몰 클래스 상속받기

	//생성자 없어서 에러나는것 생성자 만들기
	public Cat(String name) {
		super(name);
	}
	
	//-------------------------------------------
	//기본 에니몰 클래스내의 기능 말고 한가지 더 meow()만들기
	public void meow() {
		System.out.println(name + ": 야옹");
	}
	
	//--------------------------------------------
	
}
