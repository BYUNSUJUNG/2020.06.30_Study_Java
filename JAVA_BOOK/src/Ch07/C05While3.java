package Ch07;

import java.util.Scanner;

public class C05While3 {
	
	// 별 출력하기3
	public static void main(String[] args) {
		
//	  *******	7	
//	   *****	5
//		***   	3
//		 *    	1

		/* 
		 * i = 0, 공백 0, 별7
		 * i = 1, 공백 1, 별5
		 * i = 2, 공백 2, 별3
		 * i = 3, 공백 3, 별1
		 * 
		 * 공백은 i이고, 별은 7-(2*i)
		 * 
		 * */
		
		int i=0;
		int j=0;
		
		while (i<4) {
			j=0;
			// 공백 출력
			while (j<i) {
				System.out.print(" ");
				j++;
			}
			j=0;
			// 별 출력
			while (j<7-(2*i)) {
				System.out.print("*");
				j++;
			}
			i++;
			System.out.println();
		}
	}
}