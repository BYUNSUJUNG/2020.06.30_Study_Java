package Ch07;

import java.util.Scanner;

public class C05While3 {
	
	// �� ����ϱ�3
	public static void main(String[] args) {
		
//	  *******	7	
//	   *****	5
//		***   	3
//		 *    	1

		/* 
		 * i = 0, ���� 0, ��7
		 * i = 1, ���� 1, ��5
		 * i = 2, ���� 2, ��3
		 * i = 3, ���� 3, ��1
		 * 
		 * ������ i�̰�, ���� 7-(2*i)
		 * 
		 * */
		
		int i=0;
		int j=0;
		
		while (i<4) {
			j=0;
			// ���� ���
			while (j<i) {
				System.out.print(" ");
				j++;
			}
			j=0;
			// �� ���
			while (j<7-(2*i)) {
				System.out.print("*");
				j++;
			}
			i++;
			System.out.println();
		}
	}
}