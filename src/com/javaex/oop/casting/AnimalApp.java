//0327
package com.javaex.oop.casting;

public class AnimalApp {

	public static void main(String[] args) {
		
		Animal dog1 = new Dog("Snoopy");
		// upcasting : 부모 타입으로 자손 객체를 참조하는것
		//참조 타입에 설계된 것만 사용할수 있다 
		dog1.eat();
		dog1.walk();
//		dog1.bark();	//설계도에 있는것만 사용 가능해서 이부분은 사용 불가
		
		Dog dog2 = new Dog("Doogy");
		dog2.eat();
		dog2.walk();
		dog2.bark();     /// 이 경우에는 가능한 소스.
		
		
		//downcasting : 명시적으로 타입을 지정
		//dog1을 bark()하도록 해보자
		//Animal 설계도 전체를 Dog로 바꿔줘야 bark()기능이 가능하게되는것인데
		((Dog)(dog1)).bark(); {	//Animal=> Dog로 캐스팅 후 실행하는 것
									
			Dog pet = new Dog("Azi");	//아지라는 강아지를
			pet.eat();
			pet.walk();
			pet.bark();  //먹이고 산책시키고 바크하게 했는데
			
			pet = null;  //아지라는 강아지를 보내버렸다고 한다면
			
//			pet = new Cat("아즈라엘");//부모가 아닌 클래스에서는 참조가 불가해
			
		}
		
		{
			Animal pet = new Dog("Azi");
			pet.eat();
			pet.walk();
//			pet.bark();	//아지에게 먹이고, 산책하고 짖게하고
			
			//현재 펫이 어떤 클래스의 인스턴스인지 확인하기
			if (pet instanceof Dog) { 	//Dog의 인스턴스면
				((Dog)pet).bark();
			} else if (pet instanceof Cat) { //cat이 인스턴스면
				((Cat)pet).meow();
				
			}
				
		
			pet = null; //pet에 참조를 해제후

		
			pet = new Cat("아즈라엘");
			pet.eat();
			pet.walk();
//			pet.meow();
			if (pet instanceof Dog) { 	//Dog의 인스턴스면
				((Dog)pet).bark();
			} else if (pet instanceof Cat) { //cat이 인스턴스면
				((Cat)pet).meow();
			}
			
			
		}
		
		
	}

}
