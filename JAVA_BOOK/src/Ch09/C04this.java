package Ch09;

class BirthDay {
	// �ʵ�
	int day;
	int month;
	int year;
	
	// �޼���
	public void setYear(int year) {
		this.year = year;
		
	}
	
	public void printThis() {
		System.out.println(this);
	}
}

public class C04this {
	public static void main(String[] args) {
		
		// stack������ �������� bDay
		// heap������ day, month, year;
		BirthDay bDay = new BirthDay();
		bDay.setYear(2000);
		
		// this: �� ��ü�� �ּ�
		// stack���� ���������� ��ġ ���
		System.out.println(bDay);
		// heap���� ��ġ ���
		bDay.printThis();
	}
}
