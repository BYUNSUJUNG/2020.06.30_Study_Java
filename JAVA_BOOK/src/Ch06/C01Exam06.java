package Ch06;

import java.util.Scanner;

public class C01Exam06 {

	public static void main(String[] args) {
		// ������ �Է¹޾� ū���� ����Ͻÿ�
		Scanner scan = new Scanner(System.in);
		int[] iNum = new int[3]; // �� ��
		int iMax = 0; // ���� ū ��
		
		// �� �Է� �� ���� ū �� ã��
		for (int i = 0; i < iNum.length; i++) {
			iNum[i] = scan.nextInt();
			// �Է��� ���� ���������� ���� ū ������ ũ��
			if(iNum[i]>iMax) {
				iMax = iNum[i];
			}
		}
		
		// ���
		System.out.println("���� ū ����"+iMax+"�Դϴ�");	
	}

}