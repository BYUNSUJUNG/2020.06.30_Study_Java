package Ch15;

public abstract class C02AnimalExample {
	public static void main(String[] args) {
		C02Dog dog = new C02Dog();
		C02Cat cat = new C02Cat();
		
		dog.sound();
		cat.sound();
		System.out.println("----");
		
		// ������ �ڵ� Ÿ�Ժ�ȯ
		C02Animal animal = null;
		animal = new C02Dog();
		animal.sound();
		animal = new C02Cat();
		animal.sound();
		System.out.println("----");
	
		// �޼ҵ��� ���⼺
		animalsound(new C02Dog());
		animalsound(new C02Cat());
		
	}
	public static void animalsound(C02Animal animal) {
		animal.sound();
	}

}