package Ch20;

public class C10WrapperClass {
	public static void main(String[] args) {
		// Boxing
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer("200"); // ���ڿ��� �Է��ص� �ڵ����� ����ȯ
		Integer obj3 = Integer.valueOf("300"); // static �޼���� ��ü(Integer)�� �ٷ� ���ٰ���
		
		// unBoxing
		int value1 = obj1.intValue();
		int value2 = obj1.intValue();
		int value3 = obj1.intValue();
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
	}
}
