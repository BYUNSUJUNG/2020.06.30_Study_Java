package Ch27;

// ������
public class C02Task2 implements Runnable {

	// Thread�� ����ص�������, run() �޼ҵ� ���� ������ �ȵǱ⿡ 
	// ���� �־�����ϴ� ������


	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Task2:"+i);
			try {Thread.sleep(500);} catch(Exception e) {};
		}
	}
}
