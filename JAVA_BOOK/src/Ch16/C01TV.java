package Ch16;

public class C01TV implements C01RemoteControl{
	// �ʵ�
	public int volume;
	
	public void turnOn() {
		System.out.println("TV�� �մϴ�");
	}
	public void turnOff() {
		System.out.println("TV�� ���ϴ�");
	}
	public void setVolume(int volume) {
		if(volume> C01RemoteControl.MAX_VOLUME) {
			this.volume = C01RemoteControl.MAX_VOLUME;
		} else if(volume< C01RemoteControl.MIN_VOLUME) {
			this.volume = C01RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}

		System.out.println("TV ����: "+this.volume);
	}
}
