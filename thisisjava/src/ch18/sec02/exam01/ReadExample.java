package ch18.sec02.exam01;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample {

	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("D:/java/abc.db");
			int data = 0;
			while ((data=is.read()) != -1) {
				System.out.println(data);
			}
//			while (true) {
//				int data = is.read();
//				if (data == -1) break;
//				System.out.println(data);
//			}
			is.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
