package Ch29;

import javax.swing.JFrame;

public class C01SwingFrame {
	public static void main(String[] args) {
		// �ڹ� ������ â ����
		JFrame f = new JFrame();
		// ������ â ���� ����
		f.setTitle("�ڹ� ������ �����Դϴ�");
		// ��ġ ������ ���� ��� x,y ������ �ϴ� x,y
		f.setBounds(100,100,700,700);
		// ���� ��ư ����
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// ȭ�� ǥ�� ���� ����
		f.setVisible(true);
	}
}
