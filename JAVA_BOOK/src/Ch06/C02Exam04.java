package Ch06;

import java.util.Arrays;
import java.util.Scanner;

public class C02Exam04 {
	
	public static void main(String[] args) {

		// 디스켓 1통에 5000원한다.
		// 그런데 한번에 10통이상을 사면 전체 금액의 10%를 할인하여준다 
		// 그리고 100통 이상을 사면 전체 금액의 12%를 할인하여 준다.
		// X통의 디스켓을 사려면 얼마가 있어야 하는가
	
		Scanner scan = new Scanner(System.in);
		
		// 디스켓 통 개수 입력
		int iCnt = scan.nextInt();
		// 디스켓 가격
		double iMoney;
		
		if(iCnt>=100) { // 100통 이상의 디스켓을 구입할 경우
			
			// 전체 금액의 12% 할인된 값 => 전체 값의 88% 값
			iMoney=(5000*iCnt)*0.88; 
		
		} else if (iCnt>=10) { // 10통 이상의 디스켓을 구입한 경우
		
			// 전체 금액의 10% 할인된 값 => 전체 값의 90% 값
			iMoney=(5000*iCnt)*0.90; 
		
		} else { // 10통 미만의 디스켓을 구입한 경우
			iMoney=(5000*iCnt);
		}
		System.out.println("디스켓 값은 "+iMoney+"원 입니다");
	
	}

}
