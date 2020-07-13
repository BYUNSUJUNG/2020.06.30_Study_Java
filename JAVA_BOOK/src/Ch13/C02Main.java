package Ch13;

public class C02Main {
	public static void main(String[] args) {
		// 객체생성, stack영역
		C02DmCellPhone2 dmbCellPhone = new C02DmCellPhone2("자바폰", "검정", 10);
		// CellPhone 클래스로 부터 상속받은 필드
		System.out.println("모델: "+dmbCellPhone.model);
		System.out.println("색상: "+dmbCellPhone.color);
		
		// DmdCellPhone 클래스의 필드
		System.out.println("채널: "+dmbCellPhone.channel);
		
		// CellPhone 클래스로부터 상속 받은 메소드 호출
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요? ");
		dmbCellPhone.recevieVoice("안녕하세요 저는 ㅇㅇㅇ이에요");
		dmbCellPhone.sendVoice("아~ 반가워요");
		dmbCellPhone.hangUp();
		// dmbCellPhone 클래스의 메소드 호출
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffFDmb();
	}
}
