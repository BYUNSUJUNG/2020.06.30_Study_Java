package Ch20;


class People {
	String name;
	int age;
	
	public People(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// 재정의 - 이 객체의 나이를 변환
	public int hashCode() {
		return age;
	}
	// 재정의 - 객체의 나이를 비교해서 같으면 true / 다르면 false를 변환
	public boolean equals(Object obj) {
		// 업캐스팅
		if(obj instanceof People) { 
			// 다운 캐스팅
			People tmp = (People)obj;
			if(this.age==tmp.age)
				return true;
			else 
				return false;
		}
		return false;
		
	}
}
public class C03Practice {
	public static void main(String[] args) {
		People Kim = new People("김상중",30);
		People Lee = new People("이경민",20);
		People Son = new People("손석희",30);

		System.out.println(Kim.equals(Lee));
		System.out.println(Kim.equals(Son));
		System.out.println(Lee.equals(Son));
		
	}
}
