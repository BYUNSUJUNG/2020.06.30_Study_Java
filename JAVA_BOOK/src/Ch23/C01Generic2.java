package Ch23;
class Corn2<T> {
	private T obj;
	public T get() {
		return obj;
		
	}
	public void set(T obj) {
		this.obj = obj;
	}
}
public class C01Generic2 {
	public static void main(String[] args) {
		/*
		Corn con1 = new Corn();
		con1.set("콘");
		String test1 = (String)con1.get(); // 다운캐스팅
		System.out.println(test1);
		
		Corn con2 = new Corn();
		con2.set(123);
		String test2 = (String)con2.get(); // 다운캐스팅
		System.out.println(test2);
		
		// 번거롭게 입력값에 따라 다운캐스팅을 각각해줘야함
		// 해결방법: 제네릭 사용
		*/
		
		// 제네릭은 객체만
		Corn2<String> con3 = new Corn2<String>();
		con3.set("팝콘");
		String test1 = con3.get();
		
		Corn2<Integer> con4 = new Corn2<Integer>();
		con4.set(1324);
		int num = con4.get();
		
		
	}
}
