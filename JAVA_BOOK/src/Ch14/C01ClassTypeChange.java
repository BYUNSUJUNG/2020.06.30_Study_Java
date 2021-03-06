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
		// 업캐스트
		
		// up.z는 출력할 수 없다
		// 객체는 존재하나 참조변수 up가 up.z를 가르킬 수 없기 때문
		Point2D up = new Point3D();
		System.out.println(up.x+","+up.y);
		
		// 다운캐스트
		// Point3D down = new Point2D(); // 컴파일에러
		// Point3D down = (Point3D) new Point2D(); // 실행에러
		
		// 다운캐스트를 하기 위해서는
		// 업캐스트을 한 후, 다운캐스팅을 해야한다.
		
		Point2D up2 = new Point3D();
		Point3D down = (Point3D) up2;
		
		down.x=100;
		down.y=100;
		down.z=100;
		System.out.println(down.x+","+down.y+","+down.z);
		
	}
}
