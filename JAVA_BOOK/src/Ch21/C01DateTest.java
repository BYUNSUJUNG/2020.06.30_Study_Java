package Ch21;

import java.text.SimpleDateFormat;
import java.util.Date;

// SimpleDateFormat
public class C01DateTest {
	public static void main(String[] args) {
		// �������� now, strNow1
		// Date�� ����ϸ� �ð��� �ٲ� ������ ��ü�� �����Ǿ� �޸𸮿� ��������
		// -> Ķ���� ���
		Date now = new Date();
		String strNow1 = now.toString();
		System.out.println(now);
		System.out.println(strNow1);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm�� ss��");

		String strNow2 = sdf.format(now);
		System.out.println(strNow2);
	}
}
