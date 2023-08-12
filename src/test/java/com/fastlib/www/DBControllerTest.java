package com.fastlib.www;

import static org.junit.Assert.*;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

import java.sql.*;
//import java.util.Date;

import javax.sql.DataSource;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.GenericXmlApplicationContext;
//import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.test.context.ContextConfiguration;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class DBControllerTest {

	@Autowired
	DataSource ds;
	
	public int insertUser(User user) throws Exception {
		Connection conn = ds.getConnection();
		
		String sql = "INSERT INTO member_tbl (cust_name, phone, join_date, cust_email, grade) values (?, ?, ?, ?, ?)";
		PreparedStatement pstat = conn.prepareStatement(sql);
		pstat.setString(1, user.getCust_name());
		pstat.setString(2, user.getPhone());
		pstat.setDate(3,user.getJoin_date());
		pstat.setString(4,user.getCust_email());
		pstat.setString(5, user.getGrade());
		
		return pstat.executeUpdate();
	}
	
	@Test
    public void springJdbcConnectionTest() throws Exception {
//      ApplicationContext ac = new GenericXmlApplicationContext("file:src/main/webapp/WEB-INF/spring/**/root-context.xml");
//      DataSource ds = ac.getBean(DataSource.class);

      Connection conn = ds.getConnection(); // 데이터베이스의 연결을 얻는다.

      System.out.println("conn = " + conn);
      assertTrue(conn!=null);
//      assertFalse(false);
    } // main()

}

