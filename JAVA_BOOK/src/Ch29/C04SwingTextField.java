package Ch29;

import java.awt.*;

import javax.swing.*;

public class C04SwingTextField extends JFrame {
	
	public C04SwingTextField() {
		
		super("�׹�° ������ â�Դϴ�");
		// �г� ����
		JPanel pl = new JPanel();
		// ���� ����
		pl.setBackground(Color.ORANGE);
				
		// �� ����
		JLabel lb1 = new JLabel("���̵�: ");
		//lb1.setBounds(10,10,40,40);
		JLabel lb2 = new JLabel("��й�ȣ: ");
		//lb2.setBounds(10,10,40,40);
		// �ؽ�Ʈ ��Ʈ ����				ĭ�� �� ����, ������
		TextField txt1 = new TextField("ID",20);
		TextField txt2 = new TextField("PW",20);
		
		// �гο� ��� �߰�
		pl.add(lb1);
		pl.add(txt1);
		pl.add(lb2);
		pl.add(txt2);
		// ���̾ƿ� ����
		//pl.setLayout(null); // null: setBounds�� ��ġ�����ؾ��Ѵ�
		// �����ӿ� �߰�
		add(pl);
		// �г�(������) ������ ����
		setSize(500,500);
		// ȭ�� ǥ�� ����
		setVisible(true);
	}
	public static void main(String[] args) {

		// �ڹ� ������ â ����
		new C04SwingTextField();
		
	}
}
