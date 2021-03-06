package Ch20;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class C09ClassTest {
	public static void main(String[] args) throws ClassNotFoundException {
		Class strClass = Class.forName("java.lang.String");
		
		
		
		Constructor[] cons = strClass.getConstructors();
		for (int i = 0; i < cons.length; i++) {
			System.out.println(cons[i]);
		}
		System.out.println("===============================");
		
		
		// 멤버변수 관련 필드
		Field[] fields = strClass.getFields();
		for (int i = 0; i < fields.length; i++) {
			System.out.println(fields[i]);
		}
		System.out.println();
		
		// 메서드 관련 필드
		Method[] methods = strClass.getMethods();
		for (int i = 0; i < methods.length; i++) {
			System.out.println(methods[i]);
		}
		System.out.println();
	}
}
