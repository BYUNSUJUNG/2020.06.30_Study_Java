package Ch29;

import java.awt.*;
import javax.swing.*;

public class C05SwingTextArea extends JFrame {
	
	public C05SwingTextArea() {
		
		super("다섯번째 프레임 창입니다");
		// 패널 생성
		JPanel pl = new JPanel();
		// 배경색 지정
		pl.setBackground(Color.ORANGE);
				
		// TextArea 객체 생성
		TextArea Area1 = new TextArea();
		// TextArea 위치 지정
		Area1.setBounds(10,10,200,100);
		
		JTextField txt1 = new JTextField();
		txt1.setBounds(10,210,100,100);
		
		// 패널에 요소 추가
		pl.add(Area1);
		pl.add(txt1);
		pl.setLayout(null);
		add(pl);
		
		// 패널(프레임) 사이즈 지정
		setSize(500,500);
		// 화면 표시 여부
		setVisible(true);
	}
	
	public static void main(String[] args) {

		// 자바 프레임 창 생성
		new C05SwingTextArea();
		
	}
}
