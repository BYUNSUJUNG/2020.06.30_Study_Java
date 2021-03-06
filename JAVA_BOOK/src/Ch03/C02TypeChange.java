package Ch03;

public class C02TypeChange {
	public static void main(String[] args) {
		int num1 = 129; // 4byte: 00000000 00000000 00000000 10000001
		int num2 = 130; // 4byte: 00000000 00000000 00000000 10000010
		// 8bit의 맨 왼쪽 비트는 부호를 나타내는 것, 0은 +, 1은 -
		byte ch1 = (byte)num1; // 1byte: 10000001 = -128 + 1 = -127
		byte ch2 = (byte)num1; // 1byte: 10000010 = -128 + 2 = -126
		
		System.out.printf("%d\n",(int)ch1);
		System.out.printf("%d\n",(int)ch2);
	}
}
