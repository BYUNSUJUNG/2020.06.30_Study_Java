package Ch07;

public class C06For {
	
	public static void main(String[] args) {
		int sum = 0;
		
		for (int i = 0; i < args.length; i++) {
			sum+=i;
		}
		System.out.println("1부터 10까지의 합은"+sum+"입니다");
	}
}