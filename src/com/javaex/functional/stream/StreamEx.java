/*
 package com.javaex.functional.stream;




import java.util.ArrayList;

import java.util.Arrays;

import java.util.Iterator;

import java.util.List;

import java.util.stream.IntStream;

import java.util.stream.Stream;



//--------------Student class 내부에 생성--------------------

class Student {

	//field

	private String name;

	private int kor;

	private int eng;

	private int math;

	

	//생성자

	public Student(String name, int kor, int eng, int math) {

		this. name = name;

		this. kor = kor;

		this. eng = eng;

		this. math = math;

	}	

	

	//getters (getter만 체크해서 불러오기 alt shift s source->select getters)

	public String getName() {

	return name;

	}

	public int getKor() {

	return kor;

	}

	public int getEng() {

	return eng;

	}

	public int getMath() {

	return math;

	}

	

	

	public int getTotal() {

	return kor + eng + math;

	}



	public double getAverate() {

	return getTotal() /(double)3;

	}

	

	//toString

	@Override

	public String toString() {

	return "Student [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math ;

	}

	

		

	}



//-------------------------------------------------------------



public class StreamEx {

	

	public static void main (String[] args) {

		//프리미티브 타입 스트림

		int scores[] = { 80, 90,60,100, 60, 50 };

		

		//배열에서 스트링 뽑아내는 방법

		IntStream arrStream = Arrays.stream(scores);

		//System.out.println(arrStream);

			

			

		//사용자 정의 클래스 타입 스트림		//클래스부터 만들기 이 클래스 내부에))

		List<Student> students = new ArrayList<>();

		students.add(new Student("홍길동", 90, 95, 100));

		students.add(new Student("고길동", 80, 50, 90));

		students.add(new Student("전우치", 80, 90, 80));

		students.add(new Student("임꺽정", 70, 65, 70));

		students.add(new Student("장길산", 60, 60, 60));

		

		//컬렉션 프레임워크 클래스에서는 .stream() 메서드로 스트림 추출 가능하다

		Stream<Student> objStream = students.stream();//(Stream import해주기)

		//System.out.println(objStream);

		

		//최종 연산 : forEach

		testForEach(scores, students);

	

	}

	

	private static void testForEach( int[] source, List<Student> lst) {

		//forEach -> 최종연산, 스트림을 순회하면서 최종 처리를 담당하는 역할

		System.out.println("===================stream forEach");

		

		

		//배열의 순회

		for (int i = 0; i < source.length; i++) {

			System.out.println(source[i] + " ");

		}

		System.out.println();

		

		

		//forEach 사용 하는 방법

		Arrays.stream(source)

			.forEach(n -> System.out.print(n + " "));

			System.out.println();

		

		

		//컬렉션 순회

		Iterator<Student> it = lst.iterator();

		while(it.hasNext()) {

			Student st = it.next();

			System.out.println(st);

		}

		

		//forEach

		lst.stream()

			.forEach(obj -> System.out.println(obj));



	}

}	
 */
//=================================================================================================================

package com.javaex.functional.stream;



import java.util.ArrayList;

import java.util.Arrays;

import java.util.Iterator;

import java.util.List;

import java.util.stream.IntStream;

import java.util.stream.Stream;



