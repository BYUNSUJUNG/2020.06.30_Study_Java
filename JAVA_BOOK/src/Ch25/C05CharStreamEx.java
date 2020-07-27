package Ch25;

import java.io.*;

// 자바 문자 스트림
// write()
public class C05CharStreamEx {
	public static void main(String[] args) {
		try {
			// 쓰기
			Writer out = new FileWriter("c:/temp/test1.txt");
			
			char a = 'A';
			char b = 'B';
			char c = 'C';
			
			out.write(a);
			out.write(b);
			out.write(c);
			
			out.flush();
			out.close();
			// 읽기
			
			Reader in = new FileReader("c:/temp/test1.txt");
			
			int readnum;
			while(true) {
				readnum = in.read();
				if(readnum==-1) {
					break;
				} 
				// 유니코드 값을 반환함
				// 문자형으로 변환
				System.out.println((char)readnum);
			}
		} catch(Exception e) {
			
		}
	}
}
