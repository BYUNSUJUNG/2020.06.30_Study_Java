package Ch11;

public class C09ArrObjectCopy {

	public static void main(String[] args) {
		
		C06Book[ ]bookArray1 = new C06Book[3];
		C06Book[ ]bookArray2 = new C06Book[3];

		bookArray1[0] = new C06Book("�¹���","������");
		bookArray1[1] = new C06Book("�츣�� �켼","���̾�");
		bookArray1[2] = new C06Book("��� �� ���ΰ�","���ù�");
	
		bookArray2[0]= new C06Book();
		bookArray2[1]= new C06Book();
		bookArray2[2]= new C06Book();
		
		// �ݺ��� �̿�
		// getter�� ���� ���� setter�� ����
		for(int i=0; i<bookArray2.length;i++)
		{
			bookArray2[i].setBookName(bookArray1[i].getBookName());
			bookArray2[i].setAuthor(bookArray1[i].getAuthor());
		}
		
		// ���
		for(int i=0; i<bookArray2.length;i++)
			bookArray2[i].showBookInfo();
	}
}