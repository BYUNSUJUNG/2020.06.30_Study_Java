package Ch25;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

// 우선 작업 
// C:\Windows\System32에서 cmd.exe를 복사해서
// C:\temp에 붙여넣는다

//자바 바이트 스크림
public class C04StreamCopy {
	public static void main(String[] args) {
		try {

			InputStream in = new FileInputStream("c:/temp/cmd.exe");
			OutputStream out = new FileOutputStream("c:/temp/copycmd.exe");
		
			byte[] buffer = new byte[4096];
			int cnt = 0;
			while(true) {
				// 개수가 cnt에 들어감
				cnt = in.read(buffer); // read()의 반환형: int
				// 읽을 것이 없으면 -1 반환
				if(cnt==-1) break;
				out.write(buffer,0,cnt);
			}
			out.flush();
			out.close();
			in.close();
		} catch(Exception e) {
			
		}
	}
}
