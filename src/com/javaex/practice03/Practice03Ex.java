package com.javaex.practice03;



public class Practice03Ex {

	public static void main(String[] args) {
		
		//[Ex01.java]//아래의 출력 결과를 예상하여 작성하는것을 목표로 하기
		//예상 값 써보기: 
		
		//while 문
		//index= 0
		//index= 1
		//index= 2
		
		//for 문
		//order= 0
		//order= 1
		//order= 2
		
		//로 예상
		
		//결과 while 문 fore 문 중간에 행 띄어쓰지 않고 바로 나열됨
		
		System.out.println("while문");
			int index = 0;
			while( index < 3 ) {
				System.out.println("index=" + index);
				index++;
			}
			
			System.out.println("for문");
			for(int order=0; order<3; order++)
				System.out.println("order=" + order);
			
			// okay pass
			System.out.println("--------------------------");
	


		
		//[Ex02.java] for 문 연습--------------------------
		int x, y; // 여기서 (x 는 행의 개수,y 는 열의 개수 의미)

		for (x = 0; x < 4; x++) {
			for (y = 0; y < 2; y++) {
				System.out.print("1");
			}
			System.out.println("");
		}
		
		System.out.println("--------------------------");
		/*예상 실패-> 코드돌리기
		**
		**
		**
		**
		위에처럼 출력됨*/
		
		//+) for 문 연습------------------------------------
		//행열 4사이즈로 점점 누적되는 *로입력되는 코드 만들기
		
		// 행 수 , 열 수에 4 대입한 a,b 변수 생성
		int a = 4;
		int b = 4; 
		
		//for 의 for 의 if 문 돌리기
		for (int i = 0; i < a; i++) { //for loop 로 행 4개 공간 확보위한 세팅해주기
			for (int j = 0; j < b; j++) { //for loop 로 열 4개 확보위한 세팅해주기
				if (j <= i) {                  //본격적인 if 조건문을 통해
					System.out.print("2");	   //원하는 출력문 출력
				}
			}
			System.out.println("");
		}
		System.out.println("--------------------------");
		//------------------위에처럼 해도 되지만 더 간단하게 ---------
		
		 int size = 5; // 아예 int형 size 변수 생성해서 int형 수 할당해주기
		 //위에처럼 미리 배열의 크기만 조정해주면 패턴이 자동으로 조정되어 편리하다.

	        // 패턴을 저장할 2차원 배열 생성
	        String[][] pattern = new String[size][size];

	        // 배열에 별표 패턴 채우기
	        for (int row = 0; row < size; row++) {
	            for (int col = 0; col <= row; col++) {
	                pattern[row][col] = "3";
	            }
	        }
	    

	        // 패턴 출력
	        
	        for (int d = 0; d < size; d++) {
	            for (int e = 0; e < size; e++) {
	                if (pattern[d][e] == "3") {
	                    System.out.print("3");
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println(); // 각 행 출력 후 줄 바꿈
	        }
			
	        System.out.println("--------------------------");
		//-----------------------------더 간단하게 -----------============
	        
	        int f; // 여기서 (x 는 행의 개수,y 는 열의 개수 의미)
	        int g;
	        
	        for (f = 0; f < 4; f++) { //1.가로 4칸 공간 확보
	           
	        		for (g = 0; g < 4; g++) { //3.세로 4칸 공간 확보 (가로x세로 2차원 배열로 생각)
	        	   
	        				if(f >= g){ //5.(조건문은 엑셀로 생각해서 f행 g열의 값으로 생각해보기)
	        					System.out.print("4");  
	        				} //그안에 if 조건문만 넣어줘서 필요한 곳에만 데이터 입력하도록 
	        		}
	        		System.out.println(" "); 
	        		//4.4행*4열 공간에 모두 공백을 넣어줘서 백그라운드 만들기
	        		//0*0/1*1/2*2/3*3만큼 이렇게 점점 2차원 배열 공간이 점점 늘어나는 구조
	        }
	        System.out.println(); //2.가로 4칸 공간 확보한 이후 담줄로 개행 
	        
	    
	//[Ex03.java]for 문 연습---------------------------------------------
}
}

