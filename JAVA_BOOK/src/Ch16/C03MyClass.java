package Ch16;

public class C03MyClass {
	// �ʵ�
	public C01RemoteControl rc;
	
	// ������
	public C03MyClass(C01RemoteControl rc) {
		this.rc = rc;
	}
	
	// �޼���
	void DefaultSet() {
		rc.turnOn();
		rc.setVolume(6);
	}
	void PowerOff() {
		rc.turnOff();
	}
	
}
