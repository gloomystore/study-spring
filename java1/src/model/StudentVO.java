package model;

public class StudentVO {
    private String name;
    private int age;
    private String dept;
    private String email;
    private int year;
    private String phone;

    public StudentVO(){

    }

    public StudentVO(String name, int age, String dept, String email, int year, String phone) {
        this.name = name;
        this.age = age;
        this.dept = dept;
        this.email = email;
        this.year = year;
        this.phone = phone;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    // getter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDept() {
        return dept;
    }

    public String getEmail() {
        return email;
    }

    public int getYear() {
        return year;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "StudentVO{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dept='" + dept + '\'' +
                ", email='" + email + '\'' +
                ", year=" + year +
                ", phone='" + phone + '\'' +
                '}';
    }
}
