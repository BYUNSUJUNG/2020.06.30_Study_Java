package Ch07;

import java.util.Scanner;

public class C05While {
	
	// 별 출력하기1
	public static void main(String[] args) {
		
//		****	
//		***
//		**
//		*
		
		int i=0;
		int j=0;
		
		while (i<4) {
			j=0;
			while (j<=3-i) {
				System.out.print("*");
				j++;
			}
			i++;
			System.out.println();
		}
	}
}