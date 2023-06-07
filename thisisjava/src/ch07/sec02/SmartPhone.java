package ch07.sec02;

public class SmartPhone extends Phone {
	public boolean wifi;
	public SmartPhone(String model, String color) {
		System.out.println("자식생성자");
		this.model = model;
		this.color = color;
	}
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("와이파이 상태를 변경했습니다.");
	}
	public void internet() {
		System.out.println("인터넷에 연결합니다.");
	}
	@Override
	public void sendVoice(String message) {
		System.out.println("나: "+message);
	}
	@Override
	public String toString() {
		return "여기는 SmartPhone객체";
	}
}
