package Ch25;

import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;


// 	문자열 입력 (종료:quit): Hello World
//	문자열 입력 (종료:quit): This is Test
//	문자열 입력 (종료:quit): bye
//	문자열 입력 (종료:quit): quit
//	종료합니다

//1.Hello World
//2.This is Test
//3.bye

public class C08Practice {
	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);
			Writer out = new FileWriter("c:/temp/testTest.txt"); // 저장 경로
			
			String tmp = null;
			int Cnt = 0;
			while(true) {
				Cnt++;
				System.out.print("문자열 입력 (종료:quit): ");
				tmp = scan.nextLine(); // 문자열 입력받기
				if(tmp.equals("quit")) break;
				out.append(Cnt+"."+tmp+"\n");

			}
			out.flush();
			out.close();
			System.out.println("종료합니다");
		} catch(Exception e) {
			
		}
	}
}
