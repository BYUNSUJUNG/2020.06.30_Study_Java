package Ch06;

import java.util.Scanner;

public class C01Exam04 {

	public static void main(String[] args) {
		// ���� �Է� �޾� ¦,Ȧ���� �����Ͽ� ���
		Scanner scan = new Scanner(System.in);
		// �� �Է�
		int iNum = scan.nextInt();
		// 2�� ����� �������� 0�̸� ¦��, 1�̸� Ȧ��
		if(iNum%2==0) {
			System.out.println(iNum+"�� ¦�� �Դϴ�");
		} else { // iNum%1==0
			System.out.println(iNum+"�� Ȧ�� �Դϴ�");
		}
		
				
	}

}
