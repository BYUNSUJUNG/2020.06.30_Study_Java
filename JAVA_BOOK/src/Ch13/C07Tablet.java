package Ch13;

public class C07Tablet extends C07Notebook {
	
	private String PenNumber;
	
	// PenNumber getter, setter
	public String getPenNumber() {
		return PenNumber;
	}

	public void setPenNumber(String penNumber) {
		PenNumber = penNumber;
	}

	void Write() {
		System.out.println("���� ���ϴ�");
	}
}
