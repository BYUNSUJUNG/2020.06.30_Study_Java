package Ch31;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

//한 파일에 스레드 클래스(Send, Recv)도 넣고 메인 메소드가 있는 클래스도 넣기

// (1) 메세지 보내는 역할 스레드
class C01ClientSendThread2 implements Runnable{
	
	
	Socket client;
	
	public void setSocket(Socket socket) { // 소켓 설정
		client = socket;
	}
	
	@Override
	public void run() {
		try {
			DataOutputStream out = new DataOutputStream(client.getOutputStream());
			String msg; // 보낼 메세지를 담음
			Scanner sc = new Scanner(System.in); 
			while(true) {
				System.out.print("[나]:");
				msg = sc.nextLine(); // 메세지 입력
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
class C01ClientRecvThread2 implements Runnable {
	
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
				System.out.println("[Server]: "+msg); // 메세지의 내용이 quit가 아니면 console에 print
			}
		} catch (Exception e) {}
		
	}

}

//(3) 실제 실행 역할 클래스
public class C01ChatClient2 {
	public static void main(String[] args) {
		// 메인 스레드 서버소켓 생성
		try {
			Socket client = new Socket("192.168.3.10",7777); // 소켓생성
			
			C01ClientSendThread2 send = new C01ClientSendThread2(); // 송신용 스레드 객체 생성
			C01ClientRecvThread2 recv = new C01ClientRecvThread2(); // 수신용 스레드 객체 생성
			
			send.setSocket(client); // 클라이언트 스트림 생성을 위한 소켓 객체 주소 전달
			recv.setSocket(client);
			
			Thread snd = new Thread(send); // 메인 스레드와 구별되는 공간에 스레드 저장
			Thread rev = new Thread(recv);
			
			snd.start(); // 스레드 시작
			rev.start();
		
		} catch (Exception e) {}
		
	}
}
