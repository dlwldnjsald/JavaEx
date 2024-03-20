//// println (개행을 하는 출력문)
//// print (개행을 하지않는 출력문)
//// String의 포맷 ->printf 
///*  포맷 문자열 %s 로 문자열 사이에 입력하여 표기.
// * 
// *  
// *  System.out.printf("Hello%s of %s%n", "World","Java");
// *  Hello World of Java로 출력될것
// *  포맷문자열 자체가 스트링이라라는 객체가 갖고있는 포맷 기능(포맷은 메서드)메서드를 활용해서 
// *  위 소스코드가 만들어지는것
// *  package com.javaex.basic.reftype;
//========================================================================
package com.javaex.basic.reftype;
public class StringFormatEx {

	public static void main(String[] args) {
		// %s(=문자열), %d(=십진수), %n(=개행)
		
		// "_개의  _중에서 _개를 먹었다"    를 포매팅 해야할때 
		
		String fruit = "사과";
		int total = 10, eat = 3; //Str 포맷쓰면 편홰짐
			
		System.out.printf("%d개의 %s 중에서 %d개를 먹었다%n",    //포맷문자열로 간소화
				total,fruit,eat);   					//순서가 중요함 잊지 말기
		
		//  %d 의 천단위 구분 기호 : %,d  //콤마를 찍어주면 천단위에 , 찍어줘서 구분 가능해짐
		int amount = 1_234_567_890; // _로는 소스코드에서 적용하면되고 출력으로는 %,d를 사용해서 출력하게하면됨
		System.out.printf("%,d%n", amount);
		
//		double pi = Math.PI;  //선언과동시 할당
//		System.out.printf("PI: %f%n",  pi);
		double pi = Math.PI;  //선언과동시 할당
		System.out.printf("PI: %.2f%n",  pi);  //소수점 2째 자리까지 출력됨
		
		// 포맷 형식은 String 형의 .format 메서드에서 구현된다
		String fmt = "%d개의 %s 중에서 %d개를 먹었다%n";  //포맷 문자를 미리 만들어도됨
		System.out.println(fmt.formatted(10, "바나나" , 2)); 
		
		
	}

}
