package part2;

public class Person {
    // 기본 생성자로, 자동으로 생성됨.
//    public  Person() {
//
//    }
    public String name;
    public int age;
    public String phone;
    public void play(){
        System.out.println("운동을 한다");
    }
    public void eat(){
        System.out.println("음식을 먹다");
    }
    public void walk(){
        System.out.println("걷다");
    }
}