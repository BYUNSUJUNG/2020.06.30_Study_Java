package Ch09;

class Person {
	String name;
	int age;
	
	
	// 초기값 세팅, 디폴트 생성자
	public Person() {
		this("이름없음", 1);
	}
	
	// 오버로딩된 생성자
	// 멤버변수 접근 .
	public Person(String name, int age) {
		// this로 객체내 변수와 매개변수 구분
		// 현재 이 객체 변수 = 매개변수
		this.name = name;
		this.age = age;
	}
	
}

public class C05this {
	public static void main(String[] args) {
		Person noName = new Person();
		System.out.println(noName.name);
		System.out.println(noName.age);
	}
}
