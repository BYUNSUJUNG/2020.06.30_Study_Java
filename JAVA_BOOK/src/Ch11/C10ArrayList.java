package Ch11;
import java.util.ArrayList;

public class C10ArrayList {

	public static void main(String[] args) {
		
		ArrayList<C06Book> library = new ArrayList<C06Book>();
		
		// �� �ֱ�
		library.add(new C06Book("�¹���","������"));
		library.add(new C06Book("���̾�","�츣�� �켼"));
		library.add(new C06Book("����","�ڰ渮"));
		library.add(new C06Book("�����","�������丮"));
		
		// �� ��������
		for( int i = 0; i< library.size();i++) {
			C06Book book = library.get(i);
			book.showBookInfo();
		}
		System.out.println();

	}

}
