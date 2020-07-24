package Ch24;

import java.util.*;

// HashMap
public class C08HashMap {

	public static void main(String[] args) {
		// Map �ɷ��� ����
		Map<String,Integer> map = new HashMap<String,Integer>();

		// ��ü �߰�
		map.put("�����",75);
		map.put("ȫ�浿",66);
		map.put("���浿",80);
		map.put("������",88);
		
		// Key�� �ش��ϴ� valueã��
		System.out.println("ȫ�浿: "+map.get("ȫ�浿"));
		
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
