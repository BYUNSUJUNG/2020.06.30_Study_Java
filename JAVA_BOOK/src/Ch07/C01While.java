package Ch07;

import java.util.Scanner;

public class C01While {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		

		// num(1)���� 10������ ��
		
		/*
		int num = 1;
		int sum = 0;
		while (num <= 10) {
			sum += num;
			num++;
		}
		System.out.printf("1���� 10������ ��: %d",sum);
		*/
		
		// num(1)���� num2(�Է� ��)������ ��
		int num = 1;
		int num2 = scan.nextInt();
		int sum = 0;
		while (num <= num2) {
			sum += num;
			num++;
		}
		System.out.printf("1���� %d������ ��: %d",num2, sum);
	}

}