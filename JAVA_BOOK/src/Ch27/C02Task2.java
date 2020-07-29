package Ch27;

// 스레드
public class C02Task2 implements Runnable {

	// Thread을 상속해도되지만, run() 메소드 강제 생성이 안되기에 
	// 따로 넣어줘야하는 불편함


	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Task2:"+i);
			try {Thread.sleep(500);} catch(Exception e) {};
		}
	}
}
