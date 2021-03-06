package Ch20;

class cloneT implements Cloneable { 
	// clone()사용위해서는 cloneable 인터페이스를  반드시 구현해야한다
	
	private int x;
	private int y;
	
	cloneT(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void showXY() {
		System.out.println("x="+this.x+", y="+this.y);
	}
	
	@Override													// clone()매서드 재정의(오버라이딩)
	public Object clone() throws CloneNotSupportedException{	//clone()매서드를 사용할때 발생할 수있는 예외 처리
		return super.clone();									//프로그램 실행중에 멈추지 않도록 오류가 생길 수 있는 부분에 특정 코드를 구현
		} 
	
}
public class C04CloneMethod {
	public static void main(String[] args) throws CloneNotSupportedException {
		cloneT test1 = new cloneT(10,20);
		cloneT copytest1 = (cloneT)test1.clone(); // 객체 복사 함수를 통한 복사 후 형변환
	}
}
