package Ch28;


// 스레드
public class C02MainThread {
	public static void main(String[] args) {
		// Stop Flag를 이용한 스레드 정지
		C02ThreadExit task = new C02ThreadExit();
		Thread th = new Thread(task);
		th.start();
		
		try {Thread.sleep(500);} catch(Exception e) {};
		System.out.println("스레드 종료를 원하는 시점");
		task.setStop(true);
		
	}
}
