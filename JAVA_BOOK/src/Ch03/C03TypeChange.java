package Ch03;

public class C03TypeChange {
	public static void main(String[] args) {
//		double num1 = 10.5 + 5; // 5를 5.0으로 변환해줌
//		int num2 = (int)10.5 + 5;
//		double num3 = (double)(10.5+5);
//		int
//		System.out.printf("num1: %f\n",num1);
//		System.out.printf("num2: %d\n",num2);
//		System.out.printf("num3: %f\n",num3);
//		/*
//		 *	num1: 15.500000
//			num2: 15
//			num3: 15.500000
//		 * */
		
		int num1 = 10, num2 = 4;
		double dnum1 = (double)num1 / num2; // 10.0/4 -> 2.5
		double dnum2 = num1 / num2; // int자료형의 값이 double에 들어감, 데이터 손실이 일어남 2 -> 2.0
		System.out.printf("%f\n",dnum1);
		System.out.printf("%f\n",dnum2);
		
		/*
		 * 	2.500000 
			2.000000 -> 데이터 손실
		 */
		
	}
}
