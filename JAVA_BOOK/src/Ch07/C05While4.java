package Ch07;

import java.util.Scanner;

public class C05While4 {
	
	// �� ����ϱ�4
	public static void main(String[] args) {
		
		
//		 *    	1
//		***   	3
//	   *****	5
//	  *******	7
		
		/*
		 * i = 0, ���� 3, ��1
		 * i = 1, ���� 2, ��3
		 * i = 2, ���� 1, ��5
		 * i = 3, ���� 0, ��7
		 * 
		 * ������ 3-i�̰�, ���� (i*2)+1
		 * */
		
		int i=0;
		int j=0;
		
		while (i<4) {
			j=0;
			// ���� ���
			while (j<3-i) {
				System.out.print(" ");
				j++;
			}
			j=0;
			// �� ���
			while (j<(i*2)+1) {
				System.out.print("*");
				j++;
			}
			i++;
			System.out.println();
		}
	}
}