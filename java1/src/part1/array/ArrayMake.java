package part1.array;

import part1.object.Book;

public class ArrayMake {
    public static void main(String[] args) {
        // 전부 소문자로
        char[] c = {'A','P','P','L','E'};
        for(int i = 0; i < c.length; i++) {
            c[i] = (char)((int)c[i] + 32);
        }
        for(int i = 0; i < c.length; i++) {
            System.out.println("c[i] = " + c[i]);
        }

        float[] f = new float[5]; // java에서 배열은 길이가 고정임


        Book[] b = new Book[3]; // 책3권을 저장할 배열
        b[0] = new Book();
        b[0].title = "자바1";
        b[0].price = 30000;
        b[0].company = "한빛1";
        b[0].author = "이대영1";
        b[0].page = 500;
        b[0].isbn = "11234561";

        b[1] = new Book();
        b[1].title = "자바2";
        b[1].price = 30000;
        b[1].company = "한빛2";
        b[1].author = "이대영2";
        b[1].page = 500;
        b[1].isbn = "11234562";

        b[2] = new Book();
        b[2].title = "자바3";
        b[2].price = 30000;
        b[2].company = "한빛2";
        b[2].author = "이대영2";
        b[2].page = 500;
        b[2].isbn = "11234563";
        for (int i=0; i<b.length;i++) {
            System.out.println("b[i].title = " + b[i].title);
        }
    }
}
