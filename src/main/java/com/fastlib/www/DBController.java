package com.fastlib.www;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

public class DBController {

    private DataSource ds;

    public DBController(DataSource dataSource) {
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
    public int getNextCustNo() {
        int nextCustNo = 100001; // 기본값 설정

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
        	conn = ds.getConnection();
            stmt = conn.createStatement();

            String query = "SELECT MAX(cust_no) FROM member_tbl";
            rs = stmt.executeQuery(query);

            if (rs.next()) {
                nextCustNo = rs.getInt(1) + 1;
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
}