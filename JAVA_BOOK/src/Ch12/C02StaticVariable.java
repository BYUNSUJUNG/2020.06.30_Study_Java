package Ch12;

public class C02StaticVariable {
	public static void main(String[] args) {
		// stack������ �������� studentLee, studentSon
		// heap������ ������ ����, method������serialNumd�� �ּҰ� ��� serialNum����
		// method������ serialNum
		C02Student studentLee = new C02Student();
		studentLee.setStudentName("�̼���");
		System.out.println(studentLee.serialNum);
		studentLee.serialNum++;
		
		C02Student studentSon = new C02Student();
		studentLee.setStudentName("�ռ���");
		studentLee.serialNum++;

		// static ����
		// �Ȱ��� ������ ����Ų��
		System.out.println(studentSon.serialNum);
		System.out.println(studentLee.serialNum);
			
	}
}
