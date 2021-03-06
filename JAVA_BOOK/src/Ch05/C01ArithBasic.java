package Ch05;

import java.util.Scanner;

public class C01ArithBasic {

	public static void main(String[] args) {
		// 기본 산술 연산자
		int a = 10 , b = 20, c =0;
		System.out.println("a + b = "+(a+b));
		System.out.println("a - b = "+(a-b));
		System.out.println("a * b = "+(a*b));
		System.out.println("a / b = "+(a/b));
		System.out.println("a %% b = "+(a%b));
		
		// 복합 대입 연산자
		a += 10;
		b -= 10;
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		// 문제 1 두수를 입력받아 합/차/곱을 출력하는 프로그램을 만들어보시오
		// Scanner 를 사용합니다
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력하세요: ");
		int iNum1 = scan.nextInt();
		System.out.print("두번째 숫자를 입력하세요: ");
		int iNum2 = scan.nextInt();
		System.out.println("iNum1 + iNum2 = "+(iNum1+iNum2));
		System.out.println("iNum1 - iNum2 = "+(iNum1-iNum2));
		System.out.println("iNum1 * iNum2 = "+(iNum1*iNum2));

		// 논리연산자
		// AND연산자
		// 둘다 참일 때, 참 
		System.out.println("true AND true = "+(true&&true)); // 참
		System.out.println("true AND false = "+(true&&false)); // 거짓
		System.out.println("false AND true = "+(false&&true)); // 거짓
		System.out.println("false AND false = "+(false&&false)); // 거짓
		
		// OR연산자
		// 하나만 참이라도, 참 
		System.out.println("true OR true = "+(true||true)); // 참
		System.out.println("true OR false = "+(true||false)); // 참
		System.out.println("false OR true = "+(false||true)); // 참
		System.out.println("false OR false = "+(false||false)); // 거짓
		
		// 논리 부정 연산자(!)
		boolean play = true;
		System.out.println(play); // true
		
		play = !play;
		System.out.println(play); // false
		
		// 비교연산자
		int A = 10, B = 20;
		System.out.println("A == B : "+(a==b));
		System.out.println("A > B : "+(a>b));
		System.out.println("A < B : "+(a<b));
		System.out.println("A >= B : "+(a>=b));
		System.out.println("A <= B : "+(a<=b));
		System.out.println("A != B : "+(a!=b));
		
		// 증감연산자
		int AA = 10, BB = 10, CC = 0, DD = 0;
		CC=--AA; // 전위연산자
		DD=AA--; // 후위연산자
		// 8 10 9 9
		System.out.printf("AA = %d, BB = %d, CC = %d, DD = %d\n",AA,BB,CC,DD);
		
		// 삼항연산자
		int score = 85;
		char grade = (score>90) ? 'A' : ((score>80)?'B':'C');
		System.out.printf(score+"점은"+grade+"등급입니다");
		
	}

}
