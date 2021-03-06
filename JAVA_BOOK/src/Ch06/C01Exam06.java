package Ch06;

import java.util.Scanner;

public class C01Exam06 {

	public static void main(String[] args) {
		// 세수를 입력받아 큰수를 출력하시오
		Scanner scan = new Scanner(System.in);
		int[] iNum = new int[3]; // 세 수
		int iMax = 0; // 가장 큰 수
		
		// 수 입력 및 가장 큰 수 찾기
		for (int i = 0; i < iNum.length; i++) {
			iNum[i] = scan.nextInt();
			// 입력한 수가 이전까지의 가장 큰 수보다 크면
			if(iNum[i]>iMax) {
				iMax = iNum[i];
			}
		}
		
		// 출력
		System.out.println("가장 큰 수는"+iMax+"입니다");	
	}

}
