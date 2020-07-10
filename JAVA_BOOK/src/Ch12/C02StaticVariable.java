package Ch12;

public class C02StaticVariable {
	public static void main(String[] args) {
		// stack영역에 참조변수 studentLee, studentSon
		// heap영역에 각각의 변수, method영역의serialNumd의 주소가 담긴 serialNum변수
		// method영역에 serialNum
		C02Student studentLee = new C02Student();
		studentLee.setStudentName("이선균");
		System.out.println(studentLee.serialNum);
		studentLee.serialNum++;
		
		C02Student studentSon = new C02Student();
		studentLee.setStudentName("손수경");
		studentLee.serialNum++;

		// static 변수
		// 똑같은 변수를 가르킨다
		System.out.println(studentSon.serialNum);
		System.out.println(studentLee.serialNum);
			
	}
}
