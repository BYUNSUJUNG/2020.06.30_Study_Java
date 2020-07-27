package Ch25;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

// �켱 �۾� 
// C:\Windows\System32���� cmd.exe�� �����ؼ�
// C:\temp�� �ٿ��ִ´�

//�ڹ� ����Ʈ ��ũ��
public class C04StreamCopy {
	public static void main(String[] args) {
		try {

			InputStream in = new FileInputStream("c:/temp/cmd.exe");
			OutputStream out = new FileOutputStream("c:/temp/copycmd.exe");
		
			byte[] buffer = new byte[4096];
			int cnt = 0;
			while(true) {
				// ������ cnt�� ��
				cnt = in.read(buffer); // read()�� ��ȯ��: int
				// ���� ���� ������ -1 ��ȯ
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
