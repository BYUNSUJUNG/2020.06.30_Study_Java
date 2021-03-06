package Ch22;

class Animal {};
class Dog extends Animal {}
class Cat extends Animal {}


public class C03ClassCastException {

	// 클래스 UP/DOWN Casting 메서드
	public static void ChangeDog(Animal animal) { // UP Casting 
		try {
			// DOWN Casting 
			Dog	dog = (Dog) animal;	// 클래스 예외발생 
				
		} catch(ClassCastException e) {
			System.out.println("캐스트 오류발생");
		} finally {
			System.out.println("finally구문");
		}
	}
	

	// 메인메서드
	public static void main(String[] args) {
		Dog dog = new Dog();
		ChangeDog(dog);
		
		Cat cat = new Cat();
		ChangeDog(cat); // dog과 cat은 상속관계가 아니라 오류가뜬다
		System.out.println("메인 함수로 복귀");
	}
}
