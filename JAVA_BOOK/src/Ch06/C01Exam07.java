package Ch06;

import java.util.Scanner;

public class C01Exam07 {

	public static void main(String[] args) {
		// 두수를 입력 받아 큰 수가 짝수이면 출력하시오
		Scanner scan = new Scanner(System.in);
		
		// 값 입력
		int iNum1 = scan.nextInt();		
		int iNum2 = scan.nextInt();		
		int iMax;
		
		// 두 수중에 큰 수 찾기
		if(iNum1<iNum2) { // iNum2이 큰 경우
			iMax = iNum2;
		} else { // iNum1>iNum2 || iNum1==iNum2
			// iNum1이 크거나, 값이 같을 경우
			iMax = iNum1;
		}
		
		// 큰 수가 짝수일 경우 출력
		if(iMax%2==0) {
			System.out.println(iMax);	
		}
		
	}

}
