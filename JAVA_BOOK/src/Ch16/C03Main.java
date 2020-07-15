package Ch16;

public class C03Main {
		public static void main(String[] args) {
			C03MyClass Kim = new C03MyClass(new C01Audio());
			Kim.DefaultSet();
			Kim.PowerOff();
			
			C03MyClass Lee = new C03MyClass(new C02SmartTV());
			Lee.DefaultSet();
			Lee.PowerOff();
		}
}
