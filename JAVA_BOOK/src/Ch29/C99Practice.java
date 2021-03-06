package Ch29;

import java.awt.Color;
import java.awt.TextArea;

import javax.swing.*;

public class C99Practice extends JFrame {
	
	public C99Practice() {
		super("TEST");
		// 패널 생성
		JPanel pl = new JPanel();
				
		// TextArea 객체 생성
		TextArea Area1 = new TextArea();
		// TextArea 위치 지정
		Area1.setBounds(10,10,400,200);
		
		JTextField txt1 = new JTextField();
		txt1.setBounds(10,240,200,30);

		JButton btn1 = new JButton("INSERT");
		btn1.setBounds(10,280,100,30);
		
		// 패널에 요소 추가
		pl.add(Area1);
		pl.add(txt1);
		pl.add(btn1);
		pl.setLayout(null);
		add(pl);
		
		// 패널(프레임) 사이즈 지정
		setSize(500,500);
		// 화면 표시 여부
		setVisible(true);
	}
	public static void main(String[] args) {
		new C99Practice();
	}
	
}
