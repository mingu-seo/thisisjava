package ch07.sec10.exam01;

public class PhoneExample {

	public static void main(String[] args) {
		Phone smartPhone = new SmartPhone("홍길동");
		
		smartPhone = new PdaPhone("ddd");
		smartPhone.turnOn();
		//smartPhone.internetSearch();
		smartPhone.turnOff();
	}

}
