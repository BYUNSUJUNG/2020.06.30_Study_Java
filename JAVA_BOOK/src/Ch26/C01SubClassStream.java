package Ch26;

import java.io.*;

// OutputStream(), BufferedOutputStream(), OutputStreamWriter(),  Writer()
// InputStream(), BufferedInputStrea(), InputStreamReader(), Reader()
public class C01SubClassStream {
	public static void main(String[] args) {
		
		String str = "���� ��ȯ ��Ʈ�� ���";
		try {
			OutputStream out = new FileOutputStream("c:/temp/test10.txt");
			
			// BufferedOutputStream(): �ӵ��� ������
			// OutputStreamWriter(): ����Ʈ ��� ��Ʈ�� -> ���� ��� ��Ʈ�� ����
			BufferedOutputStream Bout = new BufferedOutputStream(out);// ������Ʈ�� 1
			Writer Cout = new OutputStreamWriter(Bout); // ������Ʈ�� 2
			
			Cout.write(str);
			Cout.flush();
			Cout.close();
			
			InputStream in = new FileInputStream("c:/temp/test10.txt");
			
			// BufferedInputStrea(): �ӵ��� ������
			// InputStreamReader(): ����Ʈ �Է� ��Ʈ�� -> ���� �Է� ��Ʈ�� ����
			BufferedInputStream Bin = new BufferedInputStream(in);// ������Ʈ�� 1
			Reader Cin = new InputStreamReader(Bin); // ������Ʈ�� 2
		
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