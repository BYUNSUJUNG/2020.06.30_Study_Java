package Ch30;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class C02SocketClient {
	public static void main(String[] args) {
		try {
			Socket client = new Socket("192.168.3.10",2030);  // "" <- ���� ip����
			
			DataInputStream in = new DataInputStream(client.getInputStream());
			DataOutputStream out = new DataOutputStream(client.getOutputStream());
			
			String recv;
			String send;
			
			Scanner sc = new Scanner(System.in);
			
			while(true) {
				recv = in.readUTF(); // ������ ȯ�����ڸ� �����°ɷ� ������
				if(recv.equals("quit"))
					break;
				System.out.println("[Server] :"+recv); 
				System.out.print("[Client] :");
				send = sc.nextLine();
				if(send.equals("quit")||send==null) 
					break;
				out.writeUTF(send);
			}
		} catch(Exception e) {
		}
		
	}
}
