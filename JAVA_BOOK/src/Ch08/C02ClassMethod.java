package Ch08;

public class C02ClassMethod {
	// 속성 == 필드
	int x;
	int y;

	// 기능 == 함수 == 메소드
	int sum() {
		return x+y;
	}
	
	// 오버로딩
	int sum(int n1, int n2) {
		x = n1;
		y = n2;
		return x+y;
	}
}
