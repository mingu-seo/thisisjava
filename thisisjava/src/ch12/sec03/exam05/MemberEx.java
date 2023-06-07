package ch12.sec03.exam05;

import java.util.Random;

public class MemberEx {

	public static void main(String[] args) {
		Member m = new Member();
		m.setId("hong");
//		m.id = "hong";
		m.setName("홍길동바보");
//		m.name = "홍길동";
		System.out.println(m.getName());
//		System.out.println(m.name);
		System.out.println(m.toString());
		System.out.println(System.getProperty("java.specification.version"));
		
		// 배열에다가 숫자, 문자, 문자열, Member 객체
		Object[] obj = {1,3.14,'A',"ABC",new Member()};
		// auto boxing
		Object[] obj2 = {new Integer(1),3.14,'A',"ABC",new Member()};
		
		Integer i = 1; // boxing
		int i2 = i; // unboxing
		
		test(1);
		test(1.5);
		test("aa");
		test(new Member());
		double d = Math.round(3.123456*1000)/1000.0;
		System.out.println(d);
		
		
		Random r1 = new Random();
		System.out.println(r1.nextInt(10));
		Random r2 = new Random();
		System.out.println(r2.nextInt(10));
		
		test(1);
	}
	
	public static void test(Object m) {
		
	}
	
	
	
	
	
	
	
	
	
}
