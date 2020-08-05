package Ch31;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.Socket;
import java.util.Scanner;

public class C099ChatClient implements ActionListener{

	private JFrame frame;
	static JTextField txt1;

	JScrollPane scrollPane;
	static JTextArea area;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					C099ChatClient window = new C099ChatClient();
					window.frame.setVisible(true);
					
					Socket client = new Socket("192.168.3.10",7777); // 소켓생성
					
					C01ClientSendThread send = new C01ClientSendThread(); // 송신용 스레드 객체 생성
					C01ClientRecvThread recv = new C01ClientRecvThread(); // 수신용 스레드 객체 생성
					
					send.setSocket(client); // 클라이언트 스트림 생성을 위한 소켓 객체 주소 전달
					recv.setSocket(client);
					
					Thread snd = new Thread(send); // 메인 스레드와 구별되는 공간에 스레드 저장
					Thread rev = new Thread(recv);
					
					snd.start(); // 스레드 시작
					rev.start();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
				
	}

	/**
	 * Create the application.
	 */
	public C099ChatClient() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 326, 328);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(26, 10, 246, 209);
		frame.getContentPane().add(scrollPane);
		
		area = new JTextArea();
		scrollPane.setViewportView(area);
		
		txt1 = new JTextField();
		txt1.setBounds(26, 243, 246, 21);
		frame.getContentPane().add(txt1);
		txt1.setColumns(10);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==txt1)
		{
			area.append("나(Client): "+txt1.getText()+"\n");
			txt1.setText("");
		}
	}
}

//(1) 메세지 보내는 역할 스레드
class C099ClientSendThread implements Runnable{
	
	
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
				msg = C099ChatClient.txt1.getText(); // 메세지 입력
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
class C099ClientRecvThread implements Runnable {
	
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
				C099ChatClient.area.append("[Server]: "+msg);
			}
		} catch (Exception e) {}
		
	}

}