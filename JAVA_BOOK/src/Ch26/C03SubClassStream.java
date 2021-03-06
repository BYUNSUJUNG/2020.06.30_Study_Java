package Ch26;

import java.io.*;

// FileOutputStream(), DataOutputStream()
// FileInputStream(), DataInputStream()
public class C03SubClassStream {
	public static void main(String[] args) {
	
		try {
			FileOutputStream out = new FileOutputStream("c:/temp/test12.txt");
			DataOutputStream Dout = new DataOutputStream(out);
			
			// �ִ� ���̶� ������ ���̶� ���ƾ���
			// utf -> double -> int
			Dout.writeUTF("ȫ�浿"); // UTF
			Dout.writeDouble(12.12); // double �ڷ���
			Dout.writeInt(1); // ������
			
			Dout.flush();
			Dout.close();
			out.close();
			
			FileInputStream in = new FileInputStream("c:/temp/test12.txt");
			DataInputStream Din = new DataInputStream(in);
			
			String tmp;
			double dnum;
			int num;

			// �ִ� ���̶� ������ ���̶� ���ƾ���
			// utf -> double -> int
			tmp = Din.readUTF();
			dnum = Din.readDouble();
			num = Din.readInt();
			
			System.out.println(tmp+","+dnum+","+num);
			
			Din.close();
			in.close();
			
		} catch (Exception e) {
			
		}
	}
}
