package ch18;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferEx {

	public static void main(String[] args) throws Exception {
		long start = System.currentTimeMillis();
		FileInputStream fis = new FileInputStream("D:/sqldeveloper-22.2.1.234.1810-x64.zip");
		// 버퍼사용
		BufferedInputStream bis = new BufferedInputStream(fis);
		while(bis.read() != -1) {}
		long end = System.currentTimeMillis();
		System.out.println("버퍼 쓰고 소요시간:"+(end-start));
	}

}
