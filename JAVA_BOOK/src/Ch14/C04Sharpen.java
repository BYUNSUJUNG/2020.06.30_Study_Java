package Ch14;

public class C04Sharpen extends C04MoonBanggu{
	
	public C04Sharpen() {
		if(SharpenCount>0) {
			SharpenCount--;
		}
		else {
			System.out.println("재고가 없습니다.");
		}
	} 
	void write() {
		System.out.println("샤프를 씁시다");
	}
}
