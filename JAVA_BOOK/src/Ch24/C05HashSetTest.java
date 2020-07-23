package Ch24;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Set - HashSet
// 중복값 불가능
public class C05HashSetTest {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("java"); // 삽입
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("java"); // 중복문자열이라서 저장이 되지않는다
		
		int size = set.size();
		System.out.println("총 객체 수 : "+size);
		
		set.remove("JDBC");
		
		Iterator<String> iterator = set.iterator();
		String tmp = null;
		while (iterator.hasNext()) {
			tmp = iterator.next();
			System.out.println(tmp);
		}
	}
}
