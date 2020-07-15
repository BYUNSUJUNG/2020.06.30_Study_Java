package Ch16;

public class C03MyClass {
	// 필드
	public C01RemoteControl rc;
	
	// 생성자
	public C03MyClass(C01RemoteControl rc) {
		this.rc = rc;
	}
	
	// 메서드
	void DefaultSet() {
		rc.turnOn();
		rc.setVolume(6);
	}
	void PowerOff() {
		rc.turnOff();
	}
	
}
