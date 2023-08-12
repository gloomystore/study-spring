package com.fastlib.www;

import java.sql.Connection;
import java.sql.PreparedStatement;

import java.text.SimpleDateFormat;

import javax.sql.DataSource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EditController2 {
	private DataSource ds;

    public EditController2(DataSource dataSource) {
        this.ds = dataSource;
    }
	@RequestMapping(value = "/editComplete", method = RequestMethod.POST)
	public String edit2(String cust_no, String cust_name, String phone, String join_date, String cust_email, String grade, User user, BindingResult result, Model m) throws Exception {
	    user.setCust_name(cust_name);
	    user.setPhone(phone);
	    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	    java.util.Date utilDate = sdf.parse(join_date);
	    java.sql.Date newDate = new java.sql.Date(utilDate.getTime());
	    user.setJoin_date(newDate);
	    user.setCust_email(cust_email);
	    user.setGrade(grade);
	    System.out.println("edit2 progress!!!!!!!!!!!!!");
	    int rowsAffected = updateUser(user); // Call the update method
	    if (rowsAffected > 0) {
	        return "redirect:/edit"; // Redirect to edit page after updating
	    } else {
	        m.addAttribute("errorMessage", "사용자 정보를 수정하는데 실패하였습니다.");
	        return "redirect:/edit"; // Redirect to edit page with an error message
	    }
	}

	public int updateUser(User user) throws Exception {
	    Connection conn = ds.getConnection();

	    String sql = "UPDATE member_tbl SET cust_name=?, phone=?, join_date=?, cust_email=?, grade=? WHERE cust_no=?";
	    PreparedStatement pstat = conn.prepareStatement(sql);
	    pstat.setString(1, user.getCust_name());
	    pstat.setString(2, user.getPhone());
	    pstat.setDate(3, new java.sql.Date(user.getJoin_date().getTime()));
	    pstat.setString(4, user.getCust_email());
	    pstat.setString(5, user.getGrade());
	    pstat.setString(6, user.getCust_no());

	    return pstat.executeUpdate();
	}

}