package Ch24;

import java.util.*;

// List - Vector
// 멀티스레드 환경
//삭제시 index가 당겨짐 - 시간이 걸림

public class C02VectorTest {
	public static void main(String[] args) {
		List<C02Board> list = new Vector<C02Board>();
		
		list.add(new C02Board("제목1","내용1","글쓴이1"));
		list.add(new C02Board("제목2","내용2","글쓴이2"));
		list.add(new C02Board("제목3","내용3","글쓴이3"));
		list.add(new C02Board("제목4","내용4","글쓴이4"));
		list.add(new C02Board("제목5","내용5","글쓴이5"));
	
		
		list.remove(2);	
		
		for (int i = 0; i < list.size(); i++) {
			C02Board board = list.get(i);
			System.out.println(board.subject+"\t"+board.content+"\t"+board.writer);
		}
	}
}
