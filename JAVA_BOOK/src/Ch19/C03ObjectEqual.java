package Ch19;

class A
{
	
}
//object 클래스의 equal()
public class C03ObjectEqual {

	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str1 == str2);		//주소 비교->false
		System.out.println(str1.equals(str2));	//값 비교 ->True

	}
}

// String 클래스는 equals가 값비교 재정의가 되어있다 
