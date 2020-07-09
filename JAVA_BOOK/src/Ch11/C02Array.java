package Ch11;

public class C02Array {
	public static void main(String[] args) {
		// 초기화
		int[] array = {85,90,75,100,95};
		int total = 0;
		double avg = 0;
		
		// total 구하기
		for (int i = 0; i < array.length; i++) {
			total+=array[i];
		}
		// avg 구하기
		avg = (double)total/array.length;
		// 출력
		System.out.print("총합: "+total+", 평균: "+avg);
	}
}
