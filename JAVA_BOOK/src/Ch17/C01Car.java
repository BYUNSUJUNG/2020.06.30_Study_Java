package Ch17;
//ĸ��ȭ
//ĸ��ȭ�� ���������� �����Ѵ�
//������ ���ۿ��� : ���� -> ���� -> ���� -> ���
public class C01Car {
	private void Induction() {
		System.out.println("���ָ� + ��������");
	}
	private void Compress() {
		System.out.println("����� ������ ���ÿ� �ǽ��� ���");
	}
	private void Power() {
		System.out.println("�ǽ��� �ϰ��� ���ÿ� ����");
	}
	private void Exhaust() {
		System.out.println("����� ����, ��Ⱑ�� ��������");
	}
	protected void Enginstart()
	{
		Induction();
		Compress();
		Power();
		Exhaust();
	}
}
