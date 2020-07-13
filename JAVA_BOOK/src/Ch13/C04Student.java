package Ch13;

public class C04Student extends C04People{
	public int studentNo;
	
	public C04Student(String name, String ssn, int studentNo) {
		super(name,ssn);
		this.studentNo = studentNo;
	}
	
}
