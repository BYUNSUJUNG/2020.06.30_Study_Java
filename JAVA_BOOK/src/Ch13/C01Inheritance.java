package Ch13;

class Point2D {
	// �Ӽ�
	public int x;
	public int y;
	// ���
	public void showPoint() {
		System.out.println(x+","+y);
	}
}

// ���
class Point3D extends Point2D {
	// �Ӽ�(�ʵ�)
	public int z;
	// ���
	//	public void showPoint3D() {
	//		System.out.println(x+","+y+","+z);
	//	}
	
	public void showPoint3D()
	{	//  ����Ŭ���� ��
		super.showPoint();
		System.out.println(","+z);
	}
}

// ���
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