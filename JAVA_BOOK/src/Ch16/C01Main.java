package Ch16;

public class C01Main {
	public static void main(String[] args) {
		C01RemoteControl rc;
		rc = new C01TV();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
		rc = new C01Audio();
		rc.turnOn();
		rc.setVolume(7);
		rc.turnOff();
	}
}
