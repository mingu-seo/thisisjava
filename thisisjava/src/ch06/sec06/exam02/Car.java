package ch06.sec06.exam02;

public class Car {

	String company = "현대자동차";
	String model = "그랜저";
	String color = "검정";
	int maxSpeed = 350;
	int speed;
	
	Car(String model, String color, int maxSpeed){
		// 초기화
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	// 기본생성자
	Car (){
		System.out.println("생성자 호출");
	}
	
	// speed 필드 초기화
	Car(int a) {
		speed = a;
	}
	Car(String a) {
		
	}
}
