package Ch12;

// 싱글톤 패턴
public class C07Company {
	// method 영역 instance
	private static C07Company instance = new C07Company();
	private C07Company() {}
	
	public static C07Company getInstance(){
		if (instance==null) {
			instance = new C07Company();
		}
		return instance; // 객체의 주소값 반환
	}
}
