package Ch24;

import java.util.*;

public class C06HashSetTest {
	public static void main(String[] args) {
		Set<C06Member> set = new HashSet();
		set.add(new C06Member("ȫ�浿",30));
		set.add(new C06Member("���浿",31));
		set.add(new C06Member("ȫ�浿",30));
		
		System.out.println("�� ��ü��: "+ set.size());
		
		// ��ü �����
		// �ݺ���
		// �ε����� ��� �ݺ��ڸ� ����Ͽ� ���
		Iterator<C06Member> iterator = set.iterator();
		ArrayList <C06Member> list = new ArrayList();
		
		while (iterator.hasNext()) {
			list.add(iterator.next());
		}

		System.out.println(list.get(0).name+","+list.get(0).age);
		System.out.println(list.get(1).name+","+list.get(1).age);
		System.out.println(list.get(2).name+","+list.get(2).age);
		
		System.out.println(list.get(0).equals(list.get(1)));
		System.out.println(list.get(0).equals(list.get(2)));
		System.out.println(list.get(1).equals(list.get(2)));
		
	}
}
