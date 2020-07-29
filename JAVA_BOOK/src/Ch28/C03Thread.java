package Ch28;

public class C03Thread extends Thread {
	
	public void run() {
		while(true)
		{
			System.out.println("Thread 실행중");
			if(Thread.interrupted())
				break;
		}
		System.out.println("자원정리부분~");
		System.out.println("실행종료");
	}

}