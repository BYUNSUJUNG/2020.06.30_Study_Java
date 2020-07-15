package Ch16;

public class C02Main {
	public static void main(String[] args) {
		C01RemoteControl rc;
		C02Searchable search;
		
		C02SmartTV tv = new C02SmartTV();
		
		rc = tv;
		search = tv;
		
		rc.turnOn(); // C01RemoteControl
		rc.setVolume(4); // C01RemoteControl
		search.search("www.naver.com"); // C02Searchable
		rc.turnOff(); // C01RemoteControl
	}
}
