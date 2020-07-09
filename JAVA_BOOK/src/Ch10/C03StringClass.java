package Ch10;

public class C03StringClass {
	public static void main(String[] args) {
		String str = "abcdefg";
		 
		int i = 0;
		// 반복문 사용
		// %c 서식문자 사용
		while(i>str.length()) {
			System.out.printf("%c ", str.charAt(i));
			i++;
		}
	}
}
