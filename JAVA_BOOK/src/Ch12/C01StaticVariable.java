package Ch12;

public class C01StaticVariable {
	
	static int num1 = 10; // static ����, Ŭ���� ����(Ŭ������ ���ٰ����ϴϱ�)
	int num2 = 10; // �ν��Ͻ� ����
	
	public static void main(String[] args) {
		
		// static ������ ��ü ���� ���� ��� ����
		C01StaticVariable.num1=70; // Ŭ����������
		System.out.println("C01StaticVariable="+C01StaticVariable.num1);
		
		// static ������ �ƴϱ⿡ Ŭ������ ���� �Ұ�
		// C01StaticVariable.num2=70;
		
		// ��ü����
		C01StaticVariable ex1 = new C01StaticVariable();
		C01StaticVariable ex2 = new C01StaticVariable();
		
		// ��� ���� static ������ num1�� ����
		ex1.num1 = 20;
		System.out.println("ex1.num1="+ex1.num1);
		System.out.println("ex2.num1="+ex2.num1);
		System.out.println("C01StaticVariable="+C01StaticVariable.num1);
		
		// ���� �ٸ� num2�� ����
		ex1.num2 = 20;
		ex2.num2 = 50;
		System.out.println("ex1.num2="+ex1.num2);
		System.out.println("ex2.num2="+ex2.num2);
		
	}
}
