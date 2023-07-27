package part1;

public class CharTest {
    // 형변환
    public static void main(String[] args) {
        char a = 'A';
        System.out.println("a = " + a);
        char b = 'B' + 1;
        System.out.println("(char)b = " + (char)b);

        // Q.가 라는 한글 한 문자 를 변수에 저장하고 출력하시요
        int ga = '가';
        System.out.println("ga = " + ga);
        char Ga = 44032;
        System.out.println("Ga = " + Ga);
        int gga = 0xAC00;
        System.out.println("(char)gga = " + (char)gga);
        // Q.대문자 ‘A 를 문자 ‘a` 로 변환하여 출력하시요 .(ASCII 코드 참고)
        System.out.println("A to a = " + (char)(a + 32));

        // Q. ‘1’ +  ’2’ = 3 이 나오도록 프로그래밍 하시요
        char a1 = '1';
        char a2 = '2';
        int c = (int)a1-48 + (int)a2-48;
        System.out.println("c = " + c);
    }
}
