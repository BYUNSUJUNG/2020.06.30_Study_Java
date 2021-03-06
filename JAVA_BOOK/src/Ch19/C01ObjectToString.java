package Ch19;

//object 클래스의 ToString

public class C01ObjectToString {
	public static void main(String[] args) {
	
	Object ob1 = new Object();
	
	
	System.out.println(ob1);
	System.out.println(ob1.toString());
	
	} 
}
//수를 문자열로 리턴
//(자바와 같은) 객체지향 언어들은 객체에 toString이라는 메소드를 기본적으로 제공한다.
//일반적으로 toString은 그 객체를 설명해주는 문자열을 리턴한다.
//그리고 객체의 toString을 덮어쓰기(overriding)하면 다른 형식의 문자열을 리턴할 수 있다.
//문자열이 기대되는 곳에서 문자열이 아닌 객체를 사용하면 시스템은 암시적으로 toString을 호출한다.
//자바스크립트에서는 prototype을 이용해 객체의 메소드를 덮어쓰기(override)할 수 있다