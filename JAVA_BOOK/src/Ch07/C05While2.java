package Ch07;

import java.util.Scanner;

public class C05While2 {
	
	// 별 출력하기2
	public static void main(String[] args) {
		
//		*
//		**
//		***
//		****
		
		int i=0;
		int j=0;
		
		while (i<4) {
			j=0;
			while (j<=i) {
				System.out.print("*");
				j++;
			}
			i++;
			System.out.println();
		}
	}
}