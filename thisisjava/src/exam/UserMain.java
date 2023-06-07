package exam;

import java.util.List;
import java.util.Scanner;

public class UserMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean flag = true;
		Scanner scanner = new Scanner(System.in);
		UserTable usertableManager = new UserTable();

		while (flag) {
			try {

				System.out.println("-------------------------------------------------------------------");
				System.out.println("1.회원 등록 | 2.회원 목록 | 3.회원 상세 | 4.회원 수정 | 5.종료");
				System.out.println("-------------------------------------------------------------------");

				System.out.print("입력>");
				int input = scanner.nextInt();

				if (input == 1) {
					System.out.println("회원 등록 시스템을 선택하였습니다.");
					System.out.print("아이디>");
					String id = scanner.next();
					System.out.print("비밀번호>");
					String pwd = scanner.next();
					System.out.print("이름>");
					String name = scanner.next();

					User user = new User();
					user.setter(id, pwd, name);

					if (usertableManager.getUserAndCheck(user) == false)
						System.out.println("이미 존재하는 id 입니다.");
					else
						System.out.println("회원 등록에 성공하였습니다.");

				}

				else if (input == 2) {
					System.out.println("회원 목록 조회 시스템을 선택하였습니다.");
					usertableManager.getAllList();
				}

				else if (input == 3) {
					System.out.println("회원 상세 조회 시스템을 선택하였습니다.");
					System.out.print("조회할 아이디를 입력하세요>");
					String id = scanner.next();

					usertableManager.getDetailedInfo(id);
				}

				else if (input == 4) {
					System.out.println("회원 정보 수정 시스템을 선택하였습니다.");
					System.out.print("아이디를 입력하세요>");
					String id = scanner.next();

					usertableManager.checkAndModify(id);

				}

				else if (input == 5) {
					flag = false;
					System.out.println("시스템을 종료합니다.");
					scanner.close();
				} else {
					System.out.println("올바르지 않은 접근입니다.");
				}

			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("올바르지 않은 접근입니다. 시스템을 종료합니다.");
				flag = false;
			}
		}

	}

}
