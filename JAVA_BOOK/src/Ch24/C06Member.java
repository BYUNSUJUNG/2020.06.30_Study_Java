package Ch24;

public class C06Member {
	// �ʵ�
	String name;
	int age;
	
	// ������
	C06Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof C06Member) { // ��Ӱ��� Ȯ��
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