package ch07.sec08.exam02;

public class Driver {
	public void driver(Vehicle vehicle) {
		vehicle.run();
	}
	
	public void dirver1() {
		System.out.println("차량이");
	}
	public void dirver1_1() {
		System.out.println("차량이2");
	}
	public void dirver2() {
		System.out.println("버스가");
	}
	public void dirver3() {
		System.out.println("택시가");
	}
	
	private Vehicle v;
	public void setVehicle(Vehicle v) {
		this.v = v;
	}
	public void run1() {
		v.run();
	}
	public void back() {
		v.run();
	}
	public void trunkOpen() {
		v.run();
	}
	public void openDoor() {
		v.run();
	}
	
	
	
	
	
	
	
}
