package Ch06;

import java.util.Scanner;

public class C01Exam05 {

	public static void main(String[] args) {
		// �μ��� �Է� �޾� ū ���� ����Ͻÿ�
		Scanner scan = new Scanner(System.in);
		
		// �� �Է�
		int iNum1 = scan.nextInt();
		int iNum2 = scan.nextInt();
		
		// �� ��
		if(iNum1>iNum2) {
			System.out.println(iNum1+"�� �� Ů�ϴ�");
		} else if(iNum1<iNum2) {
			System.out.println(iNum2+"�� �� Ů�ϴ�");
		} else {
			System.out.println("�� ���� �����ϴ�");
		}
		
				
	}

}