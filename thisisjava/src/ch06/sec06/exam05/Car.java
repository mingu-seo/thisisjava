package ch06.sec06.exam05;

public class Car {

	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	int speed;
	
	// 기본생성자
	Car (){
	}
	Car (String model){
		this(model, "은색", 250);
		System.out.println("");
	}
	Car (String model, String color){
		this(model, color, 250);
	}
	
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
}
