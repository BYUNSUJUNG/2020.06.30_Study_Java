package Ch06;

import java.util.Arrays;
import java.util.Scanner;

public class C02Exam04 {
	
	public static void main(String[] args) {

		// ���� 1�뿡 5000���Ѵ�.
		// �׷��� �ѹ��� 10���̻��� ��� ��ü �ݾ��� 10%�� �����Ͽ��ش� 
		// �׸��� 100�� �̻��� ��� ��ü �ݾ��� 12%�� �����Ͽ� �ش�.
		// X���� ������ ����� �󸶰� �־�� �ϴ°�
	
		Scanner scan = new Scanner(System.in);
		
		// ���� �� ���� �Է�
		int iCnt = scan.nextInt();
		// ���� ����
		double iMoney;
		
		if(iCnt>=100) { // 100�� �̻��� ������ ������ ���
			
			// ��ü �ݾ��� 12% ���ε� �� => ��ü ���� 88% ��
			iMoney=(5000*iCnt)*0.88; 
		
		} else if (iCnt>=10) { // 10�� �̻��� ������ ������ ���
		
			// ��ü �ݾ��� 10% ���ε� �� => ��ü ���� 90% ��
			iMoney=(5000*iCnt)*0.90; 
		
		} else { // 10�� �̸��� ������ ������ ���
			iMoney=(5000*iCnt);
		}
		System.out.println("���� ���� "+iMoney+"�� �Դϴ�");
	
	}

}
