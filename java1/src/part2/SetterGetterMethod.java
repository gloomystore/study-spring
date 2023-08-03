package part2;

import model.PersonVO;

public class SetterGetterMethod {
    public static void main(String[] args) {
        PersonVO person = new PersonVO();
        person.setAge(10);
        person.setName("홍길동");
        person.setPhone("010-1111-1111");

        String name = person.getName();
        int age = person.getAge();
        String phone = person.getPhone();

        System.out.println(name + "\t" + age + "\t" + phone);
    }
}
