package com.fastlib.www;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.sql.DataSource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SaveController {
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String edit(String cust_name, String phone, String join_date, String cust_email, String grade, User user, BindingResult result, Model m) throws Exception {
		System.out.println(cust_name);
		System.out.println(phone);
		System.out.println(join_date);
		System.out.println(cust_email);
		System.out.println(grade);
		System.out.println("-------------------------");
		// Debugging: 출력해서 확인해보기
		
		user.setCust_name(cust_name);
		user.setPhone(phone);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date utilDate;
        utilDate = sdf.parse(join_date);
        java.sql.Date newDate = new java.sql.Date(utilDate.getTime());
		user.setJoin_date(newDate);
		user.setCust_email(cust_email);
		user.setGrade(grade);
		
		System.out.println(user.toString());
        // 데이터 저장 로직을 호출하여 사용자 정보 저장
        int rowsAffected = insertUser(user);
        if (rowsAffected > 0) {
            return "redirect:/edit"; // 저장 후 등록 화면으로 리다이렉트
        } else {
            // 삽입이 실패한 경우에 대한 처리
            // 예를 들어 메시지를 설정하여 사용자에게 알림을 표시할 수 있습니다.
            m.addAttribute("errorMessage", "사용자 정보를 저장하는데 실패하였습니다.");
            return "redirect:/register/add";
        }
	}
	private DataSource ds;

    public SaveController(DataSource dataSource) {
        this.ds = dataSource;
    }

    public int insertUser(User user) throws Exception {
        Connection conn = ds.getConnection();

        String sql = "INSERT INTO member_tbl (cust_name, phone, join_date, cust_email, grade) values (?, ?, ?, ?, ?)";
        PreparedStatement pstat = conn.prepareStatement(sql);
        pstat.setString(1, user.getCust_name());
        pstat.setString(2, user.getPhone());
        pstat.setDate(3, new java.sql.Date(user.getJoin_date().getTime())); // Convert java.util.Date to java.sql.Date
        pstat.setString(4, user.getCust_email());
        pstat.setString(5, user.getGrade());

        return pstat.executeUpdate();
    }
    public void closeConnection(Connection conn, Statement stmt, ResultSet rs) {
        try {
            if (rs != null) {
                rs.close();
            }
            if (stmt != null) {
                stmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
	

	public String toDate() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	    return dateFormat.format(new Date());
	}
}