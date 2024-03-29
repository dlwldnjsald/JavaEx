package com.javaex.exception;
//예외 처리 위한 연습

import java.io.IOException; //

// 사용자 정의 예외--------------------------------------------------------------
class CustomerArithException extends ArithmeticException {

	// field-----------------------------------------------------------------
	private int num1;
	private int num2;

	// 생성자 -----------------------------------------------------------------
	public CustomerArithException(String message, int num1, int num2) {
		super(message);
		this.num1 = num1;
		this.num2 = num2;

	}

	// getter ,setter ----------------------------------

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum1() {
		return num1;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public int getNum2() {
		return num2;
	}

}// 여기서 끝내고 새로 ThrowsExcept 클래스 아래에
	// 만들어주기-------------------------------------------!!!!!!

public class ThrowsExcept {
	// 선언부에 예외를 던질 것을 알림
	public void executeExcept() throws IOException {

		System.out.println("강제 예외 발생!");

		// 외부로 예외 던지기(throw)-----------
		throw new IOException("강제 예외!");
		// IOException은 대표적인 CheckedException,
		// CheckedException을 throw 할때는
		// 해당 메서드가 CheckedException을 던져준다는 점을
		// 외부의 메서드에게 알려줘야한다

	}

	public void executeRuntimeException() {
		// 런타임 익셉션 은 실행 타임에서만 확인되는 메서드이다
		// 예외 처리 없이도 컴파일은 되지만
		// 예외 처리를 거쳐야 안정성이 보장된다

		System.out.println("런타임 익셉션");

		throw new RuntimeException("런타임 익셉션");
		// throws 를 명시하지 않는다

	}

	// 2개의 숫자를 나누는 코드
	public double divide(int num1, int num2) {
		// 예외 발생시 보다 구체적인 예외로 변환한 후
		// 예외 상황의 정보를 추가해서 예외를 반환하는것이 좋다

		double result = 0;

		try {
			result = num1 / num2;

		} catch (ArithmeticException e) {
			// 보다 구체적인 예외로 전환---------------------
			CustomerArithException cae = new CustomerArithException("사용자 정의 Exception", num1, num2);

			// 전환된 사용자 정의 예외를 throw --------------
			throw cae;
		}

		return result;
	}

}// --------------------------------------------------------------------------------
