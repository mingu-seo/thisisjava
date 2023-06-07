package exam;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.exit;

public class UserTable {
	List<User> userList = new ArrayList<User>();
	int no;
	Scanner scan = new Scanner(System.in);

	UserTable() {
		this.no = 1;
	}

	public boolean getUserAndCheck(User user) {
		if (userList == null) {
			user.setNo(this.no);
			userList.add(user);
			this.no++;
			return true;
		} else {
			for (User e : userList) {
				if (e.getId().equals(user.getId())) {
					return false;
				}
			}
			user.setNo(this.no);
			userList.add(user);
			this.no++;
			return true;
		}

	}

	public void getAllList() {
		if (userList == null)
			System.out.println("등록된 회원 정보가 없습니다.");
		else {
			for (User e : userList) {
				System.out.print("등록번호: " + e.getNo() + "  회원아이디: " + e.getId());
				System.out.println();
			}
		}
	}

	public void getDetailedInfo(String id) {
		for (User e : userList) {
			if (e.getId().equals(id)) {
				System.out.println("상세 조회에 성공하였습니다.");
				System.out.print("등록번호: " + e.getNo() + "  회원아이디: " + e.getId() + "  비밀번호: " + e.getPwd() + "  회원이름: "
						+ e.getName());
				System.out.println();
				return;
			}
		}
		System.out.println("등록되지 않은 id입니다.");
	}

	public void checkAndModify(String id) {
		for (User e : userList) {
			if (e.getId().equals(id)) {
				System.out.print("등록번호: " + e.getNo() + "  회원아이디: " + e.getId() + "  비밀번호: " + e.getPwd() + "  회원이름: "
						+ e.getName());
				System.out.println();
				System.out.print("변경할 이름을 입력하세요>");
				String cname = scan.next();
				System.out.print("변경할 비밀번호를 입력하세요>");
				String cpwd = scan.next();

				e.changingName(cname);
				e.changingPwd(cpwd);
				System.out.println("변경을 완료하였습니다.");
				return;
			}
		}
		System.out.println("등록된 회원 아이디가 아닙니다.");
	}

}
