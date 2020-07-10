package Ch12;

public class C04Student {
	public static int serialNum = 1000;
	
	public int studentID;
	public String studentName;
	public int grade;
	public String address;
	
	public C04Student() {
		serialNum++;
		studentID = serialNum;
	}
	public String getStudentName()  {
		return studentName;
	}
	
	public void setStudentName(String name) {
		this.studentName = name;
	}
	
	public static int getSerialNum() {
		return serialNum;
	}
	public static void setSerialNum(int serialNum) {
		C04Student.serialNum = serialNum;
	}

}
