package Ch21;

import java.util.Calendar;

public class C02Calendar {
	public static void main(String[] args) {
		// getInstance()는 클래스 이름으로 접근이 가능한 static메서드이다
		Calendar now = Calendar.getInstance();
		
		// 년, 월, 일
		int year = now.get(Calendar.YEAR);
		// MONTH는 0부터 시작해서 +1해주기
		int month = now.get(Calendar.MONTH)+1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		System.out.println(year+","+month+","+day);
		
		
		// 요일
		// DAY_OF_WEEK는 일요일부터 1
		int week = now.get(Calendar.DAY_OF_WEEK);
		System.out.println(week);
		
		String strWeek = "";
		
		switch(week) {
			case Calendar.MONDAY:
				strWeek="월";
				break;
			case Calendar.TUESDAY:
				strWeek="화";
				break;
			case Calendar.WEDNESDAY:
				strWeek="수";
				break;
			case Calendar.THURSDAY:
				strWeek="목";
				break;
			case Calendar.FRIDAY:
				strWeek="금";
				break;
			case Calendar.SATURDAY:
				strWeek="토";
				break;
			case Calendar.SUNDAY:
				strWeek="일";
				break;
		}
		System.out.println(strWeek);
		
		
		// 오전 오후 출력
		int ampm = now.get(Calendar.AM_PM);
		String strAmPm = null;
		if(ampm == Calendar.AM) {
			strAmPm = "오전";
		} else {
			strAmPm = "오후";
		}
		System.out.println(strAmPm);
		
		
		// 시, 분, 초
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);

		
		// 모두 출력
		System.out.printf(year+"년 ");
		System.out.printf(month+"월 ");
		System.out.printf(day+"일 ");
		System.out.printf(strAmPm+" ");
		System.out.printf(hour+"시 ");
		System.out.printf(minute+"분 ");
		System.out.printf(second+"초 ");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
