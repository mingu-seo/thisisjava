package ch06.sec08.exam01;

public class VarLength {
	int sum(int ... values) {
		int sum = 0;
		for (int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	int sum2(int[] values) {
		int sum = 0;
		for (int i=0; i<values.length; i++) {
			sum += values[i];
			if (i==5) return sum;
		}
		return sum;
	}
	String isPass(int score) {
		if (score >= 60) {
			return "합격";
		}
		return "불합격";
	}
	void test(int number) {
		if (number > 5) return;
		System.out.println(number);
	}
	public static void main(String[] args) {
		VarLength vl = new VarLength();
		System.out.println(vl.sum(1,2,3,4,5,6,7,8,9,10));
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(vl.sum2(arr));
		System.out.println(vl.isPass(50));
	}
}






