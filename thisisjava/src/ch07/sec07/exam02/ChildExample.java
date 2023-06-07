package ch07.sec07.exam02;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();
		Parent p = child;
		
		p.method1();
		p.method2();
	}

}
