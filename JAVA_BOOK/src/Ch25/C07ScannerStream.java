package Ch25;

import java.io.*;
import java.util.Scanner;

// Scanner �� �Է� �ޱ�
public class C07ScannerStream {
	public static void main(String[] args) {
		
		try {
			Scanner scan = new Scanner(System.in);
			Writer out = new FileWriter("c:/temp/test5.txt");
			
			String tmp = null;
			while(true) {
				System.out.printf("���ڿ��� �Է��ϼ��� : ");
				tmp = scan.nextLine();
				if(tmp.equals("q")) break;
				out.append(tmp);

				out.flush();
				out.close();
			}
		} catch(Exception e) {
			
		}
		
	}
}