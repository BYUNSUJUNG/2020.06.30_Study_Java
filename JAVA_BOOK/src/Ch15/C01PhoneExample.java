package Ch15;

public class C01PhoneExample {
	// 추상 클래스는 객체를 못만든다.
	// C01Phone phone = new C01Phone();
	public static void main(String[] args) {
		C01SmartPhone Smart;
		Smart = new C01SmartPhone("홍길동");
		
		Smart.turnOn();
		Smart.internetSearch();
		Smart.turnOff();
	}	
}
