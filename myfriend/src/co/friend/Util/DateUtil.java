package co.friend.Util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {
	static String format = "yyyy-MM-dd";

	// Date->String
	public static String dateToStr(Date date) {
		SimpleDateFormat df = new SimpleDateFormat(format);
		String s = df.format(date);
		return s;
	}

	public static String dateToStr(Date date, String format) {
		SimpleDateFormat df = new SimpleDateFormat(format);
		String s = df.format(date);
		return s;
	}

	// 두 날짜 사이의 일수계산
	public static long durationDay(String s1, String s2) {
		SimpleDateFormat df = new SimpleDateFormat(format);
		long result = 0;
		try {
			Date d1 = df.parse(s1);
			Date d2 = df.parse(s2);
			result = d1.getTime() - d2.getTime();
			result = result / 1000 / 60 / 60 / 24;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return result;
	}

	public static long durationDay(Date d1, Date d2) {

		long result = 0;
		result = d1.getTime() - d2.getTime();
		result = result / 1000 / 60 / 60 / 24;
		return result;
	}
	
	//마지막날짜 구하기
	public static int lastDay(int year, int month) {
		Calendar cal = Calendar.getInstance();
		cal.set(year, month - 1, 1);
		int lastDay = cal.getActualMaximum(Calendar.DATE);

		return lastDay;

	}
}
