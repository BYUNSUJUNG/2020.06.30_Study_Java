package Ch19;

public class C05Main {

	public static void main(String[] args) {
		C05Students kim=new C05Students("ss",24,"�뱸���б�");
		C05Students Lee=new C05Students("�̽���",22,"���̴��б�");
		C05Students Jung=new C05Students("�����",24,"�뱸���б�");
		
		System.out.println(kim.equals(Lee));
		System.out.println(kim.equals(Jung));
	}

}
