package Ch11;

import java.util.Scanner;

public class C02Array2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// �ʱ�ȭ
		int[] arr = new int[5];
		int total = 0;
		double avg = 0;
		
		//array�� �� �Է��ϸ鼭 �ձ��ϱ�
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
			total+=arr[i];
		}
		
		// avg ���ϱ�
		avg = (double)total/arr.length;
		
		// ���
		System.out.print("����: "+total+", ���: "+avg);
	}
}
