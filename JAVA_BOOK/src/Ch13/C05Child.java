package Ch13;

public class C05Child extends C05Parent {
	public int studentNo;
	public C05Child(String name, int studentNo) {
		//this.name = name;
		super(name);
		this.studentNo = studentNo;
	}
}
