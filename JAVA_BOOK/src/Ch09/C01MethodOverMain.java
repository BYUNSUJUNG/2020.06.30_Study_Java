package Ch09;

// 오버로딩
public class C01MethodOverMain {
	public static void main(String[] args) {
		// 참조변수 t1, t2
		// stack t1, t2
		// heap 각각 x, y, sum(n1), sum(n1,n2)
		C01MethodOver t1 = new C01MethodOver();
		C01MethodOver t2 = new C01MethodOver();
		
		t1.x=10;
		System.out.println(t1.sum(5));
		System.out.println(t2.sum(5,20));
	}
}
