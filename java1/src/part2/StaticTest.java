package part2;

public class StaticTest {
    public static void main(String[] args) {
    int a = 10;
    int b = 20;
    int sum = sum(a,b);
        System.out.println("sum = " + sum);
    }
    public static int sum(int a, int b){
        return a + b;
    }
}
