package Ch06;

import java.util.Scanner;

public class C01Exam03 {

	public static void main(String[] args) {
		// ���밪�� ���ϴ� ���α׷�
		Scanner scan = new Scanner(System.in);
		
		// �� �Է�
		int iNum = scan.nextInt();
		
		// �Է��� ���� �����̸� ����� �ٲ�
		if(iNum<0) {
			iNum= -iNum;
		}
		System.out.println("������ "+iNum);
				
	}

}
