package Ch14;
class Point2D {
	int x = 1;
	int y = 2;
	
}

class Point3D extends Point2D {
	int z = 3;
}

public class C01ClassTypeChange {
	public static void main(String[] args) {
		// ��ĳ��Ʈ
		
		// up.z�� ����� �� ����
		// ��ü�� �����ϳ� �������� up�� up.z�� ����ų �� ���� ����
		Point2D up = new Point3D();
		System.out.println(up.x+","+up.y);
		
		// �ٿ�ĳ��Ʈ
		// Point3D down = new Point2D(); // �����Ͽ���
		// Point3D down = (Point3D) new Point2D(); // ���࿡��
		
		// �ٿ�ĳ��Ʈ�� �ϱ� ���ؼ���
		// ��ĳ��Ʈ�� �� ��, �ٿ�ĳ������ �ؾ��Ѵ�.
		
		Point2D up2 = new Point3D();
		Point3D down = (Point3D) up2;
		
		down.x=100;
		down.y=100;
		down.z=100;
		System.out.println(down.x+","+down.y+","+down.z);
		
	}
}