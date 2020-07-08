package Ch09;

class BirthDay {
	// 필드
	int day;
	int month;
	int year;
	
	// 메서드
	public void setYear(int year) {
		this.year = year;
		
	}
	
	public void printThis() {
		System.out.println(this);
	}
}

public class C04this {
	public static void main(String[] args) {
		
		// stack영역에 참조변수 bDay
		// heap영역에 day, month, year;
		BirthDay bDay = new BirthDay();
		bDay.setYear(2000);
		
		// this: 이 객체의 주소
		// stack영역 참조변수안 위치 출력
		System.out.println(bDay);
		// heap영역 위치 출력
		bDay.printThis();
	}
}
