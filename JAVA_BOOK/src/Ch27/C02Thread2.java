package Ch27;

// ������
public class C02Thread2 {
	public static void main(String[] args) {
		
		C02Task2 task2 = new C02Task2();
		Thread th2 = new Thread(task2);
		th2.start();
		
		C02Task3 task3 = new C02Task3();
		Thread th3 = new Thread(task3);
		th3.start();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Main Thread");
			try {Thread.sleep(500);} catch(Exception e) {};
		}
	}
}
