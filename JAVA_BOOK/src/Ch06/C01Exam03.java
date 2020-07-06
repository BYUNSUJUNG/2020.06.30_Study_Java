package Ch06;

import java.util.Scanner;

public class C01Exam03 {

	public static void main(String[] args) {
		// 절대값을 구하는 프로그램
		Scanner scan = new Scanner(System.in);
		
		// 값 입력
		int iNum = scan.nextInt();
		
		// 입력한 값이 음수이면 양수로 바꿈
		if(iNum<0) {
			iNum= -iNum;
		}
		System.out.println("절댓값은 "+iNum);
				
	}

}
