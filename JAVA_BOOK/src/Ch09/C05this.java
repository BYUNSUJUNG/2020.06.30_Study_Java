package Ch09;

class Person {
	String name;
	int age;
	
	
	// �ʱⰪ ����, ����Ʈ ������
	public Person() {
		this("�̸�����", 1);
	}
	
	// �����ε��� ������
	// ������� ���� .
	public Person(String name, int age) {
		// this�� ��ü�� ������ �Ű����� ����
		// ���� �� ��ü ���� = �Ű�����
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
