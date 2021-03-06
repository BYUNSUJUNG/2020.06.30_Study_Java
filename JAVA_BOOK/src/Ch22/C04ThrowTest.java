package Ch22;

public class C04ThrowTest {
	
	// 클래스 UP/DOWN Casting 메서드
	public static void ChangeDog(Animal animal) throws Exception { // UP Casting, 예외처리하지 않고 처리를 미루겠다

		// DOWN Casting 
		Dog	dog = (Dog) animal;	// 클래스 예외발생 
					
	}
	
	// 메인 메서드
	public static void main(String[] args) {
		try {
			Dog dog = new Dog();
			ChangeDog(dog);
			
			Cat cat = new Cat();
			ChangeDog(cat); // dog과 cat은 상속관계가 아니라 오류가뜬다
			System.out.println("메인 함수로 복귀");
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
