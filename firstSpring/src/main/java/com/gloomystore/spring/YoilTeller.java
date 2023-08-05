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
		// �Է�
		int yyyy = Integer.parseInt(year);
		int mm = Integer.parseInt(month);
		int dd = Integer.parseInt(day);

		// �۾�
		Calendar cal = Calendar.getInstance();
		cal.set(yyyy, mm - 1, dd);

		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK); // 1:�Ͽ���, 2:������...
		char yoil = " �Ͽ�ȭ�������".charAt(dayOfWeek);

		// ��� ���ڿ� ����
		String result = year + "�� " + month + "�� " + day + "�� " + yoil + "�����Դϴ�. ";
		return result;
	}
}