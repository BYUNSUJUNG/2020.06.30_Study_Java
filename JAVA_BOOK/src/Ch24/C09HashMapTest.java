package Ch24;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class C09HashMapTest {
	public static void main(String[] args) {
		Map<C09Student,Integer> map = new HashMap();
		
		map.put(new C09Student("ȫ�浿",1010),99);
		map.put(new C09Student("�����",2020),80);
		map.put(new C09Student("������",3030),70);
		
		System.out.println("�� Entry ��: "+map.size());
		
		// �ݺ��ڿ� set�� �̿��ؼ� ��ü ��Ʈ���� key���� name, id, value�� ����Ͻÿ�
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