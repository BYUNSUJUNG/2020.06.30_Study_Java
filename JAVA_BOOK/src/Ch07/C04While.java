package Ch07;

import java.util.Scanner;

public class C04While {
	
	// 구구단 1단부터 9단까지
	public static void main(String[] args) {
	
		int i=2;
		int j=1;
		
		while (i<10) {
			j=1;
			while (j<=9) {
				System.out.println(i+" * "+j+" = "+(i*j));
				j++;
			}
			i++;
			System.out.println();
		}
	}
}