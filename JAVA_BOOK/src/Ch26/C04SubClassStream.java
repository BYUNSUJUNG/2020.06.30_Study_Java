package Ch26;

import java.io.*;

// OutputStream(), PrintStream()
// InputStream(), Reader()
public class C04SubClassStream {
	public static void main(String[] args) {
	
		try {
			OutputStream out = new FileOutputStream("c:/temp/test13.txt");
			PrintStream Pout = new PrintStream(out);
			
			Pout.println("����Ʈ ���� ��Ʈ�� ���");
			Pout.print("print�޼��� ���");
			Pout.printf("prinf�޼��� ���, %d", 1);
			Pout.println("�����͸� ����մϴ�");
			
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
