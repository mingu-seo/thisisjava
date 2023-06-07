package ch05;

public class RefType {

	public static void main(String[] args) {
		/*
		 * 기본/참조 자료형
		 * 참조자료형 : 변수에는 메모리 주소값 저장(저장된 위치값)
		 *   - 배열, 클래스, 인터페이스...
		 *   - 동등비교(==, !=) : 메모리 주소값 비교
		 *   - null값
		 */
		// 객체 비교
		RefType rt = new RefType();
		RefType rt2 = new RefType();
		// 타입은 같지만 다른 객체
		System.out.println(rt == rt2);
		RefType rt3 = rt2; // 메모리 주소값 대입
		System.out.println(rt3 == rt2);
		/*
		 * String
		 * - 동등비교 시 반드시 equals() 메서드 사용
		 * - 불변(immutable)
		 * - 기능(메서드) : split,replace,indexOf,substring,valueOf..
		 */
		String text = "안녕하세요, 저는 홍길동입니다.";
		String text2 = text.replace(",", "");
		String text3 = text2.replace(" ", "");
		System.out.println(text3);
		
		// 메서드 체이닝
		String text4 = text.replace(",", "").replace(" ", "");
		
		/*
		 * 배열
		 * - 하나의 타입만 가능
		 * - 길이가 정해지면 변경 불가
		 * - 인덱스(순번), 0부터 시작
		 * - for문 같이 사용 : for (int i=0; i<배열변수.length; i++) 
		 */
		double[] arr = new double[] {1.5, 1.2, 1};
		System.out.println(arr[2]);
		// arr2(길이가4)
		double[] arr2 = new double[4]; // {0.0, 0.0, 0.0, 0.0}
		for (int i=0; i<arr.length; i++) {
			arr2[i] = arr[i];
		}
		for (int i=0; i<arr2.length; i++) {
			System.out.println(arr2[i]);
		}
	}

	
	
	
	
	
	
	
	
	
}
