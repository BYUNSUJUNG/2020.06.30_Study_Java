package Ch08;

public class C01ClasstestMain {
	
	public static void main(String[] args) {
		// stack영역에 cla
		C01Classtest cla = new C01Classtest(); // 생성자함수 사용: heap영역에 할당, heap영역에 x, y, z
		
		cla.x = 3;
		cla.y = 5;
		cla.z = 7;
		System.out.println("x = "+cla.x+", y = "+cla.y+", z = "+cla.z);
	}
	
}
