package Ch31;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

// �� ���Ͽ� ������ Ŭ����(Send, Recv)�� �ְ� ���� �޼ҵ尡 �ִ� Ŭ������ �ֱ�

//(1) �޼��� ������ ���� ������
class C01ServerSendThread2 implements Runnable {
	Socket client;
	
	public void setSocket(Socket socket) {
		client = socket;
	}

	@Override
	public void run() {
		try {
			DataOutputStream out = new DataOutputStream(client.getOutputStream());
			String msg; // �Է��� �޼����� ����
			out.writeUTF("Welcome to Server"); // String����
			
			// quit �Է½� �ݺ��� ����Ǹ鼭 ���� ����
			Scanner scan = new Scanner(System.in);
			while(true) {
				System.out.print("[��]:");
				msg = scan.nextLine(); // �޼��� �Է�
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

//(2) �޼��� �޴� ���� ������
class C01ServerRecvThread2 implements Runnable {
	
	Socket client;
	
	public void setSocket(Socket socket) { // ���� ����
		client = socket;
	}

	@Override
	public void run() {
		try {
			DataInputStream in = new DataInputStream(client.getInputStream());
			String msg; // ���� �޼����� ����
			while(true) {
				msg = in.readUTF(); // Ŭ���̾�Ʈ�� ���� �޼����� ������ ����
				if(msg.equals("quit")) { // �޼����� ������ quit�̸�
					System.out.println("��������");
					System.exit(1); // ��������
				}
				System.out.println("[Client]: "+msg); // �޼����� ������ quit�� �ƴϸ� console�� print
			}
		} catch (Exception e) {}
		
	}

}

// (3) ���� ���� ���� Ŭ����
public class C01ChatServer2 {
	public static void main(String[] args) {
		// ���� ������ �������� ����
		try {
			ServerSocket server = new ServerSocket(7777); // ���� ������ �������ϻ���
			Socket client = server.accept(); // Ŭ���̾�Ʈ ���� ��û�ޱ�
			System.out.println(client.getInetAddress()+"���� ���� �߽��ϴ�"); // ������ ClientIP �ּ�Ȯ��
			
			C01ServerSendThread2 send = new C01ServerSendThread2(); // �۽ſ� ������ ��ü ����
			C01ServerRecvThread2 recv = new C01ServerRecvThread2(); // ���ſ� ������ ��ü ����
			
			send.setSocket(client); // Ŭ���̾�Ʈ ��Ʈ�� ������ ���� ���� ��ü �ּ� ����
			recv.setSocket(client);
			
			Thread snd = new Thread(send); // ���� ������� �����Ǵ� ������ ������ ����
			Thread rev = new Thread(recv);
			
			snd.start(); // ������ ����
			rev.start();
		
		} catch (Exception e) {}
		
	}
}