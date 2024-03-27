package com.javaex.oop.person; //실행코드니까 메인메서드 체크해두고 나머지는 메인 체크 안하기

////– Person 클래스를 만드세요.
//✓생성자, getter/setter, showInfo()

//– Person 클래스를 상속받아 Student 클래스를 만드세요.
//✓생성자, getter/setter, showInfo()

//– PersonApp 클래스를 통해서 인스턴스를 생성하고 showInfo()를 통해 확인하세요.
//✓Person p = new Person("정우성", 45);
//✓Student s1 = new Student("서울고등학교");
//✓Student s2 = new Student("이정재", 45, "한국고등학교" );

//– 자식 클래스와 부모클래스의 생성자 순서를 확인하세요

public class PersonApp {

	public static void main(String[] args) {
		Person p = new Person("정우성" , 45);
		p.showInfo();
		
		Student s1 = new Student("서울고등학교");
		s1.showInfo();
		
		Student s2 = new Student("이정재", 45, "한국고등학교");
		s2.showInfo();

	}

}
