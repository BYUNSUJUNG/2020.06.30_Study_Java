package Ch06;

import java.util.Scanner;

public class C01Exam08 {

	public static void main(String[] args) {
		// 두수를 입력 받아 합이 짝수이고 3의 배수인 수를 출력
		Scanner scan = new Scanner(System.in);
		
		// 두 수의 합
		int iSum = scan.nextInt() + scan.nextInt();
		
		// 두 수의 합이 짝수이고 3의 배수일 경우 출력
		if((iSum%2==0)&&(iSum%3==0)) {
			System.out.println(iSum+"는 짝수이면서 3의 배수 인 수");
		}
		
	}

}
