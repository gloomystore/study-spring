package part2;

import model.StudentVO;

public class StudentTest {
    public static void main(String[] args) {
        // 정수 6개의 배열
        int[] arrNum = new int[6];
        for(int i=0; i < arrNum.length; i++) {
            System.out.println(arrNum[i]);
        }
        
        
        // 잘 설계된 Student 객체를 설계하고 출력하기
        StudentVO student = new StudentVO("홍길동",15,"컴퓨터공학","dd@nad.com",3,"010-1111-1111");
        System.out.println("student = " + student);
    }
}
