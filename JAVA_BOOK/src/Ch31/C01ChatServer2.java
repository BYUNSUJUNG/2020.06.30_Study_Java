package Ch31;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

// 한 파일에 스레드 클래스(Send, Recv)도 넣고 메인 메소드가 있는 클래스도 넣기

//(1) 메세지 보내는 역할 스레드
class C01ServerSendThread2 implements Runnable {
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

//(2) 메세지 받는 역할 스레드
class C01ServerRecvThread2 implements Runnable {
	
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

// (3) 실제 실행 역할 클래스
public class C01ChatServer2 {
	public static void main(String[] args) {
		// 메인 스레드 서버소켓 생성
		try {
			ServerSocket server = new ServerSocket(7777); // 메인 스레드 서버소켓생성
			Socket client = server.accept(); // 클라이언트 연결 요청받기
			System.out.println(client.getInetAddress()+"에서 접속 했습니다"); // 접속한 ClientIP 주소확인
			
			C01ServerSendThread2 send = new C01ServerSendThread2(); // 송신용 스레드 객체 생성
			C01ServerRecvThread2 recv = new C01ServerRecvThread2(); // 수신용 스레드 객체 생성
			
			send.setSocket(client); // 클라이언트 스트림 생성을 위한 소켓 객체 주소 전달
			recv.setSocket(client);
			
			Thread snd = new Thread(send); // 메인 스레드와 구별되는 공간에 스레드 저장
			Thread rev = new Thread(recv);
			
			snd.start(); // 스레드 시작
			rev.start();
		
		} catch (Exception e) {}
		
	}
}
