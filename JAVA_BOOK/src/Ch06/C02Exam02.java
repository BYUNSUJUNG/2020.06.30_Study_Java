package Ch06;

import java.util.Arrays;
import java.util.Scanner;

public class C02Exam02 {
	
	public static void main(String[] args) {
		// �� ���� �Է� �޾� �ִ밪�� �ּҰ��� ���ϼ���

		Scanner scan = new Scanner(System.in);
		
		// �� ���� ���� �迭
		int[] iNum = new int[3];
		
		// �� �� �Է�
		for (int i = 0; i < iNum.length; i++) {
			iNum[i] = scan.nextInt();
		}
		
		// �迭 �� �������� ����
		Arrays.sort(iNum); 
		
		System.out.println("���� ���� ��"+iNum[0]);
		System.out.println("���� ū ��"+iNum[2]);
		
		
	}

}