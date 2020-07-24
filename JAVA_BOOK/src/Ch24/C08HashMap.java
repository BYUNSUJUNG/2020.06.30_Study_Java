package Ch24;

import java.util.*;

// HashMap
public class C08HashMap {

	public static void main(String[] args) {
		// Map 걸렉션 생성
		Map<String,Integer> map = new HashMap<String,Integer>();

		// 객체 추가
		map.put("정우균",75);
		map.put("홍길동",66);
		map.put("서길동",80);
		map.put("이지성",88);
		
		// Key에 해당하는 value찾기
		System.out.println("홍길동: "+map.get("홍길동"));
		
		Set<String> keyset = map.keySet();
		Iterator<String> iterator = keyset.iterator();
		String tmpKey;
		Integer tmpval;
		
		while (iterator.hasNext()) {
			tmpKey = iterator.next();
			tmpval = map.get(tmpKey);
					
			System.out.println(tmpKey+","+tmpval);
		}
		System.out.println();
		
	}

}
