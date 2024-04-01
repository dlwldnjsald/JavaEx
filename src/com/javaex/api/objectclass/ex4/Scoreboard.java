package com.javaex.api.objectclass.ex4;
// alt shift s 후 source항묙에서 바로 찾아 만들수 있다

import java.util.Arrays;

//clone 메서드 이용을 위해 Cloneable 인터페이스를 구현 (아래코드와 같이 작성)------///
public class Scoreboard implements Cloneable {
	
	//field
	private int scores[]; 	//배열 선언후 생성자
	
	//생성자
	public Scoreboard(int[] scores) {
		super();
		this.scores = scores;
	}

	//getters,setters 
	public int[] getScores() {
		return scores;
	}

	public void setScores(int[] scores) {
		this.scores = scores;
	}

	
	//toString  override
	@Override
	public String toString() {
		return "Scoreboard [scores=" + Arrays.toString(scores) + "]";
	}
	
	//복제본 생성 메서드 --------------------------------------------///
	public Scoreboard getClone() {
		
		//새로운 인스턴스를 저장할 변수를 선언하자(아래)
		Scoreboard clone = null;  		//우선 참조데이터는 null 빈값으로 설정
		
		//얕은복제시도 
		try {
			clone = (Scoreboard)clone();
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();//예외 로그 출력
		}
		//return
		return clone;
	}
	
	
	
}
