package ch06.sec15;

public class SingletonExample {

	public static void main(String[] args) {
//		Singleton o = new Singleton();
		
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		Singleton obj3 = obj1;
		
		if (obj1 == obj2) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
	}

}
