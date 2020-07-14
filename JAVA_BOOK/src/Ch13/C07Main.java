package Ch13;

// C07Computer
// PowerOn(), PowerOff()

// C07Notebook 
// getOwner(), getProductNumber(), move()

// C07Tablet
// setPenNumber(), Write()

public class C07Main {

	public static void main(String[] args) {
			C07Notebook Kim = new C07Notebook();
			Kim.setOwner("김성주");
			System.out.println("소유자: "+Kim.getOwner()+", PN: "+Kim.getProductNumber());
			Kim.PowerOn();
			Kim.move(); // Notebook
			Kim.PowerOn();
			
			C07Tablet Lee = new C07Tablet();
			Lee.setOwner("이승기");
			System.out.println("소유자: "+Lee.getOwner()+", PN: "+Lee.getProductNumber());
			Lee.setPenNumber("1-2-3-4");
			Lee.PowerOn();
			Lee.move();  // Notebook
			Lee.Write(); // Tablet
			Lee.PowerOff();

	}

}
