package Ch06;

import java.util.Scanner;

//당신의 이름은 무엇입니까? 홍길동
//홍길동 님의 나이는 몇살입니까? 20
//홍길동 님의 나이는 20살 입니다

public class C03Exam {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str;
		int age;
		System.out.printf("당신의 이름은 무엇입니까?");
		str=sc.nextLine();
		System.out.printf("%s 님의 나이는 몇살입니까?", str);
		age=sc.nextInt();
		System.out.printf("%s 님의 나이는 %d 살입니다.\n", str,age);
		
	}
}
