package Ch24;

import java.util.*;

// List - Vector
// ��Ƽ������ ȯ��
//������ index�� ����� - �ð��� �ɸ�

public class C02VectorTest {
	public static void main(String[] args) {
		List<C02Board> list = new Vector<C02Board>();
		
		list.add(new C02Board("����1","����1","�۾���1"));
		list.add(new C02Board("����2","����2","�۾���2"));
		list.add(new C02Board("����3","����3","�۾���3"));
		list.add(new C02Board("����4","����4","�۾���4"));
		list.add(new C02Board("����5","����5","�۾���5"));
	
		
		list.remove(2);	
		
		for (int i = 0; i < list.size(); i++) {
			C02Board board = list.get(i);
			System.out.println(board.subject+"\t"+board.content+"\t"+board.writer);
		}
	}
}
