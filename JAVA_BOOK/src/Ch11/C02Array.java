package Ch11;

public class C02Array {
	public static void main(String[] args) {
		// �ʱ�ȭ
		int[] array = {85,90,75,100,95};
		int total = 0;
		double avg = 0;
		
		// total ���ϱ�
		for (int i = 0; i < array.length; i++) {
			total+=array[i];
		}
		// avg ���ϱ�
		avg = (double)total/array.length;
		// ���
		System.out.print("����: "+total+", ���: "+avg);
	}
}
