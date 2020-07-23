package Ch24;

public class C06Member {
	// 필드
	String name;
	int age;
	
	// 생성자
	C06Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof C06Member) { // 상속관계 확인
			C06Member tmp = (C06Member)obj; // downCasting
			if(name.equals(tmp.name)&&(age==tmp.age)) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}
}
