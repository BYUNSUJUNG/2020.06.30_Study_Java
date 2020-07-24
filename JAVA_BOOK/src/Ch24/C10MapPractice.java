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
			System.out.println("1. ID/WD 저장");
			System.out.println("2. ID/WD 조회");
			System.out.println("3. ID/WD 삭제");
			System.out.println("==========MENU===========");
			System.out.print("번호 입력: ");
			num = scan.nextInt();
			scan.nextLine();
			
			switch(num) {
				case 1:	// ID/WD 저장
					System.out.print("아이디를 입력해주세요 : ");
					ID = scan.nextLine();
					System.out.print("비밀번호를 입력해주세요 : ");
					PW = scan.nextLine();
					
					map.put(ID,PW);
					break;
					
				case 2: // ID/WD 조회
					System.out.print("조회할 ID입력: ");
					ID = scan.nextLine();
					Set<String> keyset = map.keySet();
					Iterator<String> iterator = keyset.iterator();
					String tmpID;
					
					while (iterator.hasNext()) {
						tmpID = iterator.next();
						if(tmpID.equals(ID)) {
							System.out.println("해당 아이디가 존재합니다");
							break;
						} else {
							System.out.println("해당 아이디가 존재하지 않습니다");
						}
					}
					break;
				case 3:
					System.out.print("삭제할 ID입력: ");
					ID = scan.nextLine();
					Set<String> keyset2 = map.keySet();
					Iterator<String> iterator2 = keyset2.iterator();
					String tmpID2;
					
					while (iterator2.hasNext()) {
						tmpID2 = iterator2.next();
						if(tmpID2.equals(ID)) {
							map.remove(tmpID2);
							System.out.println("삭제완료!!");
							break;
						} else {
							System.out.println("해당 아이디가 존재하지 않습니다");
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
