package Ch05;

public class C02Rest {

	public static void main(String[] args) {
		int t1=56789;
		
		System.out.println("�Է°� Ȯ��: "+t1);
		System.out.println("¦�� Ȯ��: "+(t1%2==0));
		System.out.println("Ȧ�� Ȯ��: "+(t1%2==1));

		System.out.println("3�� ��� Ȯ��: "+(t1%3==0));
		System.out.println("������ 1�ڸ�  Ȯ��: "+(t1%10));
		System.out.println("������ 2�ڸ�  Ȯ��: "+(t1%100));
		System.out.println("������ 3�ڸ�  Ȯ��: "+(t1%1000));
		System.out.println("������ 4�ڸ� Ȯ��: "+(t1%10000));

		System.out.println("���� 1�ڸ� Ȯ��: "+(t1/10000));
		System.out.println("���� 2�ڸ� Ȯ��: "+(t1/1000));
		System.out.println("���� 3�ڸ� Ȯ��: "+(t1/100));
	}

}
