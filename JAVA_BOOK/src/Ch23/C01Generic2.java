package Ch23;
class Corn2<T> {
	private T obj;
	public T get() {
		return obj;
		
	}
	public void set(T obj) {
		this.obj = obj;
	}
}
public class C01Generic2 {
	public static void main(String[] args) {
		/*
		Corn con1 = new Corn();
		con1.set("��");
		String test1 = (String)con1.get(); // �ٿ�ĳ����
		System.out.println(test1);
		
		Corn con2 = new Corn();
		con2.set(123);
		String test2 = (String)con2.get(); // �ٿ�ĳ����
		System.out.println(test2);
		
		// ���ŷӰ� �Է°��� ���� �ٿ�ĳ������ �����������
		// �ذ���: ���׸� ���
		*/
		
		// ���׸��� ��ü��
		Corn2<String> con3 = new Corn2<String>();
		con3.set("����");
		String test1 = con3.get();
		
		Corn2<Integer> con4 = new Corn2<Integer>();
		con4.set(1324);
		int num = con4.get();
		
		
	}
}
