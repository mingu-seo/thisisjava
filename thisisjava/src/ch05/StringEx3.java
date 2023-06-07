package ch05;

import ch06.ClassEx;

public class StringEx3 {
	String model;
	
	
	public static void main(String[] args) {
		String a = new String();
		String b = a;
		System.out.println(a == b);
		a = "안녕";
		System.out.println(a == b);
		
		Str a2 = new Str();
		Str b2 = a2;
		System.out.println(a2 == b2);
		a2.name = "안녕";
		System.out.println(a2 == b2);
		System.out.println(b2.name);
		
		System.out.println(a2);
		System.out.println(b2);
		System.out.println(new Str());
		
		
		//System.out.println(model);
		ClassEx ce = new ClassEx();
	}
	
	void test(String model) {
		
		System.out.println(this.model);
	}

}

class Str {
	String name;
}

