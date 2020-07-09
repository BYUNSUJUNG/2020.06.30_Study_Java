package Ch09;

import java.util.Scanner;

class MemberServer {
	private String id;
	private int password;
	
	// login
	public boolean login(String id, int password) {
		this.id = id;
		this.password = password;
		
		// id가 hong이고 password가 12345이면 true를 반환
		if(id.equals("hong")&&password==12345) {
			return true;
		} //else {
			return false;
		//}
	}
	
	// logout
	public void logout(String id) {
		this.id = id;
	}
}

public class C07MemberServerMain {
	public static void main(String[] args) {
		// 객체 생성
		// 참조변수 ms
		MemberServer ms = new MemberServer();
		
		Scanner scan = new Scanner(System.in);
		String id = scan.next();
		int password = scan.nextInt();
		
		if(ms.login(id,password)) {// true
			System.out.println("로그인 성공");
		} else { // false
			System.out.println("로그인 실패");
		}
	}
}
