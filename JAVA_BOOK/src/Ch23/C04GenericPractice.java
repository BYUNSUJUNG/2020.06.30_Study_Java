package Ch23;

// 추상클래스
abstract class DoPrinting {
	void doPrinting() {}
}

// 추상클래스를 상속받아 오버라이딩
class C04Power extends DoPrinting {
	public void doPrinting() {
		System.out.println("Power 재료로 출력");
	}
}
class C04Plastic extends DoPrinting {
	public void doPrinting() {
		System.out.println("Plastic 재료로 출력");
	}
}
class C04Water {
	public void doPrinting() {
		System.out.println("Plastic 재료로 출력");
	}
}

// Object를 T로 다 바꾼다
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

		// 또 추가하면 바로 적용됨
		// 일부 클래스만 허용하기 위해서
		// 추상클래스를 만들고 그것을 상속받는다.
		
		/*
			C043DPrinter<C04Water> printer3 = new C043DPrinter<C04Water>();
			C04Water p3 = new C04Water();
			printer3.setMaterial(p3);
			printer3.getMaterial().doPrinting();
		*/
	}	
}
