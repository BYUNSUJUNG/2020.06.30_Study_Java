package Ch28;

class C01Memory {
	private int num = 100;
	private int getNum() {
		return num;
	}
	// 작업 스레드 동시 접근시 문제가 발생하는 함수 => synchronized 임계영역 생성
	public synchronized void setNum() {
		this.num++;
		System.out.println(this.num);
	}
}
// 스레드
public class C01MainThread {
	public static void main(String[] args) {
		C01Memory test1 = new C01Memory();
		C01Thread1 ts1 = new C01Thread1(test1);
		C01Thread2 ts2 = new C01Thread2(test1);
		
		Thread th1 = new Thread(ts1);
		Thread th2 = new Thread(ts2);
		// 임계영역을 만들지 않아서 문제가 발생함
		th1.start(); // 100 + 100 = 200
		th2.start(); // 200 + 50 = 250
	}
}
