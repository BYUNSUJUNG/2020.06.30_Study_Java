package Ch30;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class C02SocketClient {
	public static void main(String[] args) {
		try {
			Socket client = new Socket("192.168.3.10",2030);  // "" <- 서버 ip쓰기
			
			DataInputStream in = new DataInputStream(client.getInputStream());
			DataOutputStream out = new DataOutputStream(client.getOutputStream());
			
			String recv;
			String send;
			
			Scanner sc = new Scanner(System.in);
			
			while(true) {
				recv = in.readUTF(); // 서버가 환영문자를 보내는걸로 시작함
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
