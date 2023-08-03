package part1.method;

public class MethodTest {
    public static void main(String[] args) {
        int sum = add(1,2);
        System.out.println("sum = " + sum);
    }
    public static int add(int a, int b) {
        return a + b;
    }

    // overload
    public static String add(String a, String b) {
        return a + b;
    }
    int fucker(){
       return 1;
    }
}
class TestOverride extends MethodTest {
    public static void main(String[] args) {
        System.out.println("sum = " + add(1,2));
    }
    public static int add(int a, int b) {
        return a - b;
    }
    @Override
    int fucker() {
        return 2;
    }
}