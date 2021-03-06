package Ch19;

class Book{
	int bookNumber;
	String bookTitle;

	Book(int bookNumber, String bookTitle){
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
 	}
	
	//toString() 오버라이딩(재정의)
	@Override							
	public String toString() {
		return bookTitle+","+bookNumber;
	}
	
}

public class C02ObjectToString {

	public static void main(String[] args) {
		Book book1 = new Book(200, "개미");

		// 똑같은 출력 값
		System.out.println(book1);				// 인스턴스 정보(클래스이름.주소값)
		System.out.println(book1.toString());	// toSting()매서드로 인스턴스 정보(클래스이름.주소값)를 보여줌 
	}
}
