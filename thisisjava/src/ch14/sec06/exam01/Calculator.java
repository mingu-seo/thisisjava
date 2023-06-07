package ch14.sec06.exam01;

public class Calculator {
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	public  void setMemory1(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(2000);
		} catch (Exception e) {}
		System.out.println(Thread.currentThread().getName()+": "+this.memory);
	}
	
	public void setMemory2(int memory) {
		synchronized(this) {
			try {
				Thread.sleep(3000);
			} catch (Exception e) {}
			this.memory = memory;
			System.out.println(Thread.currentThread().getName()+": "+this.memory);
		}
	}
}
