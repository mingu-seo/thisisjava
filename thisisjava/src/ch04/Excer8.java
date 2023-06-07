package ch04;

import java.util.Scanner;

public class Excer8 {

	public static void main(String[] args) {
		/*
		 * 숫자 맞히기 게임
컴퓨터가 1~100 사이의 수 정함
사용자가 그 수를 맞춤
작은수를 입력했으면 "큰수를 입력하세요" 출력
큰수를 입력했으면 "작은수를 입력하세요" 출력
맞았으면 "맞았습니다. 시도횟수 0회"
		 */
		
		int comNumber = (int)(Math.random()*100)+1;
		boolean flag = true;
		Scanner scan = new Scanner(System.in);
		int count = 0;
		while (flag) {
			System.out.print("입력>");
			int userNumber = Integer.parseInt(scan.nextLine());
			count++;
			if (comNumber > userNumber) {
				System.out.println("큰 수를 입력하세요.");
			} else if (comNumber < userNumber) {
				System.out.println("작은 수를 입력하세요.");
			} else {
				System.out.println("맞았습니다. 시도횟수:"+count+"회");
				flag = false;
			}
		}
	}

}
