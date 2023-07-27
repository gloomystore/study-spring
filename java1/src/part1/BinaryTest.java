package part1;

public class BinaryTest {
    // 2진수, 8진수, 16진수
    public static void main(String[] args) {
        // 123을 2진수, 8진수, 16진수로
        int a = 123;

        int a2 = 0b01111011;
        System.out.println("a2 = " + a2);
        String binary = Integer.toBinaryString(a);
        System.out.println("binary = " + binary);

        int a8 = 0173;
        System.out.println("a8 = " + a8);
        String octal = Integer.toOctalString(a);
        System.out.println("octal = " + octal);

        int a16 = 0x7B;
        System.out.println("a16 = " + a16);
        String hexa = Integer.toHexString(a);
        System.out.println("hexa = " + hexa);
    }
}
