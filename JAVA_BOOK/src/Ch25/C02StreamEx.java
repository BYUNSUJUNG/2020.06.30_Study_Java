package Ch25;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

//자바 바이트 스크림
// Array, OutputStream, InputStream
public class C02StreamEx {
	public static void main(String[] args) {
		try {
			OutputStream out = new FileOutputStream("C:/temp/test2.db");
			byte[] array = {10,20,30};
			
			// write(char[] b)
			out.write(array);
			out.flush();
			out.close();
			
			InputStream in = new FileInputStream("c:/temp/test2.db");
			byte[] buffer = new byte[100];
			int readByteNum;
			
			while(true) {
				// 읽은 것을 buffer에 저장
				// 개수가 readByteNum에 들어감
				readByteNum = in.read(buffer); // read()의 반환형: int
				System.out.println(readByteNum);
				// 읽을 것이 없으면 -1 반환
				if(readByteNum == -1) break;
				for(int i=0; i<readByteNum; i++) {
					System.out.println(buffer[i]);
				}
			}
			
		} catch(Exception e) {
			
		}
	}
}
