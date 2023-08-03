package part2;

public class NoneStaticTest {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        NoneStaticTest st = new NoneStaticTest();
        int sum = st.sum(a,b);
        System.out.println("sum = " + sum);
    }
    public int sum(int a, int b) {
        return a + b;
    }
}
