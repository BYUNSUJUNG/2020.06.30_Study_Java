package Ch20;

// StringBuilder���� �� ���� ���� StringBuffer
public class C07StringBufferTest {
	public static void main(String[] args) {
		String str1 = new String("java");
		
		StringBuffer builder = new StringBuffer(str1);

		builder.append(" and");
		builder.append(" Android");
		builder.append(" Programming is Fun");
		
		str1 = builder.toString();
		System.out.println(str1);
	}
}
