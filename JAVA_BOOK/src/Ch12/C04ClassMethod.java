package Ch12;

public class C04ClassMethod {
	public static void main(String[] args) {
		C04Student studentLee = new C04Student();
		studentLee.setStudentName("이선균");
		System.out.println(C04Student.getSerialNum());
		System.out.println(studentLee.studentName+"학번: "+studentLee.studentID);
		
		C04Student studentSon = new C04Student();
		studentSon.setStudentName("손수경");
		System.out.println(C04Student.getSerialNum());
		System.out.println(studentSon.studentName+"학번: "+studentSon.studentID);
		
	}
}
