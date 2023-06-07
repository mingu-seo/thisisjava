package ch07.sec08.exam02;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
//		Bus bus = new Bus();
//		driver.driver(bus);
//		
//		Taxi taxi = new Taxi();
//		driver.driver(taxi);
		driver.dirver1_1();
		driver.dirver2();
		driver.dirver3();
		driver.driver(new Bus());
		
		driver.setVehicle(new Bus());// 객체 주입 
		// (Dependency Injection)
		driver.run1();
		driver.openDoor();
		driver.trunkOpen();
		
		System.out.println(new Bus() instanceof Vehicle);
		System.out.println(new Vehicle() instanceof Vehicle);
	}

}
