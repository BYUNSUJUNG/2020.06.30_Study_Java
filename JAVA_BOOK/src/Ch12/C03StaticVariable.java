package Ch12;

public class C03StaticVariable {
	public static void main(String[] args) {
		// stack영역에 참조변수 studentLee, studentSon
		// heap영역에 각각의 변수, serialNumd의 주소가 담긴 serialNum변수
		// method영역에 serialNum
		C03Student studentLee = new C03Student();
		System.out.println(studentLee.serialNum);
		
		C03Student studentSon = new C03Student();
		System.out.println(studentSon.serialNum);
			
	}
}
