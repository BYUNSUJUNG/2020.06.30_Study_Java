package Ch28;


// ½º·¹µå
public class C03MainThread {
	public static void main(String[] args) {
		C03Thread task = new C03Thread();
		Thread th = new Thread(task);
		th.start();
		
		try {Thread.sleep(500);} catch(Exception e) {};
		th.interrupt();
		
	}
}
