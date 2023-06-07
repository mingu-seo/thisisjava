package ch18.sec02.exam01;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample2 {

	public static void main(String[] args) {
		try {
			Writer os = new FileWriter("D:/java/abc.txt");
			for (int i=65; i<91; i++) {
				os.write((char)i);
			}
			os.write("\n");
			os.write("안녕하세요");
			
			os.flush();
			os.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
