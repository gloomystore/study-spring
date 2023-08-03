package model;

public class PersonVO {
    private String name;
    private int age;
    private String phone;

    //constructor - 생성자 메소드
    public PersonVO() {
        this.name = "기본이름";
        this.age = 1;
        this.phone = "000-0000-0000";
    }
    // overload 가능!
    public PersonVO(String name, int age, String phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }
    @Override
    public String toString(){
        return this.name + "\t" + this.age + "\t" + this.phone;
    }

    // setter method
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    // getter method
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getPhone() {
        return phone;
    }
}
