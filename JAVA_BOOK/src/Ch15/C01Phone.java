package Ch15;

public abstract class C01Phone {
	public String owner;
	
	public C01Phone(String owner) {
		this.owner = owner;
	}
	public void turnOn() {
		System.out.println("폰전원을 켭니다");
	}
	public void turnOff() {
		System.out.println("폰전원을 끕니다");
	}
}
