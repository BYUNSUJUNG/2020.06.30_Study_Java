package Ch23;
class Corn {
	private Object obj;
	public Object get() {
		return obj;
		
	}
	public void set(Object obj) {
		this.obj = obj;
	}
}
public class C01Generic {
	public static void main(String[] args) {
		Corn con1 = new Corn();
		con1.set("��");
		String test1 = (String)con1.get(); // �ٿ�ĳ����
		System.out.println(test1);
		
		Corn con2 = new Corn();
		con2.set(123);
		String test2 = (String)con2.get(); // �ٿ�ĳ����
		System.out.println(test2);
		
		// ���ŷӰ� �������� ���� �ٿ�ĳ������ �����������
		// �ذ���: ���׸� ���
		
	}
}
