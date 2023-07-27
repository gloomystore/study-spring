package part1;

import java.util.*;
public class ScannerExam {
    public static void main(String[] args) {
        // 도서정보 받아보기
        Scanner scan = new Scanner(System.in); // System.in 입력 스트림을 넣어줘야함

        System.out.println("제목 입력");
        String title = scan.nextLine();
        System.out.println("title = " + title);

        System.out.println("가격");
        int price = scan.nextInt();
        System.out.println("price = " + price);

        scan.nextLine(); // 버퍼 비우기(스트림 비우기)

        System.out.println("출판사 입력");
        String company = scan.nextLine();
        System.out.println("company = " + company);

        System.out.println("작가 입력");
        String author = scan.nextLine();
        System.out.println("author = " + author);

        System.out.println("페이지수 입력");
        int pages = scan.nextInt();
        System.out.println("pages = " + pages);

        scan.nextLine(); // 버퍼 비우기(스트림 비우기)

        System.out.println("isbn 입력");
        String isbn = scan.nextLine();
        System.out.println("isbn = " + isbn);



    }
}
