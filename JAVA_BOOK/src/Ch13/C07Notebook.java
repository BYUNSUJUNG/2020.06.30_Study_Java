package Ch13;

public class C07Notebook extends C07Computer{
	
	private String Owner;
	static int ProductNumber = 1000;
	
	public C07Notebook() {
		ProductNumber++;
	}
	
	// Owner getter, setter
	public String getOwner() {
		return Owner;
	}

	public void setOwner(String owner) {
		Owner = owner;
	}
	
	// ProductNumber getter
	public static int getProductNumber() {
		return ProductNumber;
	}
	
	void move() {
		System.out.println("이동합니다");
	}
}
