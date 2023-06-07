package ch08.sec04;

public interface RemoteControl {
	int MAX_VOLUMNE = 10;
	int MIN_VOLUMNE = 0;
	
	
	// public 추상메서드
	void turnOn();
	void turnOff();
	void setVolume(int volume);
}
