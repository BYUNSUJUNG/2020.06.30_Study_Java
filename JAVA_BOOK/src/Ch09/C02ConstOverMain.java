package Ch09;

// 생성자 오버로드
public class C02ConstOverMain {
	public static void main(String[] args) {
		
		// stack영역: 참조변수 test1, test2, test3
		// heap영역: 각각 x,y,z, showPoint()
		C02ConstOver test1 = new C02ConstOver();
		C02ConstOver test2 = new C02ConstOver(3,4);
		C02ConstOver test3 = new C02ConstOver(1,2,5);
		
		test1.ShowPoint();
		test2.ShowPoint();
		test3.ShowPoint();
	}
}
