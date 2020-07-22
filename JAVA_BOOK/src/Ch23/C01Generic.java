package Ch23;
class Corn {
	private Object obj;
	public Object get() {
		return obj;
		
	}
	public void set(Object obj) {
		this.obj = obj;
	}
}
public class C01Generic {
	public static void main(String[] args) {
		Corn con1 = new Corn();
		con1.set("콘");
		String test1 = (String)con1.get(); // 다운캐스팅
		System.out.println(test1);
		
		Corn con2 = new Corn();
		con2.set(123);
		String test2 = (String)con2.get(); // 다운캐스팅
		System.out.println(test2);
		
		// 번거롭게 변수형에 따라 다운캐스팅을 각각해줘야함
		// 해결방법: 제네릭 사용
		
	}
}
