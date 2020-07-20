package Ch20;

class cloneT implements Cloneable { 
	// clone()������ؼ��� cloneable �������̽���  �ݵ�� �����ؾ��Ѵ�
	
	private int x;
	private int y;
	
	cloneT(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void showXY() {
		System.out.println("x="+this.x+", y="+this.y);
	}
	
	@Override													// clone()�ż��� ������(�������̵�)
	public Object clone() throws CloneNotSupportedException{	//clone()�ż��带 ����Ҷ� �߻��� ���ִ� ���� ó��
		return super.clone();									//���α׷� �����߿� ������ �ʵ��� ������ ���� �� �ִ� �κп� Ư�� �ڵ带 ����
		} 
	
}
public class C04CloneMethod {
	public static void main(String[] args) throws CloneNotSupportedException {
		cloneT test1 = new cloneT(10,20);
		cloneT copytest1 = (cloneT)test1.clone(); // ��ü ���� �Լ��� ���� ���� �� ����ȯ
	}
}