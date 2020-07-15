package Ch16;

public class C01Audio implements C01RemoteControl{
	// ÇÊµå
	public int volume;
	
	public void turnOn() {
		System.out.println("Audio¸¦ ÄÕ´Ï´Ù");
	}
	public void turnOff() {
		System.out.println("Audio¸¦ ²ü´Ï´Ù");
	}
	public void setVolume(int volume) {
		if(volume> C01RemoteControl.MAX_VOLUME) {
			this.volume = C01RemoteControl.MAX_VOLUME;
		} else if(volume< C01RemoteControl.MIN_VOLUME) {
			this.volume = C01RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}

		System.out.println("Audio º¼·ý: "+this.volume);
	}
}
