package Ch15;

public abstract class C02AnimalExample {
	public static void main(String[] args) {
		C02Dog dog = new C02Dog();
		C02Cat cat = new C02Cat();
		
		dog.sound();
		cat.sound();
		System.out.println("----");
		
		// 변수의 자동 타입변환
		C02Animal animal = null;
		animal = new C02Dog();
		animal.sound();
		animal = new C02Cat();
		animal.sound();
		System.out.println("----");
	
		// 메소드의 다향성
		animalsound(new C02Dog());
		animalsound(new C02Cat());
		
	}
	public static void animalsound(C02Animal animal) {
		animal.sound();
	}

}
