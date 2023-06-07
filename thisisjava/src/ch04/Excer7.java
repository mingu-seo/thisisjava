package ch04;

import java.util.Scanner;

public class Excer7 {

	public static void main(String[] args) {
		/*
		 * while 무한 반복
		 * 	기능 종류 입력
		 *  1이면 입력, 잔고+
		 *  2이면 입력, 잔고-
		 *  3이면 잔고 출력
		 *  4이면 종료
		 */
		boolean run = true;
		Scanner scan = new Scanner(System.in);
		int account = 0;
		while (run) {
			System.out.println("---------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("---------------------------");
			System.out.print("선택>");
			String val = scan.nextLine();
			if ("1".equals(val)) {
				System.out.print("예금액>");
				String input = scan.nextLine();
				account = account + Integer.parseInt(input);
			} else if ("2".equals(val)) {
				System.out.print("출금액>");
				String input = scan.nextLine();
				int inputInt = Integer.parseInt(input);
				if (account < inputInt) {
					System.out.println(account+" 이하로만 출금 가능");
				} else {
					account = account - Integer.parseInt(input);
				}
			} else if ("3".equals(val)) {
				System.out.println("잔고>"+account);
			} else if ("4".equals(val)) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

}
