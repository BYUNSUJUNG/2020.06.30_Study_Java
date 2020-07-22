package Ch23;
// 다음 C03DPrinter를 제네릭화 하시오

class C03Power {
	public void doPrinting() {
		System.out.println("Power 재료로 출력");
	}
}
class C03Plastic {
	public void doPrinting() {
		System.out.println("Plastic 재료로 출력");
	}
}

class C033DPrinter {
	private Object material;
	public void SetMaterial(Object material) {
		this.material = material;
		
	}
	public Object getMaterial() {
		return material;
	}
}

public class C03GenericPractice {
	public static void main(String[] args) {
		C033DPrinter printer1 = new C033DPrinter();
		C03Power p1 = new C03Power();
		printer1.SetMaterial(p1);
		
		C033DPrinter printer2 = new C033DPrinter();
		C03Plastic p2 = new C03Plastic();
		printer2.SetMaterial(p2);
	}	
}
