package com.gloomystore.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

@Controller
public class YoilTellerMVC {
    // http://192.168.0.144:8081/getYoil?year=2022&month=11&day=12
    @RequestMapping("/getYoilMVC")
    public void getYoil(int year, int month, int day, HttpServletResponse res) throws IOException {
        String result = GoYoil(year, month, day);

        res.setContentType("text/html");
        res.setCharacterEncoding("UTF-8");
        PrintWriter out = res.getWriter();
        out.println(result);
    }

    public String GoYoil(int year, int month, int day) {
        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, day);

        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK); // 1:일요일, 2:월요일...
        char yoil = " 일월화수목금토".charAt(dayOfWeek);

        // 결과 문자열 생성
        String result = year + "년 " + month + "월 " + day + "일 " + yoil + "요일입니다. ";
        return result;
    }
}