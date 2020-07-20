package Ch18;

public class C01Car {
	C01Tire frontLeftTire = new C01HankookTire();
	C01Tire frontRightTire = new C01HankookTire();
	C01Tire backLeftTire = new C01HankookTire();
	C01Tire backRightTire = new C01HankookTire();
	
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
}
