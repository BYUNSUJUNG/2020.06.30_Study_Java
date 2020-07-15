package Ch16;

public interface C01RemoteControl {
	
	// 필드
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	// 추상 메서드
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
}
