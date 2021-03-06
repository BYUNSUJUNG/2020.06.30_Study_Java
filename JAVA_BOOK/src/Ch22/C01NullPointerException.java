package Ch22;

public class C01NullPointerException {
	public static void main(String[] args) {

		// 예외발생시 try-catch문 사용
		try {
			String data = null;
			System.out.println(data.toString());
			
			// Exception in thread "main" java.lang.NullPointerException
			//		at Ch22.C01NullPointerException.main(C01NullPointerException.java:6)

		} catch(NullPointerException e) {
			System.out.println("NullPointerException예외발생시 출력!!");
			System.out.println(	e.getCause()); // 어떤이유
			System.out.println(	e.toString()); // 예외종류 
			e.printStackTrace(); // 모든 코드를 실행하고 마지막에 에러문 출력
		
		}
		System.out.println("예외처리 이후 출력!!");
	}
}
