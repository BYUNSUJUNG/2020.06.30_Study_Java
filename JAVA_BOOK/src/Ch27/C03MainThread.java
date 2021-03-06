package Ch27;

// 스레드
public class C03MainThread {
	public static void main(String[] args) {
		
		C03ThreadA t1 = new C03ThreadA();
		Thread th1 = new Thread(t1);
		th1.start();
		
		C03ThreadB t2 = new C03ThreadB();
		Thread th2 = new Thread(t2);
		th2.start();
		
		try { Thread.sleep(1000);} catch (Exception e) {} // 딜레이
		System.out.println("Main스레드에서 작업스레드 확인"+t1.getName());
		System.out.println("Main스레드에서 작업스레드 확인"+t2.getName());
	}
}
