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
			System.out.println("소켓 서버 시작");
			Socket client = server.accept(); // 하나의 클라이언트의 요청만 처리
			System.out.println("Client IP: "+client.getInetAddress().getHostAddress()); // 접속한 클라이언트의 주소가 출력됨
			
			// 송수신에 사용되는 스트림 형성
			DataInputStream in = new DataInputStream(client.getInputStream());
			DataOutputStream out = new DataOutputStream(client.getOutputStream());
			
			String recv = "";
			String send= "Welcome To Server 환영합니다 서버입니다";
			out.writeUTF(send);
			System.out.println();
			
			Scanner sc = new Scanner(System.in);
			
			// 문제: 클라이언트가 먼저 대화를 시작해야한다.
			while(true) {
				recv = in.readUTF();
				if(recv==null|| recv.equals("quit")) { // recv==null: 상대방이 연결스트림을 끊었다, 보낸 내용이 없다
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
