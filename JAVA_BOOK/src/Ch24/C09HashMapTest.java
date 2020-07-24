package Ch24;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class C09HashMapTest {
	public static void main(String[] args) {
		Map<C09Student,Integer> map = new HashMap();
		
		map.put(new C09Student("홍길동",1010),99);
		map.put(new C09Student("정우균",2020),80);
		map.put(new C09Student("이지성",3030),70);
		
		System.out.println("총 Entry 수: "+map.size());
		
		// 반복자와 set을 이용해서 전체 엔트리의 key안의 name, id, value를 출력하시오
		Set<C09Student> keyset = map.keySet();
		Iterator<C09Student> iterator = keyset.iterator();
		C09Student tmpKey;
		Integer tmpval;
		
		while (iterator.hasNext()) {
			tmpKey = iterator.next();
			tmpval = map.get(tmpKey);
					
			System.out.println(tmpKey.name+","+tmpKey.id+","+tmpval);
		}
		System.out.println();
	}
}
