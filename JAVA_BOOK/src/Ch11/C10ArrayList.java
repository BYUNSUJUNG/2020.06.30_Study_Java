package Ch11;
import java.util.ArrayList;

public class C10ArrayList {

	public static void main(String[] args) {
		
		ArrayList<C06Book> library = new ArrayList<C06Book>();
		
		// 값 넣기
		library.add(new C06Book("태백산맥","조정래"));
		library.add(new C06Book("데미안","헤르만 헤세"));
		library.add(new C06Book("토지","박경리"));
		library.add(new C06Book("어린왕자","생택쥐페리"));
		
		// 값 가져오기
		for( int i = 0; i< library.size();i++) {
			C06Book book = library.get(i);
			book.showBookInfo();
		}
		System.out.println();

	}

}
