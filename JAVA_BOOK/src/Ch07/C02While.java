package Ch07;

import java.util.Scanner;

public class C02While {
	// ���α׷� ����ڷκ��� ������ �ϳ� �Է¹޾Ƽ� 1���� �� ����ŭ 3�� ����� ���
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int iMax = scan.nextInt();
		int i = 1;
		
		while (i<=iMax) {
			if(i%3==0) {
				System.out.printf("%d�� 3�� ��� \n",i);
			}
			i++;
		}
	}

}
