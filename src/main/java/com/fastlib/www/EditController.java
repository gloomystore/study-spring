package com.fastlib.www;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EditController {
	private DataSource ds;

    public EditController(DataSource dataSource) {
        this.ds = dataSource;
    }

    public List<User> getCustInfo() {
        List<User> userList = new ArrayList<>(); // 1. Create a list to store user data

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            conn = ds.getConnection();
            stmt = conn.createStatement();

            String countQuery = "SELECT COUNT(*) FROM member_tbl";
            rs = stmt.executeQuery(countQuery);
            rs.next();
            int count = rs.getInt(1);

            if (count > 0) {
                String selectQuery = "SELECT * FROM member_tbl"; // 2. Modify query to select all columns
                rs = stmt.executeQuery(selectQuery);

                while (rs.next()) {
                    User user = new User();
                    user.setCust_no(rs.getString("cust_no"));
                    user.setCust_name(rs.getString("cust_name"));
                    user.setPhone(rs.getString("phone"));
                    user.setJoin_date(rs.getDate("join_date"));
                    user.setCust_email(rs.getString("cust_email"));
                    user.setGrade(rs.getString("grade"));
                    userList.add(user); // 3. Add user to the list
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeConnection(conn, stmt, rs);
        }
        
        return userList; // 4. Return the list of users
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
    
    @RequestMapping(value = "/edit", method = RequestMethod.GET)
    public String edit(Model model) {
        List<User> userList = getCustInfo(); // Retrieve user list
        model.addAttribute("userList", userList); // Add user list to the model
        return "edit";
    }

    @RequestMapping(value = "/edit/{idx}", method = RequestMethod.GET)
    public String editIndividual(@PathVariable("idx") Long idx, Model model) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            conn = ds.getConnection();
            stmt = conn.createStatement();

            String selectQuery = "SELECT * FROM member_tbl WHERE cust_no = " + idx;
            rs = stmt.executeQuery(selectQuery);

            if (rs.next()) {
                User user = new User();
                user.setCust_no(rs.getString("cust_no"));
                user.setCust_name(rs.getString("cust_name"));
                user.setPhone(rs.getString("phone"));
                user.setJoin_date(rs.getDate("join_date"));
                user.setCust_email(rs.getString("cust_email"));
                user.setGrade(rs.getString("grade"));
                
                model.addAttribute("user", user); // Add the user object to the model
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeConnection(conn, stmt, rs);
        }

        return "editIndivisual";
    }
}