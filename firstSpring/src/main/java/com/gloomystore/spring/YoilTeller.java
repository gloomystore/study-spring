package com.gloomystore.spring;

import java.util.Calendar;

public class YoilTeller {
	public static void main(String[] args) {
		String[] arguments = {"2023", "12", "12"};
		GoYoil({"2023", "12", "12"});
	}
	public static void GoYoil(String[] args) {
		// 입력
		String year = args[0];
		String month = args[1];
		String day = args[2];

		int yyyy = Integer.parseInt(year);
		int mm = Integer.parseInt(month);
		int dd = Integer.parseInt(day);

		//작업
		Calendar cal = Calendar.getInstance();
		cal.set(yyyy, mm - 1, dd);

		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK); // 1:일요일, 2:월요일...
		char yoil = " 일월화수목금토".charAt(dayOfWeek);

		// 출력
		System.out.println(year + "년 " + month + "월 " + day + "일 ");
		System.out.println(yoil + "요일입니다. ");
	}

}
