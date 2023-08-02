package part2;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "이대영";
        person.age = 30;
        person.phone = "010-1111-1111";

        person.play();
        person.walk();
        person.eat();

        // 사람2
        Person person2 = new Person();
        person2.name = "이대영2";
        person2.age = 30;
        person2.phone = "010-1111-1111";

        person2.play();
        person2.walk();
        person2.eat();
    }
}
