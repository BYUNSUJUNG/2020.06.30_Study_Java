package Ch31;

import java.io.DataInputStream;
import java.net.Socket;

public class C01ServerRecvThread implements Runnable {
	
	Socket client;
	
	public void setSocket(Socket socket) { // 소켓 설정
		client = socket;
	}

	@Override
	public void run() {
		try {
			DataInputStream in = new DataInputStream(client.getInputStream());
			String msg; // 받을 메세지를 담음
			while(true) {
				msg = in.readUTF(); // 클라이언트가 보낸 메세지를 변수에 넣음
				if(msg.equals("quit")) { // 메세지의 내용이 quit이면
					System.out.println("연결종료");
					System.exit(1); // 연결종료
				}
				System.out.println("[Client]: "+msg); // 메세지의 내용이 quit가 아니면 console에 print
			}
		} catch (Exception e) {}
		
	}

}
