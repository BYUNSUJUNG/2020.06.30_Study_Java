package Ch09;

// �����ε�
public class C01MethodOver {
	// �ʵ�
	int x;
	int y;
	
	// �����Ϸ��� ����Ʈ �����ڸ� ������ش�
	// ���� �����ڵ� �����ε�����
	
	// public: ��� ��ü�� ���ٰ���
	// private: ���ο����� ���ٰ���
	
	// �޼���
	// �����ε�: �޼������ ���������� �Ű�����(�Ķ����)�� �ٸ� �޼���
	public int sum(int num) {
		this.y = num;
		return x+y;
	}
	
	public int sum(int n1, int n2) {
		this.x = n1;
		this.y = n2;
		return x+y;
	}
}
