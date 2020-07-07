package Ch07;

import java.util.Scanner;

public class C06For2 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		
		int sum = 0;
		int max = scan.nextInt();
		
		for (int i = 0; i <=max; i++) {
			sum+=i;
		}
		
		System.out.println("1부터 "+max+"까지의 합은 "+sum+"입니다");
	}
}