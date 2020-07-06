package Ch06;

import java.util.Scanner;

public class C02Exam01 {
	// 세 과목의 점수를 입력받아 합계와 평균을 구하고,
	// 평균이 90점 이상이면 'A', 80이상이면 'B', 70점 이상이면 'C', 60점 이상이면 'D', 60점 미만이면 'F'
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 세 과목의 점수
		int[] iScore = new int[3];
		// 세 과목 점수의 합
		int iSum = 0;
		// 세 과목 점수의 평균
		float fAvg = 0;
		
		// 점수 입력 및 합계 구하기
		for (int i = 0; i < iScore.length; i++) {
			iScore[i] = scan.nextInt();
			iSum+=iScore[i];
		}
		
		// 평균 구하기
		fAvg = (float)iSum / iScore.length;
		
		// 평균에 따른 학점
		if (fAvg>=90) {
			System.out.println("A");
		} else if(fAvg>=80) {
			System.out.println("B");
		} else if(fAvg>=70) {
			System.out.println("C");
		} else if(fAvg>=60) {
			System.out.println("D");
		} else { // 60점 미만
			System.out.println("F");
		} 
		
	}

}
