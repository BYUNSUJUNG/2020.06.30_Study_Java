package Ch32;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class C01ServerBackground {

	//소켓연결
	//데이터수신
	//데이터송신
	ServerSocket server;
	Socket client;
	DataInputStream in;
	DataOutputStream out;
	
	C01ServerUI gui;
	
	void setting(C01ServerUI ui) {
		this.gui = ui;
	}
	
	//소켓연결 + 데이터 수신 + 수신-Area.append 용도
	void Conn() {
		try {
			//소켓연결
			server = new ServerSocket(7777);
			client = server.accept();
			//스트림 형성
			in = new DataInputStream(client.getInputStream());
			out = new DataOutputStream(client.getOutputStream());
			
			//데이터 수신용 코드
			while(in!=null) {
				String msg = in.readUTF();
				gui.appendMsg(msg); // C01ServerUI의 메소드
			}
		}catch(Exception e) {}
	}

	// throws IOException: 해당 메소드를 사용한 곳에서 예외를 처리하도록 함
	// 사용하는 곳에서 try-catch사용
	void sendMsg(String msg) throws IOException {
		out.writeUTF("[Server] : "+msg);
	}

}
