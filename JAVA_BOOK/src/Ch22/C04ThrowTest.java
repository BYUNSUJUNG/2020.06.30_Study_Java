package Ch22;

public class C04ThrowTest {
	
	// Ŭ���� UP/DOWN Casting �޼���
	public static void ChangeDog(Animal animal) throws Exception { // UP Casting, ����ó������ �ʰ� ó���� �̷�ڴ�

		// DOWN Casting 
		Dog	dog = (Dog) animal;	// Ŭ���� ���ܹ߻� 
					
	}
	
	// ���� �޼���
	public static void main(String[] args) {
		try {
			Dog dog = new Dog();
			ChangeDog(dog);
			
			Cat cat = new Cat();
			ChangeDog(cat); // dog�� cat�� ��Ӱ��谡 �ƴ϶� ���������
			System.out.println("���� �Լ��� ����");
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}