package Ch20;
class C08Car {
	
}

public class C08ClassTest {
	public static void main(String[] args) throws ClassNotFoundException {
		//Class cls = Ch20.C08Car.class;
		
		//  throws ClassNotFoundException : Ŭ������ ��� �߻��ϴ� ���ܸ� ó����
		Class cls = Class.forName("Ch20.C08Car");
		
		System.out.println(cls.getName()); // "��Ű��.Ŭ������" ���
		System.out.println(cls.getSimpleName()); // "Ŭ���� ��"�� ���
		System.out.println(cls.getPackage()); // "package ��Ű�� ��" ���
		System.out.println(cls.getPackage().getName()); // "��Ű�� ��" ���
	}
}
