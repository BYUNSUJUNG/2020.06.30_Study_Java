package Ch06;

import java.util.Scanner;

public class C01Exam08 {

	public static void main(String[] args) {
		// �μ��� �Է� �޾� ���� ¦���̰� 3�� ����� ���� ���
		Scanner scan = new Scanner(System.in);
		
		// �� ���� ��
		int iSum = scan.nextInt() + scan.nextInt();
		
		// �� ���� ���� ¦���̰� 3�� ����� ��� ���
		if((iSum%2==0)&&(iSum%3==0)) {
			System.out.println(iSum+"�� ¦���̸鼭 3�� ��� �� ��");
		}
		
	}

}
