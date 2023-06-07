package ch13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Object o = new Member();
		Member m = (Member)o;
		m.login();
		o = new Admin();
		Admin a = (Admin)o;
		a.manage();
		
		Member[] mArr = {new Member(), new Member(), new Member()};
		Admin[] aArr = {new Admin(), new Admin(), new Admin()};
		
		print(aArr);
		
		// ArrayList
		List<Member> al = new ArrayList<Member>();
		al.add(new Member());
		al.add(new Member());
		al.add(new Member());
		al.add(new Member());
		System.out.println(al.size());
		
		for (int i=0; i<al.size(); i++) {
//			Member m2 = (Member)al.get(i);
//			System.out.println(m2.login());
			System.out.println(al.get(i).login());
		}
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("1",1);
		map.put("2",2);
		map.put("3",3);
		map.put("4",4);
		map.put("2",4);
//		System.out.println(map.get("3").login());
		
	}
	
	public static void print(Member[] m) {
		// 화면에 출력
	}
	public static void print(Admin[] m) {
		// 화면에 출력
	}

}
