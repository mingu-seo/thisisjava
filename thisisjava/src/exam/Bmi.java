package exam;

public class Bmi {
	public static void main(String[] args) {
		double height = 180;
		double weight = 80;

		// 메서드 호출 및 출력
		System.out.println(bmi(height, weight));
	}

	// 해당 메서드를 작성하시오.
	public static String bmi(double height, double weight) {
		double result = (weight * 10000) / (height * height);
		System.out.println(result);
		System.out.println(weight / Math.pow(height/100, 2));
		String bmi = null;

		if (result > 25) {
			return bmi = "비만";
		} else if (result <= 25 && result > 18.5) {
			return bmi = "표준";
		} else {
			return bmi = "저체중";
		}

	}

}
