package Ch28;

// ½º·¹µå
public class C01Thread1 implements Runnable {
	
	C01Memory tmp;
	
	C01Thread1(C01Memory tmp) {
		this.tmp = tmp;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			tmp.setNum();
			 try {Thread.sleep(100);} catch (Exception e) {}
		}
	}
}
