package Ch12;

public class C07CompanyTest {
	public static void main(String[] args) {
		// stack영역 myCompany1,myCompany2
		// heap영역 C07Company에서 return받은 instance
		C07Company myCompany1 = C07Company.getInstance();
		C07Company myCompany2 = C07Company.getInstance();
		System.out.println(myCompany1 == myCompany2);
	}
}
