package Ch24;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class C099Test {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List <String> list = new LinkedList<String>();
		String sInput = "";
				
		for (int i = 0; ; i++) {
			System.out.print("���ڿ��� �Է��ϼ���(����:quit): ");
			sInput=scan.nextLine();
			if(sInput.equals("quit")) break; // quit �Է½� �ݺ��� ����
			list.add(sInput); // ����Ʈ�� �� ����
		}
		System.out.println("-------���ڿ� ���---------");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i+" "+list.get(i));
		}
	}
	
}