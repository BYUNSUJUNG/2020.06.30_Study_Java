package Ch24;

import java.util.*;

// List - LinkedList

// ArrayList �ҿ�ð�: 4988100ns
// LinkedList �ҿ�ð�: 1321100ns

// ���� �ڷḦ �ٷ� ���� LinkedList�� �� ��
public class C03LinkedList {
	public static void main(String[] args) {
		List <String> list1 = new ArrayList<String>();
		List <String> list2 = new LinkedList<String>();
		
		long startTime; // ���� �ð� ����
		long endTime; // ���� �ð� ����
		
		// ArrayList ����~���� �ð��� ���ϱ�
		startTime = System.nanoTime();
		for(int i=0; i<10000; i++) {
			list1.add(0,String.valueOf(i)); // Ŭ�����̸����� ���� - static
		}
		endTime = System.nanoTime();
		
		System.out.println("ArrayList �ҿ�ð�: "+(endTime-startTime)+"ns");
		
		// LinkedList ����~���� �ð��� ���ϱ�
		startTime = System.nanoTime();
		for(int i=0; i<10000; i++) {
			list2.add(0,String.valueOf(i));
		}
		endTime = System.nanoTime();
		
		System.out.println("LinkedList �ҿ�ð�: "+(endTime-startTime)+"ns");
	}
	
}