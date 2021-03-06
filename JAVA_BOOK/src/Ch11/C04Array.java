package Ch11;

import java.util.Scanner;

public class C04Array {
	public static void main(String[] args) {
		int[] aaa = {1,2,3};
		int[] bbb = {3,2,1};
		int[] ccc = new int[3];
		
		// 값 대입
		for (int i = 0; i < aaa.length; i++) {
			bbb[i]=aaa[i];
		}
		
		// 출력
		System.out.println(bbb[0]);
		System.out.println(bbb[1]);
		System.out.println(bbb[2]);
		
		// 함수를 이용 - ccc에 값을 복사
		// 배열, 시작위치, 배열, 시작위치, 개수
		System.arraycopy(aaa, 0, ccc, 0, 3);
		
		// 출력
		System.out.println(ccc[0]);
		System.out.println(ccc[1]);
		System.out.println(ccc[2]);
	}
}
