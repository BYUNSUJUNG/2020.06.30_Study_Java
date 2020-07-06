package Ch06;

import java.util.Scanner;

public class C01Exam02 {

	public static void main(String[] args) {
		// 세개의 정수를 입력받아서 합계와 평균을 출력
		// 평균은 소수 이하를 버리고 정수만 출력
		Scanner scan = new Scanner(System.in);
		int[] iNum = new int[3];
		int iSum = 0;
		
		for (int i = 0; i < iNum.length; i++) {
			iNum[i] = scan.nextInt();
			iSum += iNum[i];
		}
		System.out.println("합계: "+iSum+", 평균: "+(iSum/iNum.length));
				
	}

}
