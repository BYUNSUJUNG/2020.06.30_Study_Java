package Ch24;

import java.util.*;

class C07Student {
	// 필드
	String name;
	int id;
	
	// 생성자
	C07Student(String name, int age) {
		this.name = name;
		this.id = id;
	}
}

public class C07HashSetTest {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Set<C07Student> set = new HashSet();
		
		String name;
		int id;
		
		// 5명의 이름과 학번를 입력
		for (int i = 0; i < 5; i++) {
			// 이름
			System.out.print("이름: ");
			name = scan.nextLine();
			// 학번
			System.out.print("학번: ");
			id = scan.nextInt();
			scan.nextLine(); // 입력 버퍼 공간 초기화
			set.add(new C07Student(name,id));
		}
		
		System.out.println("입력이 끝났습니다");

		System.out.print("이름 검색: ");
		name = scan.nextLine();
		
		// 인덱스가 없어서 반복자를 사용하여 출력
		Iterator<C07Student> iterator = set.iterator();
		C07Student tmp = null;
		while (iterator.hasNext()) {
			tmp = iterator.next();
			if(tmp.name.equals(name)) {
				System.out.println(tmp.name+"님의 학번은"+tmp.id+"입니다");
				System.exit(0);
			}
			
		}
		System.out.println("해당 이름이 검색되지 않습니다");
		
	}
}
