package Ch12;

public class C04ClassMethod {
	public static void main(String[] args) {
		C04Student studentLee = new C04Student();
		studentLee.setStudentName("�̼���");
		System.out.println(C04Student.getSerialNum());
		System.out.println(studentLee.studentName+"�й�: "+studentLee.studentID);
		
		C04Student studentSon = new C04Student();
		studentSon.setStudentName("�ռ���");
		System.out.println(C04Student.getSerialNum());
		System.out.println(studentSon.studentName+"�й�: "+studentSon.studentID);
		
	}
}
