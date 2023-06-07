package ch06.sec08.exam04;

import ch05.StringEx3;
import ch05.StringEx3;
import ch05.StringEx3;
import ch05.StringEx3;
import ch05.StringEx3;
import ch05.StringEx3;
import ch05.StringEx3;
import ch05.StringEx3;
import ch05.StringEx3;
import ch05.StringEx3;

public class CalculatorExample {

	public static void main(String[] args) {
		System.out.println("main메서드 시작");
		Calculator myCalcu = new Calculator();
		double result1 = myCalcu.areaRectangle(10);
		double result2 = myCalcu.areaRectangle(10, 20);
		
		System.out.println("정사각형의 넓이="+result1);
		System.out.println("직사각형의 넓이="+result2);
		
		System.out.println(Calculator.pi);
		System.out.println(myCalcu.pi);
		
		Calculator myCalcu2 = new Calculator();
		Calculator myCalcu3 = new Calculator();
		Calculator myCalcu4 = new Calculator();
		
		Calculator.pi = 4.14;
		System.out.println(Calculator.pi);
		System.out.println(myCalcu.pi);
		System.out.println(myCalcu2.pi);
		System.out.println(myCalcu3.pi);
		System.out.println(myCalcu4.pi);
		
		// final 필드
//		System.out.println(myCalcu4.a);
//		myCalcu4.a = 1;
		
		// final static 필드 -> 상수
		double d = Math.PI;
//		Math.PI = 4.14;
		
		// 다른 패키지
		ch06.sec08.exam03.Car c = new ch06.sec08.exam03.Car();
		ch06.sec08.exam03.CarExample c2 = new ch06.sec08.exam03.CarExample();
		
		StringEx3
	}

	
	
	
	
	
	
	
	
	
	
}
