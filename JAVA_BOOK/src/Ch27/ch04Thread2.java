package Ch27;

public class ch04Thread2 implements Runnable {

	int j = 0;
	
	@Override
	public void run() {
		while(true) {
			for (int j = 0; j < 3; j++) {
				if(j==0) {
					C04MainThread.map[0][0] = 1;
					C04MainThread.map[0][1] = 0;
					C04MainThread.map[0][2] = 0;
					
				} else if(j==1) { 
					C04MainThread.map[0][0] = 0;
					C04MainThread.map[0][1] = 1;
					C04MainThread.map[0][2] = 0;
					
				} else if(j==2) { 
					C04MainThread.map[0][0] = 0;
					C04MainThread.map[0][1] = 0;
					C04MainThread.map[0][2] = 1;
				}
				try {Thread.sleep(700);} catch(Exception e) {};
			}
		}
	}
}
