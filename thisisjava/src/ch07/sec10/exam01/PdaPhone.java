package ch07.sec10.exam01;

public class PdaPhone extends Phone {
	PdaPhone(String n) {
		super(n);
	}
	
	@Override
	void turnOn() {
		System.out.println("PDA폰 전원 켜기");

	}

	@Override
	void turnOff() {
		System.out.println("PDA폰 전원 끄기");

	}

}
