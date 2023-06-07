package ch05.sec05;

public class LengthExample {

	public static void main(String[] args) {
		String ssn = "9501011231234";
		int length = ssn.length();
		if (length == 13) {
			System.out.println("자릿수 맞음");
		} else {
			System.out.println("자릿수 틀림");
		}
		ssn.replace("바보", "");
		
		String str2 = "자바";
		String str3 = str2.replace("자", "저");
		
		String[] str = new String[] {"자","바"};
		str[0] = "저";
	}

}

class Member {
	String greet;
}