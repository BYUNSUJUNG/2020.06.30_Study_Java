package Ch09;

// ������ �����ε�
public class C02ConstOverMain {
	public static void main(String[] args) {
		
		// stack����: �������� test1, test2, test3
		// heap����: ���� x,y,z, showPoint()
		C02ConstOver test1 = new C02ConstOver();
		C02ConstOver test2 = new C02ConstOver(3,4);
		C02ConstOver test3 = new C02ConstOver(1,2,5);
		
		test1.ShowPoint();
		test2.ShowPoint();
		test3.ShowPoint();
	}
}
