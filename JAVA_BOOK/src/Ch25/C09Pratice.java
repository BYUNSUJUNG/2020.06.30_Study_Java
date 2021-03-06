package Ch25;

import java.io.FileWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

// Scanner로 ID와 PW를 받아서 HashMap에 저장후
// 저장된 ID와 PW를 C:/temp/Account.txt에 저장

//ID: aaaa, PW:1111
//ID: bbbb, PW:2222
//ID: cccc, PW:3333
//ID: dddd, PW:4444

public class C09Pratice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, String> map = new HashMap();
		
		String ID = null;
		String PW = null;
		// 입력받기
		while(true) {
			System.out.print("ID입력 (종료:q): ");
			ID = sc.nextLine();
			if(ID.equals("q")) {
				break;
			}
			System.out.print("PW입력 (종료:q): ");
			PW = sc.nextLine();
			if(PW.equals("q")) {
				break;
			}
			// 객체추가
			map.put(ID,PW);
		}
		
		try { 
			Writer out = new FileWriter("c:/temp/Account.txt");
			Set<String> set = map.keySet();
			Iterator<String> iter = set.iterator();
			while(iter.hasNext()) {
				ID = iter.next();
				PW = map.get(ID);
				out.write("ID: "+ID+", PW:"+PW+"\n");
				out.flush();
				
			}
			System.out.println("종료");
			out.close();
			sc.close();
			
			
		} catch(Exception e) {
			
		}
	}
}
