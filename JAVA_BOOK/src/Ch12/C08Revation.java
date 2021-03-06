package Ch12;

// 식당 예약 프로그램 작성
// 예약가능룸: 10
// 손님이 예약할 때마다 자동으로 room 감소
public class C08Revation {
	// 멤버변수: 클래스변수(static), 인스턴스 변수
	static int Room = 10; // 클래스변수(static)
	String Name; // 인스턴스 변수
	private String Phone; // 인스턴스 변수
	
	// 생성자오버로딩으로 값을 받아도되지만,
	// phone이 private이니까 메서드를 사용해보자
	void setReserve(String name, String phone) {
		
		this.Name = name;
		this.Phone = phone;
		Room--;
		System.out.println("============================");
		System.out.println(this.Name+"님이 방 예약을 하셨습니다.");
		System.out.println(this.Name+"님의 전화번호: "+this.Phone);
	}
	
	// 현재 몇개의 방이 남았는가
	int getReserve() {
		return Room;
	}
	
}
