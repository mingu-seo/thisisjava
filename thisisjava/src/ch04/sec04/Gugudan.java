package ch04.sec04;

public class Gugudan {

	public static void main(String[] args) {
		/*
		 * 구구단 (중첩반복문)
		2단
		2 X 1 = 2
		2 X 2 = 4
		2 X 3 = 6
		...
		2 X 9 = 18
		 */
		// 변수 1~9까지 1씩 증가
		target:for (int j=2; j<=9; j++) {
			System.out.println("["+j+"단]");
			for (int i=1; i<=9; i++) {
				System.out.println(j+" X "+i+" = "+i*j);
				if (i==3) break target;
			}
		}
		
	}

}
