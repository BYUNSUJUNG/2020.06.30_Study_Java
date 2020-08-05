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
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class C099ChatServer implements ActionListener{

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
					C099ChatServer window = new C099ChatServer();
					window.frame.setVisible(true);
					
					ServerSocket server = new ServerSocket(7777); // ���� ������ �������ϻ���
					Socket client = server.accept(); // Ŭ���̾�Ʈ ���� ��û�ޱ�
					System.out.println(client.getInetAddress()+"���� ���� �߽��ϴ�"); // ������ ClientIP �ּ�Ȯ��
					
					C01ServerSendThread send = new C01ServerSendThread(); // �۽ſ� ������ ��ü ����
					C01ServerRecvThread recv = new C01ServerRecvThread(); // ���ſ� ������ ��ü ����
					
					send.setSocket(client); // Ŭ���̾�Ʈ ��Ʈ�� ������ ���� ���� ��ü �ּ� ����
					recv.setSocket(client);
					
					Thread snd = new Thread(send); // ���� ������� �����Ǵ� ������ ������ ����
					Thread rev = new Thread(recv);
					
					snd.start(); // ������ ����
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
	public C099ChatServer() {
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
			area.append("��(Server): "+txt1.getText()+"\n");
			txt1.setText("");
		}
	}
}

//(1) �޼��� ������ ���� ������
class C099ServerSendThread implements Runnable {
	Socket client;
	
	public void setSocket(Socket socket) {
		client = socket;
	}

	@Override
	public void run() {
		try {
			DataOutputStream out = new DataOutputStream(client.getOutputStream());
			String msg; // �Է��� �޼����� ����
			out.writeUTF("Welcome to Server"); // String����
			
			// quit �Է½� �ݺ��� ����Ǹ鼭 ���� ����
			Scanner scan = new Scanner(System.in);
			while(true) {
				msg = C099ChatClient.txt1.getText(); // �޼��� �Է�
				if(msg.equals("quit")) { // �޼����� ������ quit�� ��� 
					System.out.println("��������");
					System.exit(1); // ���� ����
				}
				out.writeUTF(msg); // �Է��� �޼����� ����
				out.flush();
			}
		} catch (Exception e) {}
		
		
	}
}


//(2) �޼��� �޴� ���� ������
class C099ServerRecvThread implements Runnable {
	
	Socket client;
	
	public void setSocket(Socket socket) { // ���� ����
		client = socket;
	}

	@Override
	public void run() {
		try {
			DataInputStream in = new DataInputStream(client.getInputStream());
			String msg; // ���� �޼����� ����
			while(true) {
				msg = in.readUTF(); // Ŭ���̾�Ʈ�� ���� �޼����� ������ ����
				if(msg.equals("quit")) { // �޼����� ������ quit�̸�
					System.out.println("��������");
					System.exit(1); // ��������
				}
				System.out.println("[Client]: "+msg); // �޼����� ������ quit�� �ƴϸ� console�� print
			}
		} catch (Exception e) {}
		
	}

}