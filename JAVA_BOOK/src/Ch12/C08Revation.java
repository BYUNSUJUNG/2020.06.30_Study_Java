package Ch12;

// �Ĵ� ���� ���α׷� �ۼ�
// ���డ�ɷ�: 10
// �մ��� ������ ������ �ڵ����� room ����
public class C08Revation {
	// �������: Ŭ��������(static), �ν��Ͻ� ����
	static int Room = 10; // Ŭ��������(static)
	String Name; // �ν��Ͻ� ����
	private String Phone; // �ν��Ͻ� ����
	
	// �����ڿ����ε����� ���� �޾Ƶ�������,
	// phone�� private�̴ϱ� �޼��带 ����غ���
	void setReserve(String name, String phone) {
		
		this.Name = name;
		this.Phone = phone;
		Room--;
		System.out.println("============================");
		System.out.println(this.Name+"���� �� ������ �ϼ̽��ϴ�.");
		System.out.println(this.Name+"���� ��ȭ��ȣ: "+this.Phone);
	}
	
	// ���� ��� ���� ���Ҵ°�
	int getReserve() {
		return Room;
	}
	
}
