package Ch11;

public class C09ArrObjectCopy {

	public static void main(String[] args) {
		
		C06Book[ ]bookArray1 = new C06Book[3];
		C06Book[ ]bookArray2 = new C06Book[3];

		bookArray1[0] = new C06Book("태백산맥","조정래");
		bookArray1[1] = new C06Book("헤르만 헤세","데미안");
		bookArray1[2] = new C06Book("어떻게 살 것인가","유시민");
	
		bookArray2[0]= new C06Book();
		bookArray2[1]= new C06Book();
		bookArray2[2]= new C06Book();
		
		// 반복문 이용
		// getter로 얻은 값을 setter로 설정
		for(int i=0; i<bookArray2.length;i++)
		{
			bookArray2[i].setBookName(bookArray1[i].getBookName());
			bookArray2[i].setAuthor(bookArray1[i].getAuthor());
		}
		
		// 출력
		for(int i=0; i<bookArray2.length;i++)
			bookArray2[i].showBookInfo();
	}
}
