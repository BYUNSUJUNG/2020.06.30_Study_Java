package Ch23;

// �߻�Ŭ����
abstract class DoPrinting {
	void doPrinting() {}
}

// �߻�Ŭ������ ��ӹ޾� �������̵�
class C04Power extends DoPrinting {
	public void doPrinting() {
		System.out.println("Power ���� ���");
	}
}
class C04Plastic extends DoPrinting {
	public void doPrinting() {
		System.out.println("Plastic ���� ���");
	}
}
class C04Water {
	public void doPrinting() {
		System.out.println("Plastic ���� ���");
	}
}

// Object�� T�� �� �ٲ۴�
class C043DPrinter<T extends DoPrinting>  {
	private T material;
	public void setMaterial(T material) {
		this.material = material;
		
	}
	public T getMaterial() {
		return material;
	}
}

public class C04GenericPractice {
	public static void main(String[] args) {
		C043DPrinter<C04Power> printer1 = new C043DPrinter<C04Power>();
		C04Power p1 = new C04Power();
		printer1.setMaterial(p1);
		printer1.getMaterial().doPrinting();
		
		C043DPrinter<C04Plastic> printer2 = new C043DPrinter<C04Plastic>();
		C04Plastic p2 = new C04Plastic();
		printer2.setMaterial(p2);
		printer2.getMaterial().doPrinting();

		// �� �߰��ϸ� �ٷ� �����
		// �Ϻ� Ŭ������ ����ϱ� ���ؼ�
		// �߻�Ŭ������ ����� �װ��� ��ӹ޴´�.
		
		/*
			C043DPrinter<C04Water> printer3 = new C043DPrinter<C04Water>();
			C04Water p3 = new C04Water();
			printer3.setMaterial(p3);
			printer3.getMaterial().doPrinting();
		*/
	}	
}
