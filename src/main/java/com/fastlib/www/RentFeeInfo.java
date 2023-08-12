package com.fastlib.www;

public class RentFeeInfo {
    private String cust_no;
    private String cust_name;
    private String grade;
    private int total_rent_fee;

    public String getCust_no() {
        return cust_no;
    }

    public void setCust_no(String cust_no) {
        this.cust_no = cust_no;
    }

    public String getCust_name() {
        return cust_name;
    }

    public void setCust_name(String cust_name) {
        this.cust_name = cust_name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getTotal_rent_fee() {
        return total_rent_fee;
    }

    public void setTotal_rent_fee(int total_rent_fee) {
        this.total_rent_fee = total_rent_fee;
    }

    @Override
    public String toString() {
        return "RentFeeInfo [cust_no=" + cust_no + ", cust_name=" + cust_name + ", grade=" + grade +
               ", total_rent_fee=" + total_rent_fee + "]";
    }
}