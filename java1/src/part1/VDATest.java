package part1;

public class VDATest {
    public static void main(String[] args) {
        //Q.정수 한 개를 저장하기위해서 변수를 선언 하시요
        int v;

        //Q.변수 a 에 10 을 저장하고 a 에 저장된 값을 변수 b 에 저장하고 변수 b 에 10 을 곱하여 변수 c 에 저장하시요
        int a = 10;
        int b = a;
        int c = b * 10;

        //Q. sum이라는 변수에 1 부터 5 까지의 수 를 누적 accumulate 해서 출력 하시요
        int sum = 0;
        for (int i = 1; i < 6; i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);

        //Q.x=10, y=20 을 저장하고 변수의 값을 서로 교환 ( 하여 출력하시요
        int x = 10;
        int y = 20;
        int tempx = x;
        int tempy = y;
        x = tempy;
        y = tempx;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
