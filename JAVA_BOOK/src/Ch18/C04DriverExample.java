package Ch18;

public class C04DriverExample {
	public static void main(String[] args) {
		C04Driver driver = new C04Driver();
		
		C04Bus bus = new C04Bus();
		C04Taxi taxi = new C04Taxi();
		
		driver.drive(bus);
		driver.drive(taxi);
	}
}
