package Ch21;

import java.text.SimpleDateFormat;
import java.util.Date;

// SimpleDateFormat
public class C01DateTest {
	public static void main(String[] args) {
		// 참조변수 now, strNow1
		// Date를 사용하면 시간이 바뀔 때마다 객체가 생성되어 메모리에 좋지않음
		// -> 캘린더 사용
		Date now = new Date();
		String strNow1 = now.toString();
		System.out.println(now);
		System.out.println(strNow1);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");

		String strNow2 = sdf.format(now);
		System.out.println(strNow2);
	}
}
