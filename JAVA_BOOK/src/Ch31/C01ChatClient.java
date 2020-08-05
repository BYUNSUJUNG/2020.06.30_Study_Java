package Ch31;

import java.net.ServerSocket;
import java.net.Socket;

public class C01ChatClient {
	public static void main(String[] args) {
		// ���� ������ �������� ����
		try {
			Socket client = new Socket("192.168.3.10",7777); // ���ϻ���
			
			C01ClientSendThread send = new C01ClientSendThread(); // �۽ſ� ������ ��ü ����
			C01ClientRecvThread recv = new C01ClientRecvThread(); // ���ſ� ������ ��ü ����
			
			send.setSocket(client); // Ŭ���̾�Ʈ ��Ʈ�� ������ ���� ���� ��ü �ּ� ����
			recv.setSocket(client);
			
			Thread snd = new Thread(send); // ���� ������� �����Ǵ� ������ ������ ����
			Thread rev = new Thread(recv);
			
			snd.start(); // ������ ����
			rev.start();
		
		} catch (Exception e) {}
		
	}
}