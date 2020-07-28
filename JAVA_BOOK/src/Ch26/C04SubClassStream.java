package Ch26;

import java.io.*;

// OutputStream(), PrintStream()
// InputStream(), Reader()
public class C04SubClassStream {
	public static void main(String[] args) {
	
		try {
			OutputStream out = new FileOutputStream("c:/temp/test13.txt");
			PrintStream Pout = new PrintStream(out);
			
			Pout.println("프린트 보조 스트림 사용");
			Pout.print("print메서드 사용");
			Pout.printf("prinf메서드 사용, %d", 1);
			Pout.println("데이터를 출력합니다");
			
			InputStream in = new FileInputStream("c:/temp/test13.txt");
			Reader Cin = new InputStreamReader(in);
		
			char[] buffer = new char[100];
			int readNum = 0;
			while(true) {
				readNum = Cin.read(buffer);
				if(readNum==-1) break;
				System.out.println(buffer);
			}
			Cin.close();

			
		} catch (Exception e) {
			
		}
	}
}
