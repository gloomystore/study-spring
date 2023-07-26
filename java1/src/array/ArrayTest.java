package array;

import object.Book;

public class ArrayTest {
    public static void main(String[] args) {
        
        // 2 X 4 2차원 배열 실습 - 만들어보기
        int[][] a = new int[2][4];
        for(int i=0;i<a.length;i++) {
            for(int j=0;j<a[i].length;j++) {
                a[i][j] = (j + 1) * 10;
            }
        }
        System.out.println("a[0][0] = " + a[0][0]);
        System.out.println("a[0][1] = " + a[0][1]);
        System.out.println("a[0][2] = " + a[0][2]);
        System.out.println("a[0][3] = " + a[0][3]);
        
        // 2차원 배열의 초기화
        int[][] b = {
                {1,2,3,4},
                {1,2,3,4}
        };
        for(int i=0;i<b.length;i++) {
            for(int j=0;j<b[i].length;j++) {
                System.out.println("b[i][j] = " + b[i][j]);
            }
        }
    }
}
