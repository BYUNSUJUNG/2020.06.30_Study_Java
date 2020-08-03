package Ch29;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

import javax.swing.*;

public class C07SwingaddThread extends JFrame implements ActionListener {
	
	JPanel pl;
	// ThreadA�� ������ ��������: static
	static JTextArea area1;
	static JScrollPane scroll1;
	
	static JTextArea area2;
	static JScrollPane scroll2;
	
	TextField txt1;
	JButton btn1;
	JButton btn2;
	
	C07SwingaddThread() {
		super("�����带 ���۽�Ű�� ������ â");
		
		// panel
		pl = new JPanel();
		
		// textarea, scroll
		area1 = new JTextArea(10,30);
		scroll1 = new JScrollPane(area1);
		scroll1.setBounds(10,10,450,150);
		
		area2 = new JTextArea(10,30);
		scroll2 = new JScrollPane(area2);
		scroll2.setBounds(10,280,450,150);
				
		// text
		txt1 = new TextField();
		txt1.setBounds(10,170,150,30);
		txt1.addActionListener(this); // ��ü�� Listener�� Ȯ���� �� �ֵ���
		
		// button
		btn1 = new JButton("���Ϸ� ����");
		btn1.setBounds(10,220,150,30);
		btn1.addActionListener(this); // ��ü�� Listener�� Ȯ���� �� �ֵ���
		
		btn2 = new JButton("���Ͽ��� �ҷ�����");
		btn2.setBounds(10,450,150,30);
		btn2.addActionListener(this); // ��ü�� Listener�� Ȯ���� �� �ֵ���
		
		// add
		pl.add(scroll1);
		pl.add(scroll2);
		pl.add(txt1);
		pl.add(btn1);
		pl.add(btn2);
		add(pl);
		pl.setLayout(null);
		setSize(500,700);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new C07SwingaddThread();
		ThreadA task1 = new ThreadA();
		Thread th1 = new Thread(task1);
		th1.start();
		
		while(true) {

			C07SwingaddThread.area1.append("This is MainThread\n");
			// ��Ʈ���� �ڵ����� ������ �� �ֵ���
			// �ִ� ���� ������
			C07SwingaddThread.scroll1.getVerticalScrollBar().setValue(C07SwingaddThread.scroll1.getVerticalScrollBar().getMaximum());
			
			try {Thread.sleep(1200);}catch(Exception e) {}
			
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TxtField�� ������ TextArea�� �߰��ϱ�
		if(e.getSource()==txt1)
		{
			area1.append(txt1.getText()+"\n");
			txt1.setText("");
		} 
		// bt1 ��ư�� ������ TextArea�� ������ ���Ϸ� �����ϱ�
		if(e.getSource()==btn1)
		{
			try {
				Writer out = new FileWriter("c:/temp/Dialog.txt");
				out.write(area1.getText());
				out.flush();
				out.close();
			} catch (Exception ec) {
			}
		}
		// bt2 ��ư�� ������ ������ ������ TextArea�� �ҷ�����
		if(e.getSource()==btn2)
		{
			try {
				Reader in = new FileReader("c:/temp/Dialog.txt");
				String tmp;
				char ch;
				int readNum;
				
				while(true) {
					readNum = in.read(); // �ѹ���
					if(readNum==-1) 
						break;
					ch=(char)readNum;
					tmp=Character.toString(ch);
					area2.append(tmp);
				}
				
			} catch (Exception ec) {
			}
		}
		
		
		
	}
}

class ThreadA implements Runnable {

	// implements�� �ϸ� run()�� ���� ��ӵ�
	@Override
	public void run() {
		while(true) {

			C07SwingaddThread.area1.append("This is Thread\n");
			// ��Ʈ���� �ڵ����� ������ �� �ֵ���
			// �ִ� ���� ������
			C07SwingaddThread.scroll1.getVerticalScrollBar().setValue(C07SwingaddThread.scroll1.getVerticalScrollBar().getMaximum());
			
			try {Thread.sleep(1000);}catch(Exception e) {}
			
		}
	}
	
}
