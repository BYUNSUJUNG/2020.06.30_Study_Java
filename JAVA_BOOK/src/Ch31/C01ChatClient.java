package Ch31;

import java.net.ServerSocket;
import java.net.Socket;

public class C01ChatClient {
	public static void main(String[] args) {
		// 메인 스레드 서버소켓 생성
		try {
			Socket client = new Socket("192.168.3.10",7777); // 소켓생성
			
			C01ClientSendThread send = new C01ClientSendThread(); // 송신용 스레드 객체 생성
			C01ClientRecvThread recv = new C01ClientRecvThread(); // 수신용 스레드 객체 생성
			
			send.setSocket(client); // 클라이언트 스트림 생성을 위한 소켓 객체 주소 전달
			recv.setSocket(client);
			
			Thread snd = new Thread(send); // 메인 스레드와 구별되는 공간에 스레드 저장
			Thread rev = new Thread(recv);
			
			snd.start(); // 스레드 시작
			rev.start();
		
		} catch (Exception e) {}
		
	}
}
