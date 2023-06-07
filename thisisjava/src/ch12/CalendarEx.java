package ch12;

import java.util.Calendar;

public class CalendarEx {

	public static void main(String[] args) {
		// 두날짜 사이의 간격
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		
		cal1.set(2023, 6, 1);
		cal2.set(2023, 6, 12);
		
		long diff = cal2.getTimeInMillis() - cal1.getTimeInMillis();
		System.out.println(diff/1000/(60*60*24));
		
	}

}








