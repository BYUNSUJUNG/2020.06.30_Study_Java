package Ch09;

// �����ε�
public class C01MethodOverMain {
	public static void main(String[] args) {
		// �������� t1, t2
		// stack t1, t2
		// heap ���� x, y, sum(n1), sum(n1,n2)
		C01MethodOver t1 = new C01MethodOver();
		C01MethodOver t2 = new C01MethodOver();
		
		t1.x=10;
		System.out.println(t1.sum(5));
		System.out.println(t2.sum(5,20));
	}
}
