package com.javaex.oop.tv;

		public class TVApp {

			public static void main(String[] args) {
				TV tv = new TV(7, 20, false);
				
				
				tv.status(); 	//힙메모리 상에 티비가 생성됨. 꺼져있는 상태
				
				
				
				tv.power(true);		//전원켜기
				
				tv.volume(120);		//음량의 범위(0-100)를 벗어남	//그대로 20으로 남게됨 볼륨 새로 세팅 안되어짐	
				tv.status();
				
				tv.channel(0);		//채널 범위(1-255)를 벗어남// 그대로 채널은 7값으로 남게 됨 채널 새로 세팅 안되어짐
				tv.status();
				
				
				//현재 채널에서 채널 7에서 하나씩 업하는것 세팅하는 경우
				tv.channel(true);	//channel + 1  =>현재 채널 8
				tv.channel(true);	//channel + 1  =>현재 채널 9
				tv.channel(true);	//channel + 1  =>현재 채널 10이 되게 됨 
				tv.status();
				
				tv.power(false); //tv 전원 꺼보기
				tv.status();
				

			}

		}


	