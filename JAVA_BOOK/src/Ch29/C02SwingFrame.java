package Ch29;

import javax.swing.JFrame;

public class C02SwingFrame extends JFrame {
	
	public C02SwingFrame() {
		
		super("�ι�° ������ �����Դϴ�");
		// ��ġ ������ ���� ��� x,y ������ �ϴ� x,y
		setBounds(100,100,700,700);
		// ���� ��ư ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// ȭ�� ǥ�� ���� ����
		setVisible(true);
	}
	public static void main(String[] args) {

		// �ڹ� ������ â ����
		C02SwingFrame f = new C02SwingFrame();
	}
}
