package Ch15;

public class C01PhoneExample {
	// �߻� Ŭ������ ��ü�� �������.
	// C01Phone phone = new C01Phone();
	public static void main(String[] args) {
		C01SmartPhone Smart;
		Smart = new C01SmartPhone("ȫ�浿");
		
		Smart.turnOn();
		Smart.internetSearch();
		Smart.turnOff();
	}	
}
