package Ch11;
public class C08ArrObjectCopy {

	public static void main(String[] args) {
		C06Book[ ]bookArray1 = new C06Book[3];
		C06Book[ ]bookArray2 = new C06Book[3];

		bookArray1[0] = new C06Book("�¹���","������");
		bookArray1[1] = new C06Book("�츣�� �켼","���̾�");
		bookArray1[2] = new C06Book("��� �� ���ΰ�","���ù�");
		
		//��������==�ν��Ͻ��� �ּҰ��� ����
		//				�迭,	������ġ, �迭, ������ġ, ����
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		
		for(int i=0;i<bookArray2.length;i++) {
			bookArray2[i].showBookInfo();
		}
		
		System.out.println(bookArray1[0] == bookArray2[0]);
		System.out.println(bookArray1[1] == bookArray2[1]);
		System.out.println(bookArray1[2] == bookArray2[2]);
	}

}
