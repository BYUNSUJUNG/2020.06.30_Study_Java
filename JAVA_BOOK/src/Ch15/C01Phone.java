package Ch15;

public abstract class C01Phone {
	public String owner;
	
	public C01Phone(String owner) {
		this.owner = owner;
	}
	public void turnOn() {
		System.out.println("�������� �մϴ�");
	}
	public void turnOff() {
		System.out.println("�������� ���ϴ�");
	}
}
