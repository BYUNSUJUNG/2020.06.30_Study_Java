package Ch07;

import java.util.Scanner;

public class C04Exam02 {
	
	public static void main(String[] args) {
		//����2
		//----------------------------------------------
		//���α׷� ����ڷκ��� ���� ������ �ϳ� �Է� ���� ����, �� ����ŭ 3�� ����� ����ϴ�
		//���α׷��� �ۼ�
		//ex. 5�� �Է� �޾Ҵٸ� 3, 6, 9, 12, 15 �� ���
		//
		
		Scanner scan = new Scanner(System.in);
		
		// ���� ���� �Է�
		int iNum = scan.nextInt();
		int i = 0;
		
		// �Է��� ����ŭ 3�� ��� ���
		while(i<iNum) {
			System.out.print((i+1)*3+" ");
			i++;
		}
	}
}