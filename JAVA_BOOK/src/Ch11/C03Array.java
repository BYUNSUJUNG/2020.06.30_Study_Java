package Ch11;

import java.util.Scanner;

public class C03Array {
	public static void main(String[] args) {
		int[] arr1 = new int[3];
		int[] arr2;
		
		System.out.println("arr1�� ������: "+arr1);
		
		int[] aaa = {1,2,3};
		int[] bbb = {3,2,1};
	
		System.out.println("aaa�� ������: "+aaa);
		System.out.println("bbb�� ������: "+bbb);
		
		// ��ġ���� ����
		bbb=aaa;
		arr2=aaa;
		
		System.out.println("arr2�� ������: "+arr2);
		System.out.println("aaa�� ������: "+aaa);
		System.out.println("bbb�� ������: "+bbb);
		
		System.out.println(bbb[0]);
		System.out.println(bbb[1]);
		System.out.println(bbb[2]);
		
	}
}