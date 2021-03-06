package Ch24;

public class C09Student {
	String name;
	int id;
	C09Student(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	// 메서드 재정의
	public boolean equals(Object obj) {
		if(obj instanceof C09Student) {
			C09Student tmp = (C09Student)obj;
			if(name.equals(tmp.name)&&(id==tmp.id)) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}
	// hashCode 메서드 재정의
	public int hashCode() {
		return id+name.hashCode();
	}
	
}
