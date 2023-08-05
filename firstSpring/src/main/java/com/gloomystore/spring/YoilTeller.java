package com.gloomystore.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

@Controller
public class YoilTeller {
	// http://192.168.0.144:8081/getYoil?year=2022&month=11&day=12
	@RequestMapping("/getYoil")
	public void getYoil(HttpServletRequest req, HttpServletResponse res) throws IOException {
		String year = req.getParameter("year");
		String month = req.getParameter("month");
		String day = req.getParameter("day");
		String result = GoYoil(year, month, day);

		res.setContentType("text/html");
		res.setCharacterEncoding("UTF-8");
		PrintWriter out = res.getWriter();
		out.println(result);
	}

	public String GoYoil(String year, String month, String day) {
		// 입력
		int yyyy = Integer.parseInt(year);
		int mm = Integer.parseInt(month);
		int dd = Integer.parseInt(day);

		// 작업
		Calendar cal = Calendar.getInstance();
		cal.set(yyyy, mm - 1, dd);

		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK); // 1:일요일, 2:월요일...
		char yoil = " 일월화수목금토".charAt(dayOfWeek);

		// 결과 문자열 생성
		String result = year + "년 " + month + "월 " + day + "일 " + yoil + "요일입니다. ";
		return result;
	}
}