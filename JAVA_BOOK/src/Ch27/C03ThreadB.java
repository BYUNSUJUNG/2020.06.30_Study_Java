package Ch27;

// ������
public class C03ThreadB extends Thread {
	// ������
		public C03ThreadB() {
			this.setName("ThreadB"); // implement Runnable�� �ϸ� setName�� �� �� ����. 
										// �׷��� Thread�� �����
		}

		@Override
		public void run() {
			for (int i = 0; i < 5; i++) {
				System.out.println(this.getName()+"�� ����� ����");
			}
		}
}
