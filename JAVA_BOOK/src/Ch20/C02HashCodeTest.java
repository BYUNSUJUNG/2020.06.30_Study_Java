package Ch20;

//해시코드를 오버라이딩 해서 사용해야 하는 이유//

class ObjTestA {
	int x;
	ObjTestA(){};
	public ObjTestA(int a) {
		this.x = a; 
	}
	// hashCode 오버라이딩
	public int hashCode() {
		return x;
	}
	
	
	public boolean equals(Object obj) { // equals 재정의
		if(obj instanceof ObjTestA) {  // 형변환 가능여부 확인
			ObjTestA tmp = (ObjTestA)obj; // 다운캐스팅
			if(this.x==tmp.x) // 객체 값 비교 
				return true;
			else 
				return false;
		}
		return false;
	}
}

public class C02HashCodeTest {
	public static void main(String[] args) {
		// 객체 생성
		ObjTestA obj1 = new ObjTestA(12);
		ObjTestA obj2 = new ObjTestA(12);
		ObjTestA obj3 = new ObjTestA(56);
		

		System.out.println(obj1);		//자바 가상머신이 부여한 객체의 주소가저장
		System.out.println(obj2);		//자바 가상머신이 부여한 객체의 주소가저장
		System.out.println(obj3);		//자바 가상머신이 부여한 객체의 주소가저장
		
		// 자바 가상머신에 의해 부여된 객체의 정보 확인
		System.out.println(obj1.hashCode());	// 재정의가 가능한 해시코드(재지정하지 않을시 고유식별해시코드적용)
		System.out.println(obj2.hashCode());	// 재정의가 가능한 해시코드(재지정하지 않을시 고유식별해시코드적용)
		System.out.println(obj3.hashCode());	// 재정의가 가능한 해시코드(재지정하지 않을시 고유식별해시코드적용)
		// Equals 메서드로 동등객체 여부 확인
		System.out.println(obj1.equals(obj2));	//false(서로 다른 해시코드 적용)
		System.out.println(obj1.equals(obj3));	//false(서로 다른 해시코드 적용)
		System.out.println(obj2.equals(obj3));	//false(서로 다른 해시코드 적용)
		// identityHashCode()
		System.out.println(System.identityHashCode(obj1));		//실제부여되는 고유식별해시코드
		System.out.println(System.identityHashCode(obj2));		//실제부여되는 고유식별해시코드	
		System.out.println(System.identityHashCode(obj3));		//실제부여되는 고유식별해시코드
	}
}
