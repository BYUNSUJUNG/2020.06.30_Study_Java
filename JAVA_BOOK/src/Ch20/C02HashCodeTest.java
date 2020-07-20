package Ch20;

//�ؽ��ڵ带 �������̵� �ؼ� ����ؾ� �ϴ� ����//

class ObjTestA {
	int x;
	ObjTestA(){};
	public ObjTestA(int a) {
		this.x = a; 
	}
	// hashCode �������̵�
	public int hashCode() {
		return x;
	}
	
	
	public boolean equals(Object obj) { // equals ������
		if(obj instanceof ObjTestA) {  // ����ȯ ���ɿ��� Ȯ��
			ObjTestA tmp = (ObjTestA)obj; // �ٿ�ĳ����
			if(this.x==tmp.x) // ��ü �� �� 
				return true;
			else 
				return false;
		}
		return false;
	}
}

public class C02HashCodeTest {
	public static void main(String[] args) {
		// ��ü ����
		ObjTestA obj1 = new ObjTestA(12);
		ObjTestA obj2 = new ObjTestA(12);
		ObjTestA obj3 = new ObjTestA(56);
		

		System.out.println(obj1);		//�ڹ� ����ӽ��� �ο��� ��ü�� �ּҰ�����
		System.out.println(obj2);		//�ڹ� ����ӽ��� �ο��� ��ü�� �ּҰ�����
		System.out.println(obj3);		//�ڹ� ����ӽ��� �ο��� ��ü�� �ּҰ�����
		
		// �ڹ� ����ӽſ� ���� �ο��� ��ü�� ���� Ȯ��
		System.out.println(obj1.hashCode());	// �����ǰ� ������ �ؽ��ڵ�(���������� ������ �����ĺ��ؽ��ڵ�����)
		System.out.println(obj2.hashCode());	// �����ǰ� ������ �ؽ��ڵ�(���������� ������ �����ĺ��ؽ��ڵ�����)
		System.out.println(obj3.hashCode());	// �����ǰ� ������ �ؽ��ڵ�(���������� ������ �����ĺ��ؽ��ڵ�����)
		// Equals �޼���� ���ü ���� Ȯ��
		System.out.println(obj1.equals(obj2));	//false(���� �ٸ� �ؽ��ڵ� ����)
		System.out.println(obj1.equals(obj3));	//false(���� �ٸ� �ؽ��ڵ� ����)
		System.out.println(obj2.equals(obj3));	//false(���� �ٸ� �ؽ��ڵ� ����)
		// identityHashCode()
		System.out.println(System.identityHashCode(obj1));		//�����ο��Ǵ� �����ĺ��ؽ��ڵ�
		System.out.println(System.identityHashCode(obj2));		//�����ο��Ǵ� �����ĺ��ؽ��ڵ�	
		System.out.println(System.identityHashCode(obj3));		//�����ο��Ǵ� �����ĺ��ؽ��ڵ�
	}
}
