package Ch27;

// ������
public class C03ThreadA extends Thread {
	// ������
	public C03ThreadA() {
		this.setName("ThreadA"); // implement Runnable�� �ϸ� setName�� �� �� ����. 
									// �׷��� Thread�� �����
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(this.getName()+"�� ����� ����");
		}
	}
}
