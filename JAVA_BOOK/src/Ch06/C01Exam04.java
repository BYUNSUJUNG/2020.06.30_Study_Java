package Ch06;

import java.util.Scanner;

public class C01Exam04 {

	public static void main(String[] args) {
		// 수를 입력 받아 짝,홀수를 구분하여 출력
		Scanner scan = new Scanner(System.in);
		// 값 입력
		int iNum = scan.nextInt();
		// 2로 나누어서 나머지가 0이면 짝수, 1이면 홀수
		if(iNum%2==0) {
			System.out.println(iNum+"는 짝수 입니다");
		} else { // iNum%1==0
			System.out.println(iNum+"는 홀수 입니다");
		}
		
				
	}

}
