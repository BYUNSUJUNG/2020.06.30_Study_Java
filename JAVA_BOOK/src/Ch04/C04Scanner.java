package Ch04;

import java.util.Scanner;

public class C04Scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 	// Scanner ��ü(�ν��Ͻ�) ����
		System.out.print("���ڸ� �Է��ϼ���: ");
		int num = sc.nextInt();
		System.out.print("���� �Է°�: "+num);
		
		// ���ۺ���
		sc.nextLine();
		
		System.out.print("���ڿ��� �Է��ϼ���: ");
		// ���� �Է�(���� ������)
		String st1 = sc.next();
		System.out.print("���ڿ� �Է°�: "+st1);
		
		// ���ۺ��� - �Է��� �������� ��, ���� �Է��� ������ ���Ͱ��� ���� ���� �Ͼ �� �ִ�
		sc.nextLine();
		
		System.out.print("���ڸ� �Է��ϼ���(��������): ");
		// ���� �Է�(���� ����)
		String st2 = sc.nextLine();
		System.out.print("���� �Է°�: "+st2);
		
		// ��ĳ�� ����
		sc.close();
	}
}
