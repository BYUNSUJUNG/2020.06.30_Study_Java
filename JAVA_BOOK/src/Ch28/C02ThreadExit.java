package Ch28;

// 스레드
public class C02ThreadExit  implements Runnable {
	
	private boolean stop = false;
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	@Override
	public void run() {
		while(!stop) { // stop이 false일 때, 반복
			System.out.println("Thread 실행중");
		} 
		
		System.out.println("자원 정리부분");
		System.out.println("Thread 실행종료");
		
	}
	
	
}
