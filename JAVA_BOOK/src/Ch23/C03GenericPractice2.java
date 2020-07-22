package Ch23;
// ���� C03DPrinter�� ���׸�ȭ �Ͻÿ�

class C03Power2 {
	public void doPrinting() {
		System.out.println("Power ���� ���");
	}
}
class C03Plastic2 {
	public void doPrinting() {
		System.out.println("Plastic ���� ���");
	}
}

// Object�� T�� �� �ٲ۴�
class C033DPrinter2<T> {
	private T material;
	public void setMaterial(T material) {
		this.material = material;
		
	}
	public T getMaterial() {
		return material;
	}
}

public class C03GenericPractice2 {
	public static void main(String[] args) {
		C033DPrinter2<C03Power2> printer1 = new C033DPrinter2<C03Power2>();
		C03Power2 p1 = new C03Power2();
		printer1.setMaterial(p1);
		printer1.getMaterial().doPrinting();
		
		C033DPrinter2<C03Plastic2> printer2 = new C033DPrinter2<C03Plastic2>();
		C03Plastic2 p2 = new C03Plastic2();
		printer2.setMaterial(p2);
		printer2.getMaterial().doPrinting();
	}	
}
