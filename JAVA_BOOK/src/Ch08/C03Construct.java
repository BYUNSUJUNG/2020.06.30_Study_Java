package Ch08;

public class C03Construct {
	private int x;
	private int y;
	
	// 디폴트 생성자
	public C03Construct() {
		x=10;
		y=20;
	}
	
	public void showxy() {
		// 만들어진 이 현재의 객체 : this
		System.out.println(this.x);
		System.out.println(this.y);
	}



}
