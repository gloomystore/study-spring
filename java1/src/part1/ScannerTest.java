package part1;

import java.util.Scanner;
public class ScannerTest {
    // Scanner: 사용자의 문자 입력을 받아주는 기능.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("정수 입력");
        int num = scan.nextInt();
        System.out.println("num = " + num);

        System.out.print("실수 입력");
        float f = scan.nextFloat();
        System.out.println("f = " + f);

        System.out.print("문자 입력"); 
        String str = scan.next(); // next = 문자 공백 앞에서 잘림
        System.out.println("str = " + str);
        
        scan.nextLine(); // 버퍼 비우기(스트림 비우기)

        System.out.print("문자 입력2");
        String str2 = scan.nextLine(); // next = 문자 공백을 잘 읽고, 엔터 줄바꿈 앞에서 잘림
        System.out.println("str2 = " + str2);
    }
}

