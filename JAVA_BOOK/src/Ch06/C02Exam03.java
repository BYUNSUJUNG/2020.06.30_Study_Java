package Ch06;

import java.util.Arrays;
import java.util.Scanner;

public class C02Exam03 {
	
	public static void main(String[] args) {
		// 배달 도시락  10개까지는 개당 2500이고
		// 10개를 초과하는 양에 대해서는 개당 2400원이다
		// 배달 도시락의 개수를 입력 받아서 금액을 계산하는 프로그램을 작성하시오
		
		Scanner scan = new Scanner(System.in);
		
		// 도시락 개수 입력
		int iCnt = scan.nextInt();
		// 도시락 값
		int iMoney;
		
		// 도시락 개수가 10개 이상일 경우
		if(iCnt>10) {
			iMoney=(2500*10)+2400*(iCnt-10); // 도시락 10개 값 + 초과된 개수 값
		} else {
			iMoney=2500*iCnt; // 도시락 10개 미만일 경우 값
		}
		System.out.println("도시락 값은 "+iMoney+"원 입니다");
	
	}

}
