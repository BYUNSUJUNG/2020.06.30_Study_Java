package Ch24;

import java.util.*;

// List - ArrayList
// ��Ƽ������ �Ұ�
// ������ index�� ����� - �ð��� �ɸ�
public class C01ArrayListTest {
	public static void main(String[] args) {
		List <String> list = new ArrayList<String>();
		list.add("java"); // ����
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2,"Database"); // ������ 2��° �ִ� ���� 3��°�� �з���

		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i+": "+str);
		}
		
		list.remove(1); // ����
		System.out.println();
		
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i+": "+str);
		}
	}
}
