package com.javaex.oop.tv;

public class TV {

	
	// 채널범위 1~255
    //볼륨 범위 0~100//
	
	private static final int MIN_CHANNEL = 1;	//최소 채널 1로 지정했을때
	private static final int MAX_CHANNEL = 255;	 //최대 채널 255로 지정했을때
	private static final int MIN_VOLUME = 0;    //최소 볼륨을 0으로 지정했을때
	private static final int MAX_VOLUME = 100;	//최대 볼륨을 100으로 지정했을때 (선언
	
	//필드
	private int channel;
	private int volume;
	private boolean power;	
	
	
	public TV() {
		this.channel = 7;
		this.volume = 20;
		this.power = false;	
	}
	
	public TV(int channel, int volume, boolean power) {
			super();
			this.channel = channel;
			this.volume = volume;
			this.power = power;
	}
	
	public int getChannel() {
	return channel;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public boolean isPower() {
		return power;	
	}
	
	public void power(boolean on) {
		this. power = on;
	}
	
	//채널 변경 메서드
	public void channel(int channel) {
		//채널의 범위 체크
		if (channel >= MIN_CHANNEL && channel <= MAX_CHANNEL) {
			this. channel = channel;
			//범위를 벗어나면 채널 변경을 하지 않는다로 세팅되있음	
		}		//false && true => false성립
	}
	
	//채널 변경 메서드 (오버로딩)
	public void channel(boolean up) {
		if (up) {   //채널 음량
			if (this. channel < MAX_CHANNEL) {  //최대 채널에 도달하지 않음
				this. channel ++;
			}
		} else {    //채널 내림
			if (this.channel > MIN_CHANNEL) {   //최소 채널에 도달하지 않음
				this. channel --;
			}		
		}
	}
	
	// 볼륨 조절 메서드
	public void volume(int volume) {	//여기 volume에 100을 넣었을때, 100값에 volume이란 이름표를 붙인다 생각하기
		if (volume >= MIN_VOLUME && volume <= MAX_VOLUME) {  //예를들면 볼륨값을 최소 볼륨(0)이상, 최대볼륨(100) 이하로 지정해두어야 함
			this. volume = volume;    //true와 && false =>false성립
		}
	}
	
	// 볼륨 조절 메서드 (오버로딩)ㅁ
	public void volume(boolean up) {       //볼륨값이 트루면 up false면 out
		if (up) { 			//볼륨 높이기
			if (volume < MAX_VOLUME) {    //최대볼륨에 도달하지 않은 상태라 아직까지 볼륨을 증가할 여지 남아있음
				this. volume ++;
				}		
		} else {			//볼륨 낮추기
			if (volume > MIN_VOLUME) {    //최소볼륨보다 큰가 체크, 최소 볼륨에 도달하지 않은상태라 아직까지 볼륨을 낮출 여지 남아있음
				this. volume --;
			}
		}	
	}
	
	public void status() {
		if (power) {				//TV가 켜졌을때만 정보를 보여주자
			System.out.println("전원: 켜짐");
			System.out.println("현재 채널: "+ channel);
			System.out.println("현재 음량: " + volume);
		} else {
			System.out.println("전원: 꺼짐");
		}
		System.out.println("--------------------");
		
	}

}


		

	
	

