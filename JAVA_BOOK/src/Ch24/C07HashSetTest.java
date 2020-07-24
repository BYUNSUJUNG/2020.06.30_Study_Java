package Ch24;

import java.util.*;

class C07Student {
	// �ʵ�
	String name;
	int id;
	
	// ������
	C07Student(String name, int age) {
		this.name = name;
		this.id = id;
	}
}

public class C07HashSetTest {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Set<C07Student> set = new HashSet();
		
		String name;
		int id;
		
		// 5���� �̸��� �й��� �Է�
		for (int i = 0; i < 5; i++) {
			// �̸�
			System.out.print("�̸�: ");
			name = scan.nextLine();
			// �й�
			System.out.print("�й�: ");
			id = scan.nextInt();
			scan.nextLine(); // �Է� ���� ���� �ʱ�ȭ
			set.add(new C07Student(name,id));
		}
		
		System.out.println("�Է��� �������ϴ�");

		System.out.print("�̸� �˻�: ");
		name = scan.nextLine();
		
		// �ε����� ��� �ݺ��ڸ� ����Ͽ� ���
		Iterator<C07Student> iterator = set.iterator();
		C07Student tmp = null;
		while (iterator.hasNext()) {
			tmp = iterator.next();
			if(tmp.name.equals(name)) {
				System.out.println(tmp.name+"���� �й���"+tmp.id+"�Դϴ�");
				System.exit(0);
			}
			
		}
		System.out.println("�ش� �̸��� �˻����� �ʽ��ϴ�");
		
	}
}
