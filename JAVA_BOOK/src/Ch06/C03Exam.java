package Ch06;

import java.util.Scanner;

//����� �̸��� �����Դϱ�? ȫ�浿
//ȫ�浿 ���� ���̴� ����Դϱ�? 20
//ȫ�浿 ���� ���̴� 20�� �Դϴ�

public class C03Exam {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str;
		int age;
		System.out.printf("����� �̸��� �����Դϱ�?");
		str=sc.nextLine();
		System.out.printf("%s ���� ���̴� ����Դϱ�?", str);
		age=sc.nextInt();
		System.out.printf("%s ���� ���̴� %d ���Դϴ�.\n", str,age);
		
	}
}
