package Ch08;

public class C02ClassMethod {
	// �Ӽ� == �ʵ�
	int x;
	int y;

	// ��� == �Լ� == �޼ҵ�
	int sum() {
		return x+y;
	}
	
	// �����ε�
	int sum(int n1, int n2) {
		x = n1;
		y = n2;
		return x+y;
	}
}
