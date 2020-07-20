package Ch20;

public class C05StringConcatTest {
	public static void main(String[] args) {
		String javaStr1 = new String("JAVA");
		String javaStr2 = new String("ANDROID");
		
		System.out.println(System.identityHashCode(javaStr1));
		System.out.println(System.identityHashCode(javaStr2));
		
		System.out.println(javaStr1);
		
		// concat() 새로운 객체를 만들어서 문자열을 붙임
		// 많은 객체는 메모리에 부담을 줌
		// 해결: C06 StringBuilder
		javaStr1 = javaStr1.concat(javaStr2);
		System.out.println(System.identityHashCode(javaStr1)); // 객체가 다르기에 값이 달라짐
		
		System.out.println(javaStr1);
		
		
		
	}
}
