package Ch12;

public class C03Student {
	public static int serialNum = 1000;
	
	public int studentID;
	public String studentName;
	public int grade;
	public String address;
	
	public C03Student() {
		serialNum++;
		studentID = serialNum;
	}
	public String getStudentName()  {
		return studentName;
	}
	
	public void setStudentName(String name) {
		this.studentName = name;
	}
	
	
}
