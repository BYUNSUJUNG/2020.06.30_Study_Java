package Ch06;

import java.util.Arrays;
import java.util.Scanner;

public class C02Exam03 {
	
	public static void main(String[] args) {
		// ��� ���ö�  10�������� ���� 2500�̰�
		// 10���� �ʰ��ϴ� �翡 ���ؼ��� ���� 2400���̴�
		// ��� ���ö��� ������ �Է� �޾Ƽ� �ݾ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�
		
		Scanner scan = new Scanner(System.in);
		
		// ���ö� ���� �Է�
		int iCnt = scan.nextInt();
		// ���ö� ��
		int iMoney;
		
		// ���ö� ������ 10�� �̻��� ���
		if(iCnt>10) {
			iMoney=(2500*10)+2400*(iCnt-10); // ���ö� 10�� �� + �ʰ��� ���� ��
		} else {
			iMoney=2500*iCnt; // ���ö� 10�� �̸��� ��� ��
		}
		System.out.println("���ö� ���� "+iMoney+"�� �Դϴ�");
	
	}

}