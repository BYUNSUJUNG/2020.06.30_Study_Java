package Ch30;

import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

// ip확인: ncpa.cpl(네트워크 속성창)>이더넷>IPV4> 192.168.3.12

public class C01SocketServer {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(2020); // 포트번호 2020
			System.out.println("서버 소켓 시작");
			Socket client; // 외부에서 접속 요청을 했을 때, 클라이언트 정보 저장 
			DataOutputStream out; // 출력 스트림
			while(true) {
				client = server.accept();
				out = new DataOutputStream(client.getOutputStream());
				out.writeUTF("This is Server Test 서버예요"); // 클라이언트에게 문자 전달
				client.close();
			}
			
		} catch (Exception e) {
		}
	}
}
