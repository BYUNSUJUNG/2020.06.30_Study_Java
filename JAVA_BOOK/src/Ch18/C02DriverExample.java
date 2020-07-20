package Ch18;

public class C02DriverExample {
	public static void main(String[] args) {
		C02Driver driver = new C02Driver();
		
		C02Bus bus = new C02Bus();
		C02Taxi taxi = new C02Taxi();
		
		driver.drive(bus);
		driver.drive(taxi);
	}
}
