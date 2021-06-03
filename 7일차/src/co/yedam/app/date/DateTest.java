package co.yedam.app.date;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {

		Date date = new Date();
		
		Calendar calendar = Calendar.getInstance();

		System.out.println(calendar.get(Calendar.MONTH));
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		int day_year = calendar.get(Calendar.DAY_OF_YEAR);
		int hour = calendar.get(Calendar.HOUR);
		int minute = calendar.get(Calendar.MINUTE);
		int second = calendar.get(Calendar.SECOND);

		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
		System.out.println(day_year);
		System.out.println(hour);
		System.out.println(minute);
		System.out.println(second);

		System.out.println(calendar);
		System.out.println(System.currentTimeMillis());
		//살아온날 일수 계산
//		Calendar birth = Calendar.getInstance();
//		birth.set(1994, 11, 24);
//		long dur = calendar.getTimeInMillis() - birth.getTimeInMillis();
//		dur = dur / 1000 / 60 / 60 / 24;
//		System.out.println("일수:" + dur);

		// 기념일 계산
		Calendar s = Calendar.getInstance();
		s.set(2021, 11, 24);
		long d = s.getTimeInMillis() - calendar.getTimeInMillis();
		d = d / 1000 / 60 / 60 / 24;
		System.out.println("앞으로 내생일은 " + d + "일 남았다!");

		// 기념일 계산
		LocalDate currentDate = LocalDate.now();
		System.out
				.println(currentDate.getYear() + "/" + currentDate.getMonthValue() + "/" + currentDate.getDayOfMonth());

		System.out.println(currentDate.plusDays(100));

		LocalTime start = LocalTime.of(10, 35, 40);
		LocalTime end = LocalTime.of(10, 36, 50, 800);

		Duration duration = Duration.between(start, end);

		System.out.println("Seconds:" + duration.getSeconds());
		System.out.println("Nano Seconds:" + duration.getNano());

		// Date -> String
		// SimpleDateFormat df= new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z");
		// System.out.println(df.format(calendar.getTime()));
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd-E");
		System.out.println(df.format(calendar.getTime()));
		
		
	}

}