//--------------Student class 내부에 생성--------------------

	class Student {

	

		//field

		private String name;

		private int kor;

		private int eng;

		private int math;

		

		

		//생성자

		public Student(String name, int kor, int eng, int math) {

			this. name = name;

			this. kor = kor;

			this. eng = eng;

			this. math = math;

		}	

		

		

		//getters (getter만 체크해서 불러오기 alt shift s source->select getters)

		public String getName() {

		return name;

		}

		public int getKor() {

		return kor;

		}

		public int getEng() {

		return eng;

		}

		public int getMath() {

		return math;

		}

		

		

		public int getTotal() {

		return kor + eng + math;

		}

	

		public double getAverate() {

		return getTotal() / (double)3;

		}

		

		

		

		//toString

		@Override

		public String toString() {

			return "Student [getTotal()=" + getTotal() + ", getAverate()=" + getAverate() + "]";

		}





		public int getAverage() {

			// TODO Auto-generated method stub

			return 0;

		}

		



	}



		

	//------------------------------------------------------------------///

	

	public class StreamEx {

		

		public static void main(String[] args) {

			//프리미티브 타입 스트림

			int scores[] = { 80, 90,60,100, 60, 50 };

			

			

			//배열에서 스트링 뽑아내는 방법

			IntStream arrStream = Arrays.stream(scores);

			//System.out.println(arrStream);

				

				

			//사용자 정의 클래스 타입 스트림		//클래스부터 만들기 이 클래스 내부에))

			List<Student> students = new ArrayList<>();

			students.add(new Student("홍길동", 90, 95, 100));

			students.add(new Student("고길동", 80, 50, 90));

			students.add(new Student("전우치", 80, 90, 80));

			students.add(new Student("임꺽정", 70, 65, 70));

			students.add(new Student("장길산", 60, 60, 60));

			

			

			//컬렉션 프레임워크 클래스에서는 .stream() 메서드로 스트림 추출 가능하다

			Stream<Student> objStream = students.stream();//(Stream import해주기)

			//System.out.println(objStream);

			

			

			//최종 연산 : forEach

			//testForEach(scores, students);

			//testFilter(scores,stenents); //-------------------filter-----------------///

			//testMap(scores);	//--------------------------map--------------------///

			//testCountSum(scores);	//--------------------count,sum 함수------------///-

			//testFilterSort(students);	//-------------filter+sorted -----------///

			testReduce(scores);	//----------------reduce---------------------------///

		}

	

		

		private static void testForEach( int[] source, List<Student> lst) {

			//forEach -> 최종연산, 스트림을 순회하면서 최종 처리를 담당하는 역할

			System.out.println("===================stream forEach");

			

			

			//배열의 순회

			for (int i = 0; i < source.length; i++) {

				System.out.println(source[i] + " ");

			}

			System.out.println();

			

			

			//forEach 사용 하는 방법

			Arrays.stream(source) 

				.forEach(n -> System.out.print(n + " "));

				System.out.println();

			

			

			//컬렉션 순회

			Iterator<Student> it = lst.iterator();

			while(it.hasNext()) {

				Student st = it.next();

				System.out.println(st);

			}

			

			

			//forEach 

			lst.stream()

				.forEach(obj -> System.out.println(obj));

		

				

		

		}

		

		

		

		private static void testFilter(int[] arr, List<Student> lst) { 

			//arr 에서 점수가 70점 이상인 것만 추출

			System.out.println("=================stream filter");

			System.out.println(Arrays.toString(arr));

			

			

			Arrays.stream(arr)

				.filter(n -> n >= 70)

				.forEach(n -> System.out.print(n + " "));

			System.out.println();

			

			

			//lst에서 평균 점수가 70점 이상인 것만 추출

			lst.stream()

				.filter(obj -> obj.getAverage() >= 70)

				.forEach(System.out::println);

				

			

		

		}

		

		

		

		private static void testMap(int[] arr) {	

			System.out.println("===============stream map");

			//map은 형태는 그대로, 내부 요소의 변형

			System.out.println("원본:" + Arrays.toString(arr));

			//각 요소를 /2 해서 새로운 배열을 생성 

			

			

			Arrays.stream(arr) //배열을 스트림으로

				.map(n -> n / 2)	//함수 적용

				.forEach(n -> System.out.println(n + " " ));

			System.out.println();

			

			

			//배열 arr요소를 모두 *2 -> 새로운 배열로 변환

			int[] multiply = Arrays.stream(arr).map(n -> n * 2).toArray();

			System.out.println("*2:" + Arrays.toString(multiply));

			

		}

		

		

		

		private static void testCountSum(int[] arr) {

			//count : 요소의 개수를 카운트하는 함수(집계함수)

			int numCount = (int)Arrays.stream(arr).count();

			System.out.println(Arrays.toString(arr) + ": count = " + numCount);

			

			

			//sum : 기본형 특화 스트림에서만 사용 가능 

			//기본형 특화 스트림이란: 프리미티브타입을 처리하기 위해 만들어진 스트림

			//예)						IntStream, LongStream, DoubleStream..etc가 있다

			//배열로부터 70점 이상인 점수를 필터링 해서 모두 합산하는 코드 만들기

			System.out.println("70점 이상 점수 합계:" + Arrays.stream(arr).filter(n -> n >= 70).sum());

			

		}





		private static void testFilterSort(List<Student> list) {

			

			System.out.println("=================stream filter + sort");

			

			// 평균점 70점 이상인 학생 목록으로부터 학생 이름의 오름차순으로 정렬하여 출력

			list.stream()	//stream 생성

				.filter(obj -> obj.getAverage() >= 70)	//필터 함수 

				.sorted((obj1, obj2) -> obj1.getName().compareTo(obj2.getName()))	//정렬(오름차순)

				.sorted((obj1, obj2) -> -obj1.getName().compareTo(obj2.getName()))	//정렬(내림차순) -처리로 reverse하기

				.forEach(System.out::println);		

		}

		

		

		

		private static void testReduce(int[] arr) {

			System.out.println("원본:" + Arrays.toString(arr));

			System.out.println("=================stream reduce");

			

			int total = Arrays.stream(arr)

							.reduce(0, //누산기 초기값	

									(acc,curr) -> {		//acc: 누산기, curr: 현재요소

										System.out.println("acc:" + acc);

										System.out.println("curr:" + curr);

										return acc + curr;

									

									});

			

			

		}

		

	

	}	
