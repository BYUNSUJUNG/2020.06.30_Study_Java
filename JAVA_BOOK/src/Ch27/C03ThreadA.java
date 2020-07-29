package Ch27;

// 스레드
public class C03ThreadA extends Thread {
	// 생성자
	public C03ThreadA() {
		this.setName("ThreadA"); // implement Runnable를 하면 setName을 할 수 없다. 
									// 그래서 Thread을 상속함
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(this.getName()+"가 출력한 내용");
		}
	}
}
