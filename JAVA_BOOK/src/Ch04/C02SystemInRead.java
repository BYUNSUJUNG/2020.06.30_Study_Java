package Ch04;

import java.io.IOException;

public class C02SystemInRead {

	/*
	 * 	keyCode: 13 -> carriage return
		keyCode: 10 -> line feed => enter
	 * */
	public static void main(String[] args) throws IOException {
		int keyCode;
		
		while (true) {
			keyCode = System.in.read();
			System.out.println("keyCode: "+keyCode);
			if (keyCode==113) { // ���� q
				break; // �ݺ��� ����
			}
		}

		System.out.println("����");
		
	}
}
