package Ch06;

import java.util.Scanner;

public class C02Exam01 {
	// �� ������ ������ �Է¹޾� �հ�� ����� ���ϰ�,
	// ����� 90�� �̻��̸� 'A', 80�̻��̸� 'B', 70�� �̻��̸� 'C', 60�� �̻��̸� 'D', 60�� �̸��̸� 'F'
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// �� ������ ����
		int[] iScore = new int[3];
		// �� ���� ������ ��
		int iSum = 0;
		// �� ���� ������ ���
		float fAvg = 0;
		
		// ���� �Է� �� �հ� ���ϱ�
		for (int i = 0; i < iScore.length; i++) {
			iScore[i] = scan.nextInt();
			iSum+=iScore[i];
		}
		
		// ��� ���ϱ�
		fAvg = (float)iSum / iScore.length;
		
		// ��տ� ���� ����
		if (fAvg>=90) {
			System.out.println("A");
		} else if(fAvg>=80) {
			System.out.println("B");
		} else if(fAvg>=70) {
			System.out.println("C");
		} else if(fAvg>=60) {
			System.out.println("D");
		} else { // 60�� �̸�
			System.out.println("F");
		} 
		
	}

}
