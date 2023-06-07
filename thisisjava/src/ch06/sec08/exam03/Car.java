package ch06.sec08.exam03;

public class Car {
	int gas;
	
	void setGas(int gas) {
		this.gas = gas;
	}
	void setGas(String gas) {
		this.gas = Integer.parseInt(gas);
	}
	void setGas(int gas, int a) {
		this.gas = 0;
	}
	void setGas(String a, int gas) {
		this.gas = 0;
	}
	void setGas(int a, String gas) {
		this.gas = 0;
	}
	
	boolean isLeftGas() {
		if (gas == 0) {
			System.out.println("gas가 없습니다.");
			return false;
		}
		System.out.println("gas가 있습니다.");
		return true;
	}
	
	void run() {
		while (true) {
			if (gas > 0) {
				System.out.println("달립니다.(gas잔량:"+gas+")");
				gas -= 1;
			} else {
				System.out.println("멈춥니다.(gas잔량:"+gas+")");
				return;
			}
		}
	}
}
