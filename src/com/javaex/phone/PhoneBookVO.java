package com.javaex.phone;
//
//1.데이터 전송 객체 (DTO) 만들기 
//특징 -> 
//데이터 베이스 필드에 매칭되는 필드
//- getters/setters
//- 기본생성자
//- 로직포함 가급적 포함X
//- 객체관련된 toString() or equals() method 는 포함하기도 함



public class PhoneBookVO {

		
			//필드-------------------------------------------------------
	  		private int id;
			private String name;
			private String hp;
			private String tel;
			
			
			
			//기본 생성자 만들기--------------------------------------------
			public PhoneBookVO() {
			}
			
			// 전체 필드 생성자---------------------------------------------
			public PhoneBookVO (int id, String name, String hp, String tel) {
				super();
				this.id =id;
				this.name = name;
				this.hp = hp;
				this.tel = tel;
				
			}
			
			// 부분 필드 생성자----------------------------------------------
			public PhoneBookVO(String name, String hp, String tel) {
				super();
				this.name = name;
				this.hp = hp;
				this.tel = tel;
			}
			
			
			// getters,setters methods------------------------------------
			public int getId() {
				return id;
			}

			public void setId(int id) {
				this.id = id;
			}

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getHp() {
				return hp;
			}

			public void setHp(String hp) {
				this.hp = hp;
			}

			public String getTel() {
				return tel;
			}

			public void setTel(String tel) {
				this.tel = tel;
			}

			// toString() methods override--------------------------------------
			@Override
			public String toString() {
				return "PhoneBookVO [id=" + id + ", name=" + name + ", hp=" + hp + ", tel=" + tel + "]";
			}

			
			
			
		}	
	
	

