package Ch12;

public class C01StaticVariable {
	
	static int num1 = 10; // static 변수, 클래스 변수(클래스로 접근가능하니까)
	int num2 = 10; // 인스턴스 변수
	
	public static void main(String[] args) {
		
		// static 변수는 객체 생성 없이 사용 가능
		C01StaticVariable.num1=70; // 클래스로접근
		System.out.println("C01StaticVariable="+C01StaticVariable.num1);
		
		// static 변수가 아니기에 클래스로 접근 불가
		// C01StaticVariable.num2=70;
		
		// 객체생성
		C01StaticVariable ex1 = new C01StaticVariable();
		C01StaticVariable ex2 = new C01StaticVariable();
		
		// 모두 같은 static 변수인 num1에 접근
		ex1.num1 = 20;
		System.out.println("ex1.num1="+ex1.num1);
		System.out.println("ex2.num1="+ex2.num1);
		System.out.println("C01StaticVariable="+C01StaticVariable.num1);
		
		// 각각 다른 num2에 접근
		ex1.num2 = 20;
		ex2.num2 = 50;
		System.out.println("ex1.num2="+ex1.num2);
		System.out.println("ex2.num2="+ex2.num2);
		
	}
}
