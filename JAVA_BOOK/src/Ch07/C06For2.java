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
		
		System.out.println("1���� "+max+"������ ���� "+sum+"�Դϴ�");
	}
}