package Ch22;

public class C02ArrayIndexException {
	public static void main(String[] args) {
		
		// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
		//	at Ch22.C02ArrayIndexException.main(C02ArrayIndexException.java:8)

		try {
			int[] arr = {10,20,30};
			
			for (int i = 0; i < 4; i++) {
				System.out.println(arr[i]);
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("���ܹ߻��� ó���Ǵ� ����ڵ�");
		} finally {
			System.out.println("���ܹ߻��ϴ� ���ϴ� ����Ǵ� �ڵ�");
		}
		System.out.println("����ó�� ���� ��� �ڵ�");
	}
}
