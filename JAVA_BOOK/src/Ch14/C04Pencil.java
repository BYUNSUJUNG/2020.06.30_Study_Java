package Ch14;

public class C04Pencil extends C04MoonBanggu {
	
	public C04Pencil() {
		if(PencilCount>0) {
			PencilCount--;
		}
		else {
			System.out.println("재고가 없습니다.");
			// System.exit(0); // 프로그램 종료
		}
	}
	void write() {
		System.out.println("연필를 씁시다");
	}
}
