package Ch25;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

//�ڹ� ����Ʈ ��ũ��
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
				// ���� ���� buffer�� ����
				// ������ readByteNum�� ��
				readByteNum = in.read(buffer); // read()�� ��ȯ��: int
				System.out.println(readByteNum);
				// ���� ���� ������ -1 ��ȯ
				if(readByteNum == -1) break;
				for(int i=0; i<readByteNum; i++) {
					System.out.println(buffer[i]);
				}
			}
			
		} catch(Exception e) {
			
		}
	}
}
