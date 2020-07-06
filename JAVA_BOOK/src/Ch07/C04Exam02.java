package Ch07;

import java.util.Scanner;

public class C04Exam02 {
	
	public static void main(String[] args) {
		//문제2
		//----------------------------------------------
		//프로그램 사용자로부터 양의 정수를 하나 입력 받은 다음, 그 수만큼 3의 배수를 출력하는
		//프로그램을 작성
		//ex. 5를 입력 받았다면 3, 6, 9, 12, 15 를 출력
		//
		
		Scanner scan = new Scanner(System.in);
		
		// 양의 정수 입력
		int iNum = scan.nextInt();
		int i = 0;
		
		// 입력한 수만큼 3의 배수 출력
		while(i<iNum) {
			System.out.print((i+1)*3+" ");
			i++;
		}
	}
}