package Ch02;

public class C02UniCode {

	public static void main(String[] args) {
		// char ���� 10������ ��ȯ
		// char -> 10����
		System.out.println((int)'A');
		System.out.println((int)'a');
		System.out.println((int)'��');
		System.out.println((int)'��');
		
		// 10������ 16���� ���·� ���(�����ڵ� �� Ȯ��)
		// 10���� -> 16����
		System.out.printf("%x\n",(int)'A');
		System.out.printf("%x\n",(int)'a');
		System.out.printf("%x\n",(int)'��');
		System.out.printf("%x\n",(int)'��');
		
		// �����ڵ� ���� �̿��ؼ� char�� ���
		// 16���� -> char
		System.out.println('\u0041');
		System.out.println('\u0061');
		System.out.println('\uac00');
		System.out.println('\ub098');
		
	}

}