package Ch06;

import java.util.Scanner;

public class C01Exam07 {

	public static void main(String[] args) {
		// �μ��� �Է� �޾� ū ���� ¦���̸� ����Ͻÿ�
		Scanner scan = new Scanner(System.in);
		
		// �� �Է�
		int iNum1 = scan.nextInt();		
		int iNum2 = scan.nextInt();		
		int iMax;
		
		// �� ���߿� ū �� ã��
		if(iNum1<iNum2) { // iNum2�� ū ���
			iMax = iNum2;
		} else { // iNum1>iNum2 || iNum1==iNum2
			// iNum1�� ũ�ų�, ���� ���� ���
			iMax = iNum1;
		}
		
		// ū ���� ¦���� ��� ���
		if(iMax%2==0) {
			System.out.println(iMax);	
		}
		
	}

}
