package ch18.sec02.exam01;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample {

	public static void main(String[] args) {
		try {
			OutputStream os = new FileOutputStream("D:/java/abc.db");
			byte a = 10;
			byte b = 20;
			byte c = 30;
			for (int i=0; i<100; i++) {
				os.write(i);
			}
			
			os.flush();
			os.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
