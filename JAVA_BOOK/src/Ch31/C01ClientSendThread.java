package Ch31;

import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class C01ClientSendThread implements Runnable{
	
	
	Socket client;
	
	public void setSocket(Socket socket) { // ���� ����
		client = socket;
	}
	
	@Override
	public void run() {
		try {
			DataOutputStream out = new DataOutputStream(client.getOutputStream());
			String msg; // ���� �޼����� ����
			Scanner sc = new Scanner(System.in); 
			while(true) {
				System.out.print("[��]:");
				msg = sc.nextLine(); // �޼��� �Է�
				if(msg.equals("quit")) { // �޼����� ������ quit�� ��� 
					System.out.println("��������");
					System.exit(1); // ���� ����
				}
				out.writeUTF(msg); // �Է��� �޼����� ����
				out.flush();
			}
			
		} catch (Exception e) {}
	
	}
	
	
}