package ch07.sec08;

// 하나라도 추상메서드가 존재하면 반드시 추상 클래스
public abstract class AbstractEx {

	public void test() {
		System.out.println("어쩌고저쩌고");
	}
	// 추상메서드 : 선언부만 있는 메서드
	// 이 추상클래스를 상속받는 클래스에서 반드시 재정의
	public abstract void test2();
	public abstract void test3();
	public abstract void test4();
	public abstract void test5();
	public abstract void test6();
}
