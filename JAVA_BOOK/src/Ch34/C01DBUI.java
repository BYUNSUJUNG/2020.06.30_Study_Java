package Ch34;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class C01DBUI implements ActionListener{

	private JFrame frame;
	private JTextField txt1;
	private JTextField txt2;
	private JTextField txt3;
	private JTextField txt4;
	JButton btnInsert;
	JButton btnUpdate;
	JButton btnDelete;
	JButton btnSelect;
	static JTextArea area; // C01DBConn���� �����ϱ� ����

	C01DBConn DBObj = new C01DBConn();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					C01DBUI window = new C01DBUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public C01DBUI() {
		initialize();
		DBObj.setting(this); // ��ü�� ���� ������ ������
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\uC131\uC801\uAD00\uB9AC\uD504\uB85C\uADF8\uB7A8");
		frame.setBounds(100, 100, 442, 241);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txt1 = new JTextField();
		txt1.setBounds(26, 126, 82, 21);
		frame.getContentPane().add(txt1);
		txt1.setColumns(10);
		
		txt2 = new JTextField();
		txt2.setColumns(10);
		txt2.setBounds(120, 126, 82, 21);
		frame.getContentPane().add(txt2);
		
		txt3 = new JTextField();
		txt3.setColumns(10);
		txt3.setBounds(214, 126, 82, 21);
		frame.getContentPane().add(txt3);
		
		txt4 = new JTextField();
		txt4.setColumns(10);
		txt4.setBounds(308, 126, 82, 21);
		frame.getContentPane().add(txt4);
		
		JLabel lblNewLabel = new JLabel("\uD559\uBC88");
		lblNewLabel.setBounds(26, 101, 57, 15);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("\uC774\uB984");
		label.setBounds(120, 101, 57, 15);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("\uD559\uACFC");
		label_1.setBounds(214, 101, 57, 15);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("\uD559\uC810");
		label_2.setBounds(308, 101, 57, 15);
		frame.getContentPane().add(label_2);
		
		btnInsert = new JButton("INSERT");
		btnInsert.setBounds(26, 157, 82, 23);
		frame.getContentPane().add(btnInsert);
		
		btnUpdate = new JButton("UPDATE");
		btnUpdate.setBounds(120, 157, 82, 23);
		frame.getContentPane().add(btnUpdate);
		
		btnDelete = new JButton("DELETE");
		btnDelete.setBounds(214, 157, 82, 23);
		frame.getContentPane().add(btnDelete);
		
		btnSelect = new JButton("SELECT");
		btnSelect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSelect.setBounds(308, 157, 82, 23);
		frame.getContentPane().add(btnSelect);
		
		area = new JTextArea();
		area.setBounds(26, 10, 366, 81);
		area.append("[�й�]\t[�̸�]\t[�а�]\t[����]\n");
		DBObj.SELECT();
		frame.getContentPane().add(area);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(26, 10, 366, 81);
		frame.getContentPane().add(scrollPane);
		
		btnInsert.addActionListener(this);
		btnUpdate.addActionListener(this);
		btnDelete.addActionListener(this);
		btnSelect.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int no;
		
		if(e.getSource()==btnInsert) {
			// txt���� ���� ���� String���� �Ǳ⿡
			// no�� int�� �ٲپ������
			no = Integer.parseInt(txt1.getText());
			DBObj.INSERT(no, txt2.getText(), txt3.getText(), txt4.getText());
			txt1.setText("");txt2.setText("");txt3.setText("");txt4.setText("");
		}
		if(e.getSource()==btnUpdate) {
			no = Integer.parseInt(txt1.getText());
			DBObj.UPDATE(no, txt2.getText(), txt3.getText(), txt4.getText());
			txt1.setText("");txt2.setText("");txt3.setText("");txt4.setText("");
		}
		if(e.getSource()==btnDelete) {
			no = Integer.parseInt(txt1.getText());
			DBObj.DELETE(no);
			txt1.setText("");
		}
		if(e.getSource()==btnSelect) {
			
			area.setText("");
			area.append("[�й�]\t[�̸�]\t[�а�]\t[����]\n");
			
			if(txt1.getText().equals("")) { // �й��� �Է����� �ʾ��� ���
				// ��ü ���̺��� �����
				
				DBObj.SELECT();
				txt1.setText("");
			} else { // �й��� �Է����� ���
				// �й��� �ش��ϴ� ���� �����
				
				no = Integer.parseInt(txt1.getText());
				DBObj.SELECT(no);
				txt1.setText("");
			}
			
		}
		
	}
}