package Ch12;

public class C08ReservationMain {
	public static void main(String[] args) {
		
		// ��ü ����
		C08Revation Lee = new C08Revation();
		C08Revation Kim = new C08Revation();
		C08Revation Jung = new C08Revation();
		
		// ����
		Lee.setReserve("������", "010-0000-0000");
		System.out.println("���� �����ִ� ���� ������ "+Lee.getReserve()+"�� �Դϴ�.");
		Kim.setReserve("���̳�", "010-0000-0000");
		System.out.println("���� �����ִ� ���� ������ "+Kim.getReserve()+"�� �Դϴ�.");
		Jung.setReserve("�����", "010-0000-0000");
		System.out.println("���� �����ִ� ���� ������ "+Jung.getReserve()+"�� �Դϴ�.");
		
		
	}
}
