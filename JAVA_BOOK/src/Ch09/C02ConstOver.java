package Ch09;

// 생성자 오버로드
public class C02ConstOver {
	// 매개변수
	// 매개변수 초기값이 없으면 자동 0
	int x;
	int y;
	int z;
	
	// 생성자는 리턴값이 없음
	// 작업전 기본 값을 세팅해주는 것
	
	// 디폴트 생성자
	public C02ConstOver() {
		
	}
	
	// 오버로딩된 생성자 - 매개변수 2
	public C02ConstOver(int a, int b) {
		this.x = a;
		this.y = b;
	}
	
	// 오버로딩된 생성자 - 매개변수 3
	
	public C02ConstOver(int a, int b, int c) {
		this.x = a;
		this.y = b;
		this.z = c;
	}
	
	public void ShowPoint() {
		System.out.println(this.x+","+this.y+","+this.z);
	}
}
