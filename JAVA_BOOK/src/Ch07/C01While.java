package Ch07;

import java.util.Scanner;

public class C01While {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		

		// num(1)부터 10까지의 합
		
		/*
		int num = 1;
		int sum = 0;
		while (num <= 10) {
			sum += num;
			num++;
		}
		System.out.printf("1부터 10까지의 합: %d",sum);
		*/
		
		// num(1)부터 num2(입력 값)까지의 합
		int num = 1;
		int num2 = scan.nextInt();
		int sum = 0;
		while (num <= num2) {
			sum += num;
			num++;
		}
		System.out.printf("1부터 %d까지의 합: %d",num2, sum);
	}

}
