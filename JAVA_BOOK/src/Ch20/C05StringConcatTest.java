package Ch20;

public class C05StringConcatTest {
	public static void main(String[] args) {
		String javaStr1 = new String("JAVA");
		String javaStr2 = new String("ANDROID");
		
		System.out.println(System.identityHashCode(javaStr1));
		System.out.println(System.identityHashCode(javaStr2));
		
		System.out.println(javaStr1);
		
		// concat() ���ο� ��ü�� ���� ���ڿ��� ����
		// ���� ��ü�� �޸𸮿� �δ��� ��
		// �ذ�: C06 StringBuilder
		javaStr1 = javaStr1.concat(javaStr2);
		System.out.println(System.identityHashCode(javaStr1)); // ��ü�� �ٸ��⿡ ���� �޶���
		
		System.out.println(javaStr1);
		
		
		
	}
}
