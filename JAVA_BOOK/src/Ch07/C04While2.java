package Ch07;

import java.util.Scanner;

public class C04While2 {
	
	// 구구단 9단부터 2단까지 역순 출력
	public static void main(String[] args) {
	
		int i=9;
		int j=9;
		
		while (i>1) {
			j=9;
			while (j>0) {
				System.out.println(i+" * "+j+" = "+(i*j));
				j--;
			}
			i--;
			System.out.println();
		}
	}
}