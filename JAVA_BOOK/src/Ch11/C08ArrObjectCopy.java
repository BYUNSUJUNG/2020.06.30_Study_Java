package Ch11;
public class C08ArrObjectCopy {

	public static void main(String[] args) {
		C06Book[ ]bookArray1 = new C06Book[3];
		C06Book[ ]bookArray2 = new C06Book[3];

		bookArray1[0] = new C06Book("태백산맥","조정래");
		bookArray1[1] = new C06Book("헤르만 헤세","데미안");
		bookArray1[2] = new C06Book("어떻게 살 것인가","유시민");
		
		//얕은복사==인스턴스의 주소값만 복사
		//				배열,	시작위치, 배열, 시작위치, 개수
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		
		for(int i=0;i<bookArray2.length;i++) {
			bookArray2[i].showBookInfo();
		}
		
		System.out.println(bookArray1[0] == bookArray2[0]);
		System.out.println(bookArray1[1] == bookArray2[1]);
		System.out.println(bookArray1[2] == bookArray2[2]);
	}

}
