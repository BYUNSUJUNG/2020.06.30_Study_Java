package Ch22;

public class C02ArrayIndexException {
	public static void main(String[] args) {
		
		// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
		//	at Ch22.C02ArrayIndexException.main(C02ArrayIndexException.java:8)

		try {
			int[] arr = {10,20,30};
			
			for (int i = 0; i < 4; i++) {
				System.out.println(arr[i]);
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("예외발생시 처리되는 출력코드");
		} finally {
			System.out.println("예외발생하던 안하던 실행되는 코드");
		}
		System.out.println("예외처리 이후 출력 코드");
	}
}
