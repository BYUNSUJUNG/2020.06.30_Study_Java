package Ch05;

import java.util.Scanner;

public class C01ArithBasic {

	public static void main(String[] args) {
		// �⺻ ��� ������
		int a = 10 , b = 20, c =0;
		System.out.println("a + b = "+(a+b));
		System.out.println("a - b = "+(a-b));
		System.out.println("a * b = "+(a*b));
		System.out.println("a / b = "+(a/b));
		System.out.println("a %% b = "+(a%b));
		
		// ���� ���� ������
		a += 10;
		b -= 10;
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		// ���� 1 �μ��� �Է¹޾� ��/��/���� ����ϴ� ���α׷��� �����ÿ�
		// Scanner �� ����մϴ�
		Scanner scan = new Scanner(System.in);
		System.out.print("ù��° ���ڸ� �Է��ϼ���: ");
		int iNum1 = scan.nextInt();
		System.out.print("�ι�° ���ڸ� �Է��ϼ���: ");
		int iNum2 = scan.nextInt();
		System.out.println("iNum1 + iNum2 = "+(iNum1+iNum2));
		System.out.println("iNum1 - iNum2 = "+(iNum1-iNum2));
		System.out.println("iNum1 * iNum2 = "+(iNum1*iNum2));

		// ����������
		// AND������
		// �Ѵ� ���� ��, �� 
		System.out.println("true AND true = "+(true&&true)); // ��
		System.out.println("true AND false = "+(true&&false)); // ����
		System.out.println("false AND true = "+(false&&true)); // ����
		System.out.println("false AND false = "+(false&&false)); // ����
		
		// OR������
		// �ϳ��� ���̶�, �� 
		System.out.println("true OR true = "+(true||true)); // ��
		System.out.println("true OR false = "+(true||false)); // ��
		System.out.println("false OR true = "+(false||true)); // ��
		System.out.println("false OR false = "+(false||false)); // ����
		
		// ���� ���� ������(!)
		boolean play = true;
		System.out.println(play); // true
		
		play = !play;
		System.out.println(play); // false
		
		// �񱳿�����
		int A = 10, B = 20;
		System.out.println("A == B : "+(a==b));
		System.out.println("A > B : "+(a>b));
		System.out.println("A < B : "+(a<b));
		System.out.println("A >= B : "+(a>=b));
		System.out.println("A <= B : "+(a<=b));
		System.out.println("A != B : "+(a!=b));
		
		// ����������
		int AA = 10, BB = 10, CC = 0, DD = 0;
		CC=--AA; // ����������
		DD=AA--; // ����������
		// 8 10 9 9
		System.out.printf("AA = %d, BB = %d, CC = %d, DD = %d\n",AA,BB,CC,DD);
		
		// ���׿�����
		int score = 85;
		char grade = (score>90) ? 'A' : ((score>80)?'B':'C');
		System.out.printf(score+"����"+grade+"����Դϴ�");
		
	}

}