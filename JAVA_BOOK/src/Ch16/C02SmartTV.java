package Ch16;

public class C02SmartTV implements C01RemoteControl, C02Searchable{
	public int volume;
	
	// C02Searchable
	@Override
	public void search(String url) {
		System.out.println(url+"�� �˻��մϴ�");
		
	}

	// C01RemoteControl
	@Override
	public void turnOn() {
		System.out.println("TV�� �մϴ�");
	}
	@Override
	public void turnOff() {
		System.out.println("TV�� ���ϴ�");
	}
	@Override
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
