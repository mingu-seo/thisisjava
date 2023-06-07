package ch02;

public class Var {

	public static void main(String[] args) {
		/*
		 * 변수 (Variable)
		 * - 변할가능성
		 * - 다른곳에서 사용
		 */
		// 변수 정의
		// 선언(미리)
		// 타입 변수명;
		int number;
		// 선언만한 상태에서는 사용불가 (지역변수)
		//System.out.println(number);
		// 반드시 초기화 후 사용
		number = 10; // 초기화
		System.out.println(number);
		// 선언과 초기화 동시에
		int n = 1;
		// 다른타입의 값을 대입 불가
//		n = 3.14;
		/*
		 * 자료형(타입, 데이터타입, 데이터형, 자료타입, 자료형...)
		 * 기본자료형 (정수, 실수, 논리)
		 * - 정수?->int, 21억넘어?->long, 소수점?->double
		 * int < long < double
		 * - 참/거짓?->boolean
		 * 
		 * 참조자료형
		 */
		n = 2;
		n = 3;
		n = 4;
		//n = 3.14; // type mismatch
		double d = 3.14;
		d = 3.15;
		d = 1; // 자동형변환
		System.out.println(d);
		/*
		 * 자동형변환
		 * - 작은범위의 타입 -> 큰범위의 타입
		 * 강제형변환
		 * - (타입)
		 * - 범위에서 벗어나는 부분 유실
		 */
		d = 1.5;
		int n2 = (int)d;
		System.out.println(n2);
		
		byte b1 = 1;
		byte b2 = 2;
		byte b3 = (byte)(b1 + b2);
		
		// 문자열과 +연산
		String s = "1"+3;
		// 문자열 -> 기본타입
		/*
		 * int -> Integer
		 * long -> Long
		 * double -> Double
		 * 
		 * .parseXXX()
		 */
		// 문자열 -> 정수/실수
		String age = "30";
		int age2 = Integer.parseInt(age);
		long age3 = Long.parseLong(age);
		double age4 = Double.parseDouble(age);
		
		// 정수/실수 -> 문자열
		String age5 = String.valueOf(age4);
		String age6 = age4+"";
		
		// 문자열 비교 - equals()
		String id = "admin";
		System.out.println(id);
		String id2 = new String("admin");
		System.out.println(id);
		System.out.println(id == id2);//메모리주소 비교
		
		System.out.println(id.equals(id2));
		
		// 아이디가 admin이면 관리자 출력
		id = null;
		if ("admin".equals(id)) {
			System.out.println("관리자");
		}
		
		//int class = 0;
		int a = 10;
		int b = 3;
		System.out.println(a / (double)b);
		System.out.println(a/b); // 몫
		System.out.println(a%b); // 나머지
		
		System.out.println(5/0);
		
		
		
		
	}

}
