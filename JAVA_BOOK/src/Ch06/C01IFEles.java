package Ch06;

import java.util.Scanner;

public class C01IFEles {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 초기화
		int age= 0;
		age = scan.nextInt();
		
		if (age>=8) {
			System.out.println("학교에 다닙니다");
		} else {
			System.out.println("학교에 다니지 않습니다");	
		}

	}

}
