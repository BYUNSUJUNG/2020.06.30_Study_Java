package Ch31;

import java.net.ServerSocket;
import java.net.Socket;

public class C01ChatServer {
	public static void main(String[] args) {
		// ���� ������ �������� ����
		try {
			ServerSocket server = new ServerSocket(7777); // ���� ������ �������ϻ���
			Socket client = server.accept(); // Ŭ���̾�Ʈ ���� ��û�ޱ�
			System.out.println(client.getInetAddress()+"���� ���� �߽��ϴ�"); // ������ ClientIP �ּ�Ȯ��
			
			C01ServerSendThread send = new C01ServerSendThread(); // �۽ſ� ������ ��ü ����
			C01ServerRecvThread recv = new C01ServerRecvThread(); // ���ſ� ������ ��ü ����
			
			send.setSocket(client); // Ŭ���̾�Ʈ ��Ʈ�� ������ ���� ���� ��ü �ּ� ����
			recv.setSocket(client);
			
			Thread snd = new Thread(send); // ���� ������� �����Ǵ� ������ ������ ����
			Thread rev = new Thread(recv);
			
			snd.start(); // ������ ����
			rev.start();
		
		} catch (Exception e) {}
		
	}
}