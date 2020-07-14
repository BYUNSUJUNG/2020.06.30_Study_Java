package Ch14;

class Animal {
	int x = 10;
	
}
class Human extends Animal {
	int y = 20;
}

class Tiger extends Animal {
	int z = 20;
}

public class C03ClassTypeChange {
	public static void main(String[] args) {
		Animal ani = new Human();
		System.out.println(ani.x);
		//System.out.println(ani.y); // ���� �Ұ�
		
		// �ٿ� ĳ���� ����!
		if(ani instanceof Human) {
			Human man = (Human) ani;
		}
//		System.out.println(man.x);
//		System.out.println(man.y);
		
		// �߸��� �ٿ�ĳ����
		// Human�� Tiger�� ��Ӱ��谡 �ƴ�
		Animal ani2 = new Tiger();
		if(ani2 instanceof Human) {
			Human man2 = (Human) ani2;
		}
//		System.out.println(man2.x);
//		System.out.println(man2.y); 
		// System.out.println(man2.z); // ���� �Ұ�
		
	}
}