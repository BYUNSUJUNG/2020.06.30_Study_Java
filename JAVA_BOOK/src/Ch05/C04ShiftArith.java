package Ch05;

public class C04ShiftArith {
	public static void main(String[] args) {
		int num1 = 15;	// 00000000 00000000 00000000 00001111
		int num2 = 20;  // 00000000 00000000 00000000 00010100
		int num3 = num1 <<2;	// 00000000 00000000 00000000 00111100 = 60 = 15*(2�� 2��)
		int num4 = num2 >>2;	// 00000000 00000000 00000000 00000101 = 20/(2�� 2��)
		System.out.printf("<< Shift ������: %d\n",num3);
		System.out.printf("<< Shift ������: %d\n",num4);
	}
}
