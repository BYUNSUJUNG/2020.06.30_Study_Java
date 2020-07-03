package Ch05;

public class C03BitArith {

	public static void main(String[] args) {
		int num1 = 15; // 00000000 00000000 00000000 00001111
		int num2 = 20; // 00000000 00000000 00000000 00010100
		int num3 = num1 & num2; // 00100 = 4
		int num4 = num1 | num2; // 11111 = 31
		int num5 = num1^num2; // 둘다 1이면 0 // 11011 = 27
		int num6 = ~num1; // 11111111 11111111 11111111 11110000  = -16
		System.out.println("AND비트연산결과"+num3);
		System.out.println("OR비트연산결과"+num4);
		System.out.println("XOR비트연산결과"+num5);
		System.out.println("N0T비트연산결과"+num6);
	}

}
