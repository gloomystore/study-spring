package com.fastlib.www;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.sql.DataSource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.Connection;

@Controller
@RequestMapping("/register")
public class RegisterController {
	private DataSource ds;

    public RegisterController(DataSource dataSource) {
        this.ds = dataSource;
    }

    @SuppressWarnings("resource")
	public int getNextCustNo() {
        int nextCustNo = 100001; // 기본값 설정

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            conn = ds.getConnection();
            stmt = conn.createStatement();

            String countQuery = "SELECT COUNT(*) FROM member_tbl";
            rs = stmt.executeQuery(countQuery);

            if (rs.next()) {
                int rowCount = rs.getInt(1);
                if (rowCount > 0) {
                    String maxCustNoQuery = "SELECT MAX(cust_no) FROM member_tbl";
                    rs = stmt.executeQuery(maxCustNoQuery);
                    if (rs.next()) {
                        nextCustNo = rs.getInt(1) + 1;
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            closeConnection(conn, stmt, rs);
        }

        return nextCustNo;
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
	

	@GetMapping("/add")
    public String register(Model model) {
        // 고객번호 자동 생성 (가장 최근 번호 + 1)
		System.out.println("add!!!!!!!");
		int nextCustNo = getNextCustNo(); // 이 메서드는 DB에서 가장 최근 고객번호를 가져오는 로직이어야 합니다.
        model.addAttribute("nextCustNo", nextCustNo);

        return "register";
    }

}
