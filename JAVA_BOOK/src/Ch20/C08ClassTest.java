package Ch20;
class C08Car {
	
}

public class C08ClassTest {
	public static void main(String[] args) throws ClassNotFoundException {
		//Class cls = Ch20.C08Car.class;
		
		//  throws ClassNotFoundException : 클래스가 없어서 발생하는 예외를 처리함
		Class cls = Class.forName("Ch20.C08Car");
		
		System.out.println(cls.getName()); // "패키지.클래스명" 출력
		System.out.println(cls.getSimpleName()); // "클래스 명"만 출력
		System.out.println(cls.getPackage()); // "package 패키지 명" 출력
		System.out.println(cls.getPackage().getName()); // "패키지 명" 출력
	}
}
