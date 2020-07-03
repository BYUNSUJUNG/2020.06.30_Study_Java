package Ch04;

import java.util.Scanner;

public class C04Scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 	// Scanner 객체(인스턴스) 생성
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		System.out.print("숫자 입력값: "+num);
		
		// 버퍼비우기
		sc.nextLine();
		
		System.out.print("문자열를 입력하세요: ");
		// 문자 입력(공백 미포함)
		String st1 = sc.next();
		System.out.print("문자열 입력값: "+st1);
		
		// 버퍼비우기 - 입력을 여러번할 때, 다음 입력할 공간에 엔터값이 들어가는 일이 일어날 수 있다
		sc.nextLine();
		
		System.out.print("숫자를 입력하세요(띄어쓰기포함): ");
		// 문자 입력(공백 포함)
		String st2 = sc.nextLine();
		System.out.print("숫자 입력값: "+st2);
		
		// 스캐너 제거
		sc.close();
	}
}
