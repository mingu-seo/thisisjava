package ch02.sec06;

import ch01.verify.Example;

public class TextBlockExample {

	public static void main(String[] args) {
		String str1 = "" +
				"{\n" +
				"\t\"id\":\"winter\",\n" +
				"\t\"name\":\"눈송이\"\n" +
				"}";
		System.out.println(str1);
		
		// 타입추론(jdk 11이상)
		var a = 1;
		var b = "";
		var e = new Example();
		
		int i = 1;
		long l = i; // 자동형변환
		int i2 = (int)l; // 강제형변환
		
		double d = 3.14;
		int d2 = (int)d; // 강제형변환 (소수점 유실)
		System.out.println(d2);
		
		// 정수와 정수의 연산은 결과값이 항상 정수
		int kor = 90;
		int eng = 80;
		int math = 87;
		int total = kor + eng + math;
		double avg = (double)total / 3;
		System.out.println(avg);
		
		
		
		
	}

}
