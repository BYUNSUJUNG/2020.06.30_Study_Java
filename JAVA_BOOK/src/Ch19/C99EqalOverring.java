package Ch19;

class C99MyData{
	int num;

	public boolean equals(Object obj){		// equals 재정의
		if(obj instanceof C99MyData)
		{
			C99MyData tmp=(C99MyData)obj;
			return this.num==tmp.num;
		}
		else
		{
			return false;
		}
	}
}

public class C99EqalOverring {
	public static void main(String[] args) {
		C99MyData data1 = new C99MyData();
		C99MyData data2 = new C99MyData();
		data1.num=20;
		data2.num=20;
		
		System.out.println("data1의 HashCode: "+data1.hashCode());
		System.out.println("data2의 HashCode: "+data2.hashCode());
		System.out.println(data1.equals(data2));
		
		
	}

}
