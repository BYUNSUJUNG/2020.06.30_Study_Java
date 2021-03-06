package Ch26;

import java.io.*;

// OutputStream(), BufferedOutputStream(), OutputStreamWriter(),  Writer()
// InputStream(), BufferedInputStrea(), InputStreamReader(), Reader()
public class C01SubClassStream {
	public static void main(String[] args) {
		
		String str = "문자 변환 스트림 사용";
		try {
			OutputStream out = new FileOutputStream("c:/temp/test10.txt");
			
			// BufferedOutputStream(): 속도가 빨라짐
			// OutputStreamWriter(): 바이트 출력 스트림 -> 문자 출력 스트림 변봔
			BufferedOutputStream Bout = new BufferedOutputStream(out);// 보조스트림 1
			Writer Cout = new OutputStreamWriter(Bout); // 보조스트림 2
			
			Cout.write(str);
			Cout.flush();
			Cout.close();
			
			InputStream in = new FileInputStream("c:/temp/test10.txt");
			
			// BufferedInputStrea(): 속도가 빨라짐
			// InputStreamReader(): 바이트 입력 스트림 -> 문자 입력 스트림 변봔
			BufferedInputStream Bin = new BufferedInputStream(in);// 보조스트림 1
			Reader Cin = new InputStreamReader(Bin); // 보조스트림 2
		
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
