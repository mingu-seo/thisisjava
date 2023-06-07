package ch04.sec02;

public class MathRandom {

	public static void main(String[] args) {
		double number = Math.random(); // 0~1미만
		// 랜덤수의 개수를 곱
		number = number * 6; // 0~6미만
		// 정수로 형변환
		number = (int)number; // 0~5
		// 시작값 +
		number = number + 1;
		System.out.println(number);
		// 주사위
		int dice = (int)(Math.random()*6) + 1;
		System.out.println(dice);
		
		// 동전 앞/뒤
		// 앞이나왔습니다. / 뒤가나왔습니다. -> 출력
		int coin = (int)(Math.random()*2);
		if (coin == 0) System.out.println("앞이 나왔습니다.");
		else System.out.println("뒤가 나왔습니다.");
		
	}

}
