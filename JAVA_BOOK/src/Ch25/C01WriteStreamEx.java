package Ch25;

import java.io.FileOutputStream;
import java.io.OutputStream;

//자바 바이트 스크림

// 프로그램에서 파일로 out
public class C01WriteStreamEx {
	public static void main(String[] args) {
		try {
			// 예외처리
			OutputStream out = new FileOutputStream("c:/temp/test1.db");
			byte a = 10;
			byte b = 20;
			byte c = 30;
			
			out.write(a);
			out.write(b);
			out.write(c);

			out.flush();
			out.close(); // 더이상 사용하지않을 때
		} catch(Exception e) {
			
		}
	}
}
