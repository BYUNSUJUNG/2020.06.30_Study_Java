package Ch29;

import java.awt.*;

import javax.swing.*;

public class C04SwingTextField extends JFrame {
	
	public C04SwingTextField() {
		
		super("네번째 프레임 창입니다");
		// 패널 생성
		JPanel pl = new JPanel();
		// 배경색 지정
		pl.setBackground(Color.ORANGE);
				
		// 라벨 생성
		JLabel lb1 = new JLabel("아이디: ");
		//lb1.setBounds(10,10,40,40);
		JLabel lb2 = new JLabel("비밀번호: ");
		//lb2.setBounds(10,10,40,40);
		// 텍스트 필트 생성				칸에 들어갈 문자, 사이즈
		TextField txt1 = new TextField("ID",20);
		TextField txt2 = new TextField("PW",20);
		
		// 패널에 요소 추가
		pl.add(lb1);
		pl.add(txt1);
		pl.add(lb2);
		pl.add(txt2);
		// 레이아웃 지정
		//pl.setLayout(null); // null: setBounds로 위치조정해야한다
		// 프레임에 추가
		add(pl);
		// 패널(프레임) 사이즈 지정
		setSize(500,500);
		// 화면 표시 여부
		setVisible(true);
	}
	public static void main(String[] args) {

		// 자바 프레임 창 생성
		new C04SwingTextField();
		
	}
}
