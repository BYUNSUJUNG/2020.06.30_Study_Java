package Ch11;

public class C01Array {
	public static void main(String[] args) {
		// 배열의 참조변수 생성과 인스턴스(객체) 생성를 동시에
		int[] arr1 = new int[5];
		double[] arr2 = new double[7];
		
		// 배열의 참조변수와 인스턴스(객체) 생성 분리
		float[] arr3;
		arr3 = new float[9];
		
		System.out.println("arr1 배열의 길이: "+arr1.length);
		System.out.println("arr2 배열의 길이: "+arr2.length);
		System.out.println("arr3 배열의 길이: "+arr3.length);
		
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		arr1[3] = 40;
		arr1[4] = 50;
		
		int i = 0;
		while (i<arr1.length) {
			System.out.println(arr1[i]);
			i++;
		}
		
	}
}
