package Ch25;

import java.io.FileOutputStream;
import java.io.OutputStream;

//�ڹ� ����Ʈ ��ũ��

// ���α׷����� ���Ϸ� out
public class C01WriteStreamEx {
	public static void main(String[] args) {
		try {
			// ����ó��
			OutputStream out = new FileOutputStream("c:/temp/test1.db");
			byte a = 10;
			byte b = 20;
			byte c = 30;
			
			out.write(a);
			out.write(b);
			out.write(c);

			out.flush();
			out.close(); // ���̻� ����������� ��
		} catch(Exception e) {
			
		}
	}
}