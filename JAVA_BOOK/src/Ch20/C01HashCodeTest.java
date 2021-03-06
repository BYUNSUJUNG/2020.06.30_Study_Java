package Ch20;
//HashCode 는 객체에게 부여된 번호지만 주소는 아니다
//HashCode 는 객체로의 빠른 접근을 위해 부여되었다(확인할것)
//HashCode 를 사용해서 같은 객체인지 아닌지 비교할 수 있다
public class C01HashCodeTest {
	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();
		Object obj3 = new Object();
		
		System.out.println("----equals매서드  확인----");
		System.out.println(obj1.equals(obj2));
		System.out.println(obj1.equals(obj3));
		System.out.println(obj2.equals(obj3));
		
		System.out.println("----JVM이 부여한 주소 확인----");
		System.out.println(obj1); //자바 가상머신이 부여한 객체의 주소가저장
		System.out.println(obj2); 
		System.out.println(obj3);
		
		System.out.println("----객체 고유 번호 확인----");
		System.out.println(obj1.hashCode()); //객체의 고유번호를 반환
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());
		System.out.printf("%x\n", obj1.hashCode());
		System.out.printf("%x\n", obj2.hashCode());
		System.out.printf("%x\n", obj3.hashCode());
	}
}
