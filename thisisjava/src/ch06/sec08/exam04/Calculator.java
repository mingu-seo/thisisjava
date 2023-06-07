package ch06.sec08.exam04;

public class Calculator {
	
	static double pi = 3.141592;
	final static int A = 3;
	
	Calculator() {
		//a = 0;
		System.out.println("생성자 호출");
	}
	
	static {
		System.out.println("static 블록");
//		System.out.println(a);
	}
	{
		System.out.println("인스턴스 블록");
	}
	
	double areaRectangle(double width) {
		return width * width;
	}
	double areaRectangle(double width, double height) {
		return width * height;
	}
	static void test() {
//		double a = areaRectangle(10);
	}
}
