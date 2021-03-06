package Ch13;

// 상속
public class C02DmCellPhone2 extends C02CellPhone {
	
	// 속성(필드)
	int channel;
	
	// 생성자 오버로딩
	public C02DmCellPhone2(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	// 메소드
	void turnOnDmb() {
		System.out.println("채널 "+channel+"번 방송수신시작");
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 "+channel+"번으로 번경");
	}	
	void turnOffFDmb() {
		System.out.println("DMB 방송 종료");
	}

}

