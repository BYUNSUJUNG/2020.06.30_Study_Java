package Ch30;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class C02SocketServer {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(2030);
			System.out.println("���� ���� ����");
			Socket client = server.accept(); // �ϳ��� Ŭ���̾�Ʈ�� ��û�� ó��
			System.out.println("Client IP: "+client.getInetAddress().getHostAddress()); // ������ Ŭ���̾�Ʈ�� �ּҰ� ��µ�
			
			// �ۼ��ſ� ���Ǵ� ��Ʈ�� ����
			DataInputStream in = new DataInputStream(client.getInputStream());
			DataOutputStream out = new DataOutputStream(client.getOutputStream());
			
			String recv = "";
			String send= "Welcome To Server ȯ���մϴ� �����Դϴ�";
			out.writeUTF(send);
			System.out.println();
			
			Scanner sc = new Scanner(System.in);
			
			// ����: Ŭ���̾�Ʈ�� ���� ��ȭ�� �����ؾ��Ѵ�.
			while(true) {
				recv = in.readUTF();
				if(recv==null|| recv.equals("quit")) { // recv==null: ������ ���ὺƮ���� ������, ���� ������ ����
					break;
				} 
				System.out.println("[Client]:"+recv);
				System.out.print("[Server]:");
				send = sc.nextLine();
				out.writeUTF(send);
				if(send.equals("quit"))
					break;
			}
			sc.close();
			in.close();
			out.close();
			
		} catch (Exception e) {
		}
	}
}