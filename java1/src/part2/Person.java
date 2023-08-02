package part2;

public class Person {
    // 기본 생성자로, 자동으로 생성됨.(생략가능) 멤버변수, 멤버 메소드를 메모리에 올리는 역할을 함.
//    public  Person() {
//
//    }

    // 이거도 일종의 DTO임
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