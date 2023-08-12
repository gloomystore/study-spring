package com.fastlib.www;

import java.sql.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class RentInfo {
    private String cust_no;
    private String rent_no;
    private String book_code;
    private int rent_price;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date rent_date;
    private String cust_name;

    public String getCust_no() {
        return cust_no;
    }

    public void setCust_no(String cust_no) {
        this.cust_no = cust_no;
    }

    public String getRent_no() {
        return rent_no;
    }

    public void setRent_no(String rent_no) {
        this.rent_no = rent_no;
    }

    public String getBook_code() {
        return book_code;
    }

    public void setBook_code(String book_code) {
        this.book_code = book_code;
    }

    public int getRent_price() {
        return rent_price;
    }

    public void setRent_price(int rent_price) {
        this.rent_price = rent_price;
    }

    public Date getRent_date() {
        return rent_date;
    }

    public void setRent_date(Date rent_date) {
        this.rent_date = rent_date;
    }

    public String getCust_name() {
        return cust_name;
    }

    public void setCust_name(String cust_name) {
        this.cust_name = cust_name;
    }

    @Override
    public String toString() {
        return "RentInfo [cust_no=" + cust_no + ", rent_no=" + rent_no + ", book_code=" + book_code +
               ", rent_price=" + rent_price + ", rent_date=" + rent_date + ", cust_name=" + cust_name + "]";
    }
}