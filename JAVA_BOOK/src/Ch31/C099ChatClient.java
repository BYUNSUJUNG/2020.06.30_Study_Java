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
					
					Socket client = new Socket("192.168.3.10",7777); // ���ϻ���
					
					C01ClientSendThread send = new C01ClientSendThread(); // �۽ſ� ������ ��ü ����
					C01ClientRecvThread recv = new C01ClientRecvThread(); // ���ſ� ������ ��ü ����
					
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
			area.append("��(Client): "+txt1.getText()+"\n");
			txt1.setText("");
		}
	}
}

//(1) �޼��� ������ ���� ������
class C099ClientSendThread implements Runnable{
	
	
	Socket client;
	
	public void setSocket(Socket socket) { // ���� ����
		client = socket;
	}
	
	@Override
	public void run() {
		try {
			DataOutputStream out = new DataOutputStream(client.getOutputStream());
			String msg; // ���� �޼����� ����
			Scanner sc = new Scanner(System.in); 
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
class C099ClientRecvThread implements Runnable {
	
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
				C099ChatClient.area.append("[Server]: "+msg);
			}
		} catch (Exception e) {}
		
	}

}