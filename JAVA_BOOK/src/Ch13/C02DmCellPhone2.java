package Ch13;

// ���
public class C02DmCellPhone2 extends C02CellPhone {
	
	// �Ӽ�(�ʵ�)
	int channel;
	
	// ������ �����ε�
	public C02DmCellPhone2(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	// �޼ҵ�
	void turnOnDmb() {
		System.out.println("ä�� "+channel+"�� ��ۼ��Ž���");
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("ä�� "+channel+"������ ����");
	}	
	void turnOffFDmb() {
		System.out.println("DMB ��� ����");
	}

}
