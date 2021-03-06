package Ch24;

import java.util.*;

// List - LinkedList

// ArrayList 소요시간: 4988100ns
// LinkedList 소요시간: 1321100ns

// 많은 자료를 다룰 때는 LinkedList를 쓸 것
public class C03LinkedList {
	public static void main(String[] args) {
		List <String> list1 = new ArrayList<String>();
		List <String> list2 = new LinkedList<String>();
		
		long startTime; // 시작 시간 저장
		long endTime; // 종료 시간 저장
		
		// ArrayList 시작~종료 시간차 구하기
		startTime = System.nanoTime();
		for(int i=0; i<10000; i++) {
			list1.add(0,String.valueOf(i)); // 클래스이름으로 접근 - static
		}
		endTime = System.nanoTime();
		
		System.out.println("ArrayList 소요시간: "+(endTime-startTime)+"ns");
		
		// LinkedList 시작~종료 시간차 구하기
		startTime = System.nanoTime();
		for(int i=0; i<10000; i++) {
			list2.add(0,String.valueOf(i));
		}
		endTime = System.nanoTime();
		
		System.out.println("LinkedList 소요시간: "+(endTime-startTime)+"ns");
	}
	
}
