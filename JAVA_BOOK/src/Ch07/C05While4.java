package Ch07;

import java.util.Scanner;

public class C05While4 {
	
	// 별 출력하기4
	public static void main(String[] args) {
		
		
//		 *    	1
//		***   	3
//	   *****	5
//	  *******	7
		
		/*
		 * i = 0, 공백 3, 별1
		 * i = 1, 공백 2, 별3
		 * i = 2, 공백 1, 별5
		 * i = 3, 공백 0, 별7
		 * 
		 * 공백은 3-i이고, 별은 (i*2)+1
		 * */
		
		int i=0;
		int j=0;
		
		while (i<4) {
			j=0;
			// 공백 출력
			while (j<3-i) {
				System.out.print(" ");
				j++;
			}
			j=0;
			// 별 출력
			while (j<(i*2)+1) {
				System.out.print("*");
				j++;
			}
			i++;
			System.out.println();
		}
	}
}