package com.fastlib.www;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Controller
public class RentFeeController {
    private DataSource ds;

    public RentFeeController(DataSource dataSource) {
        this.ds = dataSource;
    }

    @RequestMapping(value = "/rentFee", method = RequestMethod.GET)
    public String showRentFeeList(Model model) {
        List<RentFeeInfo> rentFeeList = getRentFeeInfoList(); // Retrieve rent fee information list
        model.addAttribute("rentFeeList", rentFeeList); // Add rent fee information list to the model
        return "rentFee";
    }

    public List<RentFeeInfo> getRentFeeInfoList() {
        List<RentFeeInfo> rentFeeList = new ArrayList<>(); // Create a list to store rent fee information

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            conn = ds.getConnection();
            stmt = conn.createStatement();

            String selectQuery = "SELECT r.cust_no, m.cust_name, m.grade, SUM(r.rent_price) AS total_rent_fee " +
                                 "FROM rent_tbl r " +
                                 "JOIN member_tbl m ON r.cust_no = m.cust_no " +
                                 "GROUP BY r.cust_no, m.cust_name, m.grade";
            rs = stmt.executeQuery(selectQuery);

            while (rs.next()) {
                RentFeeInfo rentFeeInfo = new RentFeeInfo();
                rentFeeInfo.setCust_no(rs.getString("cust_no"));
                rentFeeInfo.setCust_name(rs.getString("cust_name"));
                rentFeeInfo.setGrade(rs.getString("grade"));
                rentFeeInfo.setTotal_rent_fee(rs.getInt("total_rent_fee"));
                rentFeeList.add(rentFeeInfo); // Add rent fee information to the list
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeConnection(conn, stmt, rs);
        }

        return rentFeeList; // Return the list of rent fee information
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
}