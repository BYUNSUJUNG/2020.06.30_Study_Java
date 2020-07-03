package Ch05;

public class C02Rest {

	public static void main(String[] args) {
		int t1=56789;
		
		System.out.println("입력값 확인: "+t1);
		System.out.println("짝수 확인: "+(t1%2==0));
		System.out.println("홀수 확인: "+(t1%2==1));

		System.out.println("3의 배수 확인: "+(t1%3==0));
		System.out.println("오른쪽 1자리  확인: "+(t1%10));
		System.out.println("오른쪽 2자리  확인: "+(t1%100));
		System.out.println("오른쪽 3자리  확인: "+(t1%1000));
		System.out.println("오른쪽 4자리 확인: "+(t1%10000));

		System.out.println("왼쪽 1자리 확인: "+(t1/10000));
		System.out.println("왼쪽 2자리 확인: "+(t1/1000));
		System.out.println("왼쪽 3자리 확인: "+(t1/100));
	}

}
