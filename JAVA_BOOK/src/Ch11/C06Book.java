package Ch11;

public class C06Book {
	private String bookName;
	private String author;
	
	// 디폴트 생성자
	public C06Book() {};
	
	// 생성자 오버로딩
	public C06Book(String bookName, String author) {
		this.bookName = bookName;
		this.author=author;
	}
	
	// 책 이름 getter
	public String getBookName() {
		return bookName;
	}
	// 작가 이름 getter
	public String getAuthor() {
		return author;
	}
	
	// 책 이름 setter
	public void setBookName(String bookName) {
		this.bookName=bookName;
	}
	
	// 작가 이름 setter
	public void setAuthor(String author) {
		this.author=author;
	}
	
	// 책 이름이랑 작가 이름 출력
	public void showBookInfo() {
		System.out.println(bookName+" , "+author);
	}
	
}
