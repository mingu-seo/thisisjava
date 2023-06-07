package ch11;

import java.io.FileInputStream;
import java.io.IOException;

public class ExceptionEx {

	public static void main(String[] args) throws ClassNotFoundException{
		Class.forName("java.lang.String");
		try (
			FileInputStream fis = new FileInputStream("");
			FileInputStream fis2 = new FileInputStream("");
			FileInputStream fis3 = new FileInputStream("");
		) {
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		FileInputStream fis = null;
		try {
			Class.forName("java.lang.String");
			fis = new FileInputStream("D:\\madang.dmp");
			
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {fis.close();}catch(Exception e) {}
		}
		System.out.println("시작");
		try {
			System.out.println(3/0);
			int[] arr = {1,2,3};
			System.out.println(arr[3]);
			System.out.println("출력");
		} catch (Exception e) {
			System.out.println("예외발생");
//			System.out.println(e.getMessage());
			System.out.println(e.toString());
			e.printStackTrace();
		} finally {
			// 예외가 발생하던 안하던 무조건 실행
			System.out.println("무조건실행");
//			try { file.close(); } catch (Exception e) {}
		}
//		} catch (ArithmeticException e) {
//			System.out.println("0으로 나눌수 없습니다.");
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("인덱스 오류");
//		} catch (Exception e) {
		System.out.println("끝");
	}

}
