package Ch06;

import java.util.Scanner;

public class C01IFEles {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// �ʱ�ȭ
		int age= 0;
		age = scan.nextInt();
		
		if (age>=8) {
			System.out.println("�б��� �ٴմϴ�");
		} else {
			System.out.println("�б��� �ٴ��� �ʽ��ϴ�");	
		}

	}

}
