package Ch08;

public class C02ClassMethodMain {
	// 참조변수명 test
	// stack에 test, heap에 x,y,sum()
	public static void main(String[] args) {
		C02ClassMethod test = new C02ClassMethod();
		test.x = 5;
		test.y = 100;
		System.out.println(test.sum());
		System.out.println(test.sum(10,500));
	}
}
