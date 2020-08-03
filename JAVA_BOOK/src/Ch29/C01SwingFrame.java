package Ch29;

import javax.swing.JFrame;

public class C01SwingFrame {
	public static void main(String[] args) {
		// 자바 프레임 창 생성
		JFrame f = new JFrame();
		// 프레임 창 제목 지정
		f.setTitle("자바 프레임 제목입니다");
		// 배치 관리자 왼쪽 상단 x,y 오른쪽 하단 x,y
		f.setBounds(100,100,700,700);
		// 종료 버튼 적용
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 화면 표시 여부 설정
		f.setVisible(true);
	}
}
