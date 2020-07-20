package Ch19;

public class C05Main {

	public static void main(String[] args) {
		C05Students kim=new C05Students("ss",24,"대구대학교");
		C05Students Lee=new C05Students("이승찬",22,"구미대학교");
		C05Students Jung=new C05Students("정우균",24,"대구대학교");
		
		System.out.println(kim.equals(Lee));
		System.out.println(kim.equals(Jung));
	}

}
