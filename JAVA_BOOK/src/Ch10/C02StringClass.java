package Ch10;

public class C02StringClass {
	public static void main(String[] args) {
		 int alength, blength; 
		 char achar, bchar; 
		 
		 String str1 = new String("java Powerful"); 
		 String str2 = new String("java Programming"); 
		 
		 // ���ڿ� ��ġ��
		 String str3 = str1 +", "+str2;
		 
		 // length(): ����
		 alength = str1.length();
		 blength = str2.length(); 
		 
		 // charAt(): String�� Ư�� index ���ڸ� ������ �� ����
		 // ���鵵 index�� ���Եȴ�.
		 // index�� 0���� ����
		 achar = str1.charAt(5);
		 bchar = str2.charAt(10); 

		 System.out.println(str1); 
		 System.out.println(str2); 
		 System.out.println(str3); 
		 
		 System.out.println("str1�� ���� = "+str1 + ",  ����= "+alength); 
		 System.out.println("str2�� ���� = "+str2 + ",  ����= "+blength);
		 
		 System.out.println("str1�� 5��° ���� = "+achar);
		 System.out.println("str2�� 10��° ���� = "+bchar);
		 
		 // toUpperCase(): �빮�ڷ� ��ȯ
		 System.out.println("str1�� �빮�ڷ� ��ȯ = "+str1.toUpperCase()); 
		 // replace('',''): ù��° ���ڰ��� �ι�° ���ڰ����� �ٲ�
		 System.out.println("str2�� a�� A�� ��ȯ = "+str2.replace('a','A')); 
		 
	}
}