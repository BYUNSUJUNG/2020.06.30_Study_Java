package Ch24;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class C10MapPractice {
	public static void main(String[] args) {
		Map<String,String> map = new HashMap();
		
		Scanner scan = new Scanner(System.in);
		int num;
		String ID, PW;
		while(true) {
			System.out.println("==========MENU===========");
			System.out.println("1. ID/WD ����");
			System.out.println("2. ID/WD ��ȸ");
			System.out.println("3. ID/WD ����");
			System.out.println("==========MENU===========");
			System.out.print("��ȣ �Է�: ");
			num = scan.nextInt();
			scan.nextLine();
			
			switch(num) {
				case 1:	// ID/WD ����
					System.out.print("���̵� �Է����ּ��� : ");
					ID = scan.nextLine();
					System.out.print("��й�ȣ�� �Է����ּ��� : ");
					PW = scan.nextLine();
					
					map.put(ID,PW);
					break;
					
				case 2: // ID/WD ��ȸ
					System.out.print("��ȸ�� ID�Է�: ");
					ID = scan.nextLine();
					Set<String> keyset = map.keySet();
					Iterator<String> iterator = keyset.iterator();
					String tmpID;
					
					while (iterator.hasNext()) {
						tmpID = iterator.next();
						if(tmpID.equals(ID)) {
							System.out.println("�ش� ���̵� �����մϴ�");
							break;
						} else {
							System.out.println("�ش� ���̵� �������� �ʽ��ϴ�");
						}
					}
					break;
				case 3:
					System.out.print("������ ID�Է�: ");
					ID = scan.nextLine();
					Set<String> keyset2 = map.keySet();
					Iterator<String> iterator2 = keyset2.iterator();
					String tmpID2;
					
					while (iterator2.hasNext()) {
						tmpID2 = iterator2.next();
						if(tmpID2.equals(ID)) {
							map.remove(tmpID2);
							System.out.println("�����Ϸ�!!");
							break;
						} else {
							System.out.println("�ش� ���̵� �������� �ʽ��ϴ�");
						}
					}
					break;
				case 4:
					break;
				default:
					break;
			}
			
		} // end of while
	} // end of main
}
