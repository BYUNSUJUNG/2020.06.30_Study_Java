package Ch18;

public class C03VehicleExample {
	public static void main(String[] args) {
		C03Vehicle vehicle = new C03Bus();

		vehicle.run();
		//vehicle.checkFare(); //(x)

		C03Bus bus = (C03Bus) vehicle;  //媛뺤젣 ���엯蹂��솚

		bus.run();
		bus.checkFare();
	}
}
