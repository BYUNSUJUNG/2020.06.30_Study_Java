package Ch12;

public class C09Final {
	int num = 10;
	// FIANL ������ ���ȭ
	final int NUM = 100;
	
	public static void main(String[] args) {
		C09Final cons = new C09Final();
		System.out.println(cons.num+","+cons.NUM);
		
		cons.num = 50;
		//cons.NUM = 200;
		System.out.println(cons.num+","+cons.NUM);
		
	}
}