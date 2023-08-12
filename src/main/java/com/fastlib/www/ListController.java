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
public class ListController {
    private DataSource ds;

    public ListController(DataSource dataSource) {
        this.ds = dataSource;
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String showRentList(Model model) {
        List<RentInfo> rentList = getRentInfoList();
        System.out.println(rentList.toString());
        model.addAttribute("rentList", rentList); 
        return "list";
    }

    public List<RentInfo> getRentInfoList() {
        List<RentInfo> rentList = new ArrayList<>(); 

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            conn = ds.getConnection();
            stmt = conn.createStatement();

            String selectQuery = "SELECT r.cust_no, r.rent_no, r.book_code, r.rent_price, r.rent_date, m.cust_name " +
                                 "FROM rent_tbl r " +
                                 "JOIN member_tbl m ON r.cust_no = m.cust_no";
            rs = stmt.executeQuery(selectQuery);

            while (rs.next()) {
                RentInfo rentInfo = new RentInfo();
                rentInfo.setCust_no(rs.getString("cust_no"));
                rentInfo.setRent_no(rs.getString("rent_no"));
                rentInfo.setBook_code(rs.getString("book_code"));
                rentInfo.setRent_price(rs.getInt("rent_price"));
                rentInfo.setRent_date(rs.getDate("rent_date"));
                rentInfo.setCust_name(rs.getString("cust_name"));
                rentList.add(rentInfo); 
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeConnection(conn, stmt, rs);
        }

        return rentList; 
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