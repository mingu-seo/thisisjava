package ch05.sec05;

public class EmptyStringExample {

	public static void main(String[] args) {
		String hobby = " ";
		
		if ("홍길동".equals(hobby)) {
			System.out.println("빈 문자열");
		}
	}

}