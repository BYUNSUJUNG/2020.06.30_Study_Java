package Ch30;

import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

// ipȮ��: ncpa.cpl(��Ʈ��ũ �Ӽ�â)>�̴���>IPV4> 192.168.3.12

public class C01SocketServer {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(2020); // ��Ʈ��ȣ 2020
			System.out.println("���� ���� ����");
			Socket client; // �ܺο��� ���� ��û�� ���� ��, Ŭ���̾�Ʈ ���� ���� 
			DataOutputStream out; // ��� ��Ʈ��
			while(true) {
				client = server.accept();
				out = new DataOutputStream(client.getOutputStream());
				out.writeUTF("This is Server Test ��������"); // Ŭ���̾�Ʈ���� ���� ����
				client.close();
			}
			
		} catch (Exception e) {
		}
	}
}