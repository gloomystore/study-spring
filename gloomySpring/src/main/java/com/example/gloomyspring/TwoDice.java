package com.gloomystore.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
public class TwoDice {
    @RequestMapping("/rollDice")
    public void main(HttpServletResponse res) throws IOException {
        int idx = (int)(Math.random() * 6) + 1;
        res.setContentType("text/html");
        res.setCharacterEncoding("utf-8");
        PrintWriter out = res.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("</head>");
        out.println("<body>");
        out.println("<img src='/resources/img/dice"+ idx +".jpg' />");
        out.println("</body>");
        out.println("</html>");
    }
}
