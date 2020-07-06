package Ch07;

import java.util.Scanner;

public class C02While {
	// 프로그램 사용자로부터 정수를 하나 입력받아서 1부터 그 수만큼 3의 배수를 출력
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int iMax = scan.nextInt();
		int i = 1;
		
		while (i<=iMax) {
			if(i%3==0) {
				System.out.printf("%d는 3의 배수 \n",i);
			}
			i++;
		}
	}

}
