package Ch31;

import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class C01ServerSendThread implements Runnable {
	Socket client;
	
	public void setSocket(Socket socket) {
		client = socket;
	}

	@Override
	public void run() {
		try {
			DataOutputStream out = new DataOutputStream(client.getOutputStream());
			String msg; // 입력할 메세지를 담음
			out.writeUTF("Welcome to Server"); // String전달
			
			// quit 입력시 반복문 종료되면서 연결 종료
			Scanner scan = new Scanner(System.in);
			while(true) {
				System.out.print("[나]:");
				msg = scan.nextLine(); // 메세지 입력
				if(msg.equals("quit")) { // 메세지의 내용이 quit일 경우 
					System.out.println("연결종료");
					System.exit(1); // 연결 종료
				}
				out.writeUTF(msg); // 입력한 메세지를 보냄
				out.flush();
			}
		} catch (Exception e) {}
		
		
	}
}
