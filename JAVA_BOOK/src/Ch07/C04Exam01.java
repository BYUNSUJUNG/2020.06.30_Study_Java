package Ch07;

import java.util.Scanner;

public class C04Exam01 {
	
	public static void main(String[] args) {
		//����1
		//----------------------------------------------
		//���α׷� ����ڷκ��� ���� ������ �ϳ� �Է¹޾Ƽ�, �� ����ŭ "Hello world!"��
		//����ϴ� ���α׷��� �ۼ�
		
		Scanner scan = new Scanner(System.in);
		
		// ���� ���� �Է�
		int iNum = scan.nextInt();
		int i = 0;
		
		// �Է��� ����ŭ �ݺ�
		while(i<iNum) {
			System.out.println("Hello world!");
			i++;
		}
	}
}