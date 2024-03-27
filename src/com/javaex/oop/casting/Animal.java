package com.javaex.oop.casting;

//상위클래스 animal, 하위 클래스 cat,dog
public class Animal {  

	//필드 
	protected String name;	//상속관계가 될거기에 protected로
	
	//생성자
	public Animal(String name) {
		this.name = name;
	}
	
	
	//메서드
	public void eat() {
		System.out.println(name + "이 먹고 있다.");
		
	}
	
	public void walk() {
		System.out.println(name + "은 산책중...");
		
	}
	
	//1)이제 여기까지 먼저 적은후 
	
	//2)에니몰 클래스를 바탕으로한 강아지,고양이 클래스 만들기
	//고양이는 에니몰을 쓸수 있는 상태가 될것이고 거기다 한가지 더 추가예정
	//캣클래스로 이동해서 생성자생성후 메서드 추가하기, dog클래스도 마찬가지로 
	
	//3)이제 animalapp으로 가서 세팅하기.
}
