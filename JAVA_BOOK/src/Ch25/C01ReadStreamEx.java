package Ch25;

import java.io.FileInputStream;
import java.io.InputStream;

// �ڹ� ����Ʈ ��ũ��

//���Ͽ��� ���α׷����� in
public class C01ReadStreamEx {
	public static void main(String[] args) {
		try {
			InputStream in = new FileInputStream("c:/temp/test1.db");
			
			// �ݺ������� ���� ���� �б�
			// 1����Ʈ�� ����
			
			byte data;
			
			while(true) {
				data = (byte)in.read();
				// read(): ���̻� ���� �� ���� �� -1�� ��ȯ
				if(data==-1) break;
				System.out.println(data);
			}
			
		} catch(Exception e) {
			
		}
	}
}
