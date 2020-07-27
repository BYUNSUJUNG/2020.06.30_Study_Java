package Ch25;

import java.io.FileInputStream;
import java.io.InputStream;

// 자바 바이트 스크림

//파일에서 프로그램으로 in
public class C01ReadStreamEx {
	public static void main(String[] args) {
		try {
			InputStream in = new FileInputStream("c:/temp/test1.db");
			
			// 반복문으로 파일 내용 읽기
			// 1바이트씩 읽음
			
			byte data;
			
			while(true) {
				data = (byte)in.read();
				// read(): 더이상 읽을 수 없을 때 -1를 반환
				if(data==-1) break;
				System.out.println(data);
			}
			
		} catch(Exception e) {
			
		}
	}
}
