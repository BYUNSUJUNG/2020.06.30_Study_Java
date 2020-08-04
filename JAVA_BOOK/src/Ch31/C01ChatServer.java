package Ch31;

import java.net.ServerSocket;
import java.net.Socket;

public class C01ChatServer {
	public static void main(String[] args) {
		// 메인 스레드 서버소켓 생성
		try {
			ServerSocket server = new ServerSocket(7777); // 메인 스레드 서버소켓생성
			Socket client = server.accept(); // 클라이언트 연결 요청받기
			System.out.println(client.getInetAddress()+"에서 접속 했습니다"); // 접속한 ClientIP 주소확인
			
			C01ServerSendThread send = new C01ServerSendThread(); // 송신용 스레드 객체 생성
			C01ServerRecvThread recv = new C01ServerRecvThread(); // 수신용 스레드 객체 생성
			
			send.setSocket(client); // 클라이언트 스트림 생성을 위한 소켓 객체 주소 전달
			recv.setSocket(client);
			
			Thread snd = new Thread(send); // 메인 스레드와 구별되는 공간에 스레드 저장
			Thread rev = new Thread(recv);
			
			snd.start(); // 스레드 시작
			rev.start();
		
		} catch (Exception e) {}
		
	}
}
