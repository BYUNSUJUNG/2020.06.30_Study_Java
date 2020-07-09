package Ch11;

import java.util.Scanner;

public class C02Array2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 초기화
		int[] arr = new int[5];
		int total = 0;
		double avg = 0;
		
		//array에 값 입력하면서 합구하기
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
			total+=arr[i];
		}
		
		// avg 구하기
		avg = (double)total/arr.length;
		
		// 출력
		System.out.print("총합: "+total+", 평균: "+avg);
	}
}
