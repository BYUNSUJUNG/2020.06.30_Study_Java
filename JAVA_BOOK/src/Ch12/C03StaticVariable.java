package Ch12;

public class C03StaticVariable {
	public static void main(String[] args) {
		// stack������ �������� studentLee, studentSon
		// heap������ ������ ����, serialNumd�� �ּҰ� ��� serialNum����
		// method������ serialNum
		C03Student studentLee = new C03Student();
		System.out.println(studentLee.serialNum);
		
		C03Student studentSon = new C03Student();
		System.out.println(studentSon.serialNum);
			
	}
}