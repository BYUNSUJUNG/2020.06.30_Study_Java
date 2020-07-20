package Ch18;

public class C04Driver {
	public void drive(C04Vehicle vehicle) {
		if(vehicle instanceof C04Bus) {
			C04Bus bus = (C04Bus) vehicle;
			bus.checkFare();
		}
		vehicle.run();
	}
}
