package Ch02;

public class C02UniCode {

	public static void main(String[] args) {
		// char 형을 10진수로 변환
		// char -> 10진수
		System.out.println((int)'A');
		System.out.println((int)'a');
		System.out.println((int)'가');
		System.out.println((int)'나');
		
		// 10진수를 16진수 형태로 출력(유니코드 값 확인)
		// 10진수 -> 16진수
		System.out.printf("%x\n",(int)'A');
		System.out.printf("%x\n",(int)'a');
		System.out.printf("%x\n",(int)'가');
		System.out.printf("%x\n",(int)'나');
		
		// 유니코드 값을 이용해서 char형 출력
		// 16진수 -> char
		System.out.println('\u0041');
		System.out.println('\u0061');
		System.out.println('\uac00');
		System.out.println('\ub098');
		
	}

}
