package ch02.sec13;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner scan;
		scan = new Scanner(System.in);
		
		System.out.print("x 값 입력: ");
		String strX = scan.nextLine();
		int x = Integer.parseInt(strX);
		
		System.out.print("y 값 입력: ");
		String strY = scan.nextLine();
		int y = Integer.parseInt(strY);
		
		int result = x + y;
		System.out.println("x + y: "+result);
		System.out.println();
		
		boolean flag = true;
		while (flag) {
			System.out.print("입력 문자열: ");
			String data = scan.nextLine();
			if (data.equals("q")) {
				flag = false;
			}
			System.out.println("출력 문자열: "+data);
			System.out.println();
		}
		System.out.println("종료");
		
	}

}
