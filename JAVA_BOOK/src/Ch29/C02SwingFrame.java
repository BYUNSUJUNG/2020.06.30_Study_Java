package Ch29;

import javax.swing.JFrame;

public class C02SwingFrame extends JFrame {
	
	public C02SwingFrame() {
		
		super("두번째 프레임 제목입니다");
		// 배치 관리자 왼쪽 상단 x,y 오른쪽 하단 x,y
		setBounds(100,100,700,700);
		// 종료 버튼 적용
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 화면 표시 여부 설정
		setVisible(true);
	}
	public static void main(String[] args) {

		// 자바 프레임 창 생성
		C02SwingFrame f = new C02SwingFrame();
	}
}
