package Ch08;

public class C01ClasstestMain {
	
	public static void main(String[] args) {
		// stack������ cla
		C01Classtest cla = new C01Classtest(); // �������Լ� ���: heap������ �Ҵ�, heap������ x, y, z
		
		cla.x = 3;
		cla.y = 5;
		cla.z = 7;
		System.out.println("x = "+cla.x+", y = "+cla.y+", z = "+cla.z);
	}
	
}
