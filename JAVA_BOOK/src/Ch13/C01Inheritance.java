package Ch13;

class Point2D {
	// 속성
	public int x;
	public int y;
	// 기능
	public void showPoint() {
		System.out.println(x+","+y);
	}
}

// 상속
class Point3D extends Point2D {
	// 속성(필드)
	public int z;
	// 기능
	//	public void showPoint3D() {
	//		System.out.println(x+","+y+","+z);
	//	}
	
	public void showPoint3D()
	{	//  상위클래스 상
		super.showPoint();
		System.out.println(","+z);
	}
}

// 상속
public class C01Inheritance {
	public static void main(String[] args) {
		Point3D pt = new Point3D();
		pt.x = 10;
		pt.y = 20;
		pt.z = 30;

		System.out.println(pt.x+","+pt.y+","+pt.z);
		pt.showPoint();
		pt.showPoint3D();
		
	}
}
