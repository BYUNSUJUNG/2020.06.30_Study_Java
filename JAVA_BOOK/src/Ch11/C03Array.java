package Ch11;

import java.util.Scanner;

public class C03Array {
	public static void main(String[] args) {
		int[] arr1 = new int[3];
		int[] arr2;
		
		System.out.println("arr1의 참조값: "+arr1);
		
		int[] aaa = {1,2,3};
		int[] bbb = {3,2,1};
	
		System.out.println("aaa의 참조값: "+aaa);
		System.out.println("bbb의 참조값: "+bbb);
		
		// 위치값를 대입
		bbb=aaa;
		arr2=aaa;
		
		System.out.println("arr2의 참조값: "+arr2);
		System.out.println("aaa의 참조값: "+aaa);
		System.out.println("bbb의 참조값: "+bbb);
		
		System.out.println(bbb[0]);
		System.out.println(bbb[1]);
		System.out.println(bbb[2]);
		
	}
}
