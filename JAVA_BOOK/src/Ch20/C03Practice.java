package Ch20;


class People {
	String name;
	int age;
	
	public People(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// ������ - �� ��ü�� ���̸� ��ȯ
	public int hashCode() {
		return age;
	}
	// ������ - ��ü�� ���̸� ���ؼ� ������ true / �ٸ��� false�� ��ȯ
	public boolean equals(Object obj) {
		// ��ĳ����
		if(obj instanceof People) { 
			// �ٿ� ĳ����
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
		People Kim = new People("�����",30);
		People Lee = new People("�̰��",20);
		People Son = new People("�ռ���",30);

		System.out.println(Kim.equals(Lee));
		System.out.println(Kim.equals(Son));
		System.out.println(Lee.equals(Son));
		
	}
}
