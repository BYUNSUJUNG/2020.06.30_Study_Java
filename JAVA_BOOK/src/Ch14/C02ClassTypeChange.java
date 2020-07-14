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
		// �������̵��� �޼ҵ带 ���� Ŭ������ ����� ��, ��ĳ��Ʈ�� �Ѵ�.
		// ��, ���� Ŭ������ �ش� �޼ҵ尡 ���� ��쿡�� ����
		Shape ref = null;
		ref = new Circle(); 
		System.out.println("������ ����"+ref.area());
	}
}
