package Ch29;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

public class C08SwingThreadTest implements ActionListener{

	private JFrame frame;
	
	JLabel lblNewLabel;
	
	static JScrollPane scroll1; // 쓰레드 클래스에서 사용하기 위해서 static
	static JTextArea textArea1;
	private JTextField txt1;
	JButton btn1;
	
	JScrollPane scroll2;
	JTextArea textArea2;
	JButton btn2;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					C08SwingThreadTest window = new C08SwingThreadTest();
					window.frame.setVisible(true);
					ThreadABC task1 = new ThreadABC();
					Thread th1 = new Thread(task1);
					th1.start();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public C08SwingThreadTest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		lblNewLabel = new JLabel("\uCC44\uD305\uCC3D");
		lblNewLabel.setBounds(24, 12, 57, 15);
		frame.getContentPane().add(lblNewLabel);
		
		// 파일 내용 저장하는 부분
		scroll1 = new JScrollPane();
		scroll1.setBounds(24, 37, 133, 149);
		frame.getContentPane().add(scroll1);
		
		textArea1 = new JTextArea();
		scroll1.setViewportView(textArea1);

		txt1 = new JTextField();
		txt1.setBounds(24, 197, 133, 21);
		frame.getContentPane().add(txt1);
		txt1.setColumns(10);
		txt1.addActionListener(this); // 객체를 Listener로 확인할 수 있도록
		
		btn1 = new JButton("\uD30C\uC77C\uB85C \uC800\uC7A5");
		btn1.setBounds(24, 228, 133, 23);
		frame.getContentPane().add(btn1);
		btn1.addActionListener(this); // 객체를 Listener로 확인할 수 있도록
		 
		// 파일 내용 불러오는 부분
		btn2 = new JButton("\uD30C\uC77C\uC5D0\uC11C \uBD88\uB7EC\uC624\uAE30");
		btn2.setBounds(248, 196, 142, 23);
		frame.getContentPane().add(btn2);
		btn2.addActionListener(this); // 객체를 Listener로 확인할 수 있도록
		
		scroll2 = new JScrollPane();
		scroll2.setBounds(254, 37, 126, 149);
		frame.getContentPane().add(scroll2);
		
		textArea2 = new JTextArea();
		scroll2.setViewportView(textArea2);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==txt1)
		{
			textArea1.append(txt1.getText()+"\n");
			txt1.setText("");
		} 
		// bt1 버튼을 누르면 TextArea의 내용을 파일로 저장하기
		if(e.getSource()==btn1)
		{
			try {
				Writer out = new FileWriter("c:/temp/aaa.txt");
				out.write(textArea1.getText());
				out.flush();
				out.close();
			} catch (Exception ec) {
			}
		}
		// bt2 버튼을 누르면 파일의 내용을 TextArea에 불러내기
		if(e.getSource()==btn2)
		{
			textArea2.setText(""); // 내용 초기화
			try {
				Reader in = new FileReader("c:/temp/aaa.txt");
				String tmp;
				char ch;
				int readNum;
				
				while(true) {
					readNum = in.read(); // 한문자
					if(readNum==-1) // 파일에서 읽을 게 없으면 -1를 반환
						break;
					ch=(char)readNum;
					tmp=Character.toString(ch);
					textArea2.append(tmp);
				}
				
			} catch (Exception ec) {
			}
		}
		
	}
}

class ThreadABC implements Runnable {

	@Override
	public void run() {
		while(true) {
			C08SwingThreadTest.textArea1.append("This is ThreadABC\n");
			// 스크롤 자동으로 내려가도록
			C08SwingThreadTest.scroll1.getVerticalScrollBar().setValue(C08SwingThreadTest.scroll1.getVerticalScrollBar().getMaximum());

			try {Thread.sleep(1000);} catch (Exception e) {}
		}
		
		
	}
	
}











