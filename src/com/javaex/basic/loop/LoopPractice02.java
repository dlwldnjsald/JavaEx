package com.javaex.basic.loop;

import java.util.ArrayList;
import java.util.Scanner;

public class LoopPractice02 {

	public static void main(String[] args) {
		
		//1.if 문 연습
		IfPractice();
		
		//2.if 문 연습 && 3.비교 연산자
		IfPractice1();
		
		//4.List형-contains()
		ArrayList();
		
		//5.List형-contains() // +입력 콘솔 추가해서 작성해보기
		ArrayList02();
		
		//6. else if 문 연습
		ElseIfPractice();
		
		
	}
		//1.if 문 연습
		//boolean 사용/머니가 있으면 택시를 타고,없으면 걸어가라는 조건 만들기
		public static void IfPractice() {
		
			boolean money =false; 
			//머니가 있으면 ㅇ->true 로 설정, 
			//money 가 없으면 x ->false 로 설정하기 위해 boolean 형 사용하여 변수선언 및 할당해줌
			
				if(money) {
					System.out.println("Ride Taxi.");
				} else {
					System.out.println("Walk instead.");
				}
			
			//true 로 설정하면 Ride Taxi
			//false 로 설정하면 Walk instead 가 출력될것임.
			
				System.out.println("----------------");		
		}
		
	
		//2.if 문 연습
		//만약 3000원 이상의 돈을 가지고 있으면 택시를 타고, 없으면 걸어가라는 조건 만들기
		public static void IfPractice1() {
			
			int money = 0;//여기에 어떤 수를 할당하냐에 따라 if 조건문 또는 else 조건문을 수행할것임.
			
			if(money >= 3000) {
				System.out.println("Ride Taxi.");
			} else {
				System.out.println("Walk instead.");
			}
			System.out.println("----------------");	
			
			
		//3. if-else문과 비교연산자
		//돈이 3000원이상 있거나 카드가 있다면 택시를 타고, 그렇지 않으면 걸어가라.
			
			int money1 =0; //할당 any int. 형 #..
			boolean hasCard = true; //할당 true/false..
			
			if(money1 >= 3000 || hasCard) { 	
				System.out.println("Ride Taxi.");
			} else {
				System.out.println("Walk instead.");
			}
			//a or b 조건연산자의 경우 둘중 어느 하나라도 참이면 if 를 수행한다. 
			//둘다 false 일 경우 else 를 수행한다
			//&& and 연산자/ || or 연산자 / !는 not 연산자
			System.out.println("----------------");	
			
		}
		
		//4.List형-contains()
		//만약 주머니에 돈이 있으면 택시를 타고 없으면 걸어가라.
		//리스트 자료형에 해당아이템이 있는지 조사하는 코드 작성해보는 연습
				
		public static void ArrayList() {
					
			ArrayList<String> pocket = new ArrayList<>(); //import ArrayList
					
			//add
			pocket.add("phone");
			pocket.add("paper");
			pocket.add("perfume");
			pocket.add("pen");
			pocket.add("money");
					
											
				if (pock.contains("money")) {
					System.out.println("Ride Taxi.");
				} else {
					System.out.println("Walk instead.");
				}

					
		}
		
		//5.List형-contains()
		//만약 주머니에 돈이 있으면 택시를 타고 없으면 걸어가라.
		//리스트 자료형에 해당아이템이 있는지 조사하는 코드 작성해보는 연습
		
		public static void ArrayList02() {
			
			ArrayList<String> pocket = new ArrayList<>(); //import ArrayList
			
			//add
			pocket.add("phone");
			pocket.add("paper");
			pocket.add("perfume");
			pocket.add("pen");
			pocket.add("money");
			
			Scanner scanner = new Scanner(System.in);				//scanner import
			System.out.println("what do you need in this case?");	//client 에게 입력 요청시 작성하는 출력문
			String pock = scanner.next(); 							//pock 변수 스트링으로 설정후 입력위한 코드 설정
					
				if (pock.contains("money")) {
					System.out.println("Ride Taxi.");
				} else {
					System.out.println("Walk instead.");
				}

			scanner.close();										//scanner close
		}
		
		
		//6. else if 문 연습
		// 지갑에 돈이 있으면 택시를 타고, 지갑엔 돈이 없지만 카드가 있으면 택시를 타고, 돈도 없고 카드도 없으면 걸어가라.
		public static void ElseIfPractice() {
			
			boolean posessCard = true;
			
			ArrayList<String> pockey = new ArrayList<>();
			pockey.add("paper");
			pockey.add("phone");
		
			
			
		}
	
	}


