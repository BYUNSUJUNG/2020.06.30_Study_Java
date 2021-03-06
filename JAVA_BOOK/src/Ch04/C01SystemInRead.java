package Ch04;

import java.io.IOException;

public class C01SystemInRead {
	public static void main(String[] args) throws IOException { // 예외처리
		int keyCode;
		
/*
		// read()는 한문자만 받는다.
		// 10이상의 수는 입력받으면 1만 인식함
		keyCode = System.in.read()-48; // 문자0에 대한 값이 48이기에 0를 출력하기 위해서 -48
		System.out.println("KeyCode: "+keyCode);
*/
		while (true) {
			keyCode = System.in.read();
			System.out.println("keyCode: "+keyCode);
		}
		
		/*
		 * 123456
			keyCode: 49
			keyCode: 50
			keyCode: 51
			keyCode: 52
			keyCode: 53
			keyCode: 54
			keyCode: 13 -> carriage return
			keyCode: 10 -> line feed => enter
		 * */
		
	}
}
