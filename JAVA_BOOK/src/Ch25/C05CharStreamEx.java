package Ch25;

import java.io.*;

// �ڹ� ���� ��Ʈ��
// write()
public class C05CharStreamEx {
	public static void main(String[] args) {
		try {
			// ����
			Writer out = new FileWriter("c:/temp/test1.txt");
			
			char a = 'A';
			char b = 'B';
			char c = 'C';
			
			out.write(a);
			out.write(b);
			out.write(c);
			
			out.flush();
			out.close();
			// �б�
			
			Reader in = new FileReader("c:/temp/test1.txt");
			
			int readnum;
			while(true) {
				readnum = in.read();
				if(readnum==-1) {
					break;
				} 
				// �����ڵ� ���� ��ȯ��
				// ���������� ��ȯ
				System.out.println((char)readnum);
			}
		} catch(Exception e) {
			
		}
	}
}
