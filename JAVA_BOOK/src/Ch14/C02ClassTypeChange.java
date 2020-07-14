package Ch14;

class Shape {
	public double res = 0;
	public double area() {
		return res;
	}
	
}

class Circle extends Shape {
	public int r = 5;
	
	@Override
	public double area() {
		res = r*r*3.14;
		return res;
		
	}
}

class Rectangle extends Shape {
	public int w = 10;
	public int h = 10;
	
	@Override
	public double area() {
		res = w * h;
		return res;
	}
}
public class C02ClassTypeChange {
	public static void main(String[] args) {
		// 오버라이딩된 메소드를 상위 클래스가 사용할 때, 업캐스트를 한다.
		// 단, 상위 클래스에 해당 메소드가 있을 경우에만 가능
		Shape ref = null;
		ref = new Circle(); 
		System.out.println("도형의 면적"+ref.area());
	}
}
