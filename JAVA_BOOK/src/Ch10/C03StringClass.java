package Ch10;

public class C03StringClass {
	public static void main(String[] args) {
		String str = "abcdefg";
		 
		int i = 0;
		// �ݺ��� ���
		// %c ���Ĺ��� ���
		while(i>str.length()) {
			System.out.printf("%c ", str.charAt(i));
			i++;
		}
	}
}
