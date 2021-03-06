package Ch24;

import java.util.*;

// List - ArrayList
// 멀티스레드 불가
// 삭제시 index가 당겨짐 - 시간이 걸림
public class C01ArrayListTest {
	public static void main(String[] args) {
		List <String> list = new ArrayList<String>();
		list.add("java"); // 삽입
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2,"Database"); // 기존의 2번째 있던 것이 3번째로 밀려남

		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i+": "+str);
		}
		
		list.remove(1); // 제거
		System.out.println();
		
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i+": "+str);
		}
	}
}
