package Ch27;

// 스레드
public class C04MainThread {
	
	// 공유 영역 2차원 배열 객체
	public static int [][]map = new int[3][3];
	
	
	public static void main(String[] args) {
		
		// 스레드 ch04Thread1 은 map[0]째 요소에서 1을 0.5초 마다 오른쪽으로 이동
		// 스레드 ch04Thread2 은 map[1]째 요소에서 1을 0.7초 마다 오른쪽으로 이동
		// 스레드 ch04Thread3 은 map[2]째 요소에서 1을 0.9초 마다 오른쪽으로 이동
		int i = 0, j = 0;
		
		ch04Thread1 t1 = new ch04Thread1();
		Thread th1 = new Thread(t1);
		th1.start();

		ch04Thread2 t2 = new ch04Thread2();
		Thread th2 = new Thread(t2);
		th2.start();
		
		ch04Thread3 t3 = new ch04Thread3();
		Thread th3 = new Thread(t3);
		th3.start();
		while(true) {
			for (i = 0; i < 3; i++) {
				for (j = 0; j < 3; j++) {
					System.out.print(map[i][j]+"");
				}
				System.out.println();
			}
			System.out.println();
			try { Thread.sleep(1000);} catch (Exception e) {} // 딜레이
		}
	}
}
