package part2;

public class PersonAccessTest {
    // Q. person class에 이름, 나이, 전화번호를 저장하고 출력
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "홍길동";
        p.age = 1000;
        p.phone = "010-4343-4343";
        System.out.println(p.name + "\t" + p.age + "\t" + p.phone);
    }
}
