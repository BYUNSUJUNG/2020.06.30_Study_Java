package Ch13;

public class C06Main extends C06Car {

	public static void main(String[] args) {
		C06SuperCar sc = new C06SuperCar();
		
		sc.accelMethod();
		sc.accelMethod();
		sc.showMethod();
		
		sc.breakMethod();
		sc.showMethod();
		
		sc.Open();
	}

}
