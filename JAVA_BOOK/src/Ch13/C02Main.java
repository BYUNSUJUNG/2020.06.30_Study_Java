package Ch13;

public class C02Main {
	public static void main(String[] args) {
		// ��ü����, stack����
		C02DmCellPhone2 dmbCellPhone = new C02DmCellPhone2("�ڹ���", "����", 10);
		// CellPhone Ŭ������ ���� ��ӹ��� �ʵ�
		System.out.println("��: "+dmbCellPhone.model);
		System.out.println("����: "+dmbCellPhone.color);
		
		// DmdCellPhone Ŭ������ �ʵ�
		System.out.println("ä��: "+dmbCellPhone.channel);
		
		// CellPhone Ŭ�����κ��� ��� ���� �޼ҵ� ȣ��
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("��������? ");
		dmbCellPhone.recevieVoice("�ȳ��ϼ��� ���� �������̿���");
		dmbCellPhone.sendVoice("��~ �ݰ�����");
		dmbCellPhone.hangUp();
		// dmbCellPhone Ŭ������ �޼ҵ� ȣ��
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffFDmb();
	}
}
