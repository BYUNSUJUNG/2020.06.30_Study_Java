package Ch07;

import java.util.Scanner;

public class C03While {
	
	// 1. 구구단 - 3단
	// 2. 입력받은 단을 꺼꾸로 출력하기
	public static void main(String[] args) {
		// 1.
		/*
		int dan = 3;
		int i = 1;
		while(i<10) {
			System.out.println(dan+" * "+i+" = "+dan*i);
			i++;
		}
		*/
		
		Scanner scan = new Scanner(System.in);
		
		// 2.
		int dan = scan.nextInt();
		int i = 9;
		while(i>0) {
			System.out.println(dan+" * "+i+" = "+dan*i);
			i--;
		}
	}
}