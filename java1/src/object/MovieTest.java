package object;

public class MovieTest {
    public static void main(String[] args) {
        Movie m = new Movie();
        m.title = "avatar";
        m.date = "2023.03.05";
        m.major = "대영";
        m.genre = "action";
        m.time = 175;
        m.grade = 19;
        System.out.println("m = " + m);
    }
}
