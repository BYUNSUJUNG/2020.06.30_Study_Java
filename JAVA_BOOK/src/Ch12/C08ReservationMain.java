package Ch12;

public class C08ReservationMain {
	public static void main(String[] args) {
		
		// 객체 생성
		C08Revation Lee = new C08Revation();
		C08Revation Kim = new C08Revation();
		C08Revation Jung = new C08Revation();
		
		// 예약
		Lee.setReserve("이정민", "010-0000-0000");
		System.out.println("현재 남아있는 방의 개수는 "+Lee.getReserve()+"개 입니다.");
		Kim.setReserve("김이나", "010-0000-0000");
		System.out.println("현재 남아있는 방의 개수는 "+Kim.getReserve()+"개 입니다.");
		Jung.setReserve("정기수", "010-0000-0000");
		System.out.println("현재 남아있는 방의 개수는 "+Jung.getReserve()+"개 입니다.");
		
		
	}
}
