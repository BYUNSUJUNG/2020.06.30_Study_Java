package Ch09;

// 오버로딩
public class C01MethodOver {
	// 필드
	int x;
	int y;
	
	// 컴파일러가 디폴트 생성자를 만들어준다
	// 물론 생성자도 오버로딩가능
	
	// public: 어느 객체든 접근가능
	// private: 내부에서만 접근가능
	
	// 메서드
	// 오버로드: 메서드명은 동일하지만 매개변수(파라미터)는 다른 메서드
	public int sum(int num) {
		this.y = num;
		return x+y;
	}
	
	public int sum(int n1, int n2) {
		this.x = n1;
		this.y = n2;
		return x+y;
	}
}
